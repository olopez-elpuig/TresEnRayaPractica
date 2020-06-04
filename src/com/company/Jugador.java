package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jugador {
    private Fichas ficha;

    public Jugador() {
    }

    public Jugador(Fichas ficha) {
        this.ficha = ficha;
    }

    public Fichas getFicha() {
        return ficha;
    }

    public void setFicha(Fichas ficha) {
        this.ficha = ficha;
    }

    public void ponerFicha(Tablero tablero){
//      El metodo nos ayudará a Introducir la ficha y con esto a repetirlo en caso de fallo/error.
        try {
//          InputStreamReader pasará a leer los bytes a caracteres guardandolos en el system.in de esta manera usaremos tambien el BufferedReader,
//          hará lo mismo que el InputStreamReader este convertira la linea que le hemos pedido en String y nos la devolverá.
//          De esta manera usaremos el br.readLine, para pedirle un String, este metodo leerá todos los caracteres tecleados hasta que se presione la tecla INTRO.
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader (isr);
            System.out.print("Fila: ");
            int fila = Integer.parseInt(br.readLine());
            System.out.print("Columna: ");
            int columna = Integer.parseInt(br.readLine());
            tablero.getTablero()[fila][columna] = " _"+this.ficha.getFicha()+"_ ";
//      Este catch nos ayuda a tratar el fallo ocurrido dentro del try
        } catch (IOException ex) {
            Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


