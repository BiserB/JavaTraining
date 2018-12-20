package com.telerikacademy.furnituremanufacturer.models;

import com.telerikacademy.furnituremanufacturer.interfaces.Company;
import com.telerikacademy.furnituremanufacturer.interfaces.Furniture;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompanyImpl implements Company {

    private static final int NAME_MIN_LENGTH = 5;
    private static final String NAME_ERR_MSG = "Name length should be minimum %d symbols";
    private static final String REGISTRATION_ERR_MSG = "Registration number is not valid";
    private static final String N0_FURNITURES = "%s - %s - no furnitures";
    private static final String FURNITURES_NUM = "%s - %s - %d furnitures";

    private String name;
    private String registrationNumber;
    private List<Furniture> furnitures;

    public CompanyImpl(String name, String registrationNumber)
    {
        this.setName(name);
        this.setRegistrationNum(registrationNumber);
        this.furnitures = new ArrayList<>();
    }

    public String getRegistrationNumber(){
        return this.registrationNumber;
    }

    private void setRegistrationNum(String registrationNumber) {
        this.validateRegistrationNumber(registrationNumber);
        this.registrationNumber = registrationNumber;
    }

    public String getName () {
        return this.name;
    }

    private void setName(String name) {
        this.validateName(name);
        this.name = name;
    }

    public List<Furniture> getFurnitures(){
        return new ArrayList<Furniture>(this.furnitures);
    }

    public void add(Furniture furniture)
    {
        this.validateFurniture(furniture);
        this.furnitures.add(furniture);
    }

    public String catalog()
    {
        StringBuilder sb = new StringBuilder();

        Comparator<Furniture> furnitureComparator = Comparator
                .comparing(Furniture::getPrice)
                .thenComparing(Furniture::getModel);

        furnitures.sort(furnitureComparator);

        if (this.furnitures.size() == 0){
            sb.append(String.format(N0_FURNITURES, this.name, this.registrationNumber));
        }
        else{
            sb.append(String.format(FURNITURES_NUM, this.name, this.registrationNumber, this.furnitures.size()));
            sb.append(System.lineSeparator());
            for (Furniture f: furnitures ) {
                sb.append(f.toString());
                sb.append(System.lineSeparator());
            }
        }

        return sb.toString().trim();
    }

    public Furniture find(String model)
    {
        validateString(model);
        for (Furniture f: furnitures ) {
            if (f.getModel().equalsIgnoreCase(model)){
                return f;
            }
        }
        return null;
    }

    private void validateString(String str) {
        if (str == null || str.isEmpty()){
            throw new IllegalArgumentException();
        }
    }

    public void remove(Furniture furniture)
    {
        this.validateFurniture(furniture);
        furnitures.remove(furniture);
    }

    private void validateName(String name) {
        if (name == null || name.isEmpty() || name.length() < NAME_MIN_LENGTH){
            throw new IllegalArgumentException(String.format(NAME_ERR_MSG, NAME_MIN_LENGTH));
        }
    }

    private void validateRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.length() != 10){
            throw new IllegalArgumentException(REGISTRATION_ERR_MSG);
        }
        for (char ch: registrationNumber.toCharArray()) {
            if (!Character.isDigit(ch)){
                throw new IllegalArgumentException(REGISTRATION_ERR_MSG);
            }
        }
    }

    private void validateFurniture(Furniture furniture) {

        if (furniture == null){
            throw new IllegalArgumentException("Cannot add null for furniture");
        }
    }
}
