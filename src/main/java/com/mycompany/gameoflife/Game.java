/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.gameoflife;

/**
 *
 * @author Bruno
 */
public class Game{
        
        public static void run(Matrix state, int gen, Histo history){
            
            int prox;
            for(int t = 0; t < gen; t++){
                for(int i=0; i<state.size; i++)
                    for(int j=0; j<state.size; j++){
                        history.history[t][i][j]=state.mata[i][j];                      
                    }

                for(int i = 1; i<=state.size;i++){
                    for(int j = 1; j<=state.size;j++){
                        prox = 0;               
                        //analizando viz
                            for(int o = -1; o<2; o++)
                                for(int p = -1; p<2; p++){
                                    if(o != 0 || p != 0){
                                        if(state.matb[i+o][j+p] == 1)
                                            prox++;
                                    }
                                }
                        if(state.matb[i][j] == 1){
                            if(prox < 2 || prox > 3)
                                state.mata[i][j] = 0;
                        }else{
                            if(prox==3)
                                state.mata[i][j] = 1;
                        }
                     //prox = 0;            
                    }
                }
                for(int i=0; i<state.size; i++)
                    for(int j=0; j<state.size; j++){
                        state.matb[i][j]=state.mata[i][j];                      
                    }
                //state.Print();
            }
            
        }
        public static void run(Matrix state, int gen){
            
            int prox;
            for(int t = 0; t < gen; t++){             
                for(int i = 1; i<=state.size;i++){
                    for(int j = 1; j<=state.size;j++){
                        prox = 0;               
                        //analizando viz
                            for(int o = -1; o<2; o++)
                                for(int p = -1; p<2; p++){
                                    if(o != 0 || p != 0){
                                        if(state.matb[i+o][j+p] == 1)
                                            prox++;
                                    }
                                }
                        if(state.matb[i][j] == 1){
                            if(prox < 2 || prox > 3)
                                state.mata[i][j] = 0;
                        }else{
                            if(prox==3)
                                state.mata[i][j] = 1;
                        }
                     //prox = 0;            
                    }
                }
                for(int i=0; i<state.size; i++)
                    for(int j=0; j<state.size; j++){
                        state.matb[i][j]=state.mata[i][j];                      
                    }
                state.Print();
            }
            
        }
       
    }
