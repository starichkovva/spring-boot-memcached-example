package org.starichkov.java.spring.memcached;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootMemcachedExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMemcachedExampleApplication.class, args);
    }

}
