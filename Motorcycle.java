public class Motorcycle extends Vehicle  
{  
   
public Motorcycle(String licPlate, String companyName)  
{  
slotsNeeded = 1;  
siz = VSize.Motorcycle;  
this.licPlate = licPlate;  
this.companyName = companyName;  
}  
  
public boolean canFitInSlot(ParkingSlot slot)   
{  

  
return slot.getSize() == VSize.CarSize || slot.getSize() == VSize.Motorcycle;  
}  
}