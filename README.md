## Запуск тестов
mvn clean test

## Построение отчетов локально
mvn allure:serve

## Удалить последнюю локальную сборку
mvn clean

## Входные данные
задаются в файле application.properties

## Запуск одного теста
mvn clean -Dtest=ClassName#TestName test,
где TestName - имя класса, в котором лежит нужный тест, а TestName - имя метода теста

## Запуск тестов по тегам 
### Тесты помечены соответствующими аннотациями:
#### @Tag("auth")
#### @Tag("version")
#### @Tag("tasks")
#### @Tag("newTask")
### Запуск нескольких тестов
mvn clean test -Dgroups=newTask,version
### Запуск одного
mvn clean test -Dgroups=auth