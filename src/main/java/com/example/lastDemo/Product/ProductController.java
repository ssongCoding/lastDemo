package com.example.lastDemo.Product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    // 메인페이지 main.html get /product
    @GetMapping
    public String main() {
        return "main";
    }

    // 메인페이지 main.html post /product
    @PostMapping
    public String logonmain() {
        return "main";
    }

    // 상품조회 search.html get /product/search
    @GetMapping("/search")
    public String search() {
        return "search";
    }
}
