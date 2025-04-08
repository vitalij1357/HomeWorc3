SELECT p.ID,
       p.CLIENT_ID,
       p.START_DATE,
       p.FINISH_DATE,
       TIMESTAMPDIFF(MONTH, p.START_DATE, p.FINISH_DATE) AS PROJECT_DURATION
FROM project p
WHERE TIMESTAMPDIFF(MONTH, p.START_DATE, p.FINISH_DATE) = (
    SELECT MAX(TIMESTAMPDIFF(MONTH, p.START_DATE, p.FINISH_DATE))
    FROM project p
);