<h1>Manual de Instalação</h1>

<h2 style="color: #0080c0;">- Requisitos</h2>
<ul>
  <li>Java JDK instalado</li>
  <li>Apache Maven instalado</li>
  <li>IntelliJ IDEA</li>
  <li>JavaFX SDK instalado</li>
  <li>Scene Builder instalado</li>
</ul>

<h2 style="color: #0080c0;">- Clonando o Projeto</h2>
<p>
Para obter o código do projeto, utilize o seguinte comando no terminal:
</p>

<pre>
git clone https://github.com/DataTech-API/API-2Semestre.git
</pre>

<p>
Após o clone, acesse a pasta do projeto:
</p>

<pre>
cd API-2Semestre
</pre>

<h2 style="color: #0080c0;">- Abrindo o Projeto</h2>
<ul>
  <li>Abrir o IntelliJ IDEA</li>
  <li>Selecionar a opção "Open"</li>
  <li>Escolher a pasta do projeto API-2Semestre</li>
  <li>Aguardar o carregamento das dependências do Maven</li>
</ul>

<h2 style="color: #0080c0;">- Configuração do JavaFX</h2>
<ul>
  <li>Garantir que o JavaFX esteja configurado no projeto</li>
  <li>Utilizar o Maven para executar a aplicação com suporte ao JavaFX</li>
</ul>

<h2 style="color: #0080c0;">- Configuração do Scene Builder</h2>
<ul>
  <li>Instalar o Scene Builder</li>
  <li>Associar o Scene Builder aos arquivos FXML no IntelliJ</li>
  <li>Utilizar o Scene Builder para edição visual das telas do sistema</li>
</ul>

<h2 style="color: #0080c0;">- Executando o Sistema</h2>
<p>
O sistema deve ser executado utilizando o Maven com suporte ao JavaFX:
</p>

<pre>
mvn javafx:run
</pre>

<p>
Também é possível executar pelo IntelliJ utilizando a aba Maven:
</p>

<ul>
  <li>Acessar a aba Maven</li>
  <li>Ir em Plugins → javafx</li>
  <li>Executar a opção javafx:run</li>
</ul>

<h2 style="color: #0080c0;">- Observações</h2>
<ul>
  <li>O projeto utiliza JavaFX para a interface gráfica</li>
  <li>O Scene Builder é utilizado para edição das telas em FXML</li>
  <li>O projeto não utiliza banco de dados nesta versão</li>
  <li>Os dados são manipulados em memória</li>
</ul>