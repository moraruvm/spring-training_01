## Step-by-step guide:
- open project in Intellij
- run application from IDE (or use `mvn spring-boot:run`)
- visit localhost:8080/h2-console to login to the database console (password is `password` :) )
- insert a few products in the products table
> INSERT INTO PRODUCTS VALUES (1, 'Laptop', 1500)
> INSERT INTO PRODUCTS VALUES (2, 'Headphones', 300)
> INSERT INTO PRODUCTS VALUES (3, 'Keyboard', 100)
- go to http://localhost:8080/products and see the response

## Bonus:
- 'google' how you can make the H2 database save the information to a file so it won't reset each time you restart the application (you'll need to add some configuration to application.properties)
- implement ShopController so that it calls ShopService to return the total amount needed to pay for a shopping cart
> you'll need to inject a ShopService in ShopController
> this will be a POST method, so you'll need some tool to execute the requests (eg. Postman)
> quick guide on how to do POST methods with JSON body: https://www.youtube.com/watch?v=qyYAOty_bDs 
