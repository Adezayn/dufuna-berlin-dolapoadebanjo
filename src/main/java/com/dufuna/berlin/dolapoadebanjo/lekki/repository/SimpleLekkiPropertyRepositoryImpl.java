package com.dufuna.berlin.dolapoadebanjo.lekki.repository;

import com.dufuna.berlin.dolapoadebanjo.lekki.model.LekkiProperty;

import java.util.HashMap;
import java.util.Map;

public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository{
    private final Map<Integer,LekkiProperty> propertiesRepo = new HashMap<>();

    public Map<Integer, LekkiProperty> getPropertiesRepo() {
        return propertiesRepo;
    }

    @Override
    public LekkiProperty save(LekkiProperty ppt) {
        getPropertiesRepo().put(ppt.getPropertyId(),ppt);
        return ppt;
    }

    @Override
    public LekkiProperty findById(LekkiProperty ppt) {
        int id = ppt.getPropertyId();
        return getPropertiesRepo().get(id);
    }

    @Override
    public Map<Integer, LekkiProperty> findAll() {
        return getPropertiesRepo();
    }

    @Override
    public void update(LekkiProperty ppt) {
        getPropertiesRepo().replace(ppt.getPropertyId(),ppt);
    }


    public static void main (String[] args){
       SimpleLekkiPropertyRepositoryImpl repository = new SimpleLekkiPropertyRepositoryImpl();
        LekkiProperty p1 = new LekkiProperty();
        p1.setPropertyId(1);
        p1.setPropertyAddress("Tunde Apatira Street, Lekki");
        p1.setPropertyType("Bungalow");
        //-------------------------------------------------------------------------//
        LekkiProperty p2 = new LekkiProperty();
        p2.setPropertyId(2);
        p2.setPropertyAddress("Hope Street, Ojo");
        p2.setPropertyType("Bungalow");
        //-------------------------------------------------------------------------//
        LekkiProperty p3 = new LekkiProperty();
        p3.setPropertyId(3);
        p3.setPropertyAddress("Ogoluwa Street, Ogba");
        p3.setPropertyType("Duplex");
        //-------------------------------------------------------------------------//
        LekkiProperty p4 = new LekkiProperty();
        p4.setPropertyId(4);
        p4.setPropertyAddress("Divine Street, Lekki");
        p4.setPropertyType("Duplex");
        //-------------------------------------------------------------------------//
        LekkiProperty p5 = new LekkiProperty();
        p5.setPropertyId(5);
        p5.setPropertyAddress("Ozumba road, VI");
        p5.setPropertyType("Storey Building");
        //-------------------------------------------------------------------------//
        LekkiProperty p6 = new LekkiProperty();
        p6.setPropertyId(6);
        p6.setPropertyAddress("20,Ogoluwa Street, Epe");
        p6.setPropertyType("Mini-flat");
        //-------------------------------------------------------------------------//
        repository.save(p1);
        System.out.println(repository.save(p1) + " returned value. \n");
        repository.save(p2);
        System.out.println(repository.save(p2) + " returned value. \n");
        repository.save(p3);
        System.out.println(repository.save(p3) + " returned value.\n");
        repository.save(p4);
        System.out.println(repository.save(p4) + " returned value.\n");
        repository.save(p5);
        System.out.println(repository.save(p5)+ " returned value.\n");
        repository.save(p6);
        System.out.println(repository.save(p6)+ " returned value.\n");
        //pp1.findById(p6);

        System.out.println(repository.findById(p6));
        System.out.println(repository.findAll());

        //------------------------------------------------------------------
        LekkiProperty p5_new = new LekkiProperty();
        p5.setPropertyId(5);
        p5.setPropertyAddress("Ijaiye road, Ogba");
        p5.setPropertyType("Event hall");

        //-------------------------------------------------------------------
        repository.update(p5_new);
        System.out.println(repository.findAll());

        //---------------------------------------------------------------------
        SimpleLekkiPropertyRepositoryImpl repository2 = new SimpleLekkiPropertyRepositoryImpl();
        System.out.println(repository2.findAll());
    }
}
