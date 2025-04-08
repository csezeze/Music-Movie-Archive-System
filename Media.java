
/** A media item with basic attributes like type, title, location, year, and category
  is represented by the Media abstract class.
 These properties include getter and setter methods, and a toString function
 is available to show the media item's details.
 Additionally, it defines an abstract playMedia method that its subclasses must implement.
 In other words, The Media class symbolizes a piece of media, such a music or a movie.
 Since this class is abstract, it must be subclassed and cannot be instantiated directly.
 */
    abstract class Media {

    private String type;
    private String title;
    private String location;
    private int year;
    private String category;

    /** Initializes the properties of the Media class in its constructor.
     */
    public Media(String type, String title, String location, int year, String category) {
        this.type = type;
        this.title = title;
        this.location = location;
        this.year = year;
        this.category = category;
    }

    public String getType() {
        return type;
    }//returns the type of media

    public void setType(String type) {
        this.type = type;
    }//sets the type of media, in others, it is similiar like this

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public abstract void playMedia();

    /**
     Returns a string representation of the Media object.
     */
    @Override
    public String toString() {
        return "Media{" +
                "Type='" + type + '\'' +
                ", Title='" + title + '\'' +
                ", Location='" + location + '\'' +
                ", Year=" + year +
                ", Category='" + category + '\'' +
                '}';
    }
}