package br.inatel.ordenacoes;

import br.inatel.ordenarvetores.Ordena;

public class insertionSort implements Ordena {

    @Override
    public void ordenaVetor(double[] vet){

        double chave;
        int i, j;

        for(j = 2; j < vet.length; j++){
            chave = vet[j];
            i = j - 1;

            while(i > 0 && vet[i] > chave){
                vet[i+1] = vet[i];
                i--;
            }
            vet[i+1] = chave;
        }
    }
}
