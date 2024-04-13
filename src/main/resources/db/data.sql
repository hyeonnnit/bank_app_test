INSERT INTO user_tb (username, password, fullname, created_at)
VALUES
    ('ssar', '1234', '홍길동', NOW()),
    ('cos', '1234', '임꺽정', NOW()),
    ('love', '1234', '이순신', NOW());

INSERT INTO account_tb (user_id, number, password, balance, status, created_at)
VALUES
    (1, 1111, '1234', 600, true, NOW()),
    (2, 2222, '1234', 1000, true, NOW()),
    (3, 3333, '1234', 1300, true, NOW()),
    (1, 4444, '1234', 1000, true, NOW()),
    (2, 5555, '1234', 1100, true, NOW());

INSERT INTO history_tb (sender_id, receiver_id, amount, sender_balance, receiver_balance, created_at)
VALUES
    (1, 2, 100, 900, 1100, NOW()),
    (1, 3, 100, 900, 1100, NOW()),
    (1, 4, 100, 900, 1100, NOW()),
    (1, 5, 100, 900, 1100, NOW()),
    (2, 3, 100, 900, 1200, NOW()),
    (4, 3, 100, 900, 1300, NOW()),
    (1, 3, 100, 900, 1400, NOW()),
    (3, 1, 100, 900, 600, NOW());