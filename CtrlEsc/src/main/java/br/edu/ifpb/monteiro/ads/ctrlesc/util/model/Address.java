package br.edu.ifpb.monteiro.ads.ctrlesc.util.model;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 * Helper class containing attributes for creating an address.
 * @author E.Wellington
 */
@Embeddable
public class Address implements Serializable{
    
    private String street;

    private Integer houseNumber;

    private String district;

    private String cep;

    private String city;

    private String uf;

    private String country;

    public Address(String street, Integer number, String district, String cep, String city, String state, String country) {
        this.street = street;
        this.houseNumber = number;
        this.district = district;
        this.cep = cep;
        this.city = city;
        this.uf = state;
        this.country = country;
    }
    
    public Address(){
        
    } 

    // methods gettes and setters
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
