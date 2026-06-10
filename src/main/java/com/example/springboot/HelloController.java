package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/")
  public String index() {
    return "Foi bem longo o processo mas no final tudo saiu funcionando! Viva!!!!!";
  }

}