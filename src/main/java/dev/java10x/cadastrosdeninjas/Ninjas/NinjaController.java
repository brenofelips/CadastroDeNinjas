package dev.java10x.cadastrosdeninjas.Ninjas;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ninjas")
@AllArgsConstructor
public class NinjaController {
  private final NinjaService ninjaService;

  @GetMapping
  public ResponseEntity<List<NinjaModel>> listAll() {
    List<NinjaModel> ninjaModelList = ninjaService.listAll();
    return ResponseEntity.ok(ninjaModelList);
  }
}
