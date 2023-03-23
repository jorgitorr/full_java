package guia_usuario;
import java.util.Random;
import java.util.Scanner;

public class TresEnRaya{

    private char[][] tablero= {{' ',' ',' '},
                               {' ',' ',' '},
                               {' ',' ',' '}};	
    private char turno;

    public TresEnRaya(){
        turno = empieza();
    }

    private char empieza(){
        Random rd = new Random();
        int jugador = rd.nextInt(2);
        return (jugador==0)?'X':'0';       
    }

    private void muestraTablero(){
        System.out.println( " "+tablero[0][0]+" | "+tablero[0][1]+" | "+tablero[0][2]
                           +"\n---+---+---\n"
                           +" "+tablero[1][0]+" | "+tablero[1][1]+" | "+tablero[1][2]
                           +"\n---+---+---\n"
                           +" "+tablero[2][0]+" | "+tablero[2][1]+" | "+tablero[2][2]);
    }

    private boolean hayGanador(){	
        boolean ganador = false;
        for(int i=0; i<tablero.length; i++){
            //filas
            if(tablero[i][0]==tablero[i][1] && tablero[i][1]==tablero[i][2] && tablero[i][0]!=' ')
                    ganador = true;
            //columnas
            if(tablero[0][i]==tablero[1][i] && tablero[1][i]==tablero[2][i] && tablero[0][i]!=' ')
                    ganador = true;
        }	
        //diagonal principal
        if(tablero[0][0]==tablero[1][1] && tablero[1][1]==tablero[2][2] && tablero[0][0]!=' ')
                    ganador = true;
        //diagonal secundaria
        if(tablero[0][2]==tablero[1][1] && tablero[1][1]==tablero[2][0] && tablero[0][2]!=' ')
                    ganador =true;

        return ganador;
    }						

    public void juega(){
        System.out.println("\n¡Tres en Raya!");
        Scanner sc = new Scanner(System.in);
        boolean ganador = false;
        int count = 0;

        do{				  
                muestraTablero();
                System.out.print("Turno para " + turno + " ¿A qué espacio mueves?: ");
                int posicion = sc.nextInt();

                if (posicion<1 || posicion>9)
                    System.out.println("Posición inexistente");  
                else if (tablero[(posicion-1)/3][(posicion-1)%3]!=' ')
                    System.out.println("Posición ocupada"); 
                else {
                    tablero[(posicion-1)/3][(posicion-1)%3] = turno;
                    ganador=hayGanador();
                    if (!ganador){
                        turno = (turno=='X')?'0':'X';
                        count++;
                    }
                }   
        } while(count<9 && !ganador);

        muestraTablero();

        if(!ganador)
            System.out.println("¡Ha quedado empate!");
        else 		
            System.out.print("¡Ha ganado " + turno + "!\n");				
    }

    public static void main(String[] args){		  
        TresEnRaya partida = new TresEnRaya();
        partida.juega();	
    }			
}			
	
