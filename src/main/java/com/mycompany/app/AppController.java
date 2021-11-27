package com.mycompany.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AppController {

  @RequestMapping("/healthcheck")
  public String getHealth() {
   return "Appication is Healthy";
  }

}