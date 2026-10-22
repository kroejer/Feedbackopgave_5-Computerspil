# **Feedbackopgave 5 - Computerspil**

## **Gruppemedlemmer:**  
Jonas, Oliver, Valdemar og Kasper

## **Projektbeskrivelse:**  
Vi har bygget et system til at holde styr på computerspil og spillere. 
Det har vi gjort ved at oprette tre seperate klasser med seperate metoder
og fået dem til at arbejde sammen. De tre klasser vi har oprettet er:  
**Game**  
**Player**  
**GameSystem**  

Vi har oprettet et **GameSystem** med 4 spillere og 4 spil, indtastet data
for spillere og spil og dernæst testet nogle af vores metoder i **GameSystem**
klassen.

## **Hvordan køres programmet:**  
Programmet køres i main hvor vi opretter 4 objekter af klassen **Game** og 
opretter 4 objekter af klassen **Player**. Derefter opretter vi et objekt af
klassen **GameSystem** og lægger vores 8 tidligere oprettede objekter over
i **GameSystem** objektet. 

## **Klasser vi har implementeret samt deres attributter og metoder:**  

### **Game** klassen:  

Attributter inde i **Game** klassen:  
private int **gameId**  
private String **title**  
private String **genre**  
private double **price**  

Metoder inde i **Game** klassen:  
**Game** (Konstruktøren)  
**getGameId**  
**getTitle**  
**getGenre**  
**getPrice**  
**setGameId**  
**setTitle**  
**setGenre**  
**setPrice**  
**displayDetails**  
**toString** (@Override)  

### **Player** klassen:  
Attributter inde i **Player** klassen:  
private int **playerId**  
private String **name**  
private int **age**  
private double **score**  

Metoder inde i **Player** klassen:  
**Player** (Konstruktøren)  
**getPlayerId**  
**getName**  
**getAge**  
**getScore**  
**setPlayerId**  
**setName**  
**setAge**  
**setScore**  
**updateScore**  
**displayDetails**  
**toString** (@Override)  

### **GameSystem** klassen:  
Attributter inde i **GameSystem** klassen:  
private Game[] **games**  
private Player[] **players**  
private int **gameCount**  
private int **playerCount**  

Metoder inde i **GameSystem** klassen:  
**GameSystem** (Konstruktøren)  
**addGame**  
**addPlayer**  
**displayAllGames**  
**displayAllPlayers**  
**updatePlayerScore**  
**findGameById**  
**findPlayerById**  
**findTopScoringPlayer**  


## **Udfordringer ved projektet:**  
Overordnet var det en okay forståelig opgave (Valdemar skulle lige sætte 
sig ind i klasser, objekter og konstruktører med vores andres hjælp da han
missede mandagens undervisning), men vi havde dog en smule udfordringer med
at få disse tre metoder til at virke som vi gerne vil have dem til at virke:  
**updatePlayerScore**  
**findGameById**  
**findPlayerById**  

Men vi fik det til at virke til sidst og blev tilfredse med resultatet.

## **Tests vi har lavet:**  
| Test | Sådan udføres testen | Forventet resultat | Resultat |
|---|---|---|---|
| Vis spil | Kør `displayAllGames` metoden på **steam** objektet i `Main` | Alle fire spil udskrives i konsollen med de korrekte oplysninger. | Samme som forventet |
| Vis spillere | Kør `displayAllPlayers` i `Main` | Alle fire spillere udskrives i konsollen med de korrekte oplysninger | Samme som forventet  |
| Søg efter et spil der findes | Kør `findGameById(2)` metoden på **steam** objektet i `Main` | Spillet “World of Warcraft” udskrives i konsollen | Samme som forventet  |
| Søg efter et spil der ikke findes | Kør `findGamesById(5)` metoden på **steam** objektet i `Main` | Fejl besked udskrives i konsollen | Samme som forventet |
| Søg efter en spiller der findes | Kør `findPlayerById(2)` metoden på **steam** objektet i `Main` | Spilleren "Jonas" udskrives i konsollen | Samme som forventet |
| Søg efter en spiller der ikke findes | Kør `findPlayerById(5)` metoden på **steam** objektet i `Main` | Fejl besked udskrives i konsollen | Samme som forventet |
| Opdater en score | Kør `updatePlayerScore(1, 40)` på **kasper** objektet på 9,99 point i `Main` | Kaspers score bliver 49,99 point | Samme som forventet  |
| Find spilleren med højeste score | Kør `findTopScoringPlayer()` efter scoreopdateringen | Kasper vises som spilleren med den højeste score | Samme som forventet  |
| Test kapacitetsgrænsen for spil | Forsøg at tilføje et femte **Game** objekt til **steam** | Spillet bliver ikke tilføjet og der udskrives en fejl besked i konsollen | Samme som forventet |
| Test kapacitetsgrænsen for spillere | Forsøg at tilføje et femte **Player** objekt til **steam** | Spilleren bliver ikke tilføjet og der udskrives en fejl besked i konsollen | Samme som forventet |
| Test alle `Game` set'ere og get'ere | Kør hver enkelt `Game` set'er og get'er metode og kør til sidst `displayAllGames` for at tjekke om det også er blevet overført til **steam** objektet | Vores metoder virker og attributterne bliver ændret korrekt. Derefter skal de ændrede attributter udskrives i konsollen hver for sig, og til sidst skal `Game` objekterne udskrives i konsollen | Samme som forventet |
| Test alle `Player` set'ere og get'ere | Kør hver enkelt `Player` set'er og get'er metode og kør til sidst `displayAllPlayers` for at tjekke om det også er blevet overført til **steam** objektet | Vores metoder virker og attributterne bliver ændret korrekt. Derefter skal de ændrede attributter udskrives i konsollen hver for sig, og til sidst skal `Player` objekterne udskrives i konsollen | Samme som forventet |
