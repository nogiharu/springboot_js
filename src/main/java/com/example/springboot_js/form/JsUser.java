package com.example.springboot_js.form;

import org.springframework.format.annotation.NumberFormat;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JsUser {
    private String name;
    private Integer age;
    private Integer id;
    @NumberFormat
    private Integer url;
}