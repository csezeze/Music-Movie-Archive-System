import java.util.ArrayList;

public class MyMediaDatabase implements MediaDatabase {
    private ArrayList<Media> mediaList;
    /**
     A class representing a media database containing a collection of media entries.
     Creates a new MyMediaDatabase object with no media in it.
     */

    public MyMediaDatabase() {
        mediaList = new ArrayList<>();
    }

    /**
     Finds the first entry in the media list that matches the given title, no matter the case,
     and returns that entry. Returns null if no entry is found.
     The search term for the media entry's title.
     If a media entry with the supplied title exists, return it; else, return null.
     */
    @Override
    public Media lookupByTitle(String title) {
        for (Media media : mediaList) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }
    /**
     Adds a new media entry to the media list.
     In other words,The media entry to add to the list.
     */
    @Override
    public void addEntry(Media newMedia) {
        mediaList.add(newMedia);
    }

    /**
     Prints a list of all media entries in the media list.
     */
    @Override
    public void listAllMedia() {
        System.out.println("Listing all media:");
        for (Media media : mediaList) {
            System.out.println("Type: " + media.getType() + ", Title: " + media.getTitle());
        }
    }
    /**
     Returns(prints) a list of all media list entries that match the requested type.
     Prints a message stating that no entries of the requested kind were found.
     Enter the type of media entry to list.
     */
    @Override
    public void listMediaByType(String type) {
        System.out.println("Listing media of type: " + type);
        boolean found = false;
        for (Media media : mediaList) {
            if (media.getType().equalsIgnoreCase(type)) {
                System.out.println("Title: " + media.getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No media of type: " + type + " found.");
        }
    }
}