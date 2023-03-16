public class CuentaBancaria {

    String nombreTitular;
    String apellidoTitular;
    int numeroCuenta;
    double saldo;
    TipoCuenta tipoCuenta;

    public CuentaBancaria(String nombreTitular, String apellidoTitular, int numeroCuenta, TipoCuenta tipoCuenta){

        this.nombreTitular = nombreTitular;
        this.apellidoTitular = apellidoTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0;

    }

    //MÉTODOS DE TRANSACCIÓN

    public void retirar(double valor) throws CuentaSinSaldo{

        try{                                                                             //Bloque try para gestionar excepción
            if(valor<=saldo) {                                                          //Se valida que el valor solicitado no sea mayor que el saldo que tiene la cuenta
                this.saldo -= valor;                                                   //Se actualiza el valor del saldo actual, es decir saldo-valor
                System.out.println("Retiro exitoso, su nuevo saldo es: " + this.saldo);
            }else {
                throw new CuentaSinSaldo();                                            //Si el valor solicitado supera saldo, lazo nueva excepción
            }
            }catch(CuentaSinSaldo cs){
                System.out.println("Fondos insuficientes");                            //Imprimo mensaje de error
            }
        }

    public void consignar(double valor){

        if(valor>0){

            this.saldo+=valor;                                                     //Actualizo el valor del saldo sumando el valor que recibo de consignación
            System.out.println("Consignación existosa");                           //Confirmo consignación pero no devuelvo saldo actual

        }else{
            System.out.println("Ingrese un valor mayor a 0.0");
        }

    }

    public void consultarSaldo(){

        System.out.println("Su saldo actual es de: " + this.saldo);                 //Simplemente imprimo el saldo actual de la cuenta.

    }



    //MÉTODOS DE ACCESO ---GETTER Y SETTER----

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getApellidoTitular() {
        return apellidoTitular;
    }

    public void setApellidoTitular(String apellidoTitular) {
        this.apellidoTitular = apellidoTitular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }


}
