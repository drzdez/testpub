/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Student
 */
@Configuration
public class MyConfig {
    
    @Value(value="${gopas.test.param.greeting:Ok}")
    private String greetings;
    
    public String getGreetings(){
        return greetings;
    }
    
}
