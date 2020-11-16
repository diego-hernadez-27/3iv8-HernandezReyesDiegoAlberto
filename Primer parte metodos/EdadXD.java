//Importando las librerias

import java.util.*;


public class EdadXD{

    Scanner escaner = new Scanner(System.in);

    //El vinvulo

    public void LaEdad(){

        //Las variasbñes
    int anio, mes, dia, diastrans, diastransac, diasedad;
    double anios, meses, dias;

    //Iniciando el programa

    System.out.println("Para saber su edad proporcionenos su año de nacimiento");
    anio = escaner.nextInt();

    while(anio < 1900){

        System.out.println("Creo que ya estas muy viejo amigo, tal vez introdujo un dato incorrecto, intente de nuevo");
        anio = escaner.nextInt();

    }

    while(anio > 2018){

        System.out.println("Creo que ya estas muy joven, tal vez introdujo un dato incorrecto, intente de nuevo");
        anio = escaner.nextInt();

    }

    System.out.println("Proporcionenos su mes de nacimiento");
    mes = escaner.nextInt();

    while(mes < 1){

        System.out.println("Este mes no existe, tal vez introdujo un dato incorrecto, intente de nuevo");
        mes= escaner.nextInt();

    }

    while(mes > 12){

        System.out.println("Estoy seguro que hay 12 meses en el año, tal vez introdujo un dato incorrecto, intente de nuevo");
        mes = escaner.nextInt();

    }

    System.out.println("Pproporcionenos su dia de nacimiento");
    dia = escaner.nextInt();

    while(dia < 1){

        System.out.println("Este dia no existe, tal vez introdujo un dato incorrecto, intente de nuevo");
        dia = escaner.nextInt();

    }

    while(dia > 31){

        System.out.println("Aqui no dire nada, tal vez introdujo un dato incorrecto, intente de nuevo");
        dia = escaner.nextInt();

    }

    //Las operaciones
    
    diastrans = (anio*365) + ((mes -1)*30) + dia;
    diastransac = (2020*365) + ((11-1)*30) + 15;

    diasedad = diastransac - diastrans;

    anios = (diasedad/365);

    meses = ((diasedad % 365)/30);

    dias = ((diasedad % 365) % 30);

    //Danso resultaedos

    System.out.println("Tu vida en la tierra ha sido de: "+anios+" años "+meses+" mes y "+dias+" dias");

    }
}

