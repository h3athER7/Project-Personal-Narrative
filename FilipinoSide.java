import org.code.theater.*;
import org.code.media.*;
public class FilipinoSide extends Scene {

  /** Instance Variables */
  private ImageFilter[][] images2;

  /** Constructor */
  public FilipinoSide(ImageFilter[][] images2) {
this.images2= images2;
  }

  /**
   * Top-level drawScene method which will draw the whole animation
   */
  public void drawScene1() {
// drawing methods
    drawFlag1();
    drawFamily1();
    drawHobby1();
  }

  // other methods...
    // other methods...
  public void drawFlag1() {
   for (ImageFilter img : images2[0]) {
      clear("white");
      drawImage(img, 0, 0, 400, 400, 0);
     setCaptionStyle1();
drawText("My mom's side is Filipino", 30, 30);
      pause(1);
      
      img.cancelRed();
      
      drawImage(img, 0, 0, 400, 400, 0);
      pause(1);
  } }

  public void drawFamily1() {
   for (ImageFilter img : images2[1]) {
      clear("white");
      drawImage(img, 0, 0, 400, 400, 0);
     setCaptionStyle1();
drawText("Some pictures of my mom's side", 30, 30);
      pause(1);
      
      img.motionBlur(10, "vertical");
      
      drawImage(img, 0, 0, 400, 400, 0);
      pause(1);
  } }

  public void drawHobby1() {
   for (ImageFilter img : images2[2]) {
      clear("white");
      drawImage(img, 0, 0, 400, 400, 0);
    setCaptionStyle1();
drawText("They like to thrift and travel", 30, 30);
      pause(1);
      
      img.threshold(10);
      
      drawImage(img, 0, 0, 400, 400, 0);
      pause(1);
  } }
    public void setCaptionStyle1() {
    setTextHeight(30);
    setTextColor("black");
    setTextStyle(Font.SERIF, FontStyle.BOLD);
  }
  }