-- Last updated: 13/08/2026, 15:48:43
# Write your MySQL query statement below
SELECT
    customer_id
FROM Customer
GROUP BY customer_id
HAVING COUNT(DISTINCT product_key) = (
    SELECT COUNT(*)
    FROM Product
);