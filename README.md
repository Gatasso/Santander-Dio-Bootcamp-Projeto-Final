# Projeto final do Bootcamp Java, da empresa DIO + Santander
Como projeto final do bootcamp Java oferecido pela empresa [DIO](https://www.linkedin.com/school/dio-makethechange/posts/?feedView=all) em parceria com o [Santander](https://www.linkedin.com/company/santander-open-academy/), este é um desenvolvimento de uma API RESTful simulando uma conta bancária.

## Principais Tecnologias
 - **Java 17**
 - **Spring Boot 3**
 - **Spring Data JPA**
 - **OpenAPI (Swagger)**
 - **Railway**


## Diagrama de Classes (Domínio da API)

O Diagrama de Classes desta aplicação foi desenvolvida em sintaxe Mermaid, através de um Modelo de Inteligência Artificial Generativa.

```mermaid
classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```
## Endpoints
### POST
`/users/`: Por meio de um JSON, cria um usuário. Validação é feita pelo Id e pelo Account number, onde há um tratamento de possíveis erros, como a tentativa de criar um usuário já registrado.
 
### GET
`/users/{id}`: Retorna uma URL e um JSON com as informações do usuário buscado. Eventualmente, existe tratamento de erro para caso o usuário filtrado não exista.

## Publicação
Um dos objetivos deste projeto, é realizar o deploy da aplicação, e torná-la disponível para ser consumida.
  Portanto, utilizamos a plataforma [Railway](https://railway.app/) para:
  1. Criar um Banco de Dados PostgreSQL em nuvem;
  2. Realizar o deploy;
  3. Publicar através de um domínio personalizado.

  
  O link da aplicação não estará disponível, uma vez que o serviço é pago e fora utilizado o plano Trial para configurar e publicar, entretanto, segue o endereço:  
https://satanderdio-projetofinal-production.up.railway.app/swagger-ui/index.html#/

## Contato
Gostou do projeto?  
Tem uma sugestão, crítica ou elogio?  
Você pode me encontrar no Linkedin:  
  
  [![LinkedIn](https://img.shields.io/badge/LinkedIn-000080?style=for-the-badge&logo=Linkedin&logoColor=white)](https://www.linkedin.com/in/galasso-matheus/)

