package me.dio.academia.digital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@data
@noArgConstructor
@AllArgsConstructor
@entity
@table(name = "tb_alunos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Aluno {

  @id
  @generatedValue(strategy = generationType.Identity)
  private Long id;

  @column(unique = true)
  private String nome;

  private String cpf;

  private String bairro;

  private LocalDate dataDeNascimento;
  @OneToMany(mappedBy = "aluno", fetch = fetchType.LAZY)
  @JsonIgnore
  private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

}
