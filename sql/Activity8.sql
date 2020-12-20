SELECT customer_id, MAX(purchase_amount) AS "Max Amount" FROM orders GROUP BY customer_id;

select salesman_id, order_date, max(purchase_amount) as "Max_amount" from orders
where order_date=to_date('2012-08-17','yyyy-mm-dd') 
group by salesman_id,order_date

SELECT customer_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders
GROUP BY customer_id, order_date
HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);