USE adlister_db;

create user if not exists 'newbie'@'localhost' identified by 'password';
grant all on adlister_db.* to 'newbie'@'localhost';

CREATE table IF NOT EXISTS users (
    id int unsigned not null auto_increment,
    username varchar(40) not null,
    email varchar(40) not null,
    password varchar(30) not null,
    primary key(id)
);

CREATE table if not exists ads (
    id int unsigned not null auto_increment,
    user_id int unsigned not null,
    title varchar(50) not null,
    description varchar(100) not null,
    primary key (id),
    foreign key (user_id) references users(id)
);

