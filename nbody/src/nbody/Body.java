package nbody;

import edu.princeton.cs.StdDraw;

/******************************************************************************
 *  Compilation:  javac Body.java
 *  Execution:    java Body
 *  Dependencies: Vector.java StdDraw.java
 *
 *  Implementation of a 2D Body with a position, velocity and mass.
 *
 *
 ******************************************************************************/

public class Body {
    private Vector r;      // position
    private Vector v;      // velocity
    private final double mass;   // mass

    /**
     *
     * @param r
     * @param v
     * @param mass
     */
    public Body(Vector r, Vector v, double mass) {
        //give each Body these variables
        this.r = r;
        this.v = v;
        this.mass = mass;
    } // Body( Vector, Vector, double )
    //function to change position of orbs
    public void move(Vector f, double dt) {
        //find forces on orb
        Vector a = f.times(1/mass);
        //set orb new position
        v = v.plus(a.times(dt));
        r = r.plus(v.times(dt));
    } // move( Vector, double )

    /**
     *
     * @param b
     * @return
     */
    public Vector forceFrom(Body b) {
        Body a = this;
        //gravity
        double G = 6.67e-11;
        //change in velocity based on gravity
        Vector delta = b.r.minus(a.r);
        //distance traveled based on change in velocity
        double dist = delta.magnitude();
        //total force (mass * acceleration)
        double F = (G * a.mass * b.mass) / (dist * dist);
        return delta.direction().times(F);
    } // forceFrom( Body )

    public void draw() {
        //draw a circle
        StdDraw.setPenRadius(0.025);
        StdDraw.point(r.cartesian(0), r.cartesian(1));
    } // draw()

    // this method is only needed if you want to change the size of the bodies
    public void draw(double penRadius) {
        //draw a circle for given radius
        StdDraw.setPenRadius(penRadius);
        StdDraw.point(r.cartesian(0), r.cartesian(1));
    } // draw( double )

} // Body
