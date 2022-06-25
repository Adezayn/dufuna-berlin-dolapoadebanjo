package com.dufuna.berlin.dolapoadebanjo.lekki;

import com.dufuna.berlin.dolapoadebanjo.lekki.model.LekkiProperty;
import com.dufuna.berlin.dolapoadebanjo.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.dolapoadebanjo.lekki.service.MockLekkiPropertyService;

public class MockLekkiPropertyApp {
    public static void main(String[] args){
        LekkiProperty ppt1 = new LekkiProperty();
        LekkiPropertyService service = new MockLekkiPropertyService();

        service.saveProperty(ppt1);

        service.getProperty();
    }
}
