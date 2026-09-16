# Calculator Service

Консольное Java-приложение для выполнения арифметических операций.

## Сборка

``` bash
./gradlew clean build
```

Jar после сборки:

``` text
build/libs/calculator-service-1.0.jar
```

## Проверки качества

Checkstyle:

``` bash
./gradlew checkstyleMain
```

Отчеты:

``` text
build/reports/checkstyle/main.html
build/reports/checkstyle/main.xml
```

SpotBugs:

``` bash
./gradlew spotbugsMain
```

Отчеты:

``` text
build/reports/spotbugs/main.html
build/reports/spotbugs/main.xml
```

## Тесты

``` bash
./gradlew test
```

Отчеты:

``` text
build/reports/tests/test/index.html
build/test-results/test/
```

## Запуск приложения

``` bash
java -jar build/libs/calculator-service-1.0.jar
```

Формат:

``` text
java -jar calculator-service-1.0.jar <number1> <operator> <number2>
```

## Проверка операций

Сложение:

``` bash
java -jar build/libs/calculator-service-1.0.jar 11 + 7
```

Ожидаемо:

``` text
Result: 18.0
```

Вычитание:

``` bash
java -jar build/libs/calculator-service-1.0.jar 11 - 7
```

Ожидаемо:

``` text
Result: 4.0
```

Умножение:

``` bash
java -jar build/libs/calculator-service-1.0.jar 11 '*' 7
```

Ожидаемо:

``` text
Result: 77.0
```

Деление:

``` bash
java -jar build/libs/calculator-service-1.0.jar 14 / 7
```

Ожидаемо:

``` text
Result: 2.0
```

Проверка ошибки:

``` bash
java -jar build/libs/calculator-service-1.0.jar 10 / 0
```

Ожидается обработка:

``` text
DivisionByZeroException
```

## Полный цикл проверки

Очистка:

``` bash
./gradlew clean
```

Сборка:

``` bash
./gradlew clean build
```

Проверка jar:

``` bash
java -jar build/libs/calculator-service-1.0.jar 11 + 7
```

Финальная очистка:

``` bash
./gradlew clean
```

## Javadoc

``` bash
./gradlew javadoc
```

Отчет:

``` text
build/docs/javadoc/
```

