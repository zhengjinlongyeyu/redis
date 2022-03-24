package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	
	@RequestMapping("setname")
	public String getname() {
		ValueOperations<String, Object> opsForValue = redisTemplate.opsForValue();
		
		opsForValue.set("name", "xiaoming");
		
		 return "ok";
		
		
	}
	
	@RequestMapping("getname")
	public String setname() {
		ValueOperations<String, Object> opsForValue = redisTemplate.opsForValue();
		
		Object object = opsForValue.get("name");
		System.out.println("++++>" +object );
		 return object.toString();
		
	}

}
