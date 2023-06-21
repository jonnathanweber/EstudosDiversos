package br.com.alura.model;

import java.time.LocalDate;


public class Bitcoin {
	private String tid;
	private String date;
	private String type;
	private String price;
	private String amount;
	public String getTid() {
		return tid;
	}
	public String getDate() {
		return date;
	}
	public String getType() {
		return type;
	}
	public String getPrice() {
		return price;
	}
	public String getAmount() {
		return amount;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
}
