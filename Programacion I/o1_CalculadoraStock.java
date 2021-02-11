package calculadora.Stock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        int litros_cerveza = 800;

        int litros_compra;

        double precio_cerveza = 0.8;

        double dinero_ganado;

        System.out.println("¿Cuantos litros de cerveza vas a vender?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String valor_escrito = br.readLine();

        litros_compra = Integer.parseInt(valor_escrito);
        dinero_ganado = litros_compra * precio_cerveza;
        litros_cerveza = litros_cerveza - litros_compra;

        System.out.println("El precio total de " +litros_compra+ " es de: " +dinero_ganado+ "€");
        System.out.println("Despues de esta venta, te quedan " +litros_cerveza+ " litros de cerveza" );


    }
}
