package Unidad09Herencia.Ej6;
public class Movie {

    public static String title;
    private int duration;
    private int minAge;
    private String director;
    private static final String FILE_NAME = "occupiedSeats"+title+".txt";
    

    public Movie(String title, int duration, int minAge, String director) {
        Movie.title = title;
        this.duration = duration;
        this.minAge = minAge;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public int getMinAge() {
        return minAge;
    }

    public String getDirector() {
        return director;
    }

	public static String getFileName() {
		return FILE_NAME;
	}
} 