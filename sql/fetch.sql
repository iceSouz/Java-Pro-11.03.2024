INSERT INTO homeworks (name, description) VALUES
    ('Math Homework', 'Complete exercises 1-5 on page 10.'),
    ('History Reading', 'Read chapter 3 on Ancient Civilizations.'),
    ('Science Project', 'Prepare presentation on photosynthesis.'),
    ('Literature Essay', 'Write an essay on Shakespeare.'),
    ('Language Vocabulary', 'Learn new vocabulary words for next class.');

INSERT INTO lessons (name, updated_at, homework_id) VALUES
    ('Math Lesson 1', '2024-05-15 08:00:00', 1),
    ('History Lesson 1', '2024-05-16 09:30:00', 2),
    ('Science Experiment', '2024-05-17 10:00:00', 3),
    ('Literature Analysis', '2024-05-18 11:00:00', 4),
    ('Language Practice', '2024-05-19 12:00:00', 5);

INSERT INTO schedules (name, updated_at) VALUES
    ('Monday Schedule', '2024-05-14 16:00:00'),
    ('Tuesday Schedule', '2024-05-15 16:00:00'),
    ('Wednesday Schedule', '2024-05-16 16:00:00'),
    ('Thursday Schedule', '2024-05-17 16:00:00'),
    ('Friday Schedule', '2024-05-18 16:00:00');

INSERT INTO lessons_schedules (id_lesson, id_schedule) VALUES
    (1, 1), (2, 2), (3, 3),
    (5, 4), (5, 5), (2, 1),
    (3, 1), (3, 5);

-- Отримання всіх записів Homework
SELECT * FROM homeworks;

-- Отримання всіх записів Lesson, включаючи дані Homework
SELECT * FROM lessons
JOIN homeworks ON lessons.id = homeworks.id;

-- Отримання всіх записів Lesson (включаючи дані Homework) відсортовані за часом оновлення
SELECT * FROM lessons
JOIN homeworks ON lessons.id = homeworks.id
ORDER BY lessons.updated_at;

-- Отримання всіх записів Schedule, включаючи дані Lesson
SELECT schedules.*, lessons.*
FROM schedules
JOIN lessons_schedules ON schedules.id = lessons_schedules.id_schedule
JOIN lessons ON lessons_schedules.id_lesson = lessons.id;

-- Отримання кількості Lesson для кожного Schedule
SELECT name, lessons_count
FROM schedules
JOIN (
	SELECT id_schedule, COUNT(id_lesson) AS lessons_count FROM lessons_schedules
	GROUP BY id_schedule
	ORDER BY id_schedule
) AS counts ON schedules.id = counts.id_schedule;