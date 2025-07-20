```
SQL

├── DDL (Data Definition Language)
│   ├── CREATE
│   ├── ALTER
│   ├── DROP
│   ├── RENAME
│   └── TRUNCATE
│
├── DML (Data Manipulation Language)
│   ├── INSERT
│   ├── UPDATE
│   └── DELETE
│
├── DQL (Data Query Language)
│   └── SELECT
│
├── DCL (Data Control Language)
│   ├── GRANT
│   └── REVOKE
│
└── TCL (Transaction Control Language)
    ├── COMMIT
    ├── ROLLBACK    
    └── BEGIN / START TRANSACTION
```
## 🔹 Common SQL Commands

| Category      | Command                           | Description                         |
| ------------- | --------------------------------- | ----------------------------------- |
| **Querying**  | `SELECT`                          | Fetch data from one or more tables  |
| **Filtering** | `WHERE`, `LIKE`, `IN`, `BETWEEN`  | Filter records based on conditions  |
| **Sorting**   | `ORDER BY`, `GROUP BY`, `HAVING`  | Sort and group data with conditions |
| **Joins**     | `INNER JOIN`, `LEFT JOIN`, etc.   | Combine rows from multiple tables   |
| **DDL**       | `CREATE`, `DROP`, `ALTER`         | Define or modify database schema    |
| **DML**       | `INSERT`, `UPDATE`, `DELETE`      | Manipulate data in existing tables  |
| **DCL**       | `GRANT`, `REVOKE`                 | Control user privileges             |
| **TCL**       | `COMMIT`, `ROLLBACK`, `SAVEPOINT` | Manage transactions in databases    |

## 🔹 SQL Joins (Very Important)

| Join Type      | Description                                                         |
| -------------- | ------------------------------------------------------------------- |
| **INNER JOIN** | Returns records with matching values in both tables                 |
| **LEFT JOIN**  | Returns all records from the left table and matched ones from right |
| **RIGHT JOIN** | Returns all records from the right table and matched ones from left |
| **FULL JOIN**  | Returns records with a match in either left or right table          |
| **CROSS JOIN** | Returns Cartesian product of both tables                            |

## 📊 SQL Aggregation Functions

| Function           | Description                                                   | Example Usage                           |
| ------------------ | ------------------------------------------------------------- | --------------------------------------- |
| **COUNT()**        | Returns the total number of rows or non-null values           | `SELECT COUNT(*) FROM employees;`       |
| **SUM()**          | Returns the total sum of a numeric column                     | `SELECT SUM(salary) FROM employees;`    |
| **AVG()**          | Returns the average value of a numeric column                 | `SELECT AVG(age) FROM users;`           |
| **MIN()**          | Returns the smallest value in a column                        | `SELECT MIN(price) FROM products;`      |
| **MAX()**          | Returns the largest value in a column                         | `SELECT MAX(score) FROM students;`      |
| **GROUP_CONCAT()***| Returns concatenated string of grouped values (DBMS-specific) | `SELECT GROUP_CONCAT(name) FROM users;` |
