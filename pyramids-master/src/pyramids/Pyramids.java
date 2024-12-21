/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1
 */
public class Pyramids {

    /**
     * @param args the command line arguments
//     */
    public static void main(String[] args) throws IOException {
        pyramidCSVDao pyramidDAO = new pyramidCSVDao();
       //ArrayList<pyramid>array_pyramid = new ArrayList<>();
       ArrayList<pyramid> pyramidlist = new ArrayList<>();
      pyramidlist = pyramidDAO.readPyramidFromCsv("pyramids.csv");
       for(pyramid p:pyramidlist){
            p.getPyramidDetails();
            
         }
        
        // TODO code application logic here
    }
    
}
