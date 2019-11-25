package com.sheva;

import com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sheva
 */
@SpringBootApplication(exclude = PageHelperAutoConfiguration.class)
public class SpringbootdruidApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdruidApplication.class, args);
    }

}
