public class Player {
    private int playerId;
    private String name;
    private int age;
    private double score;

    //Player klasse konstruktøren
    public Player(int playerId, String name, int age, double score) {
        this.playerId = playerId;
        this.name = name;
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
            System.out.println("Fejl: Alderen må ikke være negativ!");
        }
        this.score = score;
    }

    //Her kommer alle get'ere og set'ere
    public int getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    public void setPlayerid(int playerId) {
        this.playerId = playerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 10;
            System.out.println("Fejl: Alderen må ikke være negativ!");
        }
    }

    public void setScore(double score) {
        this.score = score;
    }

    //Metode der opdaterer et objekts score variabel ved at tilføje den nye mængde score til det allerede indtastede
    public void updateScore(double newScore) {
        this.score += newScore;
    }

    //Metode til at udskrive information om objektet i konsollen
    public void displayDetails() {
        System.out.println(this);
    }

    //Alternativ metode til at udskrive information om objektet i konsollen ved at overskrive toString metoden fra Java
    @Override
    public String toString() {
        return "************************\n"
                + "---Player information---\n"
                + "Player ID: " + playerId + "\n"
                + "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Score: " + score + "\n"
                + "************************\n";
    }
}
