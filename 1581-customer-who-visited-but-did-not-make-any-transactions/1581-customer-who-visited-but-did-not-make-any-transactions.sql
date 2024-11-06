# Write your MySQL query statement below
SELECT x.customer_id, COUNT(x.customer_id) AS count_no_trans
FROM Visits x
WHERE NOT EXISTS (
    SELECT 1
    FROM Transactions y
    WHERE x.visit_id = y.visit_id
)
GROUP BY x.customer_id;