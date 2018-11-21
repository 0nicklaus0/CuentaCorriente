import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuenta1= new CuentaCorriente("Juanito Perez", "15065858-8");
        CuentaCorriente cuenta2= new CuentaCorriente("Frodo Bolson", "15235653-9");
      cuenta1.setSaldo(100000);
        cuenta1.setCorreoElectronico("@hoytmain.cum");
      cuenta2.setSaldo(30000);

        System.out.println("cuenta1 "+cuenta1.getTitular() );
        System.out.println("cuenta2 "+cuenta2.getTitular() );
    }



}
