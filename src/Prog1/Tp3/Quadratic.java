package Prog1.Tp3;

/**
 * Created by a on 20/04/2017.
 */
public class Quadratic {
    double a;
    double b;
    double c;

    public Quadratic (double coefA, double coefB, double coefC){
        a = coefA;
        b = coefB;
        c = coefC;
    }

    public void setA(double coefA){ a = coefA; }
    public void setB(double coefB){ b = coefB; }
    public void setC(double coefC){ c = coefC; }

    public String roots (){
        double raices = Math.sqrt(Math.pow(b,2)-4*a*c);
        if (raices > 0){
            double x1 = (((-b + raices)/2*a));
            double x2 = (((-b - raices)/2*a));
            return ("Las raices son: "+ x1 +" y "+ x2);
        }
            else if (raices == 0){
                double x12 = -b/2;
                return ("Tu raice es: " + x12);
            }
                else return "No hay raices";
    }

    public double valueY (double x){ return (a * Math.pow(x,2) + b * x + c); }

    public String valueX (double y){
        double raices = Math.sqrt(Math.pow(b,2)-4*a*(c-y));
        if (raices > 0){
            double x1 = (((-b + raices)/2*a));
            double x2 = (((-b - raices)/2*a));
            return ("Los valores de X son: "+ x1 +" y "+ x2);
        }
            else if (raices < 0){
                double x12 = -b/2;
                return ("Tu valor de X es: " + x12);
            }
                else return "No existe valore de X para ese valor";
    }

    public void printString(){ System.out.println ("\n" + "Y = " + a + "  X^2 + " + b + " X + " + c); }

    public void printDerivation () { System.out.println("\n" + "Y' = " + 2*a + " X + " + b); }

}