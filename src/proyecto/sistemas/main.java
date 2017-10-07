/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.sistemas;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class main {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc= new Scanner (System.in);
        int A , B;
        char [][] mapa;
        System.out.println ("Obtener A");
        A = Sc.nextInt ();
        System.out.println ("Obetener B");
        B = Sc.nextInt();
        mapa= new char [A][B];
        for (int i = 0 ; i < A ;i++)
            for (int j = 0; j < B ; j++);
        int i = 0;
        int j = 0;
                 if ( i == 0 || i== A-1 || j== 0 || j==B-1){
                mapa [i][j]= 'x';
                 }else{
                     mapa [i][j] = ' ';
                 }
          for ( int I = 0 ; i < A ; i++)
        {
            for ( int J = 0 ; j < B ; j++)
                System.out.print (mapa [i][j]);
            System.out.println("");
        }
                 }
        
      
    
}
