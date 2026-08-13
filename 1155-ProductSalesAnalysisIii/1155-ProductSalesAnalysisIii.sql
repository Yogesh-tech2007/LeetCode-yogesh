-- Last updated: 13/08/2026, 15:48:38
SELECT product_id, year AS first_year, quantity, price
FROM (
    SELECT product_id, year, quantity, price,
           RANK() OVER (PARTITION BY product_id ORDER BY year ASC) AS rnk
    FROM Sales
) t
WHERE rnk = 1;
