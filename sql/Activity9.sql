select salesman_name, customer_name 
from salesman
Inner join customers
on salesman.salesman_id=customers.salesman_id

select a.customer_id,a.customer_name, a.city,a.grade,a.salesman_id, b.salesman_name
from customers a
left outer join salesman b
on b.salesman_id=a.salesman_id
where a.grade<300
order by a.customer_id asc

select a.customer_id,a.customer_name,a.salesman_id, b.salesman_name,b.commission
from customers a
inner join salesman b
on b.salesman_id=a.salesman_id
where b.commission>12
order by b.commission asc

select c.order_no,c.order_date,c.purchase_amount,b.customer_name,a.salesman_name,a.commission
from orders c
inner join customers b
on c.customer_id=b.customer_id
inner join salesman a
on c.salesman_id=a.salesman_id