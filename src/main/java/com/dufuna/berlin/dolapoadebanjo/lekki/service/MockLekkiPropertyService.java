package com.dufuna.berlin.dolapoadebanjo.lekki.service;

import com.dufuna.berlin.dolapoadebanjo.lekki.model.LekkiProperty;

public class MockLekkiPropertyService implements LekkiPropertyService{
    @Override
    public void saveProperty(LekkiProperty obj) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
    }

    @Override
    public LekkiProperty getProperty() {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return null;
    }

}
