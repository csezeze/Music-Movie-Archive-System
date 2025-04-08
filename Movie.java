class Movie extends Media {
    private String director;
    private int playingTime;
/**
 * Creates a new Movie object with the given parameters. The continuing part is similiar in music.java
 */
    public Movie(String type, String title, String location, int year, String category, String director,
                 int playingTime) {
        super(type, title, location, year, category);
        this.director = director;
        this.playingTime = playingTime;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    @Override
    public void playMedia() {
        System.out.println("*** Now playing: ***" + getTitle() + " directed by=>" + getDirector() + " ( " + getPlayingTime() + " minutes)");
    }

    @Override
    public String toString() {
        return "Movie{" +
                "Director='" + director + '\'' +
                ", Duration=" + playingTime +
                ", Type='" + getType() + '\'' +
                ", Title='" + getTitle() + '\'' +
                ", Location='" + getLocation() + '\'' +
                ", Year=" + getYear() +
                ", Category='" + getCategory() + '\'' +
                '}';
    }
}