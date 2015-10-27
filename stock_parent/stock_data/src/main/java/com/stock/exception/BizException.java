/**
 * 
 */
package com.stock.exception;

/**
 * 业务异常，不需要回滚
 * @author think
 *
 */
public class BizException extends Throwable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5503748142045921535L;

	public BizException(String message){
		super(message);
	}
}
