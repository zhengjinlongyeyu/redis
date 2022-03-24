package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;


@Configuration
public class RedisConfig {
	/**
	 * 
	 * @description  主要配置redis 的序列化模板
	 * @author Jeff
	 * @date 2022年3月23日
	 * @param Lettucefactory
	 * @return
	 */

    @Bean
	public RedisTemplate<String, Object> redisTemplate(LettuceConnectionFactory Lettucefactory) {
	        RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
	        template.setConnectionFactory(Lettucefactory);
	        // 不用jdk 的因为jsk 太大了
	        GenericJackson2JsonRedisSerializer genericJackson2JsonRedisSerializer = new GenericJackson2JsonRedisSerializer();
	        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
	        // key采用String的序列化方式
	        template.setKeySerializer(stringRedisSerializer);
	        // hash的key也采用String的序列化方式
	        template.setHashKeySerializer(stringRedisSerializer);
	        // value序列化方式采用jackson
	        template.setValueSerializer(genericJackson2JsonRedisSerializer);
	        // hash的value序列化方式采用jackson
	        template.setHashValueSerializer(genericJackson2JsonRedisSerializer);
	        template.afterPropertiesSet();
	        return template;
	    }

}
