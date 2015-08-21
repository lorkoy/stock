/**
 * 
 */
package com.stock.db.entity;

/**
 * 资金流向
 * @author think
 *
 */
public class Bankroll {
	//主力
	private String mainForce;
	//超大单
	private String large;
	//大单
	private String big;
	//中单
	private String medium;
	//小单
	private String small;
	
	
	public String getMainForce() {
		return mainForce;
	}
	public void setMainForce(String mainForce) {
		this.mainForce = mainForce;
	}
	public String getLarge() {
		return large;
	}
	public void setLarge(String large) {
		this.large = large;
	}
	public String getBig() {
		return big;
	}
	public void setBig(String big) {
		this.big = big;
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	public String getSmall() {
		return small;
	}
	public void setSmall(String small) {
		this.small = small;
	}
	
}
