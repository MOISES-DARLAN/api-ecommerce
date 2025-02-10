# Projeto de Cadastro de Usuários

Este projeto implementa uma API de cadastro de usuários com validação de CPF e e-mail. A API oferece um endpoint para criar novos usuários, garantindo que não existam duplicidades no banco de dados. Caso o CPF ou o e-mail já estejam cadastrados, a API retorna um erro apropriado.

## Funcionalidades

- **Cadastro de Usuário**: Criação de um novo usuário, com validação de CPF e e-mail.
- **Validação de CPF**: Verifica se o CPF fornecido já está registrado.
- **Validação de E-mail**: Verifica se o e-mail fornecido já está registrado.
- **Mensagens de Erro**: Retorna uma mensagem de erro clara caso o CPF ou o e-mail já exista.

## Tecnologias

- **Spring Boot**: Framework principal para o desenvolvimento da API.
- **JPA (Hibernate)**: Para persistência no banco de dados.
- **Validação de Dados**: Utiliza anotações do `jakarta.validation` e `hibernate-validator` para validações.
- **Banco de Dados Relacional**: Utilização de um banco de dados relacional para armazenar os dados dos usuários.

## Endpoints da API

### 1. **Cadastrar um Usuário**

**Método**: `POST`  
**URL**: `/api/v1/users`  
**Descrição**: Cadastra um novo usuário no sistema.

#### Request (Exemplo):

```json
{
  "name": "João Silva",
  "cpf": "12345678900",
  "email": "joao@example.com",
  "password": "senha123",
  "data_birth": "1990-01-01"
}
