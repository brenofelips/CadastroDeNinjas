package dev.java10x.cadastrosdeninjas.Ninjas;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ninjas")
@AllArgsConstructor
public class NinjaController {

  @GetMapping
  public void listName() {
    System.out.println("Listando o meu ninja");
  }
}
