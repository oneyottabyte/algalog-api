# algalog-api

Criando uma api na Semana Spring REST - AlgaWorks.

## CRUD AlgaLog


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


