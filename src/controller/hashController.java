package controller;

import fateczl.Lista.model.Lista;

public class hashController {
    private Lista<Integer>[] lista = new Lista[2];

    public hashController() {
        for (int i = 0; i < 2; i++) {
            lista[i] = new Lista<>();
        }
    }
    public void add(int num) throws Exception {
        int pos = hash(num);
        if(lista[pos].isEmpty()) {
            lista[pos].addFirst(num);
        }
        else{
            lista[pos].addLast(num);
        }
    }

    public void print() throws Exception {
        for (int i = 0; i < 2; i++) {
            System.out.print("Hash " + i + " : ");
            for (int j = 0; j < lista[i].size(); j++) {
                if (!lista[i].isEmpty()) {
                    System.out.print(lista[i].get(j) + " -> ");
                }
            }
            System.out.print("null \n");
        }
    }
    private int hash(int num) {
        return num % 2;
    }
}
