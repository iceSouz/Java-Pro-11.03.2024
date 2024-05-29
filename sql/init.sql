CREATE TABLE homeworks (
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	description TEXT NOT NULL
);

CREATE TABLE lessons (
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	updated_at TIMESTAMP NOT NULL,
	homework_id INT UNIQUE NOT NULL,
	CONSTRAINT fk_homework
		FOREIGN KEY (homework_id)
		REFERENCES homeworks(id)
);

CREATE TABLE schedules (
 	id SERIAL PRIMARY KEY,
 	name VARCHAR(50) NOT NULL,
 	updated_at TIMESTAMP NOT NULL
);

CREATE TABLE lessons_schedules (
	id_lesson INT NOT NULL,
	id_schedule INT NOT NULL,
	PRIMARY KEY (id_lesson, id_schedule),
	CONSTRAINT fk_lesson
		FOREIGN KEY (id_lesson)
		REFERENCES lessons(id),
	CONSTRAINT fk_schedule
		FOREIGN KEY (id_schedule)
		REFERENCES schedules(id)
);