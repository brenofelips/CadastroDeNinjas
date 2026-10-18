package dev.java10x.cadastrosdeninjas.Missoes;

import dev.java10x.cadastrosdeninjas.Ninjas.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private String dificuldade;

  @OneToMany(mappedBy = "missoes") // @OneToMany -> uma missão pode ter vários ninjas
  private List<NinjaModel> ninjas;
}
