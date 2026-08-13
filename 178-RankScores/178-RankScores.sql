-- Last updated: 13/08/2026, 15:53:36
SELECT s.Score,
       (SELECT COUNT(DISTINCT Score) 
        FROM Scores 
        WHERE Score >= s.Score) AS `Rank`
FROM Scores s
ORDER BY s.Score DESC;
