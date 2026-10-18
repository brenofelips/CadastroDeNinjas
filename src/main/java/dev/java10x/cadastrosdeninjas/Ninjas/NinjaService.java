package dev.java10x.cadastrosdeninjas.Ninjas;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NinjaService {
  private final NinjaRepository ninjaRepository;

  public List<NinjaModel> listAll() {
    return ninjaRepository.findAll();
  }
}
