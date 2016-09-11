public class FixDebugOceanLiner extends FixDebugBoat
{
   public FixDebugOceanLiner()
   {
      Debug("ocean liner ");
      setPassengers();
      setPower();
   }
   public void setPassengers()
   {
      super.passengers = 2400;
   }
   public void power()
   {
      super.power = "four engines";
   }
}
