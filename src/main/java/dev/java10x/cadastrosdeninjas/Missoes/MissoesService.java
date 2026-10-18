package dev.java10x.cadastrosdeninjas.Missoes;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MissoesService {
  private final MissoesRepository missoesRepository;

  public List<MissoesModel> listAll() {
    return missoesRepository.findAll();
  }
}
