/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countryandcity;

import java.util.ArrayList;

/**
 *
 * @author 1
 */
public class countryinfo {
    private String countryName;
    private String citynames;
    private String Code;

    public countryinfo( String country, String code , String cities) {
        this.countryName = country;
        this.citynames = cities;
        this.Code = code;

    }

    countryinfo() {
    }


    /**
     * @return the name
     */
    public String getCountry() {
        return countryName;
    }

    /**
     * @param name the name to set
     */
    public void setCountry(String name) {
        this.countryName = name;
    }
    /**
     * @return the name
     */
    public String getCities() {
        return citynames;
    }

    /**
     * @param name the name to set
     */
    public void setCities(String name) {
        this.citynames = name;
    }
    

    public void setCode(String name) {
        this.Code = Code;
    }
    
        public String getCode() {
        return Code;
    }
    /**
     * @param name the name to set
     */

    public String getcountryDetails(){
         System.out.println("country name : "+countryName+"; country code : "+Code+"; city name : "+citynames);
         return null;
          } 
}