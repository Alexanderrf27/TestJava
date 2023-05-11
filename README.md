# Summary of the practice

# Exercise

In the company's e-commerce database we have the PRICES table that reflects the final price (pvp) and the rate that applies to a product from 
a chain between certain dates. Below is an example of the table with the relevant fields:

[link text](postman/javaalex-exercise.postman_collection.json)

PRICES
-------

| BRAND_ID | START_DATE | END_DATE | PRICE_LIST | PRODUCT_ID | PRIORITY | PRICE | CURR |
|----------|------------|----------|------------|------------|----------|-------|------|
| 1 | 2020-06-14 00:00:00 | 2020-12-31 23:59:59 | 1 | 35455 | 0 | 35.50 | EUR |
| 1 | 2020-06-14 15:00:00 | 2020-06-14 18:30:00 | 2 | 35455 | 1 | 25.45 | EUR |
| 1 | 2020-06-15 00:00:00 | 2020-06-15 11:00:00 | 3 | 35455 | 1 | 30.50 | EUR |
| 1 | 2020-06-15 16:00:00 | 2020-12-31 23:59:59 | 4 | 35455 | 1 | 38.95 | EUR |
 
## Campos

| Nombre | Descripcion |
|--------|-------------|
| BRAND_ID | foreign key of the group string (1 = ZARA). |
| START_DATE,END_DATE | range of dates in which the indicated price rate applies. |
| PRICE_LIST | Applicable price rate identifier. |
| PRODUCT_ID | Product code identifier. |
| PRIORITY | Price application disambiguator. If two rates coincide in a range of dates, the one with the highest priority (highest numerical value) is applied. |
| PRICE | final sale price. |
| CURR | iso of currency |
 
## caso de uso

It is requested:

Build an application/service in SpringBoot that provides a query rest endpoint such that:

Accept as input parameters: application date, product identifier, string identifier.
Return as output data: product identifier, string identifier, rate to apply, application dates and final price to apply.

You must use an in-memory database (h2 type) and initialize with the data from the example, (you can change the name of the fields and add new ones if you want, choose the type of data that is considered appropriate for them ).

Develop some tests to the rest endpoint that validate the following requests to the service with the data from the example:

- Test 1: request at 10:00 on day 14 of product 35455 for brand 1 (ZARA)
- Test 2: request at 4:00 p.m. on day 14 of product 35455 for brand 1 (ZARA)
- Test 3: request at 9:00 p.m. on day 14 of product 35455 for brand 1 (ZARA)
- Test 4: request at 10:00 on day 15 of product 35455 for brand 1 (ZARA)
- Test 5: request at 9:00 p.m. on the 16th of product 35455 for brand 1 (ZARA)


# postman
[Captura de Patalla de 2023-05-11 14-16 pm.png](gen%2FCaptura%20de%20pantalla%20de%202022-12-12%2010-01-14.png)
[javaalex-exercise.postman_collection.json](postman%2Fjavaalex-exercise.postman_collection.json)

# specs
[openapi.yaml](specs%2Fopenapi.yaml)

# Coverage
[Captura de Patalla de 2023-05-11 14-14 pm.png](gen%2FCaptura%20de%20pantalla%20de%202022-12-12%2009-55-13.png)

###  Build and Run application
[]()
_GOTO >_ **~/absolute-path-to-directory/javaalex**  
and try below command in terminal
> **```mvn spring-boot:run```** it will run application as spring boot application


or
> **```mvn clean install```** it will build application and create **jar** file under target directory

Run jar file from below path with given command
> **```java -jar ~/path-to-javaalex/target/javaalex-exercise.jar```**



 
