package questao2;

import java.util.Scanner;

public class ValoresEntre {

    public static void main(String[] args) {

        ValoresEntre q = new ValoresEntre();

        Scanner s = new Scanner(System.in);
        int valorMin, valorMax;
        int n, qtd = 0;

        System.out.println("Informe a quantidade de numeros do vetor!");
        n = s.nextInt();

        int v[] = new int[n];
        System.out.println("Informe o valor Minimo!");
        valorMin = s.nextInt();

        System.out.println("Informe o valor maximo!");
        valorMax = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Informe os numeros do vetor!");
            v[i] = s.nextInt();
        }
        int x = 0;
        int aux[] = null;
        for (int i = 0; i < n; i++) {
            if (v[i] > valorMin && v[i] < valorMax) {
                qtd++;
                aux = new int[qtd];
                aux[x] = q.valoresEntre(v, valorMin, valorMax, n, qtd);
                x++;
            }
        }

        for (int i = 0; i < qtd; i++) {
            System.out.println("Numeros entre " + valorMin + " e " + valorMax + "=" + aux[i]);

        }

    }

    public int valoresEntre(int v[], int min, int max, int n, int qtd) {
        int x = 0;
        int aux[] = null;
        for (int i = 0; i < n; i++) {
            if (v[i] > min && v[i] < max) {
                qtd++;
                aux = new int[qtd];
                aux[x] = v[i];
            }
        }

        return aux[x];
    }
}
