import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {


    // Create any 2D arrays & variables to be passed as parameters to constructor

    /*
    *  rows: different drawing categories
    * 1. flag
    * 2. family pic
    * 3. hobbies family has
    * columns: images within the drawing categories
    */
ImageFilter[][] images= {
// 2D array of images
  {new ImageFilter("Untitled-design-(3).png"), new ImageFilter("Untitled-design-(3).png")},
  {new ImageFilter("Untitled-design-(4).png"),new ImageFilter("fam4.png")},
  {new ImageFilter("sailing.png"), new ImageFilter("skiing.png")}
};
    /*
    *  rows: different drawing categories
    * 1. flag
    * 2. family pic
    * 3. hobbies family has
    * columns: images within the drawing categories
    */
ImageFilter[][] images2= {
// 2D array of images
  {new ImageFilter("filipinoflag.png"), new ImageFilter("filipinoflag.png")},
  {new ImageFilter("Untitled-design.png"), new ImageFilter("fam2.png")},
  {new ImageFilter("thrifting.png"), new ImageFilter("travelling.png")}
  
};
    // Instantiate Scene subclass objects
    AmericanSide scene1 = new AmericanSide(images);
    FilipinoSide scene2 = new FilipinoSide(images2);
    
    // Call drawScene methods in each subclass
    scene1.drawScene();
    scene2.drawScene1();
    
    // Play scenes in Theater, in order of arguments
    Theater.playScenes(scene1, scene2);
    
   
  }
}