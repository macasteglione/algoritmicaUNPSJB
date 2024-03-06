import java.util.List;
import java.util.HashMap;

import interfaces.*;

public class Main {

    public Main() {

        List<Integer> numeros = SuperFunciones.proveer(10, new Proovedor<>() {
            @Override
            public Integer obtener() {
                return (int) (Math.random() * 100);
            }
        });
        System.out.println(numeros);

        List<Integer> pares = SuperFunciones.filtrar(numeros, new Predicado<>() {
            @Override
            public boolean test(Integer valor) {
                return valor % 2 == 0;
            }
        });
        System.out.println(pares);

        List<Integer> transformados = SuperFunciones.transformar(pares, new OperadorUnario<>() {
            @Override
            public Integer aplicar(Integer valor) {
                return valor * valor;
            }
        });
        System.out.println(transformados);

        List<Integer> actuados = SuperFunciones.actuar(transformados, new Consumidor<>() {
            @Override
            public void aceptar(Integer valor) {
                System.out.println(valor);
            }
        });

        Integer sumaCuadrados = SuperFunciones.reducir(actuados, 0, new OperadorBinario<>() {
            @Override
            public Integer aplicar(Integer valor1, Integer valor2) {
                return valor1 + valor2;
            }
        });
        System.out.println("Suma cuadrados: " + sumaCuadrados);
    }

    public static void main(String[] args) {
        new Main(); 
        
    }
}