package br.com.livrariasofia.model;

import java.util.ArrayList;
import java.util.List;



public class BookStore {
	
	private Book book;
	
	private ArrayList<Book> bookList;
	
	public BookStore() {
		
		this.bookList = new ArrayList<Book>();
	}
	
	public BookStore(Book mockedBook) {
		this.bookList = new ArrayList<Book>();
		this.bookList.add(mockedBook);
	}

	public boolean add(Book book){
		return bookList.add(book);
	}
	
	public ArrayList<Book> getBook() {
		return bookList;
	}
	
	public void removeByIndex(Book book){
		for(Book l: bookList){
			if(l.getId() == book.getId()){
				bookList.remove(book);
			}
		}
	}
	
	
	public void changeBook(String title, String author, String description, int id) {
		for(Book l: bookList){	
			if(l.getId() == id){
				l.setAuthor(author);
				l.setDescription(description);
				l.setTitle(title);
			}
		}
	}

	public ArrayList<Book> getMaxPrice(ArrayList<Book> bookList , double value) {
		
		ArrayList<Book> list = new ArrayList<Book>();
		
		for (Book book : bookList) 
			if(book.finalPrice() < value)
				list.add(book);	

		return list;
	}

	public ArrayList<Book> getMinPrice(ArrayList<Book> booklist, double value ) {

		ArrayList<Book> list = new ArrayList<Book>();
		
		for (Book book : booklist) {
			if(book.finalPrice() > value)
			{
				list.add(book);
			}
		}
		return list;
	}

}
