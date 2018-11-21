public class CuentaCorriente {
    private String titular;
    private String rut;
    private String correoElectronico;
    private String fechaNacimiento;
    private int saldo;

    public CuentaCorriente(String titular, String rut){
        this.saldo =0;
        this.fechaNacimiento = "2018-12-01";
        this.titular = titular;
        this.rut = rut;
    }

    public String getTitular(){
        return titular;

    }

    public void setTitular(String titular){
        this.titular = titular;

    }
    public String getRut(){
        return rut;
    }

    public void setRut(String rut){
        this.rut = rut;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico = correoElectronico;
    }
    public String getFechaNacimiento(){
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    public int getSaldo(){
        return saldo;
    }
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
}
