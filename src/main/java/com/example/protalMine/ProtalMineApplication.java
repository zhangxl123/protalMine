package com.example.protalMine;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter4;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

@SpringBootApplication
public class ProtalMineApplication  {

    /**
    * @Author:zhangxinlin
    * @Description: 使用FastJosn 统一格式化json数据输出
    * @Date:2017/5/19
    */
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(
			SerializerFeature.PrettyFormat,//null值也要输出
				SerializerFeature.QuoteFieldNames,//输出key值带引号
				SerializerFeature.WriteDateUseDateFormat,
				SerializerFeature.WriteNullListAsEmpty,
				SerializerFeature.WriteMapNullValue
		);
		fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
		HttpMessageConverter<?> converter = fastJsonHttpMessageConverter;
		return new HttpMessageConverters(converter);
	}

	public static void main(String[] args) {
		SpringApplication.run(ProtalMineApplication.class, args);
	}
}
