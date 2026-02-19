import org.code.theater.*;
import org.code.media.*;

public class AmericanSide extends Scene {

  /** Instance Variables */
  private ImageFilter[][] images;

  /** Constructor */
  public AmericanSide(ImageFilter[][] images) {
  this.images=images;
  }

  /**
   * Top-level drawScene method which will draw the whole animation
   */
  public void drawScene() {
   // methods for drawing 
    playSound("background.wav");
    drawFlag();
    drawFamily();
    drawHobby();
  }

  // other methods...
  public void drawFlag() {
   for (ImageFilter img : images[0]) {
      clear("white");
      drawImage(img, 0, 0, 400, 400, 0);
setCaptionStyle();
drawText("My dad's side is American", 30, 30);
      pause(1);
      
      img.pixelate(10);
      
      drawImage(img, 0, 0, 400, 400, 0);
      pause(1);
  } }

    public void drawFamily() {
   for (ImageFilter img : images[1]) {
      clear("white");

      drawImage(img, 0, 0, 400, 400, 0);
     setCaptionStyle();
drawText("Some pictures of my dad's side", 30, 30);
      pause(1);
      img.motionBlur(10, "vertical");
      
      drawImage(img, 0, 0, 400, 400, 0);
      pause(1);
  } }

          public void drawHobby() {
   for (ImageFilter img : images[2]) {
      clear("white");
      drawImage(img, 0, 0, 400, 400, 0);
     setCaptionStyle();
drawText("They like to sail and ski", 30, 30);
      pause(1);
      
      img.threshold(10);
      
      drawImage(img, 0, 0, 400, 400, 0);
      pause(1);
  } }

    public void setCaptionStyle() {
    setTextHeight(30);
    setTextColor("black");
    setTextStyle(Font.SERIF, FontStyle.BOLD);
  }

}