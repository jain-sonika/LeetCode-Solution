# Write your MySQL query statement below
SELECT activity_date AS day, count(distinct user_id) AS active_users
FROM Activity
WHERE datediff('2019-07-27', activity_date) >= 0
  AND datediff('2019-07-27', activity_date) < 30
GROUP BY activity_date;