/*
 *Vilmos Feher
 *areaofatriangle.java
 *19/02/2019
 */

package areaofatriangle;

import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;

/**
 *
 * @author vifeh1685
 */
public class Areaofatriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double  a, b, c, angle, angleFinal, areaFinal, area1, semiPerimeter1, semiPerimeter2, heronFormula1, heronFormulaFinal;
        
        String number = JOptionPane.showInputDialog("Calculating area of a scalene triangle \n Enter 1 for Heron's Method, \n or 2 for Trig Method");
        int pathway = Integer.parseInt(number);
       
        
        if( pathway <2 ){
        // Heron's Formula
        String sideA = JOptionPane.showInputDialog("Enter the length of side A: ");
        String sideB = JOptionPane.showInputDialog("Enter the length of side B ");
        String sideC = JOptionPane.showInputDialog("Enter the length of side C: ");
        
        a = Double.parseDouble(sideA);
        b = Double.parseDouble(sideB);
        c = Double.parseDouble(sideC);
        
        semiPerimeter1 = a + b + c;
        semiPerimeter2 = semiPerimeter1 /2;
        heronFormula1 = semiPerimeter2*(semiPerimeter2 - a)*(semiPerimeter2 - b)*(semiPerimeter2 - c);
        heronFormulaFinal = sqrt(heronFormula1);
        JOptionPane.showMessageDialog(null, "The area of the triangle is: " + Math.ceil(heronFormulaFinal));
      
        }
        else{
        //Trig Method:
        
        String sideA = JOptionPane.showInputDialog("Enter the length of side A: ");
        String sideB = JOptionPane.showInputDialog("Enter the length of side B ");
        String angle1 = JOptionPane.showInputDialog("Enter the degree of the angle: ");
        
        a = Double.parseDouble(sideA);
        b = Double.parseDouble(sideB);
         angle = Double.parseDouble(angle1);
         
        angleFinal = sin(angle);
        area1 = a + b + angleFinal;
        areaFinal = area1 /2;
        
        JOptionPane.showMessageDialog(null, "The area of the triangle is: " + Math.ceil(areaFinal));
        }
    }
    
}