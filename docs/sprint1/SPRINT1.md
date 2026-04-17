<h1 align="center" style="color: #0080c0;">Sprint 1 - Detalhamento</h1>

<hr style="border: 0.5px solid #333;">

<h2 style="color: #0080c0;">- Backlog da Sprint 1</h2>

<table width="100%" style="border-collapse: collapse; background-color: #1e1e1e; color: white; border: 1px solid #333;">
  <tr style="background-color: #2d2d2d; color: #ffffff;">
    <th style="padding: 10px; border: 1px solid #333;">Rank</th>
    <th style="padding: 10px; border: 1px solid #333;">Prioridade</th>
    <th style="padding: 10px; border: 1px solid #333;">User Story</th>
    <th style="padding: 10px; border: 1px solid #333;">Estimativa</th>
    <th style="padding: 10px; border: 1px solid #333;">Sprint</th>
  </tr>
  <tr>
    <td align="center" style="padding: 10px; border: 1px solid #333;">1</td>
    <td align="center" style="padding: 10px; border: 1px solid #333;">Alta</td>
    <td style="padding: 10px; border: 1px solid #333;">Como professor, quero distribuir automaticamente os conteúdos ao longo das aulas do semestre considerando o calendário acadêmico, para reduzir o tempo gasto no planejamento das aulas.</td>
    <td align="center" style="padding: 10px; border: 1px solid #333;">5</td>
    <td align="center" style="padding: 10px; border: 1px solid #333;">1</td>
  </tr>
  <tr>
    <td align="center" style="padding: 10px; border: 1px solid #333;">2</td>
    <td align="center" style="padding: 10px; border: 1px solid #333;">Alta</td>
    <td style="padding: 10px; border: 1px solid #333;">Como professor, quero visualizar em um único lugar todas as aulas da disciplina com suas datas e conteúdos, para planejar o semestre com mais facilidade e evitar erros no planejamento.</td>
    <td align="center" style="padding: 10px; border: 1px solid #333;">8</td>
    <td align="center" style="padding: 10px; border: 1px solid #333;">1</td>
  </tr>
  <tr>
    <td align="center" style="padding: 10px; border: 1px solid #333;">3</td>
    <td align="center" style="padding: 10px; border: 1px solid #333;">Alta</td>
    <td style="padding: 10px; border: 1px solid #333;">Como professor, quero registrar o conteúdo de cada aula, para planejar corretamente os tópicos que serão ensinados ao longo do semestre.</td>
    <td align="center" style="padding: 10px; border: 1px solid #333;">5</td>
    <td align="center" style="padding: 10px; border: 1px solid #333;">1</td>
  </tr>
  <tr>
    <td align="center" style="padding: 10px; border: 1px solid #333;">4</td>
    <td align="center" style="padding: 10px; border: 1px solid #333;">Alta</td>
    <td style="padding: 10px; border: 1px solid #333;">Como professor, quero verificar se a quantidade de aulas planejadas corresponde à carga horária da disciplina, para evitar inconsistências no planejamento.</td>
    <td align="center" style="padding: 10px; border: 1px solid #333;">3</td>
    <td align="center" style="padding: 10px; border: 1px solid #333;">1</td>
  </tr>
</table>

<h2 style="color: #0080c0;">- Definition of Ready (DoR) – Sprint 1</h2>

<ul>
  <li>A User Story está escrita no formato <b>Como [participante], quero [ação], para [benefício]</b>.</li>
  <li>O participante está claramente definido.</li>
  <li>As regras de negócio da funcionalidade estão definidas.</li>
  <li>Os dados necessários para a funcionalidade foram identificados.</li>
  <li>As mensagens de confirmação, erro ou aviso foram definidas.</li>
  <li>Existe um esboço da interface da funcionalidade (wireframe ou protótipo).</li>
  <li>A User Story possui prioridade definida no backlog.</li>
  <li>A User Story possui estimativa definida pela equipe.</li>
  <li>A equipe compreende a User Story.</li>
</ul>

<h2 style="color: #0080c0;">- Definition of Done (DoD) – Sprint 1</h2>

<ul>
  <li>Existe uma interface funcional da funcionalidade.</li>
  <li>A funcionalidade pode ser demonstrada durante a apresentação da Sprint.</li>
  <li>O código foi versionado no GitHub do projeto.</li>
  <li>A documentação da Sprint 1 foi atualizada no repositório.</li>
  <li>Existe um esboço da interface (wireframe ou Figma) associado à User Story.</li>
  <li>A equipe consegue apresentar a solução em formato de pitch de negócio.</li>
  <li>A funcionalidade funciona mesmo sem conexão com banco de dados, podendo utilizar dados em memória.</li>
  <li>Os membros da equipe testaram o projeto.</li>
  <li>A User Story foi revisada pela equipe.</li>
</ul>

<h2 style="color: #0080c0;">- Regras de Negócio</h2>

<ul>
  <li>As aulas devem ser exibidas em ordem cronológica, mostrando a data e o conteúdo de cada aula.</li>
  <li>A distribuição dos conteúdos deve considerar as datas disponíveis do semestre.</li>
  <li>Datas que coincidam com feriados ou eventos acadêmicos não podem receber aulas.</li>
  <li>Cada aula deve possuir um conteúdo associado a uma data válida.</li>
  <li>A quantidade de aulas planejadas deve ser comparada com a carga horária da disciplina.</li>
</ul>

<h2 style="color: #0080c0;">- Esboço de Tela</h2>

<p>O protótipo das telas da Sprint 1 foi desenvolvido no Figma.</p>

<p>
  <a href="https://www.figma.com/make/dQJGfd3mXLoZM9VYdFrzIv/Plataforma-de-Planejamento-de-Aulas?fullscreen=1&t=4SphBk2P0XcH1GBs-1&preview-route=%2Fcriar" style="color: #0080c0;">Acessar wireframe no Figma</a>
</p>

<h2 style="color: #0080c0;">- Dados a Armazenar</h2>

<ul>
  <li><b>Curso:</b> id, nome</li>
  <li><b>Disciplina:</b> id, idCurso, nome, cargaHorariaTotal, horários</li>
  <li><b>Aula:</b> id, idDisciplina, data, dataOriginal, bloco, tipo, conteúdo, remanejada</li>
  <li><b>CalendarioAcademico:</b> dataInicio, dataFim, feriados, emendas, diasLetivos, diasNaoLetivos, diasBloqueadosProva</li>
  <li><b>HorarioAula:</b> DiasDaSemana, bloco</li>
</ul>

<h2 style="color: #0080c0;">- Mensagens</h2>

<ul>
  <li><b>Sucesso:</b> "Conteúdo registrado com sucesso"</li>
  <li><b>Sucesso:</b> "Conteúdos distribuídos com sucesso"</li>
  <li><b>Aviso:</b> "Nenhuma aula cadastrada para esta disciplina"</li>
  <li><b>Aviso:</b> "Carga horária divergente"</li>
  <li><b>Erro:</b> "Não foi possível concluir a operação"</li>
</ul>
