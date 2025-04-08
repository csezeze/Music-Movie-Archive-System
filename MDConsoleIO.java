import java.sql.SQLOutput;
import java.util.*;

/** This class is a possible user interface for the Media Database
 *   that uses the console to display the menu of command choices.
 */
public class MDConsoleIO {

  /** A reference to the MediaDatabase object to be processed.
      Globally available to the command-processing methods.
   */
  private MediaDatabase theDatabase = null;

  /** Scanner to read from input console. */
  private Scanner scIn = null;

  // Constructor
  /** Default constructor. */
  public MDConsoleIO() {
    scIn = new Scanner(System.in);
  }

  // Methods
  /** Method to display the command choices and process user
      commands.
      @param theMediaDatabase A reference to the MediaDatabase
             to be processed
   */
  public void processCommands(MediaDatabase theMediaDatabase) {
    String[] commands = {
        "Add Entry",
        "Get Details of Media",
        "Play Media",
        "List All Media",
        "List Media by Type",
        "Exit"};

    theDatabase = theMediaDatabase;
    int choice;
    do {
      for (int i = 0; i < commands.length; i++) {
        System.out.println("Select " + i + ": "
                           + commands[i]);
      }
      try {
        choice = scIn.nextInt(); // Read the next choice.
        scIn.nextLine(); // Skip trailing newline.
        switch (choice) {
          case 0:
            doAddEntry();
            break;
          case 1:
            doGetDetails();
            break;
          case 2:
            doPlayMedia();
            break;
          case 3:
            doListAll();
            break;
          case 4:
            doListByType();
            break;
          case 5:
              break;  
          default:
            System.out.println("*** Invalid choice "
                               + choice
                               + " - try again!");
        }
      }
      catch (InputMismatchException ex) {
        System.out.println("*** Incorrect data entry - "
                           + "enter an integer between 0 and "
                           + (commands.length-1));
        scIn.nextLine(); // Discard bad input.
        choice = -1;
      }
    }
    while (choice != commands.length - 1);
    System.exit(0);
  }

  /** Method to add an entry.
      pre:  The database exists. 
      post: A new media is added.
   */
  private void doAddEntry() {
      System.out.println("Enter media type (music/movie):");
      String type = scIn.nextLine();
      if (type.equals("")) {
          return;
      }
      /** Adding New Music(album) or Movie with the information which user will give
        these information about title, artist, location, year, category and so on.
       */
      if (type.equals("music")) { //when type equals music, it will ask the next questions, the user will give information about the music(album)
          System.out.println("Enter title:"); //because of the features of music and movie are different, we need different information
          String title = scIn.nextLine();
          System.out.println("Enter artist:");
          String artist = scIn.nextLine();
          System.out.println("Enter location:");
          String location = scIn.nextLine();
          System.out.println("Enter year:");
          int year = scIn.nextInt();
          scIn.nextLine(); //skipping the new line
          System.out.println("Enter category:");
          String category = scIn.nextLine();
          System.out.println("Enter number of songs:");
          int number = scIn.nextInt(); //number of songs on the album
          scIn.nextLine(); //skipping the new line
          //Create a new Music object and add it to the database
          Music music = new Music(type, title, location, year, category, artist, number); //creating a new music object from the user
          theDatabase.addEntry(music); //adding music to the database
          System.out.println("Music media added successfully!");
      } else if (type.equals("movie")) { //when type equals movie, it will ask the next questions, the user will give information about the music
          System.out.println("Enter title:");
          String title = scIn.nextLine();
          System.out.println("Enter director:");
          String director = scIn.nextLine();
          System.out.println("Enter location:");
          String location = scIn.nextLine();
          System.out.println("Enter year:");
          int year = scIn.nextInt();
          scIn.nextLine();
          System.out.println("Enter category:");
          String category = scIn.nextLine();
          System.out.println("Enter duration:");
          int duration = scIn.nextInt(); //movie duration
          scIn.nextLine(); // Skip trailing newline
          // Create a new Movie object and add it to the database
          Movie movie = new Movie(type, title, location, year, category, director, duration);
          theDatabase.addEntry(movie); //adding movie to the database
          System.out.println("Movie media added successfully!");
      } else {
          System.out.println("*** Invalid media type - try again!***");
      }
  }


  /** Method to get details of a media object.
      pre:  The database exists.
      post: No changes made to the database.
   */
  private void doGetDetails() {
    // Request the title.
    System.out.println("Enter title");
    String theName = scIn.nextLine();
    if (theName.equals("")) {
      return; // Dialog was cancelled.
    }
    // Look up the name.
    Media m = theDatabase.lookupByTitle(theName);
    if (m != null) { // Title was found.
    	System.out.println(m.toString());
    }
    else { // not found.
      // Display the result.
      System.out.println(theName + " is not listed in the database");

    }
  }

  /** Method to play a media object.
  pre:  The database exists.
  post: No changes made to the database.
   */
  private void doPlayMedia() {
	  //	Request the title.
	  System.out.println("Enter title");
	  String theName = scIn.nextLine();
	  if (theName.equals("")) {
		  return; // Dialog was cancelled.
	  }
	  // Look up the name.
	  Media m = theDatabase.lookupByTitle(theName);
	  if (m != null) { // Title was found.
		  m.playMedia();
	  }
	  else { // not found.
		  // Display the result.
		  System.out.println(theName + " is not listed in the database");
	  }
  }

 
  
  /** Method to list all media objects in the database.
      pre:  The database has been loaded with data.
      post: No changes to the database.
   */
  private void doListAll() {
	  theDatabase.listAllMedia();
  }

  /** Method to list media objects of a specific type.
  pre:  The database has been loaded with data.
  post: No changes to the database.
   */
  private void doListByType() {
	  // Request the type.
	  System.out.println("Enter media type (music/movie/audiobook)");//no info about audiobook
	  String type = scIn.nextLine();
	  if (type.equals("")) {
		  return;
	  }
	  // validate type here
	  
	  theDatabase.listMediaByType(type);
  }
  
  public static void main(String args[]) {
      System.out.println("Welcome to the DataBase ");
      System.out.println("Please select an option (0-5)");
      MDConsoleIO ui = new MDConsoleIO();
	  MediaDatabase md = new MyMediaDatabase();
	  ui.processCommands(md);
  }

}
