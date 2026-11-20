public class GameSystem {
    private Game[] games;
    private Player[] players;
    private int gameCount;
    private int playerCount;

    //GameSystem klasse konstruktøren
    public GameSystem(int maxGames, int maxPlayers) {
        this.games = new Game[maxGames];
        this.players = new Player[maxPlayers];
    }

    //Metode til at tilføje et objekt fra Game klassen til vores GameSystem objekt
    public void addGame(Game game) {
        if (gameCount < games.length) {
            games[gameCount] = game;
            gameCount++;
            System.out.println("Spil tilføjet!");
        }else {
            System.out.println("Ikke plads til flere spil!");
            System.out.println();
        }

    }

    //Metode til at tilføje et objekt fra Player klassen til vores GameSystem objekt
    public void addPlayer(Player player) {
        if (playerCount < players.length) {
            players[playerCount] = player;
            playerCount++;
            System.out.println("Spiller tilføjet");
        }else {
            System.out.println("Ikke plads til flere spillere!");
            System.out.println();
        }

    }

    //Metode til at udskrive alle Game objekter der er indeholdt i vores GameSystem objekt, til konsollen
    public void displayAllGames() {
        for (int i = 0; i < gameCount; i++) {
            games[i].displayDetails();
        }
    }

    //Metode til at udskrive alle Player objekter der er indeholdt i vores GameSystem objekt, til konsollen
    public void displayAllPlayers() {
        for (int i = 0; i < playerCount; i++) {
            players[i].displayDetails();
        }
    }

    //Metode der opdaterer et Player objekts score attribut ved at kalde på updateScore metoden fra Player klassen
    public void updatePlayerScore(int playerId, double newScore) {
        Player playerToUpdate = findPlayerById(playerId);
        if (playerToUpdate != null) {
            playerToUpdate.updateScore(newScore);
        } else {
            System.out.println("Kan ikke opdatere spillerens score, da spillerID " +  playerId + " ikke findes!");
        }
    }

    //Metode der finder et specifikt Game objekt via gameId og returnerer det
    public Game findGameById(int gameId) {
        for (int i = 0; i < gameCount; i++) {
            if (games[i].getGameId() == gameId) {
                return games[i];
            }
        }
        System.out.println("Det søgte spil findes ikke!");
        return null;
    }

    //Metode der finder et specifikt Player objekt via playerId og returnerer det
    public Player findPlayerById(int playerId) {
        for (int i = 0; i < playerCount; i++) {
            if (players[i].getPlayerId() == playerId) {
                return players[i];
            }
        }
        System.out.println("Den søgte spiller findes ikke!");
        return null;
    }

    //Metode der finder det Player objekt der har højest værdi i score attributten og returnerer det
    public Player findTopScoringPlayer() {
        Player topScoringPlayer = players[0];
        for (int i = 0; i < playerCount; i++) {
            if (players[i].getScore() > topScoringPlayer.getScore()) {
                topScoringPlayer = players[i];
            }
        }
        System.out.println("---Top scoring player---");
        return topScoringPlayer;
    }
}
