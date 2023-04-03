SELECT order_num, amount, name  
    FROM customers
        INNER JOIN orders
            ON customers.id = orders.customer_id
    WHERE amount BETWEEN 500 AND 2000
ORDER BY order_num