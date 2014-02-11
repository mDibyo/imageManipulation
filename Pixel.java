/* Pixel.java */

/**
 *  This Pixel class represents a single pixel in an image. It is an
 *  array of three ints where the first, second and third integer 
 *  store the Red, Green and Blue value respectively.
 */

public class Pixel {

    private short[] color;


    public Pixel(short red, short green, short blue) {
        color[0] = red;
        color[1] = green;
        color[2] = blue;
    }

    public Pixel() {
        color[0] = 0;
        color[1] = 0;
        color[2] = 0;        
    }

    public short getRed() {
        return color[0];
    }

    public short getGreen() {
        return color[1];
    }

    public short getBlue() {
        return color[2];
    }

    public void setRed(short red) {
        color[0] = red;
    }

    public void setGreen(short green) {
        color[1] = green;
    }

    public void setBlue(short blue) {
        color[2] = blue;
    }

    public Pixel averagePixel(Pixel[] pixelArray, int length) {
        int average = 0, counter;
        Pixel pixel = new Pixel();
        // Get red color
        for (counter = 0, average = 0; counter < length; counter++) {
            average += pixelArray[counter].getRed();
        }
        average /= length;
        pixel.setRed((short) average);
        // Get green color
        for (counter = 0, average = 0; counter < length; counter++) {
            average += pixelArray[counter].getGreen();
        }
        average /= length;
        pixel.setGreen((short) average);
        // Get blue color
        for (counter = 0, average = 0; counter < length; counter++) {
            average += pixelArray[counter].getBlue();
        }
        average /= length;
        pixel.setBlue((short) average);
        return pixel;
    }


}