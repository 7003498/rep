
package quiz;


public class Fraccion {
    private double fraccion1,fraccion2,numerador,denominador,resultado;

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

    public double getNumerador() {
        return numerador;
    }

    public void setFraccion3(double f1, double f2,double f3,double f4 ) {
        this.numerador = (f1*f3)+(f2*f4);
        this.denominador = f2*f4;
    }
 
    public double sumaDecimal(){
        resultado = fraccion1+fraccion2;
        return resultado;
    }

    public double getDenomidor() {
        return denominador;
    }

    
    
    
}
