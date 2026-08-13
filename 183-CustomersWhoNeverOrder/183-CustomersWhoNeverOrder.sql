-- Last updated: 13/08/2026, 15:53:23
# Write your MySQL query statement below
SELECT Name AS Customers
FROM Customers
WHERE Id NOT IN (
    SELECT CustomerId FROM Orders
);

