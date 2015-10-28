package com.stock.mongo;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;

import com.stock.SpringTestCase;
import com.stock.db.entity.Bankroll;

@ContextConfiguration({ "/spring/applicationContext.xml" })
public class MongoTest extends SpringTestCase{
	@Resource
	private MongoTemplate mongoTemplate; 
	
	@Test
	public void mongo(){
		mongoTemplate.insert(new Bankroll());
		
		
	}

}
