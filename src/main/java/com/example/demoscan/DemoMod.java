package com.example.demoscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(
     basePackages = {"com.example.demoscan.mods.hi"}
)
@Configuration
public class DemoMod {
}
