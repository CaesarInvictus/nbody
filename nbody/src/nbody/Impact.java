/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbody;

/**
 *
 * @author shecharya
 */
public class Impact {
    private Vector bodyOneV;      // first body velocity
    private final double bodyOneMass;   // first body mass
    private Vector bodyTwoV;      // second body velocity
    private final double bodyTwoMass;   // second body mass
    
    public Impact(){
        
    } //Impact()
    public double calcV(Vector bodyOneV, Vector bodyTwoV){
        Vector calcV = new Vector;
        calcV.magnitude() = bodyOneV.magnitude() + bodyTwoV.magnitude();
        return calcV
    } //calcR
    public void newMoon(){
    Body createdMoon = new Body(calcR, calcV, calcMass);

    }//newMoon
    
}//Impact
