package com.dufuna.berlin.dolapoadebanjo.lekki.repository;

import com.dufuna.berlin.dolapoadebanjo.lekki.model.LekkiProperty;

import java.util.Map;

public interface SimpleLekkiPropertyRepository {
    LekkiProperty save(LekkiProperty ppt);
    LekkiProperty findById(LekkiProperty ppt);
    Map<Integer, LekkiProperty> findAll();
    void update(LekkiProperty ppt);
}
