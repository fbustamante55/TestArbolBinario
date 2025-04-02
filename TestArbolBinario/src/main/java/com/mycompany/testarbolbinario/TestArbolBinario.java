/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testarbolbinario;

/**
 *
 * @author Fabia
 */
public class TestArbolBinario {
    
    public static void main(String[] args) {
        
        ArbolBinario arbol = new ArbolBinario();
        
        // Precargamos el árbol con la secuencia: 50,20,80,15,30,60,40,90,75,33,82
        int[] valores = {50, 20, 80, 15, 30, 60, 40, 90, 75, 33, 82};
        for (int valor : valores) {
            arbol.insertar(valor);
        }

        // Imprimimos el árbol antes de realizar cambios
        System.out.println("Árbol original:");
        arbol.imprimir();
        
        // Eliminamos las hojas del árbol
        arbol.eliminarHojas();
        
        // Imprimimos el árbol después de eliminar las hojas
        System.out.println("\nÁrbol después de eliminar las hojas:");
        arbol.imprimir();
        
        // Eliminamos el nodo con valor 30
        arbol.eliminarNodo(30);
        
        // Imprimimos el árbol después de eliminar el nodo 30
        System.out.println("\nÁrbol después de eliminar el nodo 30:");
        arbol.imprimir();
        
        // Multiplicamos por 10 cada nodo del árbol
        arbol.multiplicarPor10();
        
        // Imprimimos el árbol después de la multiplicación
        System.out.println("\nÁrbol después de multiplicar por 10:");
        arbol.imprimir();
    }
}

