SELECT product_name,year,price
FROM sales s
JOIN
product p
On s.product_id = p.product_id