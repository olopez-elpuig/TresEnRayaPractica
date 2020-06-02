package com.company;

public class Tablero {
    private String[][] tablero;

    public Tablero() {
        tablero = new String[3][3];
        limpiar();
    }

    public Tablero(String[][] tablero) {
        this.tablero = tablero;
    }


    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }

    public void limpiar(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = " ___ ";
            }
        }
    }

    public void imprimir(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println("");
        }
    }

    public boolean comprobarGanador(Jugador jugador){

        boolean valor = false;
        String ficha1 = " _"+jugador.getFicha().getFicha()+"_ ";
        String ficha3 = ficha1+ficha1+ficha1;

        //Posicion de las fichas en el tablero
        String fila = tablero[0][0]+tablero[0][1]+tablero[0][2];

        if( ficha3.equals(fila)){
            valor  = true;
        }
        fila = tablero[1][0]+tablero[1][1]+tablero[1][2];
        if( ficha3.equals(fila)){
            valor  = true;
        }
        fila = tablero[2][0]+tablero[2][1]+tablero[2][2];
        if( ficha3.equals(fila)){
            valor  = true;
        }
        String columna = tablero[0][0]+tablero[1][0]+tablero[2][0];
        if( ficha3.equals(columna)){
            valor  = true;
        }
        columna = tablero[0][1]+tablero[1][1]+tablero[2][1];
        if( ficha3.equals(columna)){
            valor  = true;
        }
        columna = tablero[0][2]+tablero[1][2]+tablero[2][2];
        if( ficha3.equals(columna)){
            valor  = true;
        }
        String diagonal = tablero[0][0]+tablero[1][1]+tablero[2][2];
        if( ficha3.equals(diagonal)){
            valor  = true;
        }
        diagonal = tablero[2][0]+tablero[1][1]+tablero[0][2];
        if( ficha3.equals(diagonal)){
            valor  = true;
        }
        return valor;
    }

}
