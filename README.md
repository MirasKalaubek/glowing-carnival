☕ Coffee Machine API Project
🚀 Описание проекта
Этот проект — это API для управления виртуальной кофемашиной, разработанный с использованием Java 17 и Spring Boot. Он демонстрирует, как можно построить RESTful-сервис с учетом реальных бизнес-требований, таких как ограничение по времени работы, учет праздничных дней и ведение статистики по заказам.

🎯 Основной функционал
✅ Приготовление напитков:
Кофемашина умеет готовить 3 стандартных напитка: эспрессо, американо и капучино.

✅ Управление рецептами:
Возможность добавления новых рецептов с сохранением их в базе данных.

✅ Учет статистики:
API собирает данные о заказах и определяет самый популярный напиток.

✅ Ограничение по времени работы:
Машина работает только с 08:00 до 17:00, не принимает заказы в нерабочее время и по выходным.

✅ Интеграция с внешним API для праздников:
Праздничные дни берутся из Nager.Date API. Используется кэширование, чтобы минимизировать количество запросов.

✅ Swagger UI:
Для удобства тестирования и демонстрации API используется Swagger.

🛠️ Технологии и стек
Java 17
Spring Boot
Spring Data JPA
PostgreSQL
Flyway (для миграций базы данных)
Maven (для управления зависимостями)
Swagger UI (для документации API)
REST API
⚡ Как работает API?
Рецепты:

Создавайте новые рецепты через POST-запросы.
Получайте информацию о самых популярных напитках.
Заказы:

Можно делать заказы только в рабочие дни и часы.
API проверяет текущую дату и время, сверяется с календарем праздников и временем работы.
Интеграция с Nager API:

Загружает праздничные дни для Казахстана на текущий год.
Использует кэш, чтобы ускорить работу и снизить нагрузку на API.
📊 Примеры API-запросов (Swagger UI)
POST /coffee-machine/recipe — добавить новый рецепт
POST /coffee-machine/order — сделать заказ
GET /coffee-machine/statistics/popular — получить ID самого популярного напитка
GET /coffee-machine/holidays — получить список праздников
Swagger доступен по адресу:
http://localhost:8080/swagger-ui/index.html

💡 Как запустить проект?
Склонируйте репозиторий:
git clone https://github.com/MirasKalaubek/glowing-carnival.git
cd glowing-carnival

Соберите проект с помощью Maven:
mvn clean install

Запустите приложение:
mvn spring-boot:run

Перейдите на http://localhost:8080/swagger-ui/ для тестирования API.

👨‍💻 Автор проекта
Miras Kalaubek

📧 GitHub
💼 Работа с Java и Spring Boot
