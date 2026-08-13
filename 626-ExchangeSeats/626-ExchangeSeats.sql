-- Last updated: 13/08/2026, 15:50:26
# Write your MySQL query statement below
SELECT 
    CASE 
        WHEN Id % 2 = 0 THEN Id - 1
        WHEN Id % 2 = 1 AND Id + 1 <= (SELECT COUNT(*) FROM Seat) THEN Id + 1
        ELSE Id
    END AS Id,
    Student
FROM Seat
ORDER BY Id;
