select sum(purchase_amount) As total
from orders

select avg(purchase_amount) as Average
from orders

select max(purchase_amount) as Max_val
from orders

select min(purchase_amount) as min_val
from orders

select count(distinct salesman_id) as Salesman_no
from orders