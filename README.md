# algalog-api

Criando uma api na Semana Spring REST - AlgaWorks.

<h1 id="arquitetura">
<img src="https://img.icons8.com/office/30/000000/blueprint.png"/>
  Arquitetura do Projeto
</h1>

![Diagrama](https://github.com/oneyottabyte/algalog-api/blob/main/assets/Diagrama%20de%20classes.JPG?raw=true/)


![algalog](https://github.com/oneyottabyte/algalog-api/blob/main/assets/algalog-api.JPG?raw=true)
## CRUD Cliente


### GET - Listar (success code: 200 OK)
```
localhost:8080/clientes
```


### GET - Obter por ID (success code: 200 OK)
```
localhost:8080/clientes/5
```

### POST - Adicionar (success code: 201 Created)
```
localhost:8080/clientes
```
Body example
```
{
    "nome": "Jessica",
    "email": "jessica@gmail.com",
    "telefone": "48 98886-6666"
},
```


### PUT- Atualizar (success code: 200 OK)
```
localhost:8080/clientes/5
```
Body example
```
{
    "nome": "Jessica",
    "email": "jessica@gmail.com",
    "telefone": "48 98886-6666"
},
```

### DELETE - Deletar (success code: 204 No Content)
```
localhost:8080/clientes/5
```

<h1 id="tecnologias-dependencias">
<img height="30" src="https://img.icons8.com/fluency/50/000000/administrative-tools.png"/>
	Tecnologias e Dependências
</h1>

<a name = "tech_stack"></a>

- [Java 11](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html) - Versão do Java utilizada
- [Spring boot](https://spring.io/projects/spring-boot) - Framework de desenvolvimento
- [Maven](https://maven.apache.org/) - Gerenciador de dependencias
- [MySql Database](https://www.mysql.com/) - Database para o ambiente de produção
- [Spring Data Jpa](https://spring.io/projects/spring-data-jpa) - Abstração orm do spring pra integração com o banco de dados
- [Postman](https://www.postman.com/) - Ferramenta para testes nas requisições
- [Lombok](https://projectlombok.org/) - Framework para abstração e melhora na legibilidade do código


<h1 id="desenvolvedors">
<img height="30" src="https://img.icons8.com/color/48/000000/devpost.png"/>
  Desenvolvedor
</h1>

<table align="center">
     <td align="center"><a href="https://github.com/oneyottabyte"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/oneyottabyte" width="100px;" alt=""/><br /><sub><b>Dorian Vieira</b></sub></a><br /><a href="https://github.com/oneyottabyte" title="Dorian Vieira"></a></td>
</table>

