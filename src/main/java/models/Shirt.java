package models;

/**
 * Created by yogeshmadaan on 30/05/16.
 */
public class Shirt implements Garment {
    public String getGarmentType() {
        return GarmentTypes.SHIRT.toString();
    }
}