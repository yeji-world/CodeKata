-- 코드를 입력하세요
SELECT COUNT(DISTINCT NAME) AS COUNT
-- 집계함수에서 컬럼명 지정 시, NULL이 있는 경우에는 제외하고 처리
FROM ANIMAL_INS