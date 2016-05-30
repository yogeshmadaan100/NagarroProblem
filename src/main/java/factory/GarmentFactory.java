package factory;

import models.*;

/**
 * Created by yogeshmadaan on 30/05/16.
 */
public class GarmentFactory {
    public Garment getGarment(String garmentType)
    {
        if(garmentType==null)
            return new Shirt();
       if(garmentType.equalsIgnoreCase(GarmentTypes.SHIRT.toString()))
           return new Shirt();
        else if(garmentType.equalsIgnoreCase(GarmentTypes.TSHIRT.toString()))
           return new TShirt();
        else if(garmentType.equalsIgnoreCase(GarmentTypes.TROUSER.toString()))
           return new Trouser();
        else
           return new Shirt();
    }
}
