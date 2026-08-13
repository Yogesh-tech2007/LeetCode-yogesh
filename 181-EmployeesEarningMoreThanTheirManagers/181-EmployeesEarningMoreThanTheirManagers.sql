-- Last updated: 13/08/2026, 15:53:31
# Write your MySQL query statement below
SELECT e.Name AS Employee
FROM Employee e
JOIN Employee m
ON e.ManagerId = m.Id
WHERE e.Salary > m.Salary;
