/**
 * 
 */
package com.stock.job;

import java.io.File;
import java.io.FileWriter;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import org.springframework.util.CollectionUtils;

/**
 * @author think
 *
 */
public class OrderBot extends Bot{
	
	Map<String, String> content;
	private CountDownLatch latch;
	/**
	 * @param url
	 * @param latch
	 */
	public OrderBot(String url,CountDownLatch latch,Map<String, String> content) {
		super(url);
		this.latch = latch;
		this.content = content;
	}
	

	/* (non-Javadoc)
	 * @see com.stock.job.Bot#handlerResult()
	 */
	@Override
	void handlerResult() {
		@SuppressWarnings("rawtypes")
		Map orderInfo = (Map) super.map.get("order");
		if(!CollectionUtils.isEmpty(orderInfo)){
			String phone = "";
			String userId = "";
			String bookingDate = "";
			for(Object key:orderInfo.keySet()){
				String keyStr = key.toString();
				if(keyStr.equals("bookingUserPhone")){
					phone = orderInfo.get(key).toString();
				}
				if(keyStr.equals("bookingUserId")){
					userId = orderInfo.get(key).toString();
				}
				if(keyStr.equals("bookingDate")){
					bookingDate = orderInfo.get(key).toString();
				}
			}
			System.out.println(url);
			content.put(phone, phone+"-"+userId+"-"+bookingDate);
		}
		latch.countDown();
	}
	public static void main(String[] args) throws Exception {
		int start =25001;
		int end = 30000;
		CountDownLatch latch = new CountDownLatch(end-start);
		String _url = "http://passenger.01zhuanche.com/car-rest/webservice/order/token=zQw&clientType=0&orderId=";
		String path = "e:"+File.separator+"4.txt";
		Map<String, String> content = new Hashtable<String, String>();
//		long start = System.currentTimeMillis();
		for(int i = start;i<=end;i++){
			String url = _url+i;
			Bot bot = new OrderBot(url,latch,content);
			Thread t = new Thread(bot);
			t.start();
		}
		
//		long end = System.currentTimeMillis();
//		System.out.println("信息收集完毕："+(end-start)/1000);
		latch.await();
		File file = new File(path);
		if(!file.exists()){
			file.createNewFile();
		}
		FileWriter fos = new FileWriter(file,true);
		System.out.println(content.size());
		for(String key:content.keySet()){
			fos.write(content.get(key));
			fos.write("\n");
		}
		fos.close();
	}

}
