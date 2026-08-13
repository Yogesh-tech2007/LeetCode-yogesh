-- Last updated: 13/08/2026, 15:50:31
SELECT *
FROM Cinema
WHERE id % 2 = 1
  AND description != 'boring'
ORDER BY rating DESC;