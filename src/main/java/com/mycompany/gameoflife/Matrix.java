/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.gameoflife;

import static java.lang.Integer.parseInt;

/**
 *
 * @author Bruno
 */
public class Matrix{

        int size;
        int[][] mata;

       
        int[][] matb;
        
        public Matrix(int size){
            this.size = size;
            this.mata = new int[size+2][size+2];
            this.matb = new int[size+2][size+2];
        }
        public void LifeCo(int x, int y){
            if(x > 0 && y > 0 && x<size && y < size){
                mata[x][y] = 1;
                matb[x][y] = 1;
            }
            else
                throw new IllegalArgumentException("OutOfBoundsCoord");
        }
        public void Print(){
            for(int i = 1; i<=size;i++){
                for(int j = 1; j<=size;j++){
                    System.out.print(" " + mata[j][i]);
                }
            System.out.println("");
           
            }        
            System.out.println("");
        }    
        public void processString(String line){
            
            String[] strr = new String[5000];      

            int i = 0;
            strr =  line.split(":");
            
            
            for(int j = 0; j < strr.length-1; j = j+2){
              int x, y;
              
              x = parseInt(strr[j]);
              y = parseInt(strr[j+1]);
              System.out.println(strr[j] + strr[j+1] + "ads");
              LifeCo(x,y);
            }
        }
    }
