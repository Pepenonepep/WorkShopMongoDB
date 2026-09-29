# WorkShopMongoDB 🍃

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white)

## 📌 Sobre o Projeto
Este é um projeto de API RESTful desenvolvido com **Java** e **Spring Boot**, utilizando o banco de dados NoSQL **MongoDB**. 

O projeto foi construído como parte prática das aulas do curso "Java COMPLETO – Programação Orientada a Objetos + Projetos" ministrado pelo professor Nélio Alves. O objetivo principal do workshop é demonstrar a diferença de paradigma entre bancos de dados relacionais e não-relacionais, além de aplicar boas práticas de desenvolvimento backend, focando na estruturação de dados e realização de consultas.

## 🚀 Tecnologias Utilizadas
O projeto foi desenvolvido com as seguintes tecnologias:
- **Java**
- **Spring Boot**
- **Spring Data MongoDB**
- **Maven** (Gerenciamento de dependências)
- **MongoDB** (Banco de dados NoSQL)
- **Postman** (Para testes da API)

## ⚙️ Funcionalidades
A API simula um sistema de rede social simples, com foco em operações de leitura e consultas:
- Retorno de dados de Usuários (`User`) e Posts através de requisições GET (`@GetMapping`).
- Estruturação de associação entre entidades (Posts e Usuários).
- Modelagem de objetos aninhados (Comentários dentro de Posts).
- Consultas simples e avançadas utilizando `@Query` do Spring Data.

## 🛠️ Como executar o projeto localmente

### Pré-requisitos
Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
- [Git](https://git-scm.com)
- [Java JDK](https://www.oracle.com/java/technologies/downloads/) (versão utilizada no projeto)
- [MongoDB](https://www.mongodb.com/try/download/community) (Rodando localmente na porta padrão `27017` ou configurado via MongoDB Atlas)

### Passos para rodar
1. Clone este repositório:
   ```bash
   git clone [https://github.com/SEU_USUARIO/WorkShopMongoDB.git](https://github.com/SEU_USUARIO/WorkShopMongoDB.git)
