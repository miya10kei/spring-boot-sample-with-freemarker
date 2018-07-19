package com.example.springbootsamplewithfreemarker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSampleWithFreemarkerApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootSampleWithFreemarkerApplication.class, args);
  }

  @Autowired private FreeMarkerService service;

  @Override
  public void run(String... args) throws Exception {
    service.out();
  }
}
