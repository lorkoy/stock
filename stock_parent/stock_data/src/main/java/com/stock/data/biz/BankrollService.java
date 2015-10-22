/**
 * 
 */
package com.stock.data.biz;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.stock.cache.CacheManager;
import com.stock.db.entity.Bankroll;
import com.stock.db.entity.Stock;
import com.stock.db.mybatis.BankrollMapper;
import com.stock.util.DateUtils;
import com.stock.util.HttpUtils;
import com.stock.util.PropertiesUtil;

/**
 * @author think
 *
 */
@Service
@Transactional(isolation=Isolation.READ_COMMITTED)
public class BankrollService {
	private static final Logger logger = LoggerFactory.getLogger(BankrollService.class);
	
	@Resource
	private BankrollMapper bankrollMapper;
	
	public void bankrollData(){
		List<Stock> stocks = CacheManager.getInstance().getCache().get("code");
		List<Bankroll> records = new ArrayList<Bankroll>();
		int i = 0;
			for(Stock s:stocks){
				i++;
				String code = s.getCode();
				logger.debug("================query bankroll code is {}=====================",code);
				String result = "";
				try {
					result = queryBankroll(code);
					if(result.length() == 0){
						continue;
					}
					String[] info = result.split("=")[1].split(";")[0].split("\"")[1].split(",");
//				System.out.println(info[info.length-2]);
//				System.out.println(Arrays.toString(info));
					Calendar cal = Calendar.getInstance();
					String date = cal.get(Calendar.YEAR)+"-"+result.split("=")[1].split(";")[1].split("\n")[0].split("Create:")[1];
					Date d = DateUtils.parseDate(date, "yyyy-MM-dd HH:mm:ss");
					cal.setTime(d);
					System.out.println(java.util.Arrays.toString(info));
//					String[] brStr = info[info.length].split(";");
//					System.out.println(brStr[0]);
					Bankroll br = new Bankroll();
					br.setLargeIn(info[12]);
					br.setLargeOut(info[13]);
					br.setBigIn(info[14]);
					br.setBigOut(info[15]);
					br.setMediumIn(info[16]);
					br.setMediumOut(info[17]);
					br.setSmallIn(info[18]);
					br.setSmallOut(info[19]);
//					double bigIn = Double.parseDouble(info[14]);
//					double bigout = Double.parseDouble(info[15]);
//					double largeIn = Double.parseDouble(info[12]);
//					double largeOut = Double.parseDouble(info[13]);
					BigDecimal largeIn = new BigDecimal(info[12]);
					BigDecimal largeOut = new BigDecimal(info[13]);
					BigDecimal bigIn = new BigDecimal(info[14]);
					BigDecimal bigout = new BigDecimal(info[15]);
					
					br.setMainforceIn(largeIn.add(bigIn).toString());
					br.setMainforceOut(largeOut.add(bigout).toString());
					br.setCreateDate(new Date());
					br.setStockCode(code);
					br.setYear(String.valueOf(cal.get(Calendar.YEAR)));
					br.setMonth(String.valueOf(cal.get(Calendar.MONTH)+1));
					br.setDate(date);
					records.add(br);
					if(i == stocks.size()-1){
						bankrollMapper.batchInsert(records);
						records.clear();
					}
					if(records.size() == 50){
						bankrollMapper.batchInsert(records);
						records.clear();
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	}
	
	public String queryBankroll(String code) throws Exception {
		String url = PropertiesUtil.getInstance().get("capital_info_url");
		StringBuffer sb = new StringBuffer(url);
		sb.replace(sb.indexOf("{stockCode}"), sb.indexOf("{stockCode}")+"{stockCode}".length(), code);
		sb.replace(sb.indexOf("{rt}"), sb.length(), "1");
		String result = HttpUtils.sendHttpRequest(sb.toString(),"utf-8");
		return result;
	}
	
	public static void main(String[] args) {
		Double d = Double.parseDouble("-7378.16");
		System.out.println(d);
	}
	
}
