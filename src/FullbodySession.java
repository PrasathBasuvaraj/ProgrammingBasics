public class FullbodySession {

    public static void main(String[] args) {
        System.out.println("******* Let's display the workout schedule for Shyamantha *******");
        Workout workout1 = new Workout();
        Workout workout2 = new Workout();
        workout2.name = "Lunge";
        workout2.reps = 8;
        workout2.set = 6;
//        workout2.instructor = "Lokesh";
        System.out.println("Name of workout 1 : " + workout1.name);
        System.out.println("Calories burnt with workout 1 : " + workout1.caloriesBurnt());
        System.out.println("Name of workout 2 : " + workout2.name);
        System.out.println("Calories burnt with workout 2 : " + workout2.caloriesBurnt());
    }

}
