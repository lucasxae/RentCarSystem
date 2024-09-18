# Sistema de Aluguel de Veículos

Pretende-se desenvolver um sistema para apoio à gestão de aluguéis de automóveis que permita efetuar, cancelar e modificar pedidos através da Internet.

<details>
<summary><b>Mais detalhes</b></summary>

1. O sistema só pode ser utilizado após cadastro prévio.
2. Os usuários individuais (clientes) podem introduzir, modificar, consultar e cancelar pedidos de aluguel (assinatura). Por outro lado, os agentes (empresas e bancos) podem modificar e avaliar pedidos.
3. Após introdução no sistema, os pedidos são analisados do ponto de vista financeiro pelos agentes e, em caso de parecer positivo, são colocados à sua consideração para execução do contrato.
4. Sobre os contratantes do aluguel (assinatura), armazenam-se os dados de identificação (RG, CPF, Nome, Endereço), profissão, as entidades empregadoras e os respectivos rendimentos auferidos (máximo 3).
5. Dependendo do tipo de contrato, os automóveis alugados podem ser registrados como propriedade dos clientes, empresas ou bancos.
6. Sobre os automóveis, o sistema registra a matrícula, ano, marca, modelo e placa.
7. O aluguel (assinatura) de um automóvel pode estar associado com um contrato de crédito (seguro), o qual foi concedido por um dos bancos agentes. 
8. Em termos do sistema, o servidor central encontra-se ligado aos computadores locais dos clientes e aos diversos agentes aderentes através da Internet.
9. O sistema pode ser subdividido em dois subsistemas: um para gestão de pedidos e contratos; e outro para a construção dinâmica das páginas web.

**Informações Complementares:**
- A empresa de locação trabalha com o sistema de Assinatura (aluguel de longa permanência) e os contratos podem ser de: 12, 24, 36 ou 48 meses.
- Ao selecionar o tipo de contratante, o contratante tem a opção de optar pela possível compra do veículo ao final do contrato, e nestes casos, o veículo já irá ter seu documento de propriedade emitido em nome do contratante.

</details>

## Histórias de Usuário

### 1. Cadastro de Usuário
**Como** um usuário (cliente ou agente), **eu quero** me cadastrar no sistema, **para** poder acessar suas funcionalidades.

**Critérios de Aceite:**
- O sistema deve permitir o cadastro com nome, e-mail, senha, e tipo de usuário (cliente ou agente).
- Dados obrigatórios: Nome, e-mail, senha.
- Após o cadastro, o sistema deve enviar um e-mail de confirmação.
- O usuário só pode acessar o sistema após a confirmação do e-mail.
- O sistema deve validar se o e-mail já está registrado e se a senha atende aos requisitos de segurança.

---

### 2. Introduzir Pedido de Aluguel
**Como** um cliente, **eu quero** introduzir um pedido de aluguel de um automóvel, **para** iniciar o processo de locação.

**Critérios de Aceite:**
- O cliente deve estar logado para fazer um pedido.
- O sistema deve permitir que o cliente selecione o automóvel desejado, insira os dados do contrato (período, tipo de contrato), e confirme o pedido.
- O pedido deve ser registrado no sistema com status “Em análise financeira”.
- O sistema deve validar se todos os campos obrigatórios foram preenchidos (dados do carro, período, tipo de contrato).
- O pedido deve ser associado ao cliente e estar disponível para consulta.

---

### 3. Modificar Pedido de Aluguel
**Como** um cliente, **eu quero** modificar um pedido de aluguel existente, **para** ajustar informações antes de sua aprovação.

**Critérios de Aceite:**
- O cliente só pode modificar pedidos que ainda estão “Em análise financeira”.
- O sistema deve permitir alterações nas informações de período, tipo de contrato e automóvel selecionado.
- O sistema deve registrar as modificações feitas e atualizar o pedido.
- As modificações devem ser salvas e refletidas no sistema imediatamente.

---

### 4. Cancelar Pedido de Aluguel
**Como** um cliente, **eu quero** cancelar um pedido de aluguel, **para** não prosseguir com a locação.

**Critérios de Aceite:**
- O cliente deve poder cancelar pedidos com status “Em análise financeira”.
- O sistema deve pedir uma confirmação antes de cancelar o pedido.
- Após o cancelamento, o pedido deve ser marcado como “Cancelado” e não pode mais ser modificado ou reativado.
- O pedido cancelado deve ser visível no histórico do cliente.

---

### 5. Avaliar Pedido de Aluguel
**Como** um agente (empresa ou banco), **eu quero** avaliar financeiramente um pedido de aluguel, **para** determinar se o cliente está apto para a execução do contrato.

**Critérios de Aceite:**
- O agente deve estar logado e ter permissões para acessar pedidos pendentes.
- O agente deve poder consultar os dados financeiros do cliente (rendimento, empregador) e do pedido.
- O sistema deve permitir o agente aprovar ou rejeitar o pedido.
- O status do pedido deve ser atualizado para “Aprovado” ou “Rejeitado” após a avaliação.
- O agente deve registrar uma justificativa para a rejeição, se aplicável.

---

### 6. Consultar Pedido de Aluguel
**Como** um cliente ou agente, **eu quero** consultar os detalhes de um pedido de aluguel, **para** acompanhar seu status e informações.

**Critérios de Aceite:**
- O sistema deve permitir consultas de pedidos ativos ou cancelados.
- O cliente deve poder visualizar seus próprios pedidos; o agente, todos os pedidos pendentes.
- O sistema deve exibir o status do pedido (em análise, aprovado, rejeitado, cancelado) e seus detalhes.
- O sistema deve garantir que agentes não possam modificar pedidos durante a consulta.

---

### 7. Registro de Automóvel
**Como** um agente, **eu quero** registrar os dados de automóveis no sistema, **para** torná-los disponíveis para aluguel.

**Critérios de Aceite:**
- O agente deve estar logado e autorizado para registrar automóveis.
- O sistema deve permitir o registro da matrícula, ano, marca, modelo e placa do automóvel.
- O automóvel deve ser associado à empresa, banco ou cliente, dependendo do tipo de contrato.
- O automóvel registrado deve estar disponível para seleção nos pedidos de aluguel.

---

### 8. Associar Contrato de Crédito ao Aluguel
**Como** um cliente ou agente, **eu quero** associar um contrato de crédito ao aluguel de um automóvel, **para** vincular o aluguel a uma instituição financeira.

**Critérios de Aceite:**
- O sistema deve permitir a associação de um contrato de crédito a um pedido de aluguel.
- O contrato de crédito deve estar registrado com os dados da instituição financeira (banco) que o concedeu.
- O pedido de aluguel associado ao contrato de crédito deve incluir as informações financeiras do banco.
- O sistema deve validar se o contrato de crédito é compatível com o tipo de pedido de aluguel.

# Apresentação Final:

Ao final da última sprint (Sprint 03), os alunos deverão apresentar o protótipo produzido, comparando-os com os modelos descritos inicialmente, bem como apresentando as modificações inseridas para o funcionamento adequado do software (conforme a especificação anterior). O sistema deverá ser desenvolvido em Java, utilizando arquitetura MVC, e atendendo aos requisitos apresentados e cumprindo a modelagem produzida nas sprints iniciais do projeto. O repositório GitHub deve estar atualizado, com todas as versões produzidas dos modelos UML e o código final desenvolvido. A avaliação final do projeto levará em consideração os seguintes aspectos:

Qualidade do sistema produzido (adequação aos requisitos apresentados);
Alinhamento entre modelo (de classes e de arquitetura) e código;
Atualizações dos modelos conforme necessidade do projeto.
# Processo de Desenvolvimento:
- Lab02S01:  Modelagem do sistema: Diagrama de Casos de Uso, Histórias do Usuário, Diagrama de Classes e Diagrama de Pacotes (Visão Lógica).

- Lab02S02: Revisão dos diagramas, de acordo com feedback em aula + Diagrama de Componentes do Sistema + Implementação do CRUD de cliente (atendendo aos RNFs de ser um sistema WEB, em Java, com MVC);

- Lab02S03: Revisão dos diagramas, de acordo com feedback em aula + Diagrama de Implantação + Implementação de um protótipo do sistema, que permita que os usuários criados possam criar e visualizar o status de um pedido de aluguel;

Prazo final: 24/09| Apresentação: 25/09| Valor total: 20 pontos | Desconto de 1.0 ponto por dia de atraso
