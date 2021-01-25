package board.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import board.interceptor.LoggerInterceptor;

import javax.servlet.Filter;
import java.nio.charset.Charset;


public class WebMvcConfiguration implements WebMvcConfigurer{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoggerInterceptor());
	}
	
	@Bean
	public CommonsMultipartResolver multipartResolver(){
		CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
		// Encoding을 UTF-8으로 맞춤
		commonsMultipartResolver.setDefaultEncoding("UTF-8");
		// 최대 5MB까지 허용
		commonsMultipartResolver.setMaxUploadSizePerFile(5*1024*1024);
		return commonsMultipartResolver;
	}

	// Spring Boot 2.1.x 버전 아래에서 한글 처리를 위한 인코딩 필터 설정 시작
	/*
	@Bean
	public Filter characterEncodingFilter(){
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceEncoding(true);

		return characterEncodingFilter;
	}

	@Bean
	public HttpMessageConverter<String> responseBodyConverter(){
		return new StringHttpMessageConverter(Charset.forName("UTF-8"));
	}
	*/
	// 끝
}
