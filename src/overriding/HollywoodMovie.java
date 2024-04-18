package overriding;

public class HollywoodMovie extends Movie {

    public HollywoodMovie(String name, int year) {
        super(name, year);
    }

    public void duration() {
        System.out.println("Movie is 90 minutes long");
    }

}
