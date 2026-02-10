import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // Create scene objects
    LastYear lastYear = new LastYear();
    ThisYear thisYear = new ThisYear();
    Scene[] myScenes = {lastYear, thisYear};

    // Play scenes 
    Theater.playScenes(myScenes);
    
  }
}
