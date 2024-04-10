
public class Workout {

    int sequence;

    int reps = 10;

    int set = 5;

    String targetMuscle;

    String name = "Squat";

    final String instructor = "Karthick";

    public int caloriesBurnt() {
        return reps * set * 50;
    }

}
