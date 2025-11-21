/**
	* Definition of the Chair class
	* @author Wesley Cheung
	* @version 17.0.1
	*/

class Chair {
    private int legs;
    private String material;

	/**
	 * This class can be configured with 2 variables, legs and material
	 * @param legs integer that is the number of legs of the chair
	 * @param material A String that is the materials of the chair
	 */
    /** 
    * Class constructor.
    */
    public Chair() {
        this.legs = 4;
        this.material = "wood";
    }
    /** 
    * Class constructor specifying the length.
    */
    public Chair(int legs) {
        this.legs = legs;
        this.material = "wood";
    }
    /** 
    * Class constructor specifying the length and width.
    */
    public Chair(int legs, String material) {
        this.legs = legs;
        this.material = material;
    }

    /**
	 * @return the value of legs
	 *
	 */

    public int getLegs(){
        return this.legs;
    }

    /**
	 * @return the value of width
	 *
	 */
    public String getMaterial(){
        return this.material;
    }

}