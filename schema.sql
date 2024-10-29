CREATE DATABASE ai_note_taker;

USE ai_note_taker;

SHOW TABLES;

CREATE TABLE User (
	user_id INT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(255) NOT NULL UNIQUE
);
CREATE TABLE Local_User (
	user_id INT PRIMARY KEY,
    role VARCHAR(25) NOT NULL DEFAULT 'ROLE_USER',
    password VARCHAR(255) NOT NULL, -- bcrypt
    created_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    modified_date DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES User (user_id) ON DELETE CASCADE
);
CREATE TABLE Social_User (
	user_id INT PRIMARY KEY,
    role VARCHAR(25) NOT NULL DEFAULT 'ROLE_USER',
    provider VARCHAR(50) NOT NULL,
    provider_id VARCHAR(255) NOT NULL UNIQUE,
    user_name VARCHAR(255) NOT NULL UNIQUE,
    created_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    modified_date DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES USER (user_id) ON DELETE CASCADE
);

CREATE TABLE Note (
	note_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    title VARCHAR(255) NOT NULL,
    content TEXT,
    created_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    modified_date DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES User (user_id) ON DELETE CASCADE
);
CREATE TABLE Note_Image (
	image_id INT PRIMARY KEY AUTO_INCREMENT,
    note_id INT NOT NULL,
    image_url VARCHAR(500) NOT NULL,
    FOREIGN KEY (note_id) REFERENCES Note (note_id) ON DELETE CASCADE
);