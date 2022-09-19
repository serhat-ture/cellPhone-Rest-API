# Product -Rest-API

I built CRUD RESTFul APIs for a Simple Product Management System using Spring Boot, Spring Data JPA, and PostgreSQL database.

In this project are used Spring Boot + PostgreSQL + JPA/Hibernate.

Before development, make sure that the PostgreSQL database is installed on your machine, and then  create  a product database.

## 🚀 About Me - Author


- [@serhat-ture](https://github.com/serhat-ture)



# Testing REST APIs via Postman Client

1. Create Product REST API
HTTP Method: POST

Request URL: http://localhost:8080/addProduct

2. Add Products REST API
HTTP Method: POST

Request URL: http://localhost:8080/addProducts

3. Get Product by ID REST API
HTTP Method: GET 

Request URL: http://localhost:8080/productById/2

4. Get all Products REST API
HTTP Method: GET 

Request URL: http://localhost:8080/products

5. Update Product REST API
HTTP Method: PUT 

Request URL: http://localhost:8080/update

6. Delete Product REST API
HTTP Method: DELETE 

Request URL: http://localhost:8080/deleteProduct/8

6. Find Product By Name REST API
HTTP Method: GET 

Request URL: http://localhost:8080/product/Iphone13


# Sample json
```
[
    {
        "id": 1,
        "name": "Iphone 13",
        "quantity": 18,
        "price": 19250.0
    },
    {
        "id": 3,
        "name": "Iphone 12",
        "quantity": 30,
        "price": 18000.0
    },
    {
        "id": 4,
        "name": "Oppo A91",
        "quantity": 42,
        "price": 9102.0
    },
    {
        "id": 5,
        "name": "Aselsan 1920",
        "quantity": 2,
        "price": 36500.0
    },
    {
        "id": 6,
        "name": "Sony",
        "quantity": 56,
        "price": 14330.0
    },
    {
        "id": 2,
        "name": "Nokia 5110",
        "quantity": 4,
        "price": 5000.0
    }
]
```
