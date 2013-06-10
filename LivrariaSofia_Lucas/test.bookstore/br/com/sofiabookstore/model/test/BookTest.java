package br.com.sofiabookstore.model.test;

import br.com.livrariasofia.model.Book;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class BookTest {
	private Book book1;
	private Book book2;
	private Book book3;
	private Book book4;
	private static final double deltaForDoubleComparison = 0;
	
	
	@Before
	public void setUp(){
		this.book1 = new Book("Dracula", "Vampire", "Bram", 2, 30);
		this.book2 = new Book("123", "dfdsfds", "dewweded", 3, 50);
		this.book3 = new Book("hrththt", "ed3232d", "dasdsa", 4, 40); 
		this.book4 = new Book("Dracula", "Vampire", "Bram", 5, 100);
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

		//assertEquals("installment", 33, book3.finalInstallmentValue(), deltaForDoubleComparison);
		
		//assertEquals("installment", 20, book4.finalInstallmentValue(), deltaForDoubleComparison);
	//	assertEquals("payment", 6, book3.paymentConditions(), deltaForDoubleComparison);
	//	assertEquals("payment", 12, book4.paymentConditions(), deltaForDoubleComparison);
	}


	
	
}
