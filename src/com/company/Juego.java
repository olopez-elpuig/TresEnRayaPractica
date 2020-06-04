package com.company;

public class Juego {

    public static void main(String[] args) {
        System.out.println("La posicion de las fichas irá desde 0 hasta 2, elige bien.");
        System.out.println("¡Que gane el mejor!");

        Fichas fichaX = new Fichas("X");
        Fichas fichaO = new Fichas("O");

        Jugador jugador1 = new Jugador(fichaX);
        Jugador jugador2 = new Jugador(fichaO);

        Tablero tablero = new Tablero();
        tablero.imprimir();
        boolean ganador = false;
//      Este bucle nos ayudará a ir cambiando de turno e añadir nuestras fichas mediante el transcurso de la partida siendo esta un maximo de 9 turnos dado que nuestro tablero es un 3x3.
        for (int turno = 1; turno <= 9; turno++) {
            if(turno%2==0){
                jugador2.ponerFicha(tablero);
                ganador = tablero.comprobarGanador(jugador1);
            }else{
                jugador1.ponerFicha(tablero);
                ganador = tablero.comprobarGanador(jugador2);
            }
            tablero.imprimir();
            if(ganador){
                break;
            }
        }
        if(ganador){
            System.out.println("¡Has ganado!");
        }else{
            System.out.println("¡Has Perdido!");
        }


    }

}

