<h1 align="center" style="color: #0080c0;">Sprint 1 - Detalhamento</h1>

<hr style="border: 0.5px solid #333;">

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
  <li><b>HorarioAula:</b> dia, bloco</li>
</ul>

<h2 style="color: #0080c0;">- Mensagens</h2>

<ul>
  <li><b>Sucesso:</b> "Conteúdo registrado com sucesso"</li>
  <li><b>Sucesso:</b> "Conteúdos distribuídos com sucesso"</li>
  <li><b>Aviso:</b> "Nenhuma aula cadastrada para esta disciplina"</li>
  <li><b>Aviso:</b> "Carga horária divergente"</li>
  <li><b>Erro:</b> "Não foi possível concluir a operação"</li>
</ul>