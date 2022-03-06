/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author joseg
 */
public class Arbol {
    public Nodo inicial;
    //  PRUEBAS CON FICHEROS
    /*String ficheroIn = "InOrden.txt";
    File archivoIn= new File(ficheroIn);
    String ficheroPre = "PreOrden.txt";
    File archivoPre= new File(ficheroPre);
    String ficheroPos = "PosOrden.txt";
    File archivoPos= new File(ficheroPos);*/
    
    public Arbol()
    {
        inicial=null;
    }
    
    public void insertar(int valor)
    {
        if(inicial==null)
        {
            inicial=new Nodo(valor);
        }else
        {
            inicial.insertar(valor);
        }
    }
    
    public void PreOrden() throws IOException
    {
        this.PreOrden(this.inicial);
    }
    
    public void PreOrden(Nodo nodo) throws IOException
    {
        //FileWriter escribir= new FileWriter(archivoPre,true);
        //PrintWriter imprimir=new PrintWriter(escribir);  
        if(nodo == null)
        {
            return;
        }else
        {
            System.out.print(nodo.getLlave() + ", ");
            //imprimir.print(nodo.getLlave()+", ");
            //imprimir.close();
            PreOrden(nodo.getIzquierdo());
            PreOrden(nodo.getDerecho());
        }
    }
    
    
    public void InOrden() throws IOException
    {
        this.InOrden(this.inicial);
    }
    
    public void InOrden(Nodo nodo) throws IOException
    {
        //FileWriter escribir= new FileWriter(archivoIn,true);
        //PrintWriter imprimir=new PrintWriter(escribir);   
        if(nodo == null)
        {
            return;
        }else
        {
            InOrden(nodo.getIzquierdo());
            System.out.print(nodo.getLlave() + ", ");
            //imprimir.print(nodo.getLlave()+", ");
            /////////////////
            InOrden(nodo.getDerecho());
            //imprimir.close();
        }
    }
    
    
    
    public void PosOrden() throws IOException
    {
        this.PosOrden(this.inicial);
    }
    
    public void PosOrden(Nodo nodo) throws IOException
    {
        //FileWriter escribir= new FileWriter(archivoPos,true);
        //PrintWriter imprimir=new PrintWriter(escribir);
        if(nodo == null)
        {
            return;
        }else
        {
            PosOrden(nodo.getIzquierdo());
            PosOrden(nodo.getDerecho());
            System.out.print(nodo.getLlave() + ", ");
            //imprimir.print(nodo.getLlave()+", ");
            //imprimir.close();
        }
    }
}
