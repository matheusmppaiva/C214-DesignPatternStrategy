package br.inatel.ordenacoes;

import br.inatel.ordenarvetores.Ordena;

public class selectionSort implements Ordena {

    @Override
    public void ordenaVetor(double[] vet){

        int min, i, j;
        double aux;

        for(i = 1; i < vet.length; i++){
            min = i;
            for(j = i; j < vet.length; j++){
                if (vet[j] < vet[min]){
                    min = j;
                }
            }
            aux = vet[min];
            vet[min] = vet[i];
            vet[i] = aux;
        }
    }
}
