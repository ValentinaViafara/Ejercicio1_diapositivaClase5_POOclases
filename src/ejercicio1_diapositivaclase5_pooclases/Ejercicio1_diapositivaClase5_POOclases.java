
package ejercicio1_diapositivaclase5_pooclases;

public class Ejercicio1_diapositivaClase5_POOclases {


    public static void main(String[] args) {
     CuentaBancaria cuenta1= new CuentaBancaria(1012,1234, "Magdalena Sánchez", 0);
     cuenta1.consignarDinero(100000);
     
     CuentaBancaria cuenta2=new CuentaBancaria(1013, 9876, "Joselito Peréz", 500000);
     cuenta2.setClave(3292);
     cuenta2.consultarSaldo();
    }
    
}
