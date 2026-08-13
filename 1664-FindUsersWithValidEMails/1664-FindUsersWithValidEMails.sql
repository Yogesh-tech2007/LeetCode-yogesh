-- Last updated: 13/08/2026, 15:47:26
SELECT *
FROM Users
WHERE mail REGEXP '^[A-Za-z][A-Za-z0-9_.-]*@leetcode\\.com$'
  AND BINARY mail LIKE '%@leetcode.com';