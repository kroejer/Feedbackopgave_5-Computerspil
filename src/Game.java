public class Game {
    private int gameId;
    private String title;
    private String genre;
    private double price;

    //Game klassens konstruktør
    public Game(int gameId, String title, String genre, double price) {
        this.gameId = gameId;
        this.title = title;
        this.genre = genre;
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Fejl: Prisen må ikke være negativ!");
            this.price = 0;
        }
    }

    //Her kommer alle get'ere og set'ere
    public int getGameId() {
        return gameId;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = price;
        } else {
            System.out.println("Fejl: Prisen må ikke være negativ!");
        }
    }

    //Metode til at udskrive information om objektet i konsollen
    public void displayDetails() {
        System.out.println(this);
    }


    //Alternativ metode til at udskrive information om objektet i konsollen ved at overskrive toString metoden fra Java
    @Override
    public String toString() {
        return "**********************\n"
                + "---Game information---\n"
                + "Game ID: " + gameId + "\n"
                + "Title: " + title + "\n"
                + "Genre: " + genre + "\n"
                + "Price: " + price + "\n"
                + "**********************\n";
    }
}
