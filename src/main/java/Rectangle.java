/**
	* Definition of the Rectangle class
	* @author Wesley Cheung
	* @version 17.0.1
	*/

class Rectangle {
    private double length;
    private double width;

	/**
	 * This class can be configured with 2 variables, length and width
	 * @param length double that is the length of the rectangle
	 * @param width An double that is the width of the rectangle
	 */
    /** 
    * Class constructor.
    */
    public Rectangle() {
        this.length = 4;
        this.width = 8;
    }
    /** 
    * Class constructor specifying the length.
    */
    public Rectangle(double length) {
        this.length = length;
        this.width = 8;
    }
    /** 
    * Class constructor specifying the length and width.
    */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
	 * @return the value of length
	 *
	 */

    public double getLength(){
        if (length == 0 || width == 0) {
        return 0;
        }
        return this.length;
    }

    /**
	 * @return the value of width
	 *
	 */
    public double getWidth(){
        if (length == 0 || width == 0) {
        return 0;
        }
        return this.width;
    }

}