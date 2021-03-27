/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto3;

import java.util.Scanner;


/**
 *
 * @author saxss
 */

    
    

public class reto3 {
    public static void main (String[] args){
        //System.out.println("Hola mundo"); 
        //Scanner lector = new Scanner(System.in);
        punto3();
    }
    
    public static void punto1() {
        System.out.println("Valor de N");
        int n, m;
        Scanner lector = new Scanner(System.in);
        n=lector.nextInt();
        System.out.println("valor de M");
        Scanner lector = new Scanner(System.in);
        m= lector.nextInt();
        double matriz[][]= new double[n][m];
        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                System.out.println("valor de la matriz en la posicion "+(j+1)+"x"+(i+1)+" Separando los decimales"
                        + "por una coma: ");
                Scanner lector = new Scanner(System.in);
                double k= lector.nextDouble();
                matriz[j][i]=k;
                
            }
                
            }
        System.out.print("\n");     //salto de linea
        for (int i=0; i < n; i++) {
            System.out.print("|");      //laas barras e la matriz
            for (int j=0; j < m; j++) {
                System.out.print (matriz[i][j]);
                if (j!=m-1) System.out.print("\t");     //ordena columnas
            }
            System.out.println("|");        //las barras de la matriz
        }
        }
    public static void punto2(){
        int sum=0;
        System.out.println("ingrese los numeros enteros separados por una coma");
        Scanner lector=new Scanner (System.in);
        String s=lector.nextLine();
        String[] l=s.split(",");
        int may=Integer.valueOf(l[0]), men=Integer.valueOf(l[0]);
        for(int i=0;i<l.length;i++){
            if(Integer.valueOf(l[i])>may) may=Integer.valueOf(l[i]);
            if(Integer.valueOf(l[i])<men) men=Integer.valueOf(l[i]);
            sum+=Integer.valueOf(l[i]);
        }
        System.out.println("La suma de todos los enteros es: "+sum);
        double prom=(double)sum/l.length;
        System.out.println("el promedio de dichos datos es "+ prom);
        System.out.println("el numero mayor es: "+may+" y el numero menor es: "+men);
        
    }
    public static void punto3(){
        System.out.println("Ingrese el tamaño de la primera matriz, separando las filas de las columnas con un espacio (m n)");
        Scanner lector= new Scanner(System.in);
        String p= lector.nextLine();
        System.out.println("Ingrese el tamaño de la segunda matriz, separando las filas de las columnas con un espacio (m n)");
        lector= new Scanner(System.in);
        String s=lector.nextLine();
        String[] P=p.split(" ");
        String[] S=s.split(" ");
        //System.out.println(P[1]+" "+S[0]);
        if(Integer.valueOf(P[1])==Integer.valueOf(S[0])){
            System.out.println("\n \n Para La Primera Matriz");
            float matriz1[][]=crearmatriz(Integer.valueOf(P[0]),Integer.valueOf(P[1]));
            System.out.println("\n \n Para La Segunda Matriz");
            float matriz2[][]=crearmatriz(Integer.valueOf(S[0]),Integer.valueOf(S[1]));
            
                    
            float M[][]=new float[Integer.parseInt(P[0])][Integer.parseInt(S[1])];  //TAMAÑO DE LA MATRIZ RESULTANTE, CON LOS DATOS EXTREMOS
            
                /// MULTIPLICACION.
            
            for(int i=0;i<Integer.valueOf(P[0]); i++){          //SE MUEVE DE FILA EN FILA(HACIA ABAJO)
                
                //int k=0;                                        //FILA DE BLOQUEO
                for(int k=0;k<Integer.parseInt(S[1]);k++){
                    float sum=0;
                for(int j=0;j<Integer.valueOf(P[1]); j++){      //SE MUEVE DE COLUMNA EN COLUMNA(IZQ- DER)
                    sum=sum+(matriz1[i][j]*matriz2[j][k]);
                    
                }
                M[i][k]=sum;
                }
                
            }
            ///IMPRIME LA MATRIZ 1
            System.out.println("\n \n MATRIZ 1");
            for (int i=0; i < Integer.valueOf(P[0]); i++) {
            System.out.print("|");      //laas barras e la matriz
            for (int j=0; j < Integer.valueOf(P[1]); j++) {
                System.out.print (matriz1[i][j]);
                if (j!=Integer.valueOf(P[1])-1) System.out.print("\t");     //ordena columnas TABULAR
            }
            System.out.println("|");        //las barras de la matriz
        }
            
            
            System.out.println("\n \n MATRIZ 2");
            ///IMPRIME LA MATRIZ 2
            for (int i=0; i < Integer.valueOf(S[0]); i++) {
            System.out.print("|");      //laas barras e la matriz
            for (int j=0; j < Integer.valueOf(S[1]); j++) {
                System.out.print (matriz2[i][j]);
                if (j!=Integer.valueOf(S[1])-1) System.out.print("\t");     //ordena columnas TABULAR
            }
            System.out.println("|");        //las barras de la matriz
        }
            
            
            System.out.println("\n \n MATRIZ RESPUESTA");
            ///IMPRIME LA MATRIZ RESPUESTA
            for (int i=0; i < M.length; i++) {
            System.out.print("|");      //laas barras e la matriz
            for (int j=0; j < M[0].length; j++) {
                System.out.print (M[i][j]);
                if (j!=M[0].length-1) System.out.print("\t");     //ordena columnas TABULAR
            }
            System.out.println("|");        //las barras de la matriz
        }
            
            
        }
        else{
            System.out.println("orden de las matrices no compatibles para multiplicacion");
        }
        
    }
    public static void punto4(){
        System.out.println("ingrese los coeficientes del primer vector separados por coma:");
        Scanner lector= new Scanner(System.in);
        String vector1= lector.nextLine();
        System.out.println("ingrese los coeficientes del primer vector separados por coma:");
        Scanner lector=new Scanner(System.in);
        String vector2=lector.nextLine();
        String[] v1= vector1.split(",");
        String[] v2= vector2.split(",");
        int x,y,z;
        int u[];
        u= new int[3];
        int v[];
        v=new int[3];
        for(int i=0;i<3;i++){
            u[i]=Integer.valueOf(v1[i]);
        }
        for(int i=0;i<3;i++){
            v[i]=Integer.valueOf(v2[i]);
        }
            
        x=((u[1]*v[2])-(v[1]*u[2]));
        y=-((u[0]*v[2])-(v[0]*u[2]));
        z=((u[0]*v[1])-(v[0]*u[1]));
        System.out.println("("+x+")i +("+y+")j +("+z+")k");
    }
    public static float[][] crearmatriz(int F,int C){        //los datos de fila y columna deben ser combertidos a enteros
        float matrizfloat[][]=new float[F][C];
        for(int i=0;i<F;i++){
        System.out.println("ingrese los datos de la "+(i+1)+" fila separados por un espacio(a b c ...)");
        Scanner lector= new Scanner(System.in);
        String a=lector.nextLine();
        String[] fila= a.split(" ");
         for(int j=0;j<C;j++){
                 matrizfloat[i][j]=Float.parseFloat(fila[j]);
         }                    
    }
        return matrizfloat;
    }    
    }
    