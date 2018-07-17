package com.bo;

import java.util.Date;

public class OrderBO extends ProductBO{

	String orderNo;
	String customerId;
	String productid;
	int quantity;
	Date date;
	int orderStatus;
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}
	public OrderBO(String productId, String productName, String material, String collection, String length,
			String width, String colour, String description, double price, String orderNo, String customerId,
			String productid2, int quantity, Date date, int orderStatus) {
		super(productId, productName, material, collection, length, width, colour, description, price);
		this.orderNo = orderNo;
		this.customerId = customerId;
		productid = productid2;
		this.quantity = quantity;
		this.date = date;
		this.orderStatus = orderStatus;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((orderNo == null) ? 0 : orderNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderBO other = (OrderBO) obj;
		if (orderNo == null) {
			if (other.orderNo != null)
				return false;
		} else if (!orderNo.equals(other.orderNo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OrderBO [orderNo=" + orderNo + ", customerId=" + customerId + ", productid=" + productid + ", quantity="
				+ quantity + ", date=" + date + ", orderStatus=" + orderStatus + "]";
	}	


}
