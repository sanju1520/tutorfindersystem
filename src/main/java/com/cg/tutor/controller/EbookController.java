package com.cg.tutor.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.cg.tutor.entity.Ebook;
import com.cg.tutor.service.EbookServiceImpl;

@CrossOrigin(origins = "http://localhost:3001/")
@RestController
public class EbookController {
	@Autowired
	private EbookServiceImpl ebookService;
	
	
	
	@PostMapping("/ebook/save")
	public ResponseEntity<Ebook> addEbook(@RequestBody Ebook ebook) {
	    Ebook newEbook = ebookService.saveEbook(ebook);
	    ResponseEntity<Ebook> responseEntity = new ResponseEntity<>(newEbook, HttpStatus.CREATED);
	    return responseEntity;
	}
	
	@PutMapping("/ebook/update")
	  public ResponseEntity<Ebook> modifyEbook(@RequestBody Ebook ebook)
	  {
		Ebook updateEbook = ebookService.updateEbook(ebook);
		ResponseEntity<Ebook> responseEntity = new ResponseEntity<>(updateEbook,HttpStatus.OK);
		return responseEntity;
	  }
	
	@DeleteMapping("/ebook/delete/{id}")
	public ResponseEntity<String> DeleteEbook(@PathVariable("id") int ebookId){
		ebookService.deleteEbookById(ebookId);
		ResponseEntity<String> responseEntity=new ResponseEntity<>("Ebook deleted successfully.",HttpStatus.OK);
		return responseEntity;
	}
	
	 @GetMapping("/ebook/name/{name}")
	    public ResponseEntity<Ebook> ListEbookByName(@PathVariable("name") String ebookName){
	        Ebook ebook=ebookService.retrieveEbookByName(ebookName);
	        ResponseEntity<Ebook> responseEntity=new ResponseEntity<>(ebook,HttpStatus.OK);
	        return responseEntity;
	 }  
	 
	 @GetMapping("/ebook/all")
		public List<Ebook> fetchAllEbook() {
			List<Ebook> list = ebookService.getAllEbook();
			return list;
	
}
	        

	

}
