create
database ebpp_trade DEFAULT CHARSET utf8mb4 COLLATE utf8mb4_general_ci;

create table t_ebpp_trade_trade
(
    `id`          int(11) AUTO_INCREMENT NOT NULL,
    `amount`      decimal(10, 2) NOT NULL,
    `status`      tinyint(1) NOT NULL,
    `create_time` datetime NULL DEFAULT CURRENT_TIMESTAMP,
    `update_time` datetime NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    primary key (`id`)
);