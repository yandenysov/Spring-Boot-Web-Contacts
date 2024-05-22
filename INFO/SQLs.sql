
-- БАЗА ДАНИХ
-- Можливість створення БД з метою уникнення некваліфікованих
-- дій, краще залишити за розробником.
-- Тому такий функціонал у додатку не прописуємо.
-- Можемо створити БД через візуальний інструмент, наприклад,
-- MySQL Workbench.
CREATE DATABASE demo_db;


-- ТАБЛИЦІ
-- Можливість створення таблиць БД, з метою уникнення некваліфікованих
-- дій, краще залишити за розробником.
-- Тому такий функціонал у додатку не прописуємо.
-- Попередньо, необхідно спроектувати таблиці та їх зв'язки,
-- на основі сутностей реального світу.
-- Можемо створити таблиці БД через візуальний інструмент, наприклад,
-- MySQL Workbench.


CREATE TABLE IF NOT EXISTS contacts
( id INTEGER NOT NULL AUTO_INCREMENT,
  image VARCHAR(255) NOT NULL,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  phone VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO
	contacts (image, first_name, last_name, phone)
VALUES
	('Brad.jpg', 'Tyler', 'Durden', '399 555-8587'),
	('Cumberbatch.jpg', 'Javadev', 'Postingpatch', '221 777-1337'),
	('Matthew.jpg', 'Matthew', 'McCool', '777 777-7777');

