/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testarbolbinario;

/**
 *
 * @author Fabia
 */
public class ArbolBinario {
    
    private Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    // Método para insertar un nodo en el árbol binario
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }

        if (valor < nodo.getValor()) {
            nodo.setIzquierda(insertarRecursivo(nodo.getIzquierda(), valor));
        } else if (valor > nodo.getValor()) {
            nodo.setDerecha(insertarRecursivo(nodo.getDerecha(), valor));
        }

        return nodo;
    }

    // Método para imprimir el árbol (recorrido en orden)
    public void imprimir() {
        imprimirRecursivo(raiz);
    }

    private void imprimirRecursivo(Nodo nodo) {
        if (nodo != null) {
            imprimirRecursivo(nodo.getIzquierda());
            System.out.println(nodo.getValor());
            imprimirRecursivo(nodo.getDerecha());
        }
    }

    // Método para eliminar las hojas del árbol
    public void eliminarHojas() {
        raiz = eliminarHojasRecursivo(raiz);
    }

    private Nodo eliminarHojasRecursivo(Nodo nodo) {
        if (nodo == null) {
            return null;
        }

        // Si es una hoja, eliminamos el nodo (lo retornamos como null)
        if (nodo.getIzquierda() == null && nodo.getDerecha() == null) {
            return null;
        }

        // Recursivamente eliminamos hojas en subárboles izquierdo y derecho
        nodo.setIzquierda(eliminarHojasRecursivo(nodo.getIzquierda()));
        nodo.setDerecha(eliminarHojasRecursivo(nodo.getDerecha()));

        return nodo;
    }

    // Método para eliminar un nodo específico del árbol
    public void eliminarNodo(int valor) {
        raiz = eliminarNodoRecursivo(raiz, valor);
    }

    private Nodo eliminarNodoRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return null;
        }

        if (valor < nodo.getValor()) {
            nodo.setIzquierda(eliminarNodoRecursivo(nodo.getIzquierda(), valor));
        } else if (valor > nodo.getValor()) {
            nodo.setDerecha(eliminarNodoRecursivo(nodo.getDerecha(), valor));
        } else {
            if (nodo.getIzquierda() == null) {
                return nodo.getDerecha();
            } else if (nodo.getDerecha() == null) {
                return nodo.getIzquierda();
            }

            nodo.setValor(minimoValorNodo(nodo.getDerecha()));
            nodo.setDerecha(eliminarNodoRecursivo(nodo.getDerecha(), nodo.getValor()));
        }

        return nodo;
    }

    private int minimoValorNodo(Nodo nodo) {
        int minValor = nodo.getValor();
        while (nodo.getIzquierda() != null) {
            minValor = nodo.getIzquierda().getValor();
            nodo = nodo.getIzquierda();
        }
        return minValor;
    }

    // Método para multiplicar por 10 cada nodo
    public void multiplicarPor10() {
        multiplicarPor10Recursivo(raiz);
    }

    private void multiplicarPor10Recursivo(Nodo nodo) {
        if (nodo != null) {
            nodo.setValor(nodo.getValor() * 10);
            multiplicarPor10Recursivo(nodo.getIzquierda());
            multiplicarPor10Recursivo(nodo.getDerecha());
        }
    }
}
