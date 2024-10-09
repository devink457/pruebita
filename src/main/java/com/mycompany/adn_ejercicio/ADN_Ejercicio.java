/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adn_ejercicio;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class ADN_Ejercicio {
    
    public void adn_operaciones(){
        Scanner scan = new Scanner(System.in);
        char[][] factor = new char[10][8];
        boolean verificador;
        int opcion; //cantidad de ingresos
        int[] sumA = new int[10];
        int[] sumT = new int[10];
        int[] sumC = new int[10];
        int[] sumG = new int[10];
        System.out.println("Bienvenido al programa ADN");
        System.out.println("Debe ingresar su cadena de ADN con las iniciales de las propiedades que se le indican:");
        System.out.println("A: Adenina");
        System.out.println("T: Timina");
        System.out.println("C: Citosina");
        System.out.println("G: Guanina");
        do{
            for(int i=0;i<2;i++){
                int ingreso=i+1;
                System.out.println("Cadena de ADN #"+ingreso);
                for(int j=0;j<8;j++){
                        int posicion=j+1;
                        System.out.println("Ingrese su factor #"+ posicion);
                        factor[i][j] = scan.nextLine().charAt(0);
                        boolean letras;
                        do{
                            if(factor[i][j]=='A' || factor[i][j]=='a'|| factor[i][j]=='C' || factor[i][j]=='c'
                            || factor[i][j]=='T' || factor[i][j]=='t' || factor[i][j]=='G' || factor[i][j]=='g'){
                               letras=true; 
                            }else{
                                System.out.println("Error. Factor no valido. Ingrese un factor valido: ");
                                factor[i][j] = scan.nextLine().charAt(0);
                                letras=false;
                            }
                        }while(letras==false);
                        
                        if(factor[i][j]=='A' || factor[i][j]=='a'){
                            sumA[i]=sumA[i]+1;
                        }
                        if(factor[i][j]=='T' || factor[i][j]=='t'){
                            sumT[i]=sumT[i]+1;
                        }
                        if(factor[i][j]=='C' || factor[i][j]=='c'){
                            sumC[i]=sumC[i]+1;
                        }
                        if(factor[i][j]=='G' || factor[i][j]=='g'){
                            sumG[i]=sumG[i]+1;
                        }
                }
            }
            for(int i=0;i<2;i++){
                int posicion=i+1;
                System.out.println("");
                System.out.println("Cadena de ADN #"+posicion);
                for(int j=0;j<8;j++){
                    System.out.print(factor[i][j]);
                }
            }
            int i=0;
            if(sumA[i]==sumA[i+1] && sumT[i]==sumT[i+1] && sumC[i]==sumC[i+1] && sumG[i]==sumG[i+1]){
                verificador=true;
            }else{
                verificador=false;
            }
            System.out.println("");
            System.out.println("");
            System.out.println("Resultado de igualdad de cadenas: "+verificador);
            System.out.println("");
            System.out.println("");
            System.out.println("Si desea ingresar otro par de cadenas, ingrese 2. Para finalizar, ingrese 1");
            opcion = scan.nextInt();
            while(opcion!=1 && opcion!=2){
                System.out.println("Opcion no valida, ingrese una opcion valida");
                opcion = scan.nextInt();
            }
        }while(opcion!=1);        
            
    }

    public static void main(String[] args) {
        ADN_Ejercicio llamar = new ADN_Ejercicio();
        llamar.adn_operaciones();
        
    }
}
