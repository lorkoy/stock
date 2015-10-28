/**
 * 
 */
package com.stock.job;

/**
 * @author think
 *
 */
public class Order {
	private String pricing;
	private String bookingUserPhone;
	private String bookingUserId;
	private String orderNo;
	
	
	
	public String getBookingUserPhone() {
		return bookingUserPhone;
	}
	public void setBookingUserPhone(String bookingUserPhone) {
		this.bookingUserPhone = bookingUserPhone;
	}
	public String getBookingUserId() {
		return bookingUserId;
	}
	public void setBookingUserId(String bookingUserId) {
		this.bookingUserId = bookingUserId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	/**
	 * @return the pricing
	 */
	public String getPricing() {
		return pricing;
	}
	/**
	 * @param pricing the pricing to set
	 */
	public void setPricing(String pricing) {
		this.pricing = pricing;
	}
	
	

}
