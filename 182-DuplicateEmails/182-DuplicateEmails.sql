-- Last updated: 13/08/2026, 15:53:26
SELECT Email
FROM Person
GROUP BY Email
HAVING COUNT(*) > 1;
