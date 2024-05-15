INSERT INTO employee (date_of_birth, is_active, email, full_name, phone_number)
    VALUES
    ('1990-05-15', true, 'john@example.com', 'John Doe', '1234567890'),
    ('1985-10-20', false, 'jane@example.com', 'Jane Smith', '9876543210'),
    ('1978-07-03', true, 'bob@example.com', 'Bob Johnson', '5551234567'),
    ('1995-03-25', true, 'alice@example.com', 'Alice Brown', '9995551234'),
    ('1980-12-10', false, 'sam@example.com', 'Sam Wilson', '7779998888');

insert into dining_table (number_of_seats)
values (4), (4), (4), (4), (6), (8);

insert into equipment (name, quantity)
values ('standard_lane', 20),
       ('junior_lane', 4),
       ('bowling_ball', 50),
       ('shoe_pair', 100),
       ('air_hockey_table', 6),
       ('bowling_pins', 300);

insert into reservation (customer_id, dining_table_id, is_valid, number_of_participants, activity_end, activity_start)
values
    (1, 1, true, 4, '2021-10-10 12:00:00', '2021-10-10 11:00:00'),
    (2, 2, true, 4, '2021-10-10 13:00:00', '2021-10-10 12:00:00'),
    (3, 3, true, 4, '2021-10-10 14:00:00', '2021-10-10 13:00:00'),
    (4, 4, true, 4, '2021-10-10 15:00:00', '2021-10-10 14:00:00'),
    (5, 5, true, 6, '2021-10-10 16:00:00', '2021-10-10 15:00:00'),
    (1, 6, true, 8, '2021-10-10 17:00:00', '2021-10-10 16:00:00'),
    (2, 7, true, 4, '2021-10-10 18:00:00', '2021-10-10 17:00:00'),
    (3, 8, true, 4, '2021-10-10 19:00:00', '2021-10-10 18:00:00'),
    (4, 9, true, 4, '2021-10-10 20:00:00', '2021-10-10 19:00:00'),
    (5, 10, true, 6, '2021-10-10 21:00:00', '2021-10-10 20:00:00'),
    (1, 11, true, 8, '2021-10-10 22:00:00', '2021-10-10 21:00:00'),
    (2, 12, true, 4, '2021-10-10 23:00:00', '2021-10-10 22:00:00');

insert into product(in_stock, price, name, size)
values
    (true, 10.00, 'Coke', 'small'),
    (true, 15.00, 'Coke', 'medium'),
    (true, 20.00, 'Coke', 'large'),
    (true, 5.00, 'Sprite', 'small'),
    (true, 10.00, 'Sprite', 'medium'),
    (true, 15.00, 'Sprite', 'large');