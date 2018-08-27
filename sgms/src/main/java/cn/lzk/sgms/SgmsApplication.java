package cn.lzk.sgms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.lzk.sgms.dao")
public class SgmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgmsApplication.class, args);
	}
}
