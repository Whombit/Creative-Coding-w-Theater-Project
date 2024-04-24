// Import necessary packages
import org.code.theater.*;
import org.code.media.*;

// Define the class extending Image
public class gameImage extends Image {

    // Private member variable to store image pixels
    private Pixel[][] imagePixels;

    // Constructor to initialize the image and extract its pixels
    public gameImage(String imageFile) {
        // Call superclass constructor to initialize the image
        super(imageFile);
        // Extract pixels from the image
        imagePixels = getPixelsFromImage();
    }

    // Method to retrieve the image pixels
    public Pixel[][] getImagePixels() {
        return imagePixels;
    }

    // Method to get pixels from the entire image
    // Original method
    public Pixel[][] getPixelsFromImage() {
        // Create a temporary array to hold pixels
        Pixel[][] tempPixels = new Pixel[getHeight()][getWidth()];

        // Iterate through each row and column of the image
        for (int row = 0; row < tempPixels.length; row++) {
            for (int col = 0; col < tempPixels[0].length; col++) {
                // Get the pixel at the current row and column
                tempPixels[row][col] = getPixel(col, row);
            }
        }

        // Return the extracted pixels
        return tempPixels;
    }

    // Overloaded method to get pixels from a specific region of the image
    public Pixel[][] getPixelsFromImage(int startX, int startY, int width, int height) {
        // Create a temporary array to hold pixels of the specified region
        Pixel[][] tempPixels = new Pixel[height][width];

        // Iterate through the specified region of the image
        for (int row = startY; row < startY + height; row++) {
            for (int col = startX; col < startX + width; col++) {
                // Get the pixel at the current row and column relative to the specified region
                tempPixels[row - startY][col - startX] = getPixel(col, row);
            }
        }

        // Return the extracted pixels from the specified region
        return tempPixels;
    }
}
