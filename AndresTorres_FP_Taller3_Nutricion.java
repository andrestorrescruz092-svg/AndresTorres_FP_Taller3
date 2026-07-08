import java.util.Scanner;

public class AndresTorres_FP_Taller3_Nutricion {

    static Scanner entrada = new Scanner(System.in);

    // Método que devuelve el valor nutricional según el grupo alimenticio
    public static int calcularValorGrupo(String grupo) {

        if (grupo.equalsIgnoreCase("proteina")) {
            return 4;

        } else if (grupo.equalsIgnoreCase("carbohidrato")) {
            return 4;

        } else if (grupo.equalsIgnoreCase("grasa")) {
            return 9;

        } else if (grupo.equalsIgnoreCase("caloria")) {
            return 1;

        } else {
            return 0;
        }
    }


    // Método que evalúa el resultado nutricional final
    public static void resultadoNutricional(double total) {

        System.out.println("\n----- RESULTADO NUTRICIONAL -----");
        System.out.println("Total nutricional: " + total + " kcal");

        if (total <= 800) {
            System.out.println("Estado: Alimentación aceptable");
        } else {
            System.out.println("Estado: Alimentación no aceptable");
        }
    }


    // Método principal del programa
    public static void main(String[] args) {

        System.out.print("Ingrese cantidad de alimentos: ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();


        String[] alimentos = new String[cantidad];
        String[] grupos = new String[cantidad];
        double[] gramos = new double[cantidad];


        double acumulador = 0;


        // Ciclo para registrar varios alimentos
        for (int i = 0; i < cantidad; i++) {

            System.out.println("\nRegistro del alimento " + (i + 1));


            System.out.print("Nombre del alimento: ");
            alimentos[i] = entrada.nextLine();


            System.out.print("Cantidad en gramos: ");
            gramos[i] = entrada.nextDouble();
            entrada.nextLine();


            System.out.print("Grupo nutricional (proteina, carbohidrato, grasa, caloria): ");
            grupos[i] = entrada.nextLine();


            int valorNutricional = calcularValorGrupo(grupos[i]);


            // Validación del grupo ingresado
            if (valorNutricional == 0) {

                System.out.println("Error: Grupo nutricional no reconocido.");

            } else {

                acumulador += gramos[i] * valorNutricional;
            }
        }


        // Mostrar los datos registrados
        System.out.println("\n----- INFORMACIÓN REGISTRADA -----");

        for (int i = 0; i < cantidad; i++) {

            System.out.println(
                    "Alimento: " + alimentos[i] +
                    " | Cantidad: " + gramos[i] + " gramos" +
                    " | Grupo: " + grupos[i]
            );
        }


        // Llamada al método que muestra el resultado final
        resultadoNutricional(acumulador);


        entrada.close();
    }
}
