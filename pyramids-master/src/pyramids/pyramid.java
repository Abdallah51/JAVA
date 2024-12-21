/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

/**
 *
 * @author 1
 */
public class pyramid {
    private String pharaoh;
    private String modernName;
    private String pyramidSite;
    private String pyramidHeight;
    
     public pyramid(String pharaoh,String modernName,String pyramidSite,String pyramidHeight)
     
    {
        this.pharaoh =pharaoh;
        this.modernName =modernName;
        this.pyramidSite = pyramidSite;
        this.pyramidHeight =pyramidHeight;
    }

    pyramid() {
    }
    
     public void setPharaoh(String pharaohname){
         this.pharaoh=pharaohname;
     
     }
     
     public String getPharaoh() {
                 return pharaoh;
     }


     public void setModenName(String modernname){
         this.modernName=modernname;
     
     }
      public String getModenName(){
         return modernName;
     
     }  
      
     public void setPyramidSite(String site){
         this.pyramidSite=site;
     
     }
      public String getPyramidSite(){
         return pyramidSite;
     
     }      

     public void setPyramidHieght(String height){
         this.pyramidHeight=height;
     
     }
      public String getPyramidHieght(){
         return pyramidHeight;
     
     }  
      
      public String getPyramidDetails(){
         System.out.println(pharaoh+modernName+pyramidSite+pyramidHeight);
         return null;
          } 

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
     
            

}
