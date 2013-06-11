package TDDtest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.Test;
import br.com.livrariasofia.model.Book;
import br.com.livrariasofia.model.BookStore;

import org.junit.Before;
import org.junit.Ignore;

public class Bookteste {
	private Book book1;
	private Book book2;
	private Book book3;
	private Book book4;
	private static final double deltaForDoubleComparison = 0;
	
	BookStore bookList = new BookStore();
	private BookStore mockedbookList;
	private ArrayList<Book> expected;
	
	@Before
	public void setUp(){
		
		expected = new ArrayList<Book>();
		
		this.book1 = new Book("Dracula", "Vampire", "Bram", 2, 30);
		this.book2 = new Book("123", "dfdsfds", "mouse", 3, 50);
		this.book3 = new Book("hrththt", "ed3232d", "dasdsa", 4, 40); 
		this.book4 = new Book("Dracula", "Vampire", "Bram", 5, 100);
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		
		
		expected.add(book1);
		expected.add(book2);
		expected.add(book3);
		expected.add(book4);
	}
	
	@Test
	public void installmentPayment(){
		assertEquals("Final price", 30, book1.finalPrice(), deltaForDoubleComparison);
		assertEquals("Final installment", 30, book1.finalInstallmentValue(), deltaForDoubleComparison);
		
		assertEquals("Final price", 50.00, book2.finalPrice(), deltaForDoubleComparison);
		assertEquals("Set Interest", 0.01, book2.setInterest(0.01), deltaForDoubleComparison);
		assertEquals("Get Interest", 0.01, book2.getInterest(), deltaForDoubleComparison);
		assertEquals("Get Interest", 0.01, book2.getInterest(), deltaForDoubleComparison);
		assertEquals("Final price", 50.50, book2.finalPrice(), deltaForDoubleComparison);
		assertEquals("Set Installment", 3, book2.setInstallment(3), deltaForDoubleComparison);
		assertEquals("payment", 3, book2.getInstallment(), deltaForDoubleComparison);
	}
	

	private void setListMocked()
	{
		
		mockedbookList = mock(BookStore.class);
		mockedbookList.add(book1);
		mockedbookList.add(book2);
		mockedbookList.add(book3);
		mockedbookList.add(book4);
		
		expected = bookList.getBook();
		
		when(mockedbookList.getBook()).thenReturn(expected);
	}
	
	ArrayList<Book> list = new ArrayList<Book>();
	
	@Test
	public void shouldFilterMoreThan()
	{	
	
		this.setListMocked(); 
		this.list.add(book1);
		this.list.add(book2);
		this.list.add(book3);
		
		assertEquals("Max Price: ", list , bookList.getMaxPrice(expected, 80));
		when(mockedbookList.getMaxPrice(this.list, 80)).thenReturn(list);
		
		for(int i = 0; i < list.size(); i++){
			System.out.println(mockedbookList.getMaxPrice(this.list, 80).get(i).finalPrice());
		 }
	}
	
	@Test
	public void shouldFilterByMinPrice()
	{	
		this.setListMocked(); 
		this.list.add(book2);
		this.list.add(book3);
		this.list.add(book4);
		
		assertEquals("Min Price: ", list , bookList.getMinPrice(this.list, 30));
		when(mockedbookList.getMinPrice(this.list, 30)).thenReturn(list);
		
		for(int i = 0; i < list.size(); i++){
			System.out.println(mockedbookList.getMinPrice(this.list, 30).get(i).finalPrice());
		 }
	}

}
