package dev.java10x.cadastrosdeninjas.Ninjas;

import dev.java10x.cadastrosdeninjas.Missoes.MissoesModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // Construtor cheio
@NoArgsConstructor // Construtor vazio
@Entity
@Table(name = "tb_ninjas")
public class NinjaModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private String email;
  private int idade;

  @ManyToOne // @ManyToOne -> um ninja tme uma única missão
  @JoinColumn(name = "missoes_id")
  private MissoesModel missoes;
}
