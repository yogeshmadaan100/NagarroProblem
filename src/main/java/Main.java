import factory.GarmentFactory;
import models.Garment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yogeshmadaan on 30/05/16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your selection");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String garmentType = null;
        try
        {
            garmentType = bufferedReader.readLine();
        }catch (IOException e)
        {
            System.out.println("Io exception");
        }

        Garment garment = new GarmentFactory().getGarment(garmentType);
        System.out.println("Your garment is " + garment.getGarmentType());

    }
}
