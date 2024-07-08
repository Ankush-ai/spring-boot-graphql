package com.spring.graphql.Spring.boot.with.graphql.Controller;

public class BookInput {
	@Override
	public String toString() {
		return "BookInput [title=" + title + ", desc=" + desc + ", author=" + author + ", price=" + price + ", pages="
				+ pages + "]";
	}
	private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getDesc() {
		// TODO Auto-generated method stub
		return null;
	}
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getAuthor() {
		// TODO Auto-generated method stub
		return null;
	}
	public BookInput() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookInput(String title, String desc, String author, double price, int pages) {
		super();
		this.title = title;
		this.desc = desc;
		this.author = author;
		this.price = price;
		this.pages = pages;
	}
	public int getPages() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}

}
