import org.code.theater.*;
import org.code.media.*;

public class ThisYear extends Scene {

  // Variables
  private String title;
  private String[] goals;

  // No-argument constructor
  public ThisYear() {
    title = "2026 Goals";
    goals = FileReader.toStringArray("data2.txt");
    drawScene();
  }

  /*
   * Parameterized constructor
   */
  public ThisYear(String titleText, String[] goalList) {
    title = titleText;
    goals = goalList;
  }

  /**
  drawScene method
   */
  public void drawScene() {
    screen1();
    pause(7);
  }

  /*
   * Draws the goals screen
   */
  public void screen1() {
    clear("Purple");
    setTextStyle(Font.SERIF, FontStyle.BOLD);
    setTextColor("Silver");

    drawText(title, 10, 50);

    drawGoals(10, 90);
  }

  /*
   * Helper method (void)
   * Draws all goals from the text file
   */
  public void drawGoals(int x, int startY) {
    int y = startY;

    for (int i = 0; i < goals.length; i++) {

      // simple selection for variety
      if (i == 0) {
        setTextColor("Purple");
      } else {
        setTextColor("Black");
      }

      drawText("- " + goals[i], x, y);
      y = y + 25;
    }
  }
}
