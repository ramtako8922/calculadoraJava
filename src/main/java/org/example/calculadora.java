package org.example;

import java.util.Scanner;

public class calculadora {
private int n1;
private int n2;
private int res;
  Scanner sc=new Scanner(System.in);

  public calculadora(){

  }

    public calculadora(int n1, int n2, int res) {
        this.n1 = n1;
        this.n2 = n2;
        this.res = res;
    }

    public void sum(){
        System.out.println("Ingrese el primer numero");
        n1=sc.nextInt();
        System.out.println("ingrese el otro numero");
        n2=sc.nextInt();
        res=n1+n2;
        System.out.println("El resultado de la suma es " +res);

    }

    public void res(){
        System.out.println("Ingrese el primer numero");
        n1=sc.nextInt();
        System.out.println("ingrese el otro numero");
        n2=sc.nextInt();
        res=n1-n2;
        System.out.println("El resultado de la resta es " +res);


    }
    public void mul(){
        System.out.println("Ingrese el primer numero");
        n1=sc.nextInt();
        System.out.println("ingrese el otro numero");
        n2=sc.nextInt();
        res=n1*n2;
        System.out.println("El resultado de la multiplicación es " +res);
        ;

    }

    public void div(){
        System.out.println("Ingrese el primer numero");
        n1=sc.nextInt();
        System.out.println("ingrese el otro numero");
        n2=sc.nextInt();
        res=n1/n2;

        System.out.println("El resultado de la división es " +res);


    }
}

