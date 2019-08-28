
package quiz;


public class Fraccion {
    private double fraccion1,fraccion2;

    public double getFraccion1() {
        return fraccion1;
    }

    public void setFraccion1(double fraccion1,double fraccion2) {
        this.fraccion1 = fraccion1/fraccion2;
    }

    public double getFraccion2() {
        return fraccion2;
    }

    public void setFraccion2(double fraccion2,double fraccion1) {
        this.fraccion2 = fraccion2/fraccion1;
    }
 
    public double suma(){
        double resultado = fraccion1+fraccion2;
        return resultado;
    }
}
