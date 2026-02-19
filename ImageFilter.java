
import org.code.theater.*;
import org.code.media.*;

public class ImageFilter extends ImagePlus {

  /** Instance Variables */
  
  /** Constructor */
  public ImageFilter(String fileName) {
    super(fileName);
  }

  // Add filter methods here...
  /*
  * pixelate filer method
  */
    public void pixelate(int gridSize) {

    Pixel[][] pixels=getImagePixels();

    for(int r=0; r < pixels.length; r+= gridSize) {
    for(int c=0; c< pixels[0].length; c+= gridSize) {

    int endRow = Math.min(r + gridSize, pixels.length);
    int endColumn= Math.min(c + gridSize, pixels[0].length);
        
    int totalRed = 0;
    int totalGreen = 0;
    int totalBlue = 0;
    
    for(int r2=r; r2 < endRow; r2++) {
    for(int c2=c ; c2 < endColumn; c2++) {
    
    totalRed+= pixels[r2][c2].getRed();
    totalGreen+= pixels[r2][c2].getGreen();
    totalBlue+= pixels[r2][c2].getBlue();
          }
        }

    int totalPixels = (endRow - r) * (endColumn - c);
    int avgRed = totalRed / totalPixels;
    int avgGreen = totalGreen / totalPixels;
    int avgBlue = totalBlue / totalPixels;

    for(int r2=r; r2 < endRow; r2++) {
    for(int c2=c ; c2 < endColumn; c2++) {
            // add the value of RGB
            pixels[r2][c2].setRed(avgRed);
            pixels[r2][c2].setGreen(avgGreen);
            pixels[r2][c2].setBlue(avgBlue);
          }
        }
      }
    }   
  }

  /*
  * blur filter method
  */
   public void motionBlur(int length, String direction) {
    Pixel[][] pixels = getImagePixels();

    // traverse all pixels
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        
        // variables to total RBG valuse
        int totalRed = 0;
        int totalGreen = 0;
        int totalBlue = 0;

        // since we are bluring in a direction, these variables help us
        // reference the area we will total RBG value
        int x = col;
        int y = row;
        int count = 0; // use to repeat the length number of times

        // complex conditional to keep in bounds of width/height
        while (count < length && x < getWidth() && y < getHeight()) {
          // add RGB to the variables
          Pixel currentPixel = pixels[y][x];
          totalRed += currentPixel.getRed();
          totalGreen += currentPixel.getGreen();
          totalBlue += currentPixel.getBlue();
          // increase count to move to ending condition of count < length
          count++;
          // update x & y based on the definition of the bluring
          if (direction.equals("horizontal")) {
            x++;
          }
          else if (direction.equals("vertical")) {
            y++;
          }
          else if (direction.equals("diagonal")) {
            x++;
            y++;
          }
        }

        // calculate avg RBG
        int avgRed = totalRed / count;
        int avgGreen = totalGreen / count;
        int avgBlue = totalBlue / count;
        
        // update RBG values
        Pixel currentPixel = pixels[row][col];
        currentPixel.setRed(avgRed);
        currentPixel.setGreen(avgGreen);
        currentPixel.setBlue(avgBlue);
      }
    }
    
  }

  /*
  * threshold filter method
  */
   public void threshold(int value) {
    Pixel[][] pixels = getImagePixels();

    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        Pixel currentPixel = pixels[row][col];
        
        // calculate the avg RBG values
        int totalRGB = currentPixel.getRed() + currentPixel.getGreen() + currentPixel.getBlue();
        int grayValue = totalRGB / 3;

        // threshold mean "Have I crossed the boundary?", therefor IF the value is under the minimum
        if (grayValue < value) {
          currentPixel.setColor(Color.BLACK);
        }
        else {
          currentPixel.setColor(Color.WHITE);
        }
      }
    }    
  }

  /*
  * make new filter, probably color filter
  */
  public void cancelRed() {
    Pixel[][] pixels= getImagePixels();

      for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) { 
      Pixel currentPixel = pixels[row][col];
        currentPixel.setRed(0); 
      }
    }
  }
}