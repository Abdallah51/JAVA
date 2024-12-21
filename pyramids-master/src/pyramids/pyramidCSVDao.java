/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author 1
 */
public class pyramidCSVDao {
    public pyramidCSVDao(){}
    public ArrayList<pyramid> readPyramidFromCsv(String fileName) throws IOException{
        ArrayList<pyramid> pyramid_list = new ArrayList<>();
        List<String> line_list = new ArrayList<String>();
        
        BufferedReader  br = null ;
        try{
            br = new BufferedReader(new FileReader(fileName));
           line_list= br.lines().collect(Collectors.toList());
            String line_read ;
            while( (line_read =br.readLine()) != null){
                pyramid test = new pyramid();
               
                String[] pyramid_data = line_read.split(",");
                test.setPharaoh(pyramid_data[0]);
                test.setModenName(pyramid_data[2]);
                test.setPyramidSite(pyramid_data[2]);
                test.setPyramidHieght(pyramid_data[7]);
                pyramid_list.add(test);  
         
            }
        br.close();
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }finally{
        
        }
         return pyramid_list ;
        
    }
    
}
