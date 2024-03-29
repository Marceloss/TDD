package br.com.livrariasofia.model;

public class Book {

	private String title;
	private String description;
	private String author;
	private double price;
	private int id;
	private int installment;
	private double interest;
	
	public Book(){}
	
	public Book(double price){
		this.price = price;
		this.installment = 1;
	}
	
	public Book(String title, String description, String author, int id, double price) {
		this.title = title;
		this.description = description;
		this.author = author;
		this.id = id;
		this.price = price;
		this.installment = 1;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public int getInstallment() {
		return installment;
	}

	public int setInstallment(int installment) {
		if(this.price <= 30)
			this.installment = 1;
		else if(installment <= 10)
			this.installment = installment;
		
		return this.installment;
	}
	
	
	public double finalPrice() {		
		double price = this.price;
		
		if(this.interest > 0)
			price += (price * interest);
		
		return price;
	}

	public double finalInstallmentValue() {
		return  price / (int)(price / 20);
	}

	public double getInterest() {
		return this.interest;
	}

	public double setInterest(double interest) {
		return this.interest = interest;
	}
		
	
}
