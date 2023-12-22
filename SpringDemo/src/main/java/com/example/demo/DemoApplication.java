package com.example.demo;

import com.example.demo.config.MyConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    
    Logger logger = LoggerFactory.getLogger(DemoApplication.class);
    
    private final JdbcTemplate jdbcTemplate;
    private final MyConfig myConfig;

    DemoApplication(JdbcTemplate jdbcTemplate, MyConfig myConfig){
        this.jdbcTemplate = jdbcTemplate;
        this.myConfig = myConfig;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        jdbcTemplate.execute("create table asd (col1 int, col2 varchar(30))");
        jdbcTemplate.update("insert into asd (col1, col2) values (1, 'asd')");
        var resultQuery = jdbcTemplate.queryForList("select * from asd");
        
        logger.info("{}, app is running, result query: {}", myConfig.getGreetings(), resultQuery);
    }
}
