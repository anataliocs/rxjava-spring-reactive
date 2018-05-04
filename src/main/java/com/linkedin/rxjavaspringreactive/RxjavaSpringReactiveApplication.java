package com.linkedin.rxjavaspringreactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class RxjavaSpringReactiveApplication {

  public static void main(String[] args) {
    SpringApplication.run(RxjavaSpringReactiveApplication.class, args);
  }
}
