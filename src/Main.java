
void main() {
    Game lol = new Game(1, "League of Legends", "MOBA", 0.0);
    Game wow = new Game(2, "World of Warcraft", "MMORPG", 14.99);
    Game arcRaid = new Game(3, "Arc Raiders", "Extraction Shooter", 39.99);
    Game cs2 = new Game(4, "Counter Strike 2", "First Person Shooter", 19.99);

    Player kasper = new Player(1, "Kasper", 30, 9.99);
    Player jonas = new Player(2, "Jonas", 22, 19.99);
    Player oliver = new Player(3, "Oliver", 22, 29.99);
    Player valdemar = new Player(4, "Valdemar", 22, 39.99);

    GameSystem steam = new GameSystem(4,4);

    steam.addGame(lol);
    steam.addGame(wow);
    steam.addGame(arcRaid);
    steam.addGame(cs2);

    steam.addPlayer(kasper);
    steam.addPlayer(jonas);
    steam.addPlayer(oliver);
    steam.addPlayer(valdemar);

    //Tests
    //Test 1
    steam.displayAllGames();

    //Test 2
    steam.displayAllPlayers();

    //Test 3
    System.out.println(steam.findGameById(2));

    //Test 4
    System.out.println(steam.findGameById(5));

    //Test 5
    System.out.println(steam.findPlayerById(2));

    //Test 6
    System.out.println(steam.findPlayerById(5));

    //Test 7
    steam.updatePlayerScore(1, 40);

    //Test 8
    System.out.println(steam.findTopScoringPlayer());

    //Test 9
    Game testGame = new Game(5, "test", "test", 4.99);
    steam.addGame(testGame);
    steam.displayAllGames();

    //Test 10
    Player testPlayer = new Player(5, "test", 10, 4.99);
    steam.addPlayer(testPlayer);
    steam.displayAllPlayers();

    //Test 11
    lol.setGameId(5);
    wow.setTitle("test");
    arcRaid.setGenre("test");
    cs2.setPrice(199.99);
    System.out.println(lol.getGameId());
    System.out.println(wow.getTitle());
    System.out.println(arcRaid.getGenre());
    System.out.println(cs2.getPrice());
    steam.displayAllGames();

    //Test 12
    kasper.setPlayerid(5);
    jonas.setName("test");
    oliver.setAge(100);
    valdemar.setScore(129.99);
    System.out.println(kasper.getPlayerId());
    System.out.println(jonas.getName());
    System.out.println(oliver.getAge());
    System.out.println(valdemar.getScore());
    steam.displayAllPlayers();
}
