INSERT INTO employee (date_of_birth, is_active, email, full_name, phone_number)
    VALUES
    ('1990-05-15', true, 'john@example.com', 'John Doe', '1234567890'),
    ('1985-10-20', false, 'jane@example.com', 'Jane Smith', '9876543210'),
    ('1978-07-03', true, 'bob@example.com', 'Bob Johnson', '5551234567'),
    ('1995-03-25', true, 'alice@example.com', 'Alice Brown', '9995551234'),
    ('1980-12-10', false, 'sam@example.com', 'Sam Wilson', '7779998888');

insert into customer (full_name, email, birth_date, phone_number)
values ('John Doe', 'john@example.com','1990-05-15', '1234567890'),
       ('Jane Smith', 'jane@example.com','1985-10-20', '9876543210'),
       ('Bob Johnson', 'bob@example.com','1978-07-03', '5551234567'),
       ('Alice Brown', 'alice@example.com','1995-03-25', '9995551234'),
       ('Sam Wilson', 'sam@example.com','1980-12-10', '7779998888');

insert into dining_table (number_of_seats)
values (4), (6), (8);

insert into equipment (name, quantity)
values ('standard_lane', 20),
       ('junior_lane', 4),
       ('bowling_ball', 50),
       ('shoe_pair', 100),
       ('air_hockey_table', 6),
       ('bowling_pins', 300);

insert into reservation
    (customer_id, dining_table_id, is_valid, number_of_participants, activity,
     number_of_standard_lanes, number_of_jr_lanes, number_of_air_tables, activity_start, activity_end)
values
    -- Bowling
    (1, 1, true, 4,'bowling', 3, 1, 0, '2024-05-20 17:00:00', '2024-05-20 18:00:00'),
    (2, 1, true, 4,'bowling', 2, 1, 0, '2024-05-20 18:00:00', '2024-05-20 19:00:00'),
    (3, 1, true, 4,'bowling', 2, 1, 0, '2024-05-20 19:00:00', '2024-05-20 20:00:00'),
    (4, 1, true, 4,'bowling', 2, 1, 0, '2024-05-20 21:00:00', '2024-05-20 22:00:00'),
    (2, 1, true, 4,'bowling', 3, 1, 0, '2024-05-27 20:00:00', '2024-05-27 21:00:00'),
    (3, 1, true, 4,'bowling', 3, 1, 0, '2024-05-27 20:00:00', '2024-05-27 21:00:00'),
    (4, 1, true, 4,'bowling', 3, 1, 0, '2024-05-27 20:00:00', '2024-05-27 21:00:00'),
    -- Air Hockey
    (5, 2, true, 6,'airHockey', 0, 0, 1, '2024-05-22 17:00:00', '2024-05-22 18:00:00'),
    (1, 3, true, 8,'airHockey', 0, 0, 1, '2024-05-22 18:00:00', '2024-05-22 19:00:00'),
    (5, 1, true, 4,'airHockey', 0, 0, 1, '2024-05-30 22:00:00', '2024-05-30 23:00:00'),
    (1, 2, true, 6,'airHockey', 0, 0, 2, '2024-05-30 22:00:00', '2024-05-30 23:00:00'),
    (2, 3, true, 8,'airHockey', 0, 0, 3, '2024-05-30 22:00:00', '2024-05-30 23:00:00');



insert into product(in_stock, price, name, size)
values
    (true, 10.00, 'Coke', 'small'),
    (true, 15.00, 'Coke', 'medium'),
    (true, 20.00, 'Coke', 'large'),
    (true, 5.00, 'Sprite', 'small'),
    (true, 10.00, 'Sprite', 'medium'),
    (true, 15.00, 'Sprite', 'large');