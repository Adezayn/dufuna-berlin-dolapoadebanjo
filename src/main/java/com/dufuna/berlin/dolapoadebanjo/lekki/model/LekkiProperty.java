package com.dufuna.berlin.dolapoadebanjo.lekki.model;

import java.util.Date;

public class LekkiProperty {
   private int propertyId;
   private String propertyAddress;
   private String  propertyType;
    private int noOfBedrooms;
    private int noOfSittingRooms;
    private int noOfKitchens;
    private int noOfBathrooms;
    private int noOfToilets;
    private String propertyOwner;
    private String description;
    private Date validFrom;
    private Date validTo;

    public LekkiProperty() {
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public int getNoOfBedrooms() {
        return noOfBedrooms;
    }

    public void setNoOfBedrooms(int noOfBedrooms) {
        this.noOfBedrooms = noOfBedrooms;
    }

    public int getNoOfSittingRooms() {
        return noOfSittingRooms;
    }

    public void setNoOfSittingRooms(int noOfSittingRooms) {
        this.noOfSittingRooms = noOfSittingRooms;
    }

    public int getNoOfKitchens() {
        return noOfKitchens;
    }

    public void setNoOfKitchens(int noOfKitchens) {
        this.noOfKitchens = noOfKitchens;
    }

    public int getNoOfBathrooms() {
        return noOfBathrooms;
    }

    public void setNoOfBathrooms(int noOfBathrooms) {
        this.noOfBathrooms = noOfBathrooms;
    }

    public int getNoOfToilets() {
        return noOfToilets;
    }

    public void setNoOfToilets(int noOfToilets) {
        this.noOfToilets = noOfToilets;
    }

    public String getPropertyOwner() {
        return propertyOwner;
    }

    public void setPropertyOwner(String propertyOwner) {
        this.propertyOwner = propertyOwner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    @Override
    public String toString() {
        return this.getPropertyId() + ", " + this.getPropertyAddress() + ", " + this.getPropertyId();
    }

    @Override
    public int hashCode() {
        return this.getPropertyId();
    }


    @Override
    public boolean equals(Object obj) {
        LekkiProperty ppt = (LekkiProperty) obj;
     return this.getPropertyId() == ppt.getPropertyId();
    }
}
