package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opc;
        Scanner op = new Scanner(System.in);
        calculadora cal = new calculadora();


            do {
                System.out.println("+++++ BIENVENIDO A TU CALCULADORA +++++");
                System.out.println("¿QUÉ OPERACIIÓN DESEAS REALIZAR?");
                System.out.println("1. SUMA");
                System.out.println("2. RESTA");
                System.out.println("3. MULTIPLICACIÓN");
                System.out.println("4. DIVISIÓN");
                System.out.println("5. SALIR");
                opc = op.nextInt();

                switch (opc) {
                    case 1:
                        cal.sum();
                        break;
                    case 2:
                        cal.res();
                        break;

                    case 3:
                        cal.mul();
                        break;
                    case 4:
                        cal.div();
                        break;
                    default:
                        System.out.println("Gracias por usar este programa");
                        //System.exit(0);
                        


                }


            } while (opc<5);


        }
    }