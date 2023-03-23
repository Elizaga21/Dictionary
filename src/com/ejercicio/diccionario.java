package com.ejercicio;
import java.util.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class diccionario {

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> diccionario = new HashMap<>();

        // Se añaden los sinónimos
        diccionario.put("feliz", new ArrayList<>(List.of("contento", "alegre", "satisfecho")));
        diccionario.put("triste", new ArrayList<>(List.of("apenado", "deprimido", "melancólico")));
        diccionario.put("grande", new ArrayList<>(List.of("enorme", "vasto", "amplio")));
        diccionario.put("pequeño", new ArrayList<>(List.of("diminuto", "chico", "minúsculo")));


                Scanner scanner = new Scanner(System.in);
                Random random = new Random();

                int opcion;

                do {
                    System.out.println("=== Diccionario de sinónimos ===");

                    System.out.println("1. Mostrar todos los sinónimos de una palabra");
                    System.out.println("2. Mostrar un sinónimo aleatorio de una palabra");
                    System.out.println("3. Finalizar programa");
                    System.out.print("Seleccione una opción: ");

                    try {
                        opcion = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        opcion = 0;
                        scanner.nextLine();
                    }

                    switch (opcion) {

                        case 1:
                            // Opción 1: Mostrar todos los sinónimos de una palabra
                            System.out.print("Introduce una palabra: ");
                            String palabra = scanner.next();
                            ArrayList<String> sinonimos = diccionario.get(palabra);

                            if (diccionario.containsKey(palabra)) {
                                System.out.println("Sinónimos de " + palabra + ": " + sinonimos);
                            } else {
                                System.out.println("La palabra " + palabra + " no se encuentra en el diccionario");
                            }
                            break;
                        case 2:
                            System.out.print("Introduce una palabra: ");
                            palabra = scanner.next();
                            sinonimos = diccionario.get(palabra);
                            if (diccionario.containsKey(palabra)) {
                                int indice = random.nextInt(3);
                                String sinonimoAleatorio = sinonimos.get(indice);
                                System.out.println("Sinónimo aleatorio de " + palabra + ": " + sinonimoAleatorio);
                            } else {
                                System.out.println("La palabra " + palabra + " no se encuentra en el diccionario");
                            }
                            break;


                        case 3:
                            // Opción 3: Finalizar programa
                            System.out.println("¡Hasta pronto!");
                            break;
                        default:
                            // Opción inválida
                            System.out.println("Opción inválida, seleccione otra opción");
                            break;
                    }
                } while (opcion != 3);


            }
}




