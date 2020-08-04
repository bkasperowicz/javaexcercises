## Zadanie 2 - SQL 1

Stwórz aplikację konsolową która będzie rejestrowała użytkownika (jak przy zwykłej rejestracji w dowolnym logowaniu).

Aplikacja ma zapytać użytkownika o login, hasło, imie i nazwisko.

**Aplikacja ma zapisać dane użytkownika w bazie danych Microsoft SQL.**

#### Podzadania
1. Stwórz bazę danych o nazwie *LoginDB*
1. W bazie danych stwórz tabelę o nazwie *Users*. Tabela musi zawierać wszystkie pola wpisywane przez użytkownika i unikalny klucz.
1. Połącz się ze swoją bazą danych z poziomu kodu - spytać Bartka
   * Dodaj paczkę *com.microsoft.sqlserver* do skryptu gradle
   * Połącz się z bazą danych przy użyciu klasy DriverManager

Gdy Użytkownik wpisze już swoje dane aplikacja ma wypisać dane wszystkich zarejestrowanych użytkowików na konsolę

### Przykład

```
User registration
-----------------
Enter your login:
Justynka
Enter your password:
Jakie$tamh@slo
Enter your name:
Justyna
Enter your surname:
Kasperowicz

Registered users
-----------------
Justyna Kasperowicz
Bartlomiej Kasperowicz
Laura Kasperowicz
Oliwia Kasperowicz
```
### Przydatne linki:
- [Tworzenie bazy danych](db_createdb.md)
- [Pisanie skryptów do operacji na tabelach i danych](sms_scripts.md)
- [Tworzenie tabeli w bazie danych](https://www.youtube.com/watch?v=OKUcgXXrFGU)
- dostęp do bazy danych z poziomu kodu