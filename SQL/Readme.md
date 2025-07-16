-- =====================
-- SQL Command 
-- =====================
-- Table: users

-- --------------------
-- DDL (Data Definition Language)
-- --------------------

-- Create table
CREATE TABLE users (
    user_id INT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
-- Defines the structure of the 'users' table

-- Alter table
ALTER TABLE users ADD COLUMN status VARCHAR(20) DEFAULT 'active';
-- Adds a new column 'status' to the 'users' table

-- Rename table
ALTER TABLE users RENAME TO app_users;
-- Renames the table from 'users' to 'app_users'

-- Drop column
ALTER TABLE app_users DROP COLUMN email;
-- Removes the 'email' column from the table

-- Truncate table
TRUNCATE TABLE app_users;
-- Removes all rows quickly without logging individual deletions

-- --------------------
-- DML (Data Manipulation Language)
-- --------------------

-- Insert data
INSERT INTO app_users (user_id, username, status) VALUES (1, 'mazid', 'active');
-- Adds a new user to the table

-- Update data
UPDATE app_users SET status = 'inactive' WHERE user_id = 1;
-- Updates the status of a specific user

-- Delete data
DELETE FROM app_users WHERE user_id = 1;
-- Deletes a specific user from the table

-- --------------------
-- DQL (Data Query Language)
-- --------------------

-- Select query
SELECT * FROM app_users;
-- Retrieves all records from the table

-- Conditional select
SELECT username FROM app_users WHERE status = 'active';
-- Retrieves usernames of active users

-- --------------------
-- TCL (Transaction Control Language)
-- --------------------

-- Start transaction
BEGIN;
-- Begins a transaction block

-- Insert inside transaction
INSERT INTO app_users (user_id, username, status) VALUES (2, 'john_doe', 'active');
-- Inserts data within a transaction

-- Commit transaction
COMMIT;
-- Saves the transaction changes permanently

-- Rollback transaction
BEGIN;
INSERT INTO app_users (user_id, username, status) VALUES (3, 'jane_doe', 'inactive');
ROLLBACK;
-- Discards changes made during the transaction

-- --------------------
-- DCL (Data Control Language)
-- --------------------

-- Grant privileges
GRANT SELECT, INSERT ON app_users TO some_user;
-- Grants read and insert permissions on the table to another user

-- Revoke privileges
REVOKE INSERT ON app_users FROM some_user;
-- Removes insert permission from the specified user
