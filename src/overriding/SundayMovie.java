package overriding;

public class SundayMovie {
    public static void main(String[] args) {
        HollywoodMovie hollywoodMovie = new HollywoodMovie("Cast Away", 2024);
        hollywoodMovie.duration();

        KollywoodMovie kollywoodMovie = new KollywoodMovie("Mokka Movie", 2024);
        kollywoodMovie.duration();

    }
}
