SELECT * FROM Persons;

-- Zczytaj wszystkie kolumny dla wszystkich wierszy w tabeli
SELECT * FROM Persons;

-- Zczytaj wybrane kolumny dla wszystkich wierszy w tabeli
SELECT FirstName, LastName FROM Persons;

-- Zczytaj wszystkie kolumny dla tych wierszy w tabeli, dla których wartością pola "FirstName" jest "Oliwia"
SELECT * FROM Persons WHERE FirstName = 'Oliwia';

-- Zczytaj wybrane kolumny dla tych wierszy w tabeli, dla których wartością pola "FirstName" jest "Justyna" LUB (OR) wartość pola "Age" jest mniejsza od 33
-- Logiczne operator OR i AND działają tak samo jak w javie
SELECT FirstName, LastName FROM Persons WHERE FirstName = 'Justyna' OR Age < 33;