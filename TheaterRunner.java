import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    //Instantiates new scene
    Scene scene = new Scene();

    //Draws the background
    Image background = new Image("projbg.png");
    scene.drawImage(background, 0, 0, background.getWidth());

    //Creates all images as objects and whether theyre good or bad
    badGame fortnite = new badGame("fortimg(1).png");
    gameImage blank = new gameImage("fortimg(2).png");
    goodGame minecraft = new goodGame("minecraftimg.png");
    goodGame tf2 = new goodGame("tf2.png");
    badGame lol = new badGame("lol.png");

    //Draws and sets fortnite to bad
    scene.drawImage(fortnite, 150, 250, fortnite.getWidth());
    scene.pause(1);
    fortnite.setBad(150);
    scene.drawImage(fortnite, 250, 50, fortnite.getWidth());
    System.out.println(fortnite.toString());
    scene.drawImage(blank, 150, 250, blank.getWidth());
    scene.pause(1);

    //Draws and sets minecraft to good
    scene.drawImage(minecraft, 150, 250, minecraft.getWidth());
    scene.pause(1);
    minecraft.setGood(150);
    scene.drawImage(minecraft, 50, 50, minecraft.getWidth());
    System.out.println(minecraft.toString());
    scene.drawImage(blank, 150, 250, blank.getWidth());
    scene.pause(1);

    //Draws and sets tf2 to good
    scene.drawImage(tf2, 150, 250, tf2.getWidth());
    scene.pause(1);
    tf2.setGood(150);
    scene.drawImage(tf2, 70, 50, tf2.getWidth());
    System.out.println(tf2.toString());
    scene.drawImage(blank, 150, 250, blank.getWidth());
    scene.pause(1);
    
    //Draws and sets lol to bad
    scene.drawImage(lol, 150, 250, lol.getWidth());
    scene.pause(1);
    lol.setBad(150);
    scene.drawImage(lol, 270, 50, lol.getWidth());
    System.out.println(lol.toString());
    scene.drawImage(blank, 150, 250, blank.getWidth());
    scene.pause(1);

    //Runs the theater
    Theater.playScenes(scene);

  }
}
