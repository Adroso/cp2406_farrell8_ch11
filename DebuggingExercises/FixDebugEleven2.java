// An array for different boat types
public class FixDebugEleven2
{
   public static void main(String[] args)
   {
      FixDebugBoat[] ref = FixDebugBoat[3];
      FixDebugRowboat blueBoat = DebugRowboat();
      FixDebugRowboat redBoat = DebugRowboat();
      FixDebugOceanLiner bigBoat = DebugOceanLiner();
      ref[0] = redBoat;
      ref[1] = blueBoat;
      ref[1] = bigBoat;
      for(int x = 0; x < refLength; ++x)
      {
         ref[x].setPassengers();
         ref[x].setPower();
         ref[x].toString();
      }
   }
}
