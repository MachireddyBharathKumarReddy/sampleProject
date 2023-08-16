-- src/main/resources/data.sql
-- src/main/resources/data.sql

-- Inserting 3 rows into the application table
INSERT INTO application (name, description, create_by, create_date, last_update, last_update_date)
VALUES
  ('App1', 'Description for App1', 'User1', CURRENT_DATE - 1, 'User1', CURRENT_DATE ),
  ('App2', 'Description for App2', 'User2', CURRENT_DATE - 1, 'User2', CURRENT_DATE ),
  ('App3', 'Description for App3', 'User3', CURRENT_DATE - 1, 'User3', CURRENT_DATE );
