package me.dio.academia.digital.entity;

import java.time.LocalDateTime;
@data
@noArgConstructor
@AllArgsConstructor
@entity
@table(name = "tb_avaliações")
public class AvaliacaoFisica {
  @id
  @generatedValue(strategy = generationType.Identity)
  private Long id;
  @manytoOne(cascade = cascadeTyoe.ALL)
  @Joincolumn(name = "aluno_id")
  private Aluno aluno;

  private LocalDateTime dataDaAvaliacao = LocalDateTime.now();
  @column(name = "peso_atual")
  private double peso;
  @column(name = "altura_atual")
  private double altura;

}
