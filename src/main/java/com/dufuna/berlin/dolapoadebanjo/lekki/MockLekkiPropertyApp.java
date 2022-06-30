package com.dufuna.berlin.dolapoadebanjo.lekki;

import com.dufuna.berlin.dolapoadebanjo.lekki.model.LekkiProperty;
import com.dufuna.berlin.dolapoadebanjo.lekki.service.LekkiPropertyRepository;
import com.dufuna.berlin.dolapoadebanjo.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.dolapoadebanjo.lekki.service.MockLekkiPropertyService;

import java.util.Scanner;

public class MockLekkiPropertyApp {
    public static void main(String[] args){
        LekkiProperty ppt1 = new LekkiProperty();
        LekkiPropertyService service = new MockLekkiPropertyService();

        service.saveProperty(ppt1);

        service.getProperty(3);

        //-----------------------------------------------------------------------

        LekkiPropertyRepository store = new LekkiPropertyRepository();
        LekkiProperty ppt;
        Scanner scan = new Scanner(System.in);
        String address;
        String pptType;

        // ---Creating multiple lekkiProperty objects in lekkiPropertyRepistory(this is class that implements the LekkiPropertyService interface).

        for(int i = 1; i <= 5; i++){
            System.out.println("What is the property address?");
            address = scan.nextLine();

            System.out.println("What is the property type? e.g. Bungalow, Duplex, Mini-flat");
            pptType = scan.nextLine();

            //------Creating a new instance. -------//
            ppt = new LekkiProperty();

            //--------Assigning propertyId, propertyAddress and propertyType to the newly created instance------//
            ppt.setPropertyId(i);
            ppt.setPropertyAddress(address);
            ppt.setPropertyType(pptType);

            //---Adding the instance with its properties to the store(instance of lekkiPropertyRepo class.)
            store.saveProperty(ppt);
        }

        //---Getting a specific property based on its index...//
        System.out.println(store.getProperty(2));
        System.out.println(store.getProperty(5));
        System.out.println(store.getProperty(9));

        //------Printing out the lekkiProperties in the lekkiPropertyRepository instance---------//
        System.out.println(store.getProperties() );

        //-----------------------------------------------------------------------


    }
}
