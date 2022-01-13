# Springboot course with MongoDB

Serviço para cadastro de posts e comentários de usuários.
API Rest desenvolvida no curso de [Java completo](https://www.udemy.com/course/java-curso-completo/) da Udemy utilizando Java 11, Spring Boot e MongoDB.

## Implementação

Estrutura das camadas lógicas:

![Diagrama das camadas lógicas](https://github.com/moryanp/springboot-mongodb/blob/master/blob/logical_layer.png?raw=true)

Estrutura da camada de modelo:

![Diagrama da camada de modelo](https://github.com/moryanp/springboot-mongodb/blob/master/blob/domain_layer.png?raw=true)

Estrutura da camada de domínio instanciada:

![Diagrama das camadas lógicas](https://github.com/moryanp/springboot-mongodb/blob/master/blob/domain_instance.png?raw=true)

Fonte imagens: Nelio Alves

## Rotas

### Users

- `GET`:

Retorna dados de todos os usuários:

```
/users
```

#### Response Body:
```json
[
  {
    "id": "id",
    "name": "Foo",
    "email": "email@.com"
  }
]
```

Retorna usuário pelo id:

```
/users/{id}
```

#### Response Body:
```json
{
  "id": "id",
  "name": "Foo",
  "email": "email@.com"
}
```

- `POST`:

Insere novo usuário:

```
/users
```

#### Request body:
```json
{
  "name": "name",
  "email": "email"
}
```

#### Response Body:
```json
{
  "id":  "id",
  "name": "name",
  "email": "email"
}
```

- `PUT`

Atualiza dados do usuário:

```
/users/{id}
```

#### Request body:
```json
{
  "name": "name",
  "email": "email"
}
```

- `DELETE`

Deleta usuário baseado no id informado:

```
/users/{id}
```

- `GET`

Retorna todos os posts de determinado usuário:

```
/users/{id}/posts
```

#### Response Body:
```json
[
  {
    "id": "id",
    "date": "date",
    "title": "title",
    "body": "text-body",
    "author": {
      "id": "id",
      "name": "name"
    }
  }
]
```

### Posts

- `GET`

Retorna post por id:

```
/posts/{id}
```

#### Response body:
```json
{
	"id": "id",
	"date": "date",
	"title": "title",
	"body": "body-text",
	"author": {
		"id": "id",
		"name": "name"
	}
}
```
