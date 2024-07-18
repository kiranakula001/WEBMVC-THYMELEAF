package spring.thymeleaf.entity;

import lombok.Data;

@Data
public class Book {
	
	private Integer bookid;
	
	private String bookname;
	
	private double price;
	
	

	public Book() {
		
	}

	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
