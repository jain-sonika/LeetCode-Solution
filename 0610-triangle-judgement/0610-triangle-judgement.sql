# Write your MySQL query statement below
with 
tabla1 as (select *, x+y-z as sumx, x-y+z as sumy, -x+y+z as sumz FROM Triangle )
select x,y,z, 
case
when sumx > 0 and sumy > 0 and sumz > 0 then 'Yes'
else 'No' 
end as triangle
from tabla1 