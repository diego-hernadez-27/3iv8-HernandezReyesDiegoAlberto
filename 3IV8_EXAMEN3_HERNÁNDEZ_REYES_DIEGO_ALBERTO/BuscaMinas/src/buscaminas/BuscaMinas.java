
package buscaminas;
import java.util.*;
import java.util.function.Consumer;
import javax.swing.JOptionPane;

public class BuscaMinas {

    Casilla[][] casillas;
    
    int numFilas, numColumnas, numMinas, numCasillasAbiertas;
    boolean juegoTerminado;
    
    private Consumer<List<Casilla>> eventoPartidaLose;
    private Consumer<List<Casilla>> eventoPartidaWin;
    
    private Consumer<Casilla> eventoCasillaAbierta;

    public BuscaMinas(int numFilas, int numColumnas, int numMinas) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        this.numMinas = numMinas;
        this.iniciarCasillas();
    }
    
    public void iniciarCasillas(){
        casillas = new Casilla[this.numFilas][this.numColumnas];
        for(int i = 0; i < casillas.length; i++){
            for(int j = 0; j < casillas.length; j++){
                casillas[i][j] = new Casilla(i, j);
            }
        }
       generarMinas();
    }
    
    private void generarMinas(){
        int minasGeneradas = 0;
        while(minasGeneradas != numMinas){
            int posTmpFila = (int)(Math.random()*casillas.length);
            int posTmpColumna = (int)(Math.random()*casillas[0].length);
            if(!casillas[posTmpFila][posTmpColumna].isMina()){
                casillas[posTmpFila][posTmpColumna].setMina(true);
                minasGeneradas++;
            }
        }
        actualizarMinasAlrededor();
    }
    
    /*public void imprimirTablero(){
        for(int i = 0; i < casillas.length; i++){
        for(int j = 0; j < casillas[i].length; j++){
            System.out.print(casillas[i][j].isMina()?"*":"0");
        }
            System.out.println("");
        }
    }
    
    private void imprimirNumeros(){
        for(int i = 0; i < casillas.length; i++){
        for(int j = 0; j < casillas[i].length; j++){
            System.out.print(casillas[i][j].getMinasAlrededor());
        }
            System.out.println("");
        }
    }*/
    
    private void actualizarMinasAlrededor(){
        for(int i = 0; i < casillas.length; i++){
        for(int j = 0; j < casillas[i].length; j++){
            if(casillas[i][j].isMina()){
                List<Casilla> casillasAlrededor = getCasillasAlrededor(i, j);
                casillasAlrededor.forEach((c)->c.incrementarMinasAlrededor());
            }
        }
        }
    }
    
    private List<Casilla> getCasillasAlrededor(int posFila, int posColumna){
        List<Casilla> listaCasillas = new LinkedList<>();
        for(int i = 0; i < 8; i++){
            int tmpPosFila = posFila;
            int tmpPosColumna = posColumna;
            switch(i){
                case 0: tmpPosFila--;
                    break; 
                case 1: tmpPosFila--; tmpPosColumna++;
                    break;
                case 2: tmpPosColumna++;
                    break;
                case 3: tmpPosColumna++; tmpPosFila++;
                    break;
                case 4: tmpPosFila++;
                    break;
                case 5: tmpPosFila++; tmpPosColumna--;
                    break;
                case 6: tmpPosColumna--;
                    break;
                case 7: tmpPosFila--; tmpPosColumna--;
                    break;   
            }
            
            if(tmpPosFila >= 0 && tmpPosFila < this.casillas.length 
                    && tmpPosColumna >= 0 && tmpPosColumna < this.casillas[0].length){
                listaCasillas.add(this.casillas[tmpPosFila][tmpPosColumna]);
            }
        }
        return listaCasillas; 
    }
    
    List<Casilla> getCasillasConMinas(){
        List<Casilla> casillasConMinas = new LinkedList<>();
        for(int i = 0; i < casillas.length; i++){
            for(int j = 0; j < casillas[i].length; j++){
                if(casillas[i][j].isMina()){
                    casillasConMinas.add(casillas[i][j]);
                }
            }
        }

        return casillasConMinas;
    }
   
    public void seleccionarCasilla(int posFila, int posColumna){
        eventoCasillaAbierta.accept(this.casillas[posFila][posColumna]);
        if(this.casillas[posFila][posColumna].isMina()){
            eventoPartidaLose.accept(getCasillasConMinas());
            JOptionPane.showMessageDialog(null,"No ganaste, no sos un capo :(");

        }else if(this.casillas[posFila][posColumna].getMinasAlrededor() == 0){
            marcarCasillaAbierta(posFila, posColumna);
            List<Casilla> casillasAlrededor = getCasillasAlrededor(posFila, posColumna);
            for(Casilla casilla: casillasAlrededor){
                if (!casilla.isAbierta()){
                    seleccionarCasilla(casilla.getPosFila(), casilla.getPosColumna());
                }
            }
        }else{
            marcarCasillaAbierta(posFila, posColumna);
        }
        if(partidaWin()){
            eventoPartidaWin.accept(getCasillasConMinas());
            JOptionPane.showMessageDialog(null,"Ganaste, sos todo un capo!!!");
        }
    }
    
    void marcarCasillaAbierta(int posFila, int posColumna){
        if(!this.casillas[posFila][posColumna].isAbierta()){
            numCasillasAbiertas++;
            this.casillas[posFila][posColumna].setAbierta(true);
        }
    }
    
    boolean partidaWin(){
        return numCasillasAbiertas >= (numFilas*numColumnas) - numMinas;
    }
    
    /*public static void main(String[] args){
        BuscaMinas tablero = new BuscaMinas(5, 5, 5);
        tablero.imprimirTablero();
        System.out.println("---");
        tablero.imprimirNumeros();
    }*/

    public void setEventoPartidaLose(Consumer<List<Casilla>> eventoPartidaLose) {
        this.eventoPartidaLose = eventoPartidaLose;
    }

    public void setEventoCasillaAbierta(Consumer<Casilla> eventoCasillaAbierta) {
        this.eventoCasillaAbierta = eventoCasillaAbierta;
    }

    public void setEventoPartidaWin(Consumer<List<Casilla>> eventoPartidaWin) {
        this.eventoPartidaWin = eventoPartidaWin;
    }
    
    
    
}
