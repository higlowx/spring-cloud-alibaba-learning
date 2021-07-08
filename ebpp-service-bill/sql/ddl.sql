create
database ebpp_bill DEFAULT CHARSET utf8mb4 COLLATE utf8mb4_general_ci;

create table t_ebpp_bill_bill
(
    `id`          int(11) AUTO_INCREMENT NOT NULL,
    `amount`      decimal(10, 2) NOT NULL,
    `trade_id`    int(11) NOT NULL,
    `create_time` datetime NULL DEFAULT CURRENT_TIMESTAMP,
    `update_time` datetime NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    primary key (`id`)
);