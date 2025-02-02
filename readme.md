Тестовое задание. BackEnd Кофемашина
Необходимо разработать ПО для работы кофемашины и ее управления через API.

Функциональные требования:
 ● Кофемашина умеет готовить 3 стандартных напитка:
    ○ эспрессо, ○ американо, ○ капучино.
 ● Кофемашинаумеетконтролироватьколичествоиостаткиингредиентов;
 ● Кофемашинаумеетзапоминатьновыерецепты;
 ● Кофемашинасобираетстатистикуизнаетсамыйпопулярныйнапиток;
 ● Машина работает только с 8:00 и до 17:00 и не работает по выходным и праздничным дням. Их необходимо получать по апи https://date.nager.at/Api. Добавить кэш.
 
Требования к технологиям:
 ● web-сервис на SpringFramework или SpringBoot,
 ● java выше 17,
 ● сборщик Maven,
 ● БД PostgresSQL (можно другую, с обоснованием),
 ● для тестирования API подключить SwaggerUI.
