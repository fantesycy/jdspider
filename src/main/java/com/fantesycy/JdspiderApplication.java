package com.fantesycy;

import com.fantesycy.bean.GoodsInfo;
import com.fantesycy.repository.GoodInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JdspiderApplication {

	@Autowired
	public SpiderHandler spiderHandler;

	@Autowired
	public GoodInfoRepository goodInfoRepository;


	public static void main(String[] args) {
		SpringApplication.run(JdspiderApplication.class, args);
	}

	@PostConstruct
	public void task() {
		spiderHandler.spiderData();
//		GoodsInfo goodsInfo = new GoodsInfo(null,"1","2","3","4");
//		goodInfoRepository.save(goodsInfo);
	}
	//使用@PostConstruct注解会在spring容器实例化bean之前执行这个方法
}
