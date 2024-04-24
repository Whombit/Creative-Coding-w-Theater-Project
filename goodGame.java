import org.code.theater.*;
import org.code.media.*;

/**
 * Represents a subclass of gameImage with additional functionality for modifying image pixels.
 */
public class goodGame extends gameImage {

    private Pixel[][] imagePixels;
    private int newGreen; // Represents the new green value for pixels

    /**
     * Constructs a GoodGame object with the given image file.
     *
     * @param imageFile The file path of the image.
     */
    public goodGame(String imageFile) {
        super(imageFile);
        imagePixels = getPixelsFromImage();
    }

    /**
     * Sets the green component of all pixels in the image by the specified amount.
     *
     * @param amount The amount to increase the green component of each pixel by.
     */
    public void setGood(int amount) {
        if (imagePixels == null || imagePixels.length == 0 || imagePixels[0].length == 0) {
            System.out.println("No image data available.");
            return;
        }

        for (int row = 0; row < imagePixels.length; row++) {
            for (int col = 0; col < imagePixels[0].length; col++) {
                Pixel currentPixel = imagePixels[row][col];

                // Update newGreen field
                newGreen = currentPixel.getGreen() + amount;
                newGreen = Math.min(Math.max(newGreen, 0), 255); // Clamp within 0-255 range

                currentPixel.setGreen(newGreen);
            }
        }
    }

    /**
     * Returns a string representation of the GoodGame object.
     *
     * @return A string representing the new green value.
     */
    @Override
    public String toString() {
        return "New green value: " + newGreen;
    }
}
