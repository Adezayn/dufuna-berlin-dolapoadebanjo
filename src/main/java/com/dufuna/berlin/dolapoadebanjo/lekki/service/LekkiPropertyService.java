package com.dufuna.berlin.dolapoadebanjo.lekki.service;

import com.dufuna.berlin.dolapoadebanjo.lekki.model.LekkiProperty;
import com.dufuna.berlin.dolapoadebanjo.lekki.repository.SimpleLekkiPropertyRepository;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface LekkiPropertyService{
    LekkiProperty saveProperty(LekkiProperty obj);
    LekkiProperty getProperty(int id);
    List<LekkiProperty> getProperties();
}
