/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * 
 * @author Aday
 */
public class CCuenta {
    


     
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  
    public CCuenta ()
    {
    }
   /**
    * 
    * @param nom Nombre del titular de la cuenta
    * @param cue Cuenta del usuario
    * @param sal Salario de la cuenta
    * @param tipo Intereses de la cuenta
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
    
  /**
   * Nombre del usuario de la cuenta
   * 
   * @param nom 
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
   /**
    * Retorno del nombre del usuario
    * 
    * @return  
    */
    public String obtenerNombre()
    {
        return nombre;
    }

   /**
    * Consulta el saldo de la cuenta
    * 
    * @return 
    */
     public double estado ()
    {
        return saldo;
    }

   /**
    * Ingresa una cantidad a la cuenta
    * 
    * @param cantidad
    * @throws Exception 
    */ 
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

   /**
    * Retira una cantidad de la cuenta
    * 
    * @param cantidad
    * @throws Exception 
    */ 
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
   /**
    * Devuelve la cantidad de la cuenta
    * 
    * @return 
    */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

/**
 * Establece el numero de cuenta
 * 
 * @param cuenta 
 */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

/**
 * Establece el saldo de la cuenta
 * 
 * @param saldo 
 */ 
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

/**
 * Devuelve el tipo interes aplicado a la cuenta
 * 
 * @return 
 */
  public double getTipoInterés() {
    return tipoInterés;
  }

/**
 * Establece el interes de la cuenta
 * 
 * @param tipoInterés 
 */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
