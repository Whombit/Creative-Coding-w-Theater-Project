import org.code.theater.*;
import org.code.media.*;

/**
 * Represents a subclass of gameImage with additional functionality for modifying image pixels.
 */
public class badGame extends gameImage {

    private Pixel[][] imagePixels;
    private int newRed; // Represents the new red value for pixels

    /**
     * Constructs a BadGame object with the given image file.
     *
     * @param imageFile The file path of the image.
     */
    public badGame(String imageFile) {
        super(imageFile);
        imagePixels = getPixelsFromImage();
    }

    /**
     * Sets the red component of all pixels in the image by the specified amount.
     *
     * @param amount The amount to increase the red component of each pixel by.
     */
    public void setBad(int amount) {
        if (imagePixels == null || imagePixels.length == 0 || imagePixels[0].length == 0) {
            System.out.println("No image data available.");
            return;
        }

        for (int row = 0; row < imagePixels.length; row++) {
            for (int col = 0; col < imagePixels[0].length; col++) {
                Pixel currentPixel = imagePixels[row][col];

                // Update newRed field
                newRed = currentPixel.getRed() + amount;
                newRed = Math.min(Math.max(newRed, 0), 255); // Clamp within 0-255 range

                currentPixel.setRed(newRed);
            }
        }
    }

    /**
     * Returns a string representation of the BadGame object.
     *
     * @return A string representing the new red value.
     */
    @Override
    public String toString() {
        return "New red value: " + newRed;
    }
}
