import java.util.Scanner;

public class AndresTorres_FP_Taller3_Peliculas {


    static Scanner entrada = new Scanner(System.in);


    // Método para ordenar películas por año
    public static void ordenarPeliculas(
            String nombres[],
            int fechas[],
            String categorias[]) {


        for (int i = 0; i < fechas.length - 1; i++) {


            for (int j = 0; j < fechas.length - 1 - i; j++) {


                if (fechas[j] > fechas[j + 1]) {


                    int cambioFecha = fechas[j];
                    fechas[j] = fechas[j + 1];
                    fechas[j + 1] = cambioFecha;


                    String cambioNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = cambioNombre;


                    String cambioGenero = categorias[j];
                    categorias[j] = categorias[j + 1];
                    categorias[j + 1] = cambioGenero;

                }

            }

        }

    }



    public static void imprimirLista(
            String nombres[],
            int fechas[],
            String categorias[]) {


        System.out.println("\n----- PELICULAS ORDENADAS -----");


        for (int i = 0; i < nombres.length; i++) {


            System.out.println(
                    "Titulo: " + nombres[i]
                    + " | Año: " + fechas[i]
                    + " | Genero: " + categorias[i]);

        }

    }



    public static void main(String[] args) {


        System.out.print("Cantidad de peliculas: ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();


        String peliculas[] = new String[cantidad];
        String generos[] = new String[cantidad];
        int años[] = new int[cantidad];



        for (int i = 0; i < cantidad; i++) {


            System.out.println("\nPelicula " + (i + 1));


            System.out.print("Titulo: ");
            peliculas[i] = entrada.nextLine();


            System.out.print("Año lanzamiento: ");
            años[i] = entrada.nextInt();
            entrada.nextLine();


            System.out.print("Género: ");
            generos[i] = entrada.nextLine();

        }



        ordenarPeliculas(peliculas, años, generos);


        imprimirLista(peliculas, años, generos);


    }

}
