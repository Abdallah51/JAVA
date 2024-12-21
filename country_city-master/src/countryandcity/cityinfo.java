/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countryandcity;

/**
 *
 * @author 1
 */
public class cityinfo {
    private String cityName;
    private String Code;
    private String cityContinent;
    private float cityArea;
    private float cityPopulation;

    public cityinfo( String name, String code , String continent, float area, float population) {
        this.cityName = name;
        this.Code = code;
        this.cityContinent = continent;
        this.cityArea = area;
        this.cityPopulation = population;
    }

    cityinfo() {
    }

public String getCode() {
        return Code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.Code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return cityName;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.cityName = name;
    }

    /**
     * @return the continent
     */
    public String getContinent() {
        return cityContinent;
    }

    /**
     * @param continent the continent to set
     */
    public void setContinent(String continent) {
        this.cityContinent = continent;
    }

    /**
     * @return the area
     */
    public float getArea() {
        return cityArea;
    }

    /**
     * @param area the area to set
     */
    public void setArea(float area) {
        this.cityArea = area;
    }

    /**
     * @return the population
     */
    public float getPopulation() {
        return cityPopulation;
    }

    /**
     * @param population the population to set
     */
    public void setPopulation(float population) {
        this.cityPopulation = population;
    }
          public String getcityDetails(){
         System.out.println("city code : "+Code+ "; city name : "+cityName+"; city contint : "+cityContinent+"; city area : "+cityArea+"; city population : "+cityPopulation);
         return null;
          } 


}
