package com.example.demoscan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(
    basePackages = {"com.example.demoscan"},
    excludeFilters = @Filter(
        type = FilterType.REGEX,
        pattern = "com\\.example\\.demoscan\\.mods..*"
    )
)
public class DemoscanApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoscanApplication.class, args);
  }

}
