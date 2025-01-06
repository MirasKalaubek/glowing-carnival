-- Создание таблицы кофемашин
CREATE TABLE coffee_machine (
    id BIGSERIAL PRIMARY KEY
);

-- Создание таблицы рецептов
CREATE TABLE recipe (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) UNIQUE NOT NULL
);

-- Создание таблицы связи кофемашин с рецептами
CREATE TABLE coffee_machine_recipe (
    id BIGSERIAL PRIMARY KEY,
    coffee_machine_id BIGINT NOT NULL REFERENCES coffee_machine(id) ON DELETE CASCADE,
    recipe_id BIGINT NOT NULL REFERENCES recipe(id) ON DELETE CASCADE
);

-- Создание таблицы заказов
CREATE TABLE orders (
    id BIGSERIAL PRIMARY KEY,
    recipe_id BIGINT NOT NULL REFERENCES recipe(id) ON DELETE CASCADE,
    date TIMESTAMP NOT NULL DEFAULT NOW()
);
