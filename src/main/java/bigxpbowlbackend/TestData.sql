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
values (4), (4), (4), (4), (6), (8);

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
    (1, 1, true, 4,'bowling', 3, 1, 0, '2022-01-01 17:00:00', '2022-01-01 18:00:00'),
    (2, 2, true, 4,'bowling', 2, 1, 0, '2022-01-01 18:00:00', '2022-01-01 19:00:00'),
    (3, 3, true, 4,'bowling', 2, 1, 0, '2022-01-01 19:00:00', '2022-01-01 20:00:00'),
    (4, 4, true, 4,'bowling', 2, 1, 0, '2022-01-01 21:00:00', '2022-01-01 22:00:00'),
    (5, 5, true, 6,'airHockey', 0, 0, 1, '2022-01-02 17:00:00', '2022-01-01 18:00:00'),
    (1, 6, true, 8,'airHockey', 0, 0, 1, '2022-01-02 18:00:00', '2022-01-01 19:00:00');



insert into product(in_stock, price, name, size)
values
    (true, 10.00, 'Coke', 'small'),
    (true, 15.00, 'Coke', 'medium'),
    (true, 20.00, 'Coke', 'large'),
    (true, 5.00, 'Sprite', 'small'),
    (true, 10.00, 'Sprite', 'medium'),
    (true, 15.00, 'Sprite', 'large');