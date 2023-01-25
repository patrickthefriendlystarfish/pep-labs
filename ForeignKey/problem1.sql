CREATE TABLE POST (id int SERIAL PRIMARY KEY,
 post VARCHAR(255), 
 user_fk int REFERENCES user(id));
