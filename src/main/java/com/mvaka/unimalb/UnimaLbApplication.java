package com.mvaka.unimalb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class UnimaLbApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnimaLbApplication.class, args);
	}
    @GetMapping
        public List<String> Testing(){
            return List.of("Testing Testing hello world", "Testing Testing hello world","Testing Testing hello world");
        }
}
