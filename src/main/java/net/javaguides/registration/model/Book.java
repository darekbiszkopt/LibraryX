package net.javaguides.registration.model;

import java.io.Serializable;

public class Book implements Serializable  {
    private static final long serialVersionUID = 1L;
	private String idBook;
	private String name;
	private String pages;
	private String author;
	
	
	public String getIdBooks() {
		return idBook;
	}
	public void setIdBooks(String idBook) {
		this.idBook = idBook;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
