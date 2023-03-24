package com.example.demoscan;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(
     basePackages = {"com.example.demoscan.mods.hi"}
)
@ConditionalOnProperty(name = "mod.hi.enabled", havingValue = "true")
@Configuration
public class DemoMod {
}
