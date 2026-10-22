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
        for (Game game : games) {
            game.displayDetails();
        }
    }

    //Metode til at udskrive alle Player objekter der er indeholdt i vores GameSystem objekt, til konsollen
    public void displayAllPlayers() {
        for (Player player : players) {
            player.displayDetails();
        }
    }

    //Metode der opdaterer et Player objekts score attribut ved at kalde på updateScore metoden fra Player klassen
    public void updatePlayerScore(int playerId, double newScore) {
        Player playerToUpdate = findPlayerById(playerId);
        playerToUpdate.updateScore(newScore);
    }

    //Metode der finder et specifikt Game objekt via gameId og returnerer det
    public Game findGameById(int gameId) {
        if (gameId > games.length) {
            System.out.println("Dette GameID findes ikke!");
            return null;
        } else {
            Game findGameById = games[0];
            for (Game game : games) {
                if (game.getGameId() == gameId) {
                    findGameById = game;
                }
            }
            return findGameById;
        }
    }

    //Metode der finder et specifikt Player objekt via playerId og returnerer det
    public Player findPlayerById(int playerId) {
        if (playerId > players.length) {
            System.out.println("Dette PlayerID findes ikke!");
            return null;
        } else {
            Player findPlayerById = players[0];
            for (Player player : players) {
                if (player.getPlayerId() == playerId) {
                    findPlayerById = player;
                }
            }
            return findPlayerById;
        }
    }

    //Metode der finder det Player objekt der har højest værdi i score attributten og returnerer det
    public Player findTopScoringPlayer() {
        Player topScoringPlayer = players[0];
        for (Player player : players) {
            if (player.getScore() > topScoringPlayer.getScore()) {
                topScoringPlayer = player;
            }
        }
        System.out.println("---Top scoring player---");
        return topScoringPlayer;
    }
}
