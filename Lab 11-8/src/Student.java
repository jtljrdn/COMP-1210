public class Student {
    // Define Student Variables
    String name;
    double[] scores;

    public Student(){
        name = "";
        scores = new double[5];
    }

    // Class mutators
    public void setName(String name) {
        this.name = name;
    }
    public void setScores(double[] scores) {
        this.scores = scores;
    }

    // Class Accessors
    public String getName() {
        return name;
    }

    public double[] getScores() {
        return scores;
    }

    // Calculate Average Score
    public double calculateAverageScore(){
        double allScores = 0;
        double averageScore;
        for (int i = 0; i < scores.length; i++) {
            allScores += scores[i];
        }
        averageScore = allScores / scores.length;
        return averageScore;
    }
}
