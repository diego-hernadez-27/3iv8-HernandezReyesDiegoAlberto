/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

/**
 *
 * @author 25666
 */
public class Casilla {
    private int posFila, posColumna;
    private boolean mina;
    private boolean abierta;
int MinasAlrededor; 
    
    public Casilla(){}

    public Casilla(int posFila, int posColumna) {
        this.posFila = posFila;
        this.posColumna = posColumna;
    }

    public int getPosFila() {
        return posFila;
    }

    public void setPosFila(int posFila) {
        this.posFila = posFila;
    }

    public int getPosColumna() {
        return posColumna;
    }

    public void setPosColumna(int posColumna) {
        this.posColumna = posColumna;
    }

    public boolean isMina() {
        return mina;
    }

    public void setMina(boolean mina) {
        this.mina = mina;
    }
    
    public int getMinasAlrededor() {
        return MinasAlrededor;
    }

    public void setMinasAlrededor(int MinasAlrededor) {
        this.MinasAlrededor = MinasAlrededor;
    }
    
    public void incrementarMinasAlrededor(){
        this.MinasAlrededor++;
    }
    
    public boolean isAbierta() {
        return abierta;
    }
    
    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }
}
