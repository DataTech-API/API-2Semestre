<h1>Estratégia de Branch</h1>

<h2 style="color: #0080c0;">- Fluxo de Trabalho</h2>
<p>
O projeto utiliza branches temporárias para o desenvolvimento das tarefas.
Cada funcionalidade, ajuste ou documentação deve ser feita em uma branch própria,
evitando alterações diretas na branch principal de desenvolvimento da sprint.
</p>

<h2 style="color: #0080c0;">- Branches Utilizadas</h2>
<ul>
  <li><b>main:</b> branch principal do projeto.</li>
  <li><b>sprint1:</b> branch utilizada para consolidar as entregas da Sprint.</li>
  <li><b>branches temporárias:</b> branches criadas para cada tarefa ou ajuste específico.</li>
</ul>

<h2 style="color: #0080c0;">- Padrão de Criação de Branch</h2>
<p>
O nome da branch deve identificar a tarefa ou funcionalidade desenvolvida.
</p>

<ul>
  <li>Exemplo: <code>SCA-9-documentacao-sprint</code></li>
  <li>Exemplo: <code>SCA-12-planejamento-controller</code></li>
</ul>

<h2 style="color: #0080c0;">- Processo de Desenvolvimento</h2>
<ol>
  <li>Atualizar a branch da sprint antes de iniciar a tarefa.</li>
  <li>Criar uma branch temporária. </li>
  <li>Realizar as alterações necessárias na branch temporária.</li>
  <li>Fazer commit das alterações seguindo o padrão definido pela equipe.</li>
  <li>Enviar a branch para o GitHub.</li>
  <li>Abrir uma Pull Request da branch temporária para <code>sprint</code>.</li>
  <li>A Pull Request deve ser revisada por pelo menos um integrante da equipe.</li>
  <li>Após aprovação, a branch pode ser integrada à <code>sprint</code>.</li>
</ol>

<h2 style="color: #0080c0;">- Revisão e Aprovação</h2>
<p>
Nenhuma alteração deve ser integrada diretamente à branch <code>sprint1</code> sem revisão.
Pelo menos um membro da equipe deve analisar a Pull Request antes do merge.
Esse processo ajuda a reduzir erros e garante maior controle sobre as entregas da sprint.
</p>

<h2 style="color: #0080c0;">- Integração com a Main</h2>
<p>
Ao final da sprint, a branch <code>sprint1</code> reúne as entregas validadas da equipe.
Após revisão e consolidação das funcionalidades da sprint, essa branch pode ser utilizada
como base para integração futura com a <code>main</code>.
</p>

<h2 style="color: #0080c0;">- Observações</h2>
<ul>
  <li>Evitar alterações diretamente na branch <code>main</code>.</li>
  <li>Evitar alterações diretamente na branch <code>sprint</code> sem Pull Request.</li>
  <li>Manter os nomes das branches claros e relacionados à tarefa.</li>
  <li>Garantir que a branch temporária esteja atualizada antes de abrir a Pull Request.</li>
</ul>
