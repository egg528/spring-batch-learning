DROP TABLE IF EXISTS people;

-- 테이블 생성
CREATE TABLE people (
                        person_id BIGINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
                        first_name VARCHAR(20),
                        last_name VARCHAR(20)
);