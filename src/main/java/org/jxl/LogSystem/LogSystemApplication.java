package org.jxl.LogSystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.jxl.LogSystem.mapper")
public class LogSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(LogSystemApplication.class,args);
    }
}
