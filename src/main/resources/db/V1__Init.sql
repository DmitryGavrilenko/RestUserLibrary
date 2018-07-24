CREATE TABLE IF NOT EXISTS n_user(
  id SERIAL PRIMARY KEY,
  first_name VARCHAR(200),
  last_name VARCHAR(200),
  email VARCHAR(200)
);

CREATE TABLE IF NOT EXISTS book(
  id SERIAL PRIMARY KEY,
  title VARCHAR(200),
  publish_date DATE,
  user_id INTEGER REFERENCES n_user
);

CREATE TABLE IF NOT EXISTS author(
  id SERIAL PRIMARY KEY,
  first_name VARCHAR(200),
  last_name VARCHAR(200),
  birthday DATE
);

CREATE TABLE IF NOT EXISTS author_books(
  authors_id INTEGER REFERENCES author(id),
  books_id INTEGER REFERENCES book(id)
);