import java.text.DecimalFormat;
/**
*Makes a class that calculates different aspects of a Spherocylinder.
*
*Project 6
*Alexander Brannon - COMP 1210 - 004
*9/27/17
*/
public class Spherocylinder {

// Fields (Instance Variables)
   
   private String label = "";
   private double radius = 0;
   private double cylinderHeight = 0;
   
// Constructors
/**
*@param labelIn - sets the label from the structure.
*@param radiusIn - sets the radius from the structure.
*@param cylinderHeightIn - sets the cylinder height from the structure.
*/

   public Spherocylinder(String labelIn, double radiusIn, 
      double cylinderHeightIn) {
   
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(cylinderHeightIn);
   }

// Methods
/**
*@return label - gives the label from the input.
*/

   public String getLabel() {
      return label;
   }
/**
*@return isSet - returns the set value of label.
*@param labelIn - sets the label from the input.
*/
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      if (labelIn == null) {
         isSet = false;
      }
      else {
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }
   /**
   *@return radius - gives the radius from the input.
   */
   public double getRadius() {
      return radius;
   }
   /**
   *@return isSet - returns the set radius.
   *@param radiusIn - sets the radius from the input.
   */
   public boolean setRadius(double radiusIn) {
      boolean isSet = false;
      if (radiusIn < 0) {
         isSet = false;
      }
      else {
         radius = radiusIn;
         isSet = true;
      }
      return isSet;
   }
   /**
   *@return cylinderHeight - returns the set cylinder height.
   */
   public double getCylinderHeight() {
      return cylinderHeight;
   }
   /**
   *@return isSet - prevents cylinder height from being negative.
   *@param cylinderHeightIn - sets the cylinder height from the input.
   */
   public boolean setCylinderHeight(double cylinderHeightIn) {
      boolean isSet = false;
      if (cylinderHeightIn < 0) {
         isSet = false;
      }
      else {
         cylinderHeight = cylinderHeightIn;
         isSet = true;
      }
      return isSet;
   }
   /**
   *@return - gives the formula for the circumference.
   */
   public double circumference() {
      return 2 * Math.PI * radius;
   }
   /**
   *@return - gives the formula for surface area.
   */
   public double surfaceArea() {
      return 2 * Math.PI * radius * (2 * radius + cylinderHeight);
   }
   /**
   *@return - gives the formula for volume.
   */
   public double volume() {
      return Math.PI * Math.pow(radius, 2)
         * (4 * radius / 3 + cylinderHeight);
   }
   /**
   *@return output - returns the set output in the given structure.
   */
   public String toString() {
      DecimalFormat x = new DecimalFormat("#,##0.0##");
      String output = "Spherocylinder \"" + label.trim() + "\" with radius "
         + x.format(radius)
         + " and cylinder height " + x.format(cylinderHeight) + " has:\n";
      output += "\tcircumference = " + x.format(circumference()) + " units\n";
      output += "\tsurface area = " + x.format(surfaceArea())
         + " square units\n";
      output += "\tvolume = " + x.format(volume()) + " cubic units";
      return output;      
   }
   

}