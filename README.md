# E-commerce API - Gerenciamento de Usuários

## Descrição

Este projeto é uma API REST desenvolvida em **Spring Boot** para gerenciar usuários de um sistema de e-commerce. A API fornece endpoints para operações CRUD (Create, Read, Update e Delete) sobre os usuários.

## Tecnologias Utilizadas

- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **Jakarta Validation**
- **Banco de dados relacional (ex.: PostgreSQL, MySQL)**

## Endpoints Disponíveis

### Listar todos os usuários
**GET /api/v1/users**  
Retorna uma lista de todos os usuários cadastrados.

```json
[
	{
		"cod_pessoa": 8,
		"name": "Fernando Lima",
		"cpf": "74185296300",
		"email": "fernando.lima@example.com",
		"password": "senhaSegura!",
		"data_birth": "1985-07-19",
		"data_cadastre": "2025-02-09"
	},
	{
		"cod_pessoa": 9,
		"name": "Fernando Lima",
		"cpf": "74185296300",
		"email": "fernando.lima@example.com",
		"password": "senhaSegura!",
		"data_birth": "1985-07-19",
		"data_cadastre": "2025-02-09"
	},
	{
		"cod_pessoa": 10,
		"name": "Ana Souza",
		"cpf": "32178965400",
		"email": "ana.souza@example.com",
		"password": "123mudar",
		"data_birth": "1992-12-05",
		"data_cadastre": "2025-02-09"
	}
  ]
```

### Buscar usuário por ID
**GET /api/v1/users/{id}**  
Retorna os detalhes de um usuário específico.

```json
{
	"id": 2,
	"name": "Maria Oliveira",
	"cpf": "98765432100",
	"email": "maria.oliveira@example.com",
	"data_birth": "1988-09-23"
}

```

### Criar um novo usuário
**POST /api/v1/users**  
Cria um novo usuário no sistema. É necessário enviar um JSON válido com os dados do usuário.

#### Envie um json desse modelo: 
```json
 {
      "name": "Rafael Costa",
        "cpf": "65432178900",
        "email": "rafael.costa@example.com",
        "password": "rafaSenha2023",
        "data_birth": "2001-09-18"
    }
```

#### Receba o seguinte Json como confirmação de cadastro:
```json
{
  "id": 13,
  "name": "Rafael Costa",
  "cpf": "65432178900",
  "email": "rafael.costa@example.com",
  "data_birth": "2001-09-18"
}
```

### Atualizar um usuário
**PUT /api/v1/users/{id}**  
Atualiza os dados de um usuário específico.

```json
{
  "id": 1,
  "name": "João Silva de solza",
  "cpf": "05413964200",
  "email": "joao.silva@example.com",
  "data_birth": "1995-06-15"
}
```
#### Respostas:
> 200 ok (Atualizado com sucesso)

> 400  "Error: user does not exist" (Não foi possivel atualizar)

### Deletar um usuário
**DELETE /api/v1/users**  
Remove um usuário do sistema.

#### Envie:

```json
{
    "cod_pessoa": 8,
    "name": "Fernando Lima",
    "cpf": "74185296300",
    "email": "fernando.lima@example.com",
    "password": "senhaSegura!",
    "data_birth": "1985-07-19",
    "data_cadastre": "2025-02-09"
}
```

#### Respostas
> 200 ok

> 404 User not found 

## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/MOISES-DARLAN/api-ecommerce.git
   ```
2. Acesse o diretório do projeto:
   ```bash
   cd ecommerce-api
   ```
3. Configure o banco de dados no arquivo `application.properties`.
4. Execute o projeto com o seguinte comando:
   ```bash
   mvn spring-boot:run
   ```

## Autor
Desenvolvido por **[Moisés Darlan](https://github.com/MOISES-DARLAN)** - 2025.

