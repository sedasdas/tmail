package com.zxo.tmail;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zxo.tmail.mapper")
public class TmailApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmailApplication.class, args);
    }

}
