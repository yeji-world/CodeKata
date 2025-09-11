-- 코드를 입력하세요
SELECT MCDP_CD as 진료과코드, count(*)
FROM APPOINTMENT
WHERE substring(APNT_YMD, 7) = 5
GROUP BY 1
ORDER BY 2, 1
