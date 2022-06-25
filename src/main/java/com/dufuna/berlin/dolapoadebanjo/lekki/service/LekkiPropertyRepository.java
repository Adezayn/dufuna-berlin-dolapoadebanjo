package com.dufuna.berlin.dolapoadebanjo.lekki.service;

import com.dufuna.berlin.dolapoadebanjo.lekki.model.LekkiProperty;
import com.dufuna.berlin.dolapoadebanjo.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class LekkiPropertyRepository implements LekkiPropertyService{
  public SimpleLekkiPropertyRepositoryImpl repository = new SimpleLekkiPropertyRepositoryImpl();
    @Override
    public LekkiProperty saveProperty(LekkiProperty obj) {
        return repository.save(obj);
    }
    @Override
    public LekkiProperty getProperty(int id) {
        if(repository.findAll().get(id) == null){
            System.out.println("There is no property with the id:  " + id + ".");
        }
        return repository.findAll().get(id);
    }

    @Override
    public  List<LekkiProperty> getProperties() {
        return new ArrayList<>(this.repository.getPropertiesRepo().values());
    }

}
