-- For Postgres

CREATE TABLE homeworks (
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	description TEXT NOT NULL
);

CREATE TABLE lessons (
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	updated_at TIMESTAMP NOT NULL,
	homework_id INT UNIQUE,
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
	lesson_id INT NOT NULL,
	schedule_id INT NOT NULL,
	PRIMARY KEY (lesson_id, schedule_id),
	CONSTRAINT fk_lesson
		FOREIGN KEY (lesson_id)
		REFERENCES lessons(id),
	CONSTRAINT fk_schedules
		FOREIGN KEY (schedule_id)
		REFERENCES schedules(id)
);
