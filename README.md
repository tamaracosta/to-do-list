# TODO List
API para gerenciar tarefas (to-do list) (CRUD) usando JAVA e SPRING.

- Dentro da pasta resources (src/main/resources), crie um arquivo **application.properties** para colocar a configuração para conectar ao seu banco de dados alterando seu usuario e senha do MySQL:

  ```
  spring.datasource.url=jdbc:mysql://localhost:3306/todolist
  spring.datasource.username=username
  spring.datasource.password=password
  spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

  spring.jpa.hibernate.ddl-auto=update  
  ```

## Tecnologias
- Spring Boot
- Spring MVC
- Spring Data JPA
- SpringDoc OpenAPI 3
- MySQL

## Práticas adotadas
- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## Como Executar
1. Clonar repositório git:
   ```sh
   $ git clone https://github.com/tamaracosta/to-do-list.git

2. Construir o projeto:
$ ./mvnw clean package

3. Executar a aplicação:
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
A API poderá ser acessada em http://localhost:8080. O Swagger poderá ser visualizado em http://localhost:8080/swagger-ui.html.

## API Endpoints
Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta httpie:

#### Criar Tarefa

$ http POST :8080/todos nome="Todo 1" descricao="Desc Todo 1" prioridade=1
Resposta:


{
  "descricao": "Desc Todo 1",
  "id": 1,
  "nome": "Todo 1",
  "prioridade": 1,
  "realizado": false
}

### Listar Tarefas

$ http GET :8080/todos
Resposta:

[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]

### Atualizar Tarefa

$ http PUT :8080/todos/1 nome="Todo 1 Up" descricao="Desc Todo 1 Up" prioridade=2

Resposta:
{
  "descricao": "Desc Todo 1 Up",
  "id": 1,
  "nome": "Todo 1 Up",
  "prioridade": 2,
  "realizado": false
}

### Remover Tarefa
$ http DELETE :8080/todos/1

Resposta:
json
[]

![image](https://github.com/tamaracosta/to-do-list/assets/75817559/0d9f914e-9f1e-4dbe-9674-fb6e3b1c22b8)


### Swagger
Acesse: http://localhost:8080/swagger-ui/index.html
