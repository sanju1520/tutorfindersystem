package com.cg.tutor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.tutor.entity.Ebook;
import com.cg.tutor.exception.EbookNotFoundException;
import com.cg.tutor.repository.EbookRepository;





@Service
public class EbookServiceImpl implements EbookService {
	
	@Autowired
	private EbookRepository ebookRepository;

	@Override
	public Ebook saveEbook(Ebook ebook) {
		Ebook newEbook = ebookRepository.save(ebook);
	    return newEbook;
		
		
	}
	
	@Override
	public Ebook updateEbook  (Ebook ebook)throws EbookNotFoundException {
		Optional<Ebook> optionalEbook=ebookRepository.findById(ebook.getBookId());
		if(optionalEbook.isEmpty()) {
			throw new EbookNotFoundException("Ebook Not existing with ID: "+ebook.getBookId());
		}
		else
		{
			Ebook updatedEbook=ebookRepository.save(ebook);
	        return updatedEbook;
		}
		
	    
	}
	
	@Override
	public void deleteEbookById(int ebookId) throws EbookNotFoundException{
      Optional<Ebook> optionalEbook=ebookRepository.findById(ebookId);
      if(optionalEbook.isEmpty()) {
          throw new EbookNotFoundException("Ebook Not existing with ID: "+ebookId);
      }
      ebookRepository.deleteById(ebookId);
  }
	
	@Override
    public Ebook retrieveEbookByName(String ebookName) throws EbookNotFoundException {
        Ebook ebook=ebookRepository.findByBookName(ebookName);
        if(ebook==null) {
            throw new EbookNotFoundException("Ebook Not Found with Name: "+ebookName);
        }
        
        return ebook;
        
	
	}

	@Override
	public List<Ebook> getAllEbook() {
		List<Ebook> ebook = ebookRepository.findAll();
		return ebook;
		
	}
	
	

	
}


