package br.com.livrariasofia.model;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

	private ArrayList<Book> bookList;
	
	public BookStore() {
		this.bookList = new ArrayList<Book>();
		
	/*	Book book = new Book("As cronicas de nárnia","BlaBlaBla","Narnialandia", 1, 0);
		Book book2 = new Book("Patinho feioa","Eles morrem no final","Brincadeira", 2, 0);
		Book book3 = new Book("Branca de neve","Tem 7 anões","disney?",3, 0);
		BookCollection lc = new BookCollection("A sociedade do anel", "tem hobbits", "jrrt", 1, 3,4);
		bookList.add(book);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(lc);*/
		
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
	

}
