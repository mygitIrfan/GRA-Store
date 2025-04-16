package my.edu.unikl.FileHandling;


import java.util.*;
import java.io.*;

public class FileIOHandler 
{
    public void writeFile(String fileName, Object data, boolean append)
    {   
        try (PrintWriter getOut = new PrintWriter(new FileWriter(fileName, append)))
        {
            getOut.println(data);
            System.out.println("Successfully write to " + fileName + "\n" + data);
        }
        
        
        catch (IOException er)
        {
            System.out.println("Error writing to file due to: " + er.getMessage());
        }
    }
    
//    public List<String> readFile(String fileName) {
//        List<String> data = new ArrayList<>();
//
//        try (BufferedReader getIn = new BufferedReader(new FileReader(fileName)))
//        {  
//            String line;
//            while ((line = getIn.readLine()) != null) 
//            {
//                data.add(line);
//            }
//            
//            getIn.close();
//        } 
//        
//        catch (IOException er) 
//        {
//            er.printStackTrace();
//        }
//
//        return data;
//    }
    
//    public void modifyFile(String fileName, Object )
//    {
//        
//    }
    
    public static void deleteFile(String fileName)
    {
        File fail = new File(fileName);
        if(fail.exists())
        {
            fail.delete();
            System.out.println("Data file deleted.");
        }
        
        else
        {
            System.out.println("Data file not found.");
        }
    }
    

}
