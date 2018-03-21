
package ejercicio1_diapositivaclase5_pooclases;


public class CuentaBancaria {
    private int numero;
    private int clave;
    private String dueño;
    private double saldo;

    public CuentaBancaria(int numero, int clave, String dueño, double saldo) {
        this.numero = numero;
        this.clave = clave;
        this.dueño = dueño;
        this.saldo = saldo;
    }
    
   public void consignarDinero(int dinero){
       this.saldo+=dinero;
   }  
   
   public void retirarDinero(int cantidad){
       this.saldo-=cantidad;
   }

    public void setClave(int clave) {
        this.clave = clave;
    }
   
   public void consultarSaldo(){
       System.out.println("Su saldo es= "+saldo);
   }
}
