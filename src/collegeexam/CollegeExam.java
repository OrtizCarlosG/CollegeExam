/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegeexam;

/**
 *
 * @author carlo
 */
public class CollegeExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teatro teatro = new Teatro("Un titulo", "24/10/2022", "11:00", 5, 4);
        double priceSeat1 = teatro.takeSeat(3, 2);
        double priceSeat2 = teatro.takeSeat(4, 4);
        System.out.println("Taken seat 1 price: " + priceSeat1+" taken seat 2 price: "+ priceSeat2);
        System.out.println(teatro.toString());
        teatro.vacateSeat(3);
        System.out.println(teatro.getSeats(3));
        System.out.println(teatro.toString());
        
    }
    
}
