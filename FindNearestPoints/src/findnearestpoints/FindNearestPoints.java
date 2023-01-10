/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findnearestpoints;

import java.util.Scanner;

/**
 *
 * @author Cyberfaour
 */
public class FindNearestPoints {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number of points: ");
        int numberOfPoints=s.nextInt();
        double[][]points=new double[numberOfPoints][2];
        System.out.println("Enter "+numberOfPoints+" points: ");
        for(int i=0;i<points.length;i++){
            points[i][0]=s.nextDouble();
            points[i][1]=s.nextDouble();
        }
        int p1=0,p2=1;
        double shortestDistance =distance(points[1][0],points[p1][1],
                    points[p2][0], points[p2][1]);
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                double distance=distance(points[i][0],points[i][1],points[j][0],points[j][1]);
                 if(shortestDistance>distance){
                     p1=i;
                     p2=j;
                     shortestDistance=distance;
                 }
            }
            
           
        }
        System.out.println("The closest two points are " +
          "(" + points[p1][0] + ", " + points[p1][1] + ") and (" +
             points[p2][0] + ", " + points[p2][1] + ")");
    }
      public static double distance(double x1,double y1,double x2,double y2){
          return Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1),2));
      }
    
}
