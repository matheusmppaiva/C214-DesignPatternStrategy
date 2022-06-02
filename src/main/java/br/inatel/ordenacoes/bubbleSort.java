package br.inatel.ordenacoes;

import br.inatel.ordenarvetores.Ordena;

public class bubbleSort implements Ordena {

    @Override
    public void ordenaVetor(double[] vet){
        int i, j;
        double temp;

        for(i = vet.length; i >= 1; i--){
            for(j = 0; j < i; j++){
                if(vet[j] > vet[j+1]){
                    temp = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = temp;
                }
            }
        }
    }
}
