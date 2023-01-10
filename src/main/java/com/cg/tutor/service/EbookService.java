package com.cg.tutor.service;

import java.util.List;

import com.cg.tutor.entity.Ebook;
import com.cg.tutor.exception.EbookNotFoundException;


public interface EbookService {

	public Ebook saveEbook(Ebook ebook);
	
	public Ebook updateEbook(Ebook ebook) throws EbookNotFoundException;
	
	public void deleteEbookById(int ebookId) throws EbookNotFoundException;
	
	public Ebook retrieveEbookByName(String EbookName) throws EbookNotFoundException;
	
	public List<Ebook> getAllEbook();
}
