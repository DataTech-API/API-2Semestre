<h1 align="center" style="color: #0080c0;">Sprint 2 - Detalhamento</h1>

<hr style="border: 0.5px solid #333;">

<h2 style="color: #0080c0;">📌 Backlog da Sprint 2</h2>

<p>
  <b>Sprint 2 Goal/Meta:</b> entregar prioritariamente as User Stories 5 e 6, com foco na edição do planejamento das aulas e na validação automática de feriados e eventos acadêmicos, garantindo mais flexibilidade e consistência no plano de ensino.
</p>

<p>
  <b>Sprint 2 Extra:</b> a User Story 7 será tratada como escopo adicional da Sprint, podendo ser desenvolvida caso a equipe conclua as entregas prioritárias dentro do prazo previsto.
</p>

<table width="100%" style="border-collapse: collapse; background-color: #1e1e1e; color: white; border: 1px solid #333;">
  <tr style="background-color: #2d2d2d; color: #ffffff;">
    <th style="padding: 10px; border: 1px solid #333;">Rank</th>
    <th style="padding: 10px; border: 1px solid #333;">Prioridade</th>
    <th style="padding: 10px; border: 1px solid #333;">User Story</th>
    <th style="padding: 10px; border: 1px solid #333;">Estimativa</th>
    <th style="padding: 10px; border: 1px solid #333;">Sprint</th>
  </tr>
  <tr>
    <td align="center" style="padding: 10px; border: 1px solid #333;">5</td>
    <td align="center" style="padding: 10px; border: 1px solid #333;">Alta</td>
    <td style="padding: 10px; border: 1px solid #333;">Como professor, quero editar conteúdos ou datas das aulas planejadas, para ajustar o planejamento quando houver mudanças no calendário ou na disciplina.</td>
    <td align="center" style="padding: 10px; border: 1px solid #333;">13</td>
    <td align="center" style="padding: 10px; border: 1px solid #333;">2</td>
  </tr>
  <tr>
    <td align="center" style="padding: 10px; border: 1px solid #333;">6</td>
    <td align="center" style="padding: 10px; border: 1px solid #333;">Média</td>
    <td style="padding: 10px; border: 1px solid #333;">Como professor, quero planejar minhas aulas considerando automaticamente feriados e eventos acadêmicos, para evitar marcar aulas em datas inválidas.</td>
    <td align="center" style="padding: 10px; border: 1px solid #333;">8</td>
    <td align="center" style="padding: 10px; border: 1px solid #333;">2</td>
  </tr>
  <tr>
    <td align="center" style="padding: 10px; border: 1px solid #333;">7</td>
    <td align="center" style="padding: 10px; border: 1px solid #333;">Média</td>
    <td style="padding: 10px; border: 1px solid #333;">Como coordenador, quero definir os horários das aulas da disciplina, para organizar corretamente as datas das aulas no semestre.</td>
    <td align="center" style="padding: 10px; border: 1px solid #333;">8</td>
    <td align="center" style="padding: 10px; border: 1px solid #333;">2</td>
  </tr>
</table>

<h2 style="color: #0080c0;">- Definition of Ready (DoR) – Sprint 2</h2>

<ul>
  <li>A User Story está escrita no formato <b>Como [participante], quero [ação], para [benefício]</b>.</li>
  <li>O participante está claramente definido.</li>
  <li>As regras de negócio da funcionalidade estão definidas.</li>
  <li>Os dados necessários para a funcionalidade foram identificados.</li>
  <li>As mensagens de confirmação, erro ou aviso foram definidas.</li>
  <li>A User Story possui prioridade definida no backlog.</li>
  <li>A User Story possui estimativa definida pela equipe.</li>
  <li>A equipe compreende a User Story.</li>
</ul>

<h2 style="color: #0080c0;">- Definition of Done (DoD) – Sprint 2</h2>

<ul>
  <li>Existe uma interface funcional da funcionalidade.</li>
  <li>A funcionalidade pode ser demonstrada durante a apresentação da Sprint.</li>
  <li>O código foi versionado no GitHub do projeto.</li>
  <li>A documentação da Sprint 2 foi atualizada no repositório.</li>
  <li>Os membros da equipe testaram o projeto.</li>
  <li>A User Story foi revisada pela equipe.</li>
</ul>

<h2 style="color: #0080c0;">- Regras de Negócio</h2>

<ul>
  <li>O professor deve poder editar o conteúdo e a data de aulas já planejadas.</li>
  <li>Ao editar a data de uma aula, o sistema deve validar se a nova data é permitida no calendário acadêmico.</li>
  <li>Datas que coincidam com feriados, emendas ou eventos acadêmicos não podem receber aulas.</li>
  <li>O planejamento deve ser reajustado sem perder o vínculo entre aula, conteúdo e disciplina.</li>
  <li>O coordenador deve poder definir os horários e blocos das aulas de cada disciplina.</li>
  <li>Os horários cadastrados devem ser utilizados para organizar corretamente as aulas no semestre.</li>
</ul>

<h2 style="color: #0080c0;">- Dados a Armazenar</h2>

<h2 style="color: #0080c0;">- Mensagens</h2>

<ul>
  <li><b>Sucesso:</b> "Aula atualizada com sucesso"</li>
  <li><b>Sucesso:</b> "Planejamento reajustado com sucesso"</li>
  <li><b>Sucesso:</b> "Horários da disciplina definidos com sucesso"</li>
  <li><b>Aviso:</b> "A data informada coincide com um feriado ou evento acadêmico"</li>
  <li><b>Aviso:</b> "Nenhum horário foi definido para esta disciplina"</li>
  <li><b>Erro:</b> "Não foi possível atualizar o planejamento da aula"</li>
</ul>
