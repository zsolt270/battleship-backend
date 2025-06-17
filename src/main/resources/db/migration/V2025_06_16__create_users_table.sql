CREATE TABLE public.users(
id BIGINT PRIMARY KEY,
username TEXT NOT NULL UNIQUE,
email TEXT NOT NULL,
password TEXT NOT NULL,
firstname TEXT,
lastname TEXT,
phone_number TEXT,
verified boolean DEFAULT FALSE,
deleted boolean DEFAULT FALSE,
created_at TIMESTAMP NOT NULL
);

CREATE SEQUENCE users_sequence
INCREMENT BY 50
OWNED BY users.id;