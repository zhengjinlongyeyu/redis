package com;


import static org.mockito.Mockito.lenient;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.DefaultTypedTuple;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.ZSetOperations;

import com.alibaba.fastjson.JSONObject;

@SpringBootTest
class RedisApplicationTests {
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	@Test
	void contextLoads(){
		
		
		
		ValueOperations opsForValue = redisTemplate.opsForValue();
		for (int i = 0; i < 20; i++) {
			opsForValue.set("namesfsaf"+i, "zhangsan"+i);
		}
	
//		opsForValue
//		//层级目录关系 目录形式存储数据
//		opsForValue.set("user:01", "lisi");
//		// 添加多条数据
//		Map maps =new HashMap<>();
//		maps.put("a", 1);
//		maps.put("b", 2);
//		maps.put("c", 3);
//		opsForValue.multiSet(maps);
//		// 获取多个值
//		List<String> keys = new ArrayList<>();
//		keys.add("a");
//		keys.add("b");
//		keys.add("c");
//		
//		
//		List multiGet = opsForValue.multiGet(keys);
//		for (Object object : multiGet) {
//			System.out.println("++++>"+object);
//		}
//		
//		redisTemplate.delete("user:01");
		
		
//			HashOperations<String, Object, Object> opsForHash = redisTemplate.opsForHash();
//////			opsForHash.put("name", "name", "zhangsna");
////			Map map =new HashMap<>();
////			map.put("a", 1);
////			map.put("b", 2);
////			map.put("c", 3);
////			opsForHash.putAll("age", map);
////			opsForHash.delete("age", "a","b");
//         ListOperations<String, Object> opsForList = redisTemplate.opsForList();
//		
////         opsForList.leftPush("sex", "男");
//         opsForList.rightPush("sex", "男");
//		
//		SetOperations<String, Object> opsForSet = redisTemplate.opsForSet();
////		opsForSet.add("letters", "aaaa","bbb","cccc","dddd");
//		
//		opsForSet.remove("letters", "aaaa","bbb");
		
//		ZSetOperations<String, Object> opsForZSet = redisTemplate.opsForZSet();
//		ZSetOperations.TypedTuple<Object> objecTuple1 = new DefaultTypedTuple("lisi", 7D);
//		ZSetOperations.TypedTuple<Object> objecTuple2 = new DefaultTypedTuple("lisasf", 8D);
//		
//		Set<ZSetOperations.TypedTuple<Object>> aaa =new HashSet<>();
//		aaa.add(objecTuple1);
//		aaa.add(objecTuple2);
//		
//		opsForZSet.add("sssss",aaa);
		
		
	}

}
