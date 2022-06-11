package me.dio.academia.digital.entity;

import java.time.LocalDateTime;
@data
@noArgConstructor
@AllArgsConstructor
@entity
@table(name = "tb_matriculas")
public class Matricula {
  @id
  @generatedValue(strategy = generationType.Identity)
  private Long id;
  @oneToOne(cascade = cascadeType.ALL)
  @joinColumn(name = "aluno_id")
  private Aluno aluno;

  private LocalDateTime dataDaMatricula = LocalDateTime.now();
}
