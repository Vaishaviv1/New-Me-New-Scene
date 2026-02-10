import org.code.theater.*;
import org.code.media.*;

public class LastYear extends Scene {

  // Variables 
  private String title;              
  private String[] recapPoints;   

  // Constuctor
  public LastYear() {
    title = "2025 Recap";
    recapPoints = new String[] {
      "Went to a lot of vacation places",
      "Made new friends",
      "Won awards for music"
    };
    drawScene();
  }

  /*
   Parameterized constructor
   */
  public LastYear(String titleText, String[] points) {
    title = titleText;
    recapPoints = points;
  }

  /**
  drawScene method
   */
  public void drawScene() {
    playSound("BackgroundMusic.wav");
    screen1();
    pause(5);
    screen2();
    pause(5);
  }

  // other methods

  /*
   Draws the first screen of the recap
   */
  public void screen1() {
    clear("Pink");
    setTextStyle(Font.SERIF, FontStyle.BOLD);
    drawImage("Vacation.png", 0, 0, 400);
    pause(1);

    // iteration + array traversal (initializer list array)
    setTextColor("White");
    System.out.println(title);
    drawText(title, 10, 90);

    int y = 125;
    for (int i = 0; i < recapPoints.length; i++) {

      // selection (if/else) 
      if (i == 0) {
        setTextColor("Yellow");  
      } else {
        setTextColor("White");
      }

      drawText("- " + recapPoints[i], 10, y);
      y = y + 25;
    }

    // uses a helper method with a return value
    setTextColor("White");
    drawText("Biggest win: " + getLongestRecap(), 10, y + 15);
  }

  /*
  Draws the second screen of the recap
   */
 public void screen2() {
  clear("white");
  setTextStyle(Font.SERIF, FontStyle.BOLD);
  setTextColor("Black");

  drawText("What I did most:", 10, 60);
  drawText(getMostImportantWord(), 10, 95);
  drawImage("IMG_7237.JPG", 30, 140, 350);

}

  /*
  Helper method
   
   */
  public String getLongestRecap() {
    String longest = recapPoints[0];

    for (int i = 1; i < recapPoints.length; i++) {
      if (recapPoints[i].length() > longest.length()) {
        longest = recapPoints[i];
      }
    }

    return longest;
  }

  /*
    Helper method 
   Gets the most important word using a for loop and an if else statement

   */
  public String getMostImportantWord() {
    
    for (int i = 0; i < recapPoints.length; i++) {
      if (recapPoints[i].indexOf("music") >= 0 || recapPoints[i].indexOf("Music") >= 0) {
        return "Music";
      }
    }
    return "Friends";
  }

}
