/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readfilefromurl;

import java.util.Scanner;

/**
 *
 * @author Cyberfaour
 */
public class ReadFileFromUrl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        System.out.println("Enter a url: ");
        String URLString=new Scanner(System.in).next();
        try{
            java.net.URL url=new java.net.URL(URLString);//create a url Object
            int count=0;
            Scanner input=new Scanner(url.openStream());//create a scanner object that will read more than one line
            while(input.hasNext()){
                String line=input.nextLine();
                count+=line.length();
            }
            System.out.println("The file size "+count+" chars");
            
        }
        catch(java.net.MalformedURLException ex){
            System.out.println("Invalid URL");
        }
        catch(java.io.IOException ex){
            System.out.println("I/O Error:no such file");
            
        }
        
    }
    
}
