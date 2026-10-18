# 🥷 Sistema de Cadastro de Ninjas

Bem-vindo ao **Sistema de Cadastro de Ninjas**!

Este projeto consiste em uma aplicação desenvolvida com **Spring Boot** e baseada em arquitetura em camadas, com o objetivo de gerenciar o cadastro de ninjas e suas respectivas missões.

A aplicação permite cadastrar ninjas, gerenciar missões e estabelecer relacionamentos entre essas entidades. O projeto também aborda boas práticas de desenvolvimento, controle de versão com Git, hospedagem no GitHub e conceitos mais aprofundados de bancos de dados.

## 📋 Visão Geral

O sistema foi desenvolvido para gerenciar ninjas e missões, seguindo as seguintes regras de negócio:

- Cadastro de ninjas com nome, idade, e-mail e rank.
- Cadastro e gerenciamento de missões.
- Atribuição de missões aos ninjas.
- Consulta e gerenciamento dos ninjas associados a cada missão.

### Relacionamento entre as entidades

O modelo de dados utiliza um relacionamento **muitos para um (*Many-to-One*)** entre Ninja e Missão:

- Cada ninja pode estar associado a, no máximo, uma missão.
- Uma missão pode estar associada a vários ninjas.

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Descrição |
|---|---|
| **Java** | Linguagem de programação utilizada no desenvolvimento. |
| **Spring Boot** | Framework para desenvolvimento da aplicação e gerenciamento de dependências. |
| **Spring Data JPA** | Abstração para acesso e persistência de dados. |
| **JPA / Hibernate** | Mapeamento objeto-relacional (ORM). |
| **H2 Database** | Banco de dados em memória para desenvolvimento e testes. |
| **Flyway** | Gerenciamento e versionamento das migrações do banco de dados. |
| **Maven** | Build e gerenciamento de dependências. |
| **Docker** | Suporte à execução de serviços de banco de dados em contêineres. |
| **SQL** | Linguagem utilizada para consultas e manipulação de dados. |
| **Git** | Controle de versão do código-fonte. |
| **GitHub** | Hospedagem do repositório e colaboração no desenvolvimento. |

## 🗄️ Modelagem do Banco de Dados

O banco de dados é estruturado em duas entidades principais:

### Ninja

Representa os ninjas cadastrados no sistema.

**Atributos:**
- `id`: identificador único.
- `nome`: nome do ninja.
- `idade`: idade do ninja.
- `email`: endereço de e-mail.
- `rank`: classificação do ninja.
- `missao`: missão associada ao ninja.

### Missão

Representa as missões disponíveis no sistema.

**Atributos:**
- `id`: identificador único.
- `titulo`: título da missão.
- `descricao`: descrição detalhada da missão.

**Relacionamento:** uma missão pode ser compartilhada por vários ninjas, enquanto cada ninja pode possuir apenas uma missão associada.

## 🚀 Como Executar o Projeto

### Pré-requisitos

Antes de iniciar, certifique-se de ter instalado:

- [Java JDK](https://www.oracle.com/java/technologies/downloads/) — versão compatível com o projeto.
- [Apache Maven](https://maven.apache.org/).
- [Git](https://git-scm.com/).
- [Docker](https://www.docker.com/) — caso queira executar serviços adicionais de banco de dados em contêineres.

### 1. Clone o repositório

```bash
git clone https://github.com/horaciomuller/CadastroDeNinjas.git
```

### 2. Acesse o diretório do projeto

```bash
cd CadastroDeNinjas
```

### 3. Compile e empacote a aplicação

```bash
mvn clean install
```

### 4. Execute a aplicação

```bash
mvn spring-boot:run
```

### 5. Acesse a aplicação

Após iniciar o servidor, acesse:

**http://localhost:8080**

> **Nota:** o projeto utiliza o banco H2 em memória. A configuração efetiva do banco, do Flyway e de eventuais serviços Docker depende dos arquivos de configuração presentes no repositório.

## 📚 Conteúdos Abordados

Além das funcionalidades de cadastro e gerenciamento, o projeto permite explorar conceitos importantes para o desenvolvimento backend:

- Arquitetura em camadas.
- Desenvolvimento de APIs com Spring Boot.
- Persistência de dados com Spring Data JPA.
- Mapeamento objeto-relacional com JPA.
- Versionamento de esquemas com Flyway.
- Modelagem de dados e relacionamentos entre entidades.
- Consultas e manipulação de dados com SQL.
- Gerenciamento de dependências e build com Maven.
- Controle de versão com Git e GitHub.
- Conceitos aprofundados de bancos de dados.

## 📌 Objetivo do Projeto

Consolidar conhecimentos em desenvolvimento backend com Java e Spring Boot, aplicando conceitos de persistência de dados, modelagem relacional, migrações de banco de dados e organização de código por camadas.

## 🔗 Repositório

[CadastroDeNinjas — GitHub](https://github.com/horaciomuller/CadastroDeNinjas)
