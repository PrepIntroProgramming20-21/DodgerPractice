public class WorldSeries {
  //delcare and initialize instance variables
  BaseballPlayer[] dodgers = new BaseballPlayer[9];
  
  public void playSeries() {
    dodgers[0] = new BaseballPlayer();
    dodgers[0].name = "Pedro Baéz";
    setRoster();

    System.out.println("Here's our Dodger lineup!");
    //enhanced for loop
    for (BaseballPlayer p: dodgers) {
      System.out.println(p.name);
    }

    // with arrays, you can initialize with this shorthand:
    int[] raysScores = {3, 6, 2, 9, 2, 1};
    // setup the dodgers score

    // Print out the score for each game using a regular for loop

    //Set the instance variable wsWinner for each dodger player to true

    
  }

  
  public void setRoster() {
    for (int i = 0; i<dodgers.length; i++) {
      dodgers[i] = new BaseballPlayer();
    }
    dodgers[1].name = "Walker Buehler";
    dodgers[2].name = "Dylan Floro";
    dodgers[3].name = "Tony Gonsolin";
    dodgers[4].name = "Victor González";
    dodgers[5].name = "Brusdar Graterol";
    dodgers[6].name = "Kenley Jansen";
    dodgers[7].name = "Joe Kelly";
    dodgers[8].name = "Clayton Kershaw";
  }

  public static void main(String[] args) {
    WorldSeries w = new WorldSeries();
    w.playSeries();
  }
}