SELECT name, city 
    FROM customers
        WHERE city in ("Moscow", "London")
    ORDER BY name DESC