/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tipo_cuenta;

/**
 *
 * @author 25666
 */
public class Tipo_cuenta {
    
    private int num_tarjeta;
    private int[] fechavencimiento;
    private double saldo;
    private int NIP;
    private int cod_seguridad;

    public Tipo_cuenta(){
    }
    
    public Tipo_cuenta(int num_tarjeta, int[] fechavencimiento, double saldo, int NIP, int cod_seguridad) {
        this.num_tarjeta = num_tarjeta;
        this.fechavencimiento = fechavencimiento;
        this.saldo = saldo;
        this.NIP = NIP;
        this.cod_seguridad = cod_seguridad;
    }

    public int getNum_tarjeta() {
        return num_tarjeta;
    }

    public void setNum_tarjeta(int num_tarjeta) {
        this.num_tarjeta = num_tarjeta;
    }

    public int[] getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(int[] fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    public int getCod_seguridad() {
        return cod_seguridad;
    }

    public void setCod_seguridad(int cod_seguridad) {
        this.cod_seguridad = cod_seguridad;
    }
    
}
