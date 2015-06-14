/**
 * 
 */
package com.stock.common;

/**
 * @author think
 *
 */
public enum MsgEnum {
	
	SUCCESS(1,""),
	FAILED(-1,"")
	;
	
	private MsgEnum(int value,String msg){
		this.value = value;
		this.msg = msg;
	}
	private int value;
	private String msg;
	
	
}
