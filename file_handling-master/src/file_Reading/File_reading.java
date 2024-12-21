package file_Reading;
import java.io.File;
import java.util.Scanner;



public class File_reading {

    public static void main(String[] args) throws Exception{
        Scanner sc  = new Scanner(new File("C:\\Users\\1\\Desktop\\data_preperation\\city.csv"));
        try {
        while (sc.hasNextLine())
           {
             String inputrow = sc.nextLine();
             inputrow.split(",");
             System.out.println(inputrow);
                      

           }
        sc.close();
        }
        catch(Exception e){
           //System.out.println(e);
        }
       
    }
}




// list files in directory 
//package file_handling;
//import java.io.File;
//
//
//public class File_handling {
//
//    public static void main(String[] args) {
//        File file = new File("C:\\Users\\1\\Desktop\\java_uml\\DR.AMR");
//        String[] fileList = file.list();
//        System.out.println("start list");
//        for(String name:fileList){
//           System.out.println(name);
//        }
//        System.out.println("          end  list             ");
//
//        
//    }
//    
//}
