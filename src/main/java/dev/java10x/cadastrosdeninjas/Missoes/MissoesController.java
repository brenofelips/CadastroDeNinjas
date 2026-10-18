package dev.java10x.cadastrosdeninjas.Missoes;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

  // GET -- Mandar uma requisao para mostrar as missoes
  @GetMapping("/listar")
  public String listarMissao() {
    return "Missoes listadas com sucesso";
  }

  // Post -- Mandar uma requisao para criar as missoes
  @PostMapping("/criar")
  public String criarMissao() {
    return "Missao criada com sucesso";
  }

  // PUT -- Mandar uma requisao para alterar as missoes
  @PutMapping("/alterar")
  public String alterarMissao() {
    return "Missao alterada com sucesso";
  }

  // Delete -- Mandar uma requisao para deletar as missoes
  @DeleteMapping("/deletar")
  public String deletarMissao() {
    return "Missao deletada com sucesso";
  }
}
