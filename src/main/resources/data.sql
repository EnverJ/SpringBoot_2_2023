INSERT INTO employee(id, name, age)
VALUES('1', 'Eko', 0);


/* User Master*/
 INSERT INTO m_user(
    user_id,
    password,
    user_name,
    birthday,
    age,
    gender,
    department_id,
    role
 )VALUES 
    ('system@co.jp', 'password', 'System Administrator', '2000-01-01', 23,1,1, 'ROLE_ADMIN'),
    ('user@co.jp','password','User1', '2000-01-01', 23,2,2, 'ROLE_GENERAL')
    ;

 /* Department master*/
INSERT INTO m_department(
    department_id,
    department_name
)VALUES
(1,'System Management'),
(2,'Sales');

/* Sales Table*/
INSERT INTO t_salary (
user_id,
year_month,
salary
)VALUES
('user@co.jp','11/2020',2800),
('user@co.jp','12/2020',2900),
('user@co.jp','01/2020',3000);