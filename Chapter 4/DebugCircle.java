// This class defines a circle with a radius
// But it has several bugs
public class DebugCircle
{
   private int radius;
   private static final double PI = 3.14;
   
   // The constructor is supposed to set the radius
   public DebugCircle(int r)
   {
      // This constructor is empty and doesn't do anything
   }

   // This method should return the radius
   public int getRad()
   {
      return 0; // Bug: This should return the actual radius
   }

   // This method should return the diameter
   public int getDiam()
   {
      return radius + 2; // Bug: Incorrect formula
   }

   // This method should return the area
   public double getArea()
   {
      return PI * radius; // Bug: Incorrect formula
   }
}