package cuentas;
public class Main {
	/*
	 * Prueba de commit
	 */

    public static void main(String[] args) {
        operativa_cuenta(2000);
    }
    
    public static void operativa_cuenta (float cantidad) {
    	
    	CCuenta cuenta1;
        double saldoActual;
        
    	cuenta1 = new CCuenta("Antonio L�pez","1000-2365-85-1230456789",(double)2500,(double)0);
        saldoActual = cuenta1.estado();
        
        System.out.println("El saldo actual es"+ saldoActual );
		 try {
	         cuenta1.retirar(cantidad);
	     } catch (Exception e) {
	         System.out.print("Fallo al retirar");
	     }
	     try {
	         System.out.println("Ingreso en cuenta");
	         cuenta1.ingresar(695);
	     } catch (Exception e) {
	         System.out.print("Fallo al ingresar");
	     }
    }
}
