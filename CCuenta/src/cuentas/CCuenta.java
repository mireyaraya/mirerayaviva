package cuentas;
public class CCuenta {
/**
Atributos de la clase CCuenta
@throws Exception se lanza la excepcion
Se encapsulan los atritubos con geter y seter
Se realiza un bucle if hasta que se ponga la cantidad a ingresar/retirar adecuada
*/
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getcuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.nombre = cuenta;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double TipoInteres) {
        this.tipoInteres = TipoInteres;
    }
    

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }
    

    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
