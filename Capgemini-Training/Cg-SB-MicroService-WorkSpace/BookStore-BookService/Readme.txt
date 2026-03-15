CREATE SEQUENCE BOOK_SEQ
START WITH 1
INCREMENT BY 1
NOCACHE
NOCYCLE;

INSERT INTO books_database (id, title, author, isbn, price, quantity, category)
VALUES (1,'Spring Boot Guide', 'John Smith', '9781234567890', 450, 10, 'Programming');

INSERT INTO books_database (id,title, author, isbn, price, quantity, category)
VALUES (2,'Microservices Architecture', 'Sam Newman', '9789876543210', 650.00, 5, 'Software');

Get: http://localhost:9082/api/books

Post: http://localhost:9082/api/books

{
  "author": "JK Rowling",
  "category": "Fiction",
  "isbn": "978123345690",
  "price": 1050.0,
  "quantity": 10,
  "title": "Harry Potter"
}

Get: http://localhost:9082/api/books/1

Put:  http://localhost:9082/api/books

{
  "author": "Ruskin Bond",
  "category": "Romance",
  "isbn": "565123345690",
  "price": 350.0,
  "quantity": 15,
  "id":3,
  "title": "The Eyes Have itr"
}

Delete: http://localhost:9082/api/books/3