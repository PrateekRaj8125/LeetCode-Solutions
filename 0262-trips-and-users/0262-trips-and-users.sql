# Write your MySQL query statement below
SELECT T.request_at AS Day ,  
ROUND(SUM(CASE WHEN T.status = 'cancelled_by_driver' OR T.status = 'cancelled_by_client' THEN 1 ELSE 0 END) / COUNT(T.status),2)  AS `Cancellation Rate`
FROM Trips T JOIN Users C
ON T.client_id = C.users_id
JOIN Users D
ON T.driver_id = D.users_id
WHERE C.banned = 'No' AND D.banned ='No' AND T.request_at >= '2013-10-01' AND T.request_at <= '2013-10-03'
GROUP BY T.request_at