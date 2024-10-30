CREATE DATABASE ai_note_taker;

USE ai_note_taker;

CREATE TABLE User (
	user_id BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(255) NOT NULL UNIQUE
);
CREATE TABLE Local_User (
	user_id BIGINT UNSIGNED PRIMARY KEY,
    role VARCHAR(25) NOT NULL DEFAULT 'ROLE_USER',
    password VARCHAR(255) NOT NULL, -- bcrypt
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    modified_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES User (user_id) ON DELETE CASCADE
);
CREATE TABLE Social_User (
	user_id BIGINT UNSIGNED PRIMARY KEY,
    role VARCHAR(25) NOT NULL DEFAULT 'ROLE_USER',
    provider VARCHAR(50) NOT NULL,
    provider_id VARCHAR(255) NOT NULL UNIQUE,
    user_name VARCHAR(255) NOT NULL UNIQUE,
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    modified_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES USER (user_id) ON DELETE CASCADE
);

CREATE TABLE Note (
	note_id BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    user_id BIGINT UNSIGNED NOT NULL,
    title VARCHAR(255) NOT NULL,
    content TEXT,
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    modified_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES User (user_id) ON DELETE CASCADE
);
CREATE TABLE Note_Image (
	image_id BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    note_id BIGINT UNSIGNED NOT NULL,
    image_url VARCHAR(500) NOT NULL,
    FOREIGN KEY (note_id) REFERENCES Note (note_id) ON DELETE CASCADE
);

SELECT * FROM User;
SELECT * FROM Local_User;
SELECT * FROM Social_User;

SELECT * FROM Note;
SELECT * FROM Note_Image;

DELETE FROM USER WHERE email Like "text%";