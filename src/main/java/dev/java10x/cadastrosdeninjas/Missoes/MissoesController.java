package dev.java10x.cadastrosdeninjas.Missoes;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/missoes")
@AllArgsConstructor
public class MissoesController {
  private final MissoesService missoesService;

  @GetMapping
  public ResponseEntity<List<MissoesModel>> listAll() {
    List<MissoesModel> missoesModelList = missoesService.listAll();
    return ResponseEntity.ok(missoesModelList);
  }
}
