create table users
(
    id         varchar(255) primary key,
    created_at timestamp with time zone,
    updated_at timestamp with time zone,
    name       varchar(30)  not null,
    password   varchar(255) not null,
    role       varchar(25)  not null
);

create table car
(
    id           uuid primary key,
    created_at   timestamp with time zone,
    updated_at   timestamp with time zone,
    model        varchar(30),
    brand        varchar(30),
    plate_number varchar(20)
);
create table travel
(
    id            uuid primary key,
    created_at    timestamp with time zone,
    updated_at    timestamp with time zone,
    from_place    varchar(25),
    to_place      varchar(25),
    starting_date timestamp with time zone,
    ending_date   timestamp with time zone,
    driver_id     varchar(255)  not null,
    car_id        uuid          not null,
    price         numeric(9, 2) not null,
    exported      boolean,
    export_price  numeric(9, 2),
    foreign key (driver_id) references users (id),
    foreign key (car_id) references car (id)
);
create table passenger
(
    id              uuid primary key,
    created_at      timestamp with time zone,
    updated_at      timestamp with time zone,
    name            varchar(30),
    surname         varchar(30),
    passport_number varchar(255),
    birthDate       timestamp,
    email           varchar(50),
    phoneNumber     varchar(25),
    travel_id       uuid,
    foreign key (travel_id) references travel (id)
);
