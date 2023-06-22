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

 