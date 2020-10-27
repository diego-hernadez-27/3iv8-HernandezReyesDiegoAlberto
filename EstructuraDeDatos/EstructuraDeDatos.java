import java.util.Scanner;

class EstructuraDeDatos{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int num1, resultado, opcion, resta, positivo, negativo, i; 
        char respuesta, letra;
        String binario;
        double c, f, k, r;
        float solucion, otra;

    System.out.println("3IV8 Herandez Reyes Diego Alberto");

    letra = 0;
        
    do{
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- El descuento");
        System.out.println("2.- Decimal a binario");
        System.out.println("3.- Convertir temperatura");
        System.out.println("4.- Positivos y negativos");
        System.out.println("5.- Pagar dependiendo la cantidad");
        System.out.println("6.- Areas, perimetros y volumenes");
        System.out.println("7.- Tabla");
        System.out.println("8.- Factorial de un numero");
        System.out.println("9.- No disponible");
        System.out.println("10.- No disponible");
        System.out.println("11.- No disponible");
        System.out.println("12.- No disponible");
        System.out.println("13.- Calculadora convencional");
        System.out.println("14.- Salir");
        

                opcion = entrada.nextInt();

        
        switch (opcion) {
            case 1:

                do{
                System.out.println("Proporcione su edad ");
                num1 = entrada.nextInt();
                while(num1<=0){
                    System.out.println("Introduzca un valor positivo");
                    num1 = entrada.nextInt();}
                if (num1>=65)
                {
                    if (num1>120)
                    {
                        System.out.println("Creo que tener esa edad es imposible");
                    } 
                     else
                    {
                        System.out.println("Tendras un descuento del 40% ");
                    }
                
                }
                else
                {
                    if (num1<21)
                    {
                    if (num1<=5)
                        {
                        System.out.println("¿No eres muy pequeño para andar solo?");
                        }
                    else
                        {
                        System.out.println("¿Sus padres son socios?(poner s par si)");
                        respuesta = entrada.next().charAt(0);
                        if (respuesta == 's'){System.out.println("Tendras un descuento del 45%");}
                        else {System.out.println("Tendras un descuento del 25%");}
                        }
                    }
                    else
                    {
                        System.out.println("Tendras un descuento del 25%");
                    }
                }

                System.out.println("¿Desas repetir El descuento?, introduzca ,y, para si");
                letra = entrada.next().charAt(0);

                }while (letra == 'y');
            
            break;

            case 2:
                do{
                binario = "";

                System.out.println("Introduzca el valor decimal");
                num1 = entrada.nextInt();

                while (num1 < 0){
                System.out.println("Este valor es negativo, introduzca otro valor decimal");
                num1 = entrada.nextInt();
                }

                while(num1 > 0)
                {
                    resultado = num1%2;
                    binario = resultado + binario;
                    num1 = num1/2;  
                }
                System.out.println("El numero en binario es: "+binario);

                System.out.println("¿Desas repetir Decimal a binario?, introduzca ,y, para si");
                letra = entrada.next().charAt(0);

                }while(letra == 'y');
        

            break;

            case 3:

            do{
            System.out.println("Elija cual quiere convertir");
            System.out.println("1.- Celsius a Fahrenheit");
            System.out.println("2.- Celsius a Kelvin");
            System.out.println("3.- Celsius a Rankine");
            System.out.println("4.- Fahrenheit a Celsius");
            System.out.println("5.- Fahrenheit a Kelvin");
            System.out.println("6.- Fahrenheit a Rankine");
            System.out.println("7.- Kelvin a Celsius");
            System.out.println("8.- Kelvin a Fahrenheit");
            System.out.println("9.- Kelvin a Rankine");
            System.out.println("10.- Rankine a Celsius");
            System.out.println("11.- Rankine a Fahrenheit");
            System.out.println("12.- Rankine a Kelvin");
            System.out.println("13.- ya no quiero");

            opcion = entrada.nextInt();

            switch (opcion)  {

                case 1: 
                
                System.out.println("Introduzca los grados celsius");
                c = entrada.nextDouble();

                f = c*1.8+32;

                System.out.println("A grados fahrenheit serian: "+f);

                break;

                case 2: 
                
                System.out.println("Introduzca los grados celsius");
                c = entrada.nextDouble();

                k = c+273.15;

                System.out.println("A grados kelvin serian: "+k);

                break;

                case 3: 
                
                System.out.println("Introduzca los grados celsius");
                c = entrada.nextDouble();

                r = c*1.8+491.67;

                System.out.println("A grados rankine serian: "+r);

                break;

                case 4: 
                
                System.out.println("Introduzca los grados fahrenheit");
                f = entrada.nextDouble();

                c = (f-32)/1.8;

                System.out.println("A grados celius serian: "+c);

                break;

                case 5: 
                
                System.out.println("Introduzca los grados fahrenheit");
                f = entrada.nextDouble();

                k = ((f-32)/1.8)+273.15 ;

                System.out.println("A grados kelvin serian: "+k);

                break;

                case 6: 
                
                System.out.println("Introduzca los grados fahrenheit");
                f = entrada.nextDouble();

                r = f-32+491.67;

                System.out.println("A grados rankine serian: "+r);

                break;

                case 7: 
                
                System.out.println("Introduzca los grados kelvin");
                k = entrada.nextDouble();

                c = k-273.15;

                System.out.println("A grados celsius serian: "+c);

                break;

                case 8: 
                
                System.out.println("Introduzca los grados kelvin");
                k = entrada.nextDouble();

                f = (k-273.15)*1.8+32;

                System.out.println("A grados fahrenheit serian: "+f);

                break;

                case 9: 
                
                System.out.println("Introduzca los grados kelvin");
                k = entrada.nextDouble();

                r = (k-273.15)*1.8+491.67;

                System.out.println("A grados rankine serian: "+r);

                break;

                case 10: 
                
                System.out.println("Introduzca los grados rankine");
                r = entrada.nextDouble();

                c = (r-491.67)/1.8;

                System.out.println("A grados celius serian: "+c);

                break;

                case 11: 
                
                System.out.println("Introduzca los grados rankine");
                r = entrada.nextDouble();

                f = r-491.67+32;

                System.out.println("A grados fahrenheit serian: "+f);

                break;

                case 12: 
                
                System.out.println("Introduzca los grados rankine");
                r = entrada.nextDouble();

                k = ((r-491.67)/1.8)+273.15;

                System.out.println("A grados kelvin serian: "+k);

                break;

                default:
                System.out.println("Entendible tenga buen dia");

            } 
            System.out.println("¿Desea  repetir Convertir temperatura?, introduzca ,y, para si");
            letra = entrada.next().charAt(0);

            }while (letra == 'y');

        break;

        case 4:

        do{

        positivo=0;
        negativo=0;
        i=1;

        while(true){
    
        System.out.println("Introduzca el numero de valores a usar: ");
        num1 = entrada.nextInt();
    
        if (num1 > 0){
    
            while(i <= num1){
    
            System.out.println("Ingrese el valor: ");
            resultado = entrada.nextInt() ;
    
            if (resultado > 0)
            {
                positivo++;
            }
    
            else 
            {
                negativo++;
            }
    
            i++;
    
            }
    
            System.out.println("Los positivos son: "+positivo);
            System.out.println("Los negativos son: "+negativo);
    
        break;
    
        }
        else{
    
            System.out.println("Introduzca un valor valido");
        }
    
        }

        System.out.println("¿Desea repetir Positivos y negativos?, introduzca ,y, para si");
        letra = entrada.next().charAt(0);

        }while(letra == 'y');

        break;

        case 5:

        do{
        
        int chocolates, gomitas, chicharrones, papas, chicles, agua, Tp;

        chocolates = 0;
        gomitas = 0;
        chicharrones = 0;
        papas = 0;
        chicles = 0;
        agua = 0;
        Tp = 0;
        num1 = 0;

            System.out.println("Elija entre los productos que vendemos");

            System.out.println("Introduzca el numero de chocolates $1 c/u");
            chocolates = entrada.nextInt();
            while(chocolates < 0){
                System.out.println("Introduzca un valor positivo o 0");
                chocolates = entrada.nextInt();}

            System.out.println("Introduzca el numero de bolsas gomitas $5 c/u");
            gomitas = entrada.nextInt();
            while(gomitas < 0){
                System.out.println("Introduzca un valor positivo o 0");
                gomitas = entrada.nextInt();}

            System.out.println("Introduzca el numero de chicharrones $10 c/u");
            chicharrones = entrada.nextInt();
            while(chicharrones < 0){
                System.out.println("Introduzca un valor positivo o 0");
                chicharrones = entrada.nextInt();}

            System.out.println("Introduzca el numero de bolsas papas $12 c/u");
            papas = entrada.nextInt();
            while(papas < 0){
                System.out.println("Introduzca un valor positivo o 0");
                papas = entrada.nextInt();}

            System.out.println("Introduzca el numero de chicles $1 c/u");
            chicles = entrada.nextInt();
            while(chicles < 0){
                System.out.println("Introduzca un valor positivo o 0");
                chicles = entrada.nextInt();}

            System.out.println("Introduzca el numero de botellas de agua $15 c/u");
            agua = entrada.nextInt();
            while(agua < 0){
                System.out.println("Introduzca un valor positivo o 0");
                agua = entrada.nextInt();}
            

            Tp = chocolates + (gomitas*5) +  (chicharrones*10) + (papas*12) + chicles + (agua*15);

            System.out.println("El total a pagar es de: $" +Tp);
            System.out.println("las cantidades fueron "+chocolates+" chocolate(s), "+gomitas+" bolsa(s) de gomitas, "+chicharrones+" chicharron(es), "+papas+" bolsa(s) de papas, "+chicles+" chicle(s) y "+agua+" botella(s) de agua");
        
        System.out.println("¿Desea repetir Pagar dependiendo la cantidad?, introduzca ,y, para si");
        letra = entrada.next().charAt(0);

        }while(letra == 'y');

        break;

        case 6:

        do{
        int  altura, base;
        double area, perimetro, volumen, lado;

        System.out.println("Escoja la figura o cuerpo geometrico la cual quiera saber sus datos");
        System.out.println("1.- Area y perimetro de un rectangulo");
        System.out.println("2.- Area y perimetro de un triangulo (isoceles)");
        System.out.println("3.- Volumen de una esfera");
        System.out.println("4.- Volumen de un cilindro ");
        System.out.println("5.- Salir");

        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:

                System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();

                while (base <= 0){
                    System.out.println("Ingresa el valor de base positivo");
                    base = entrada.nextInt();}

                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();
         
                while (altura <= 0){
                    System.out.println("Ingresa el valor de la altura positivo");
                    altura = entrada.nextInt();}

                while (base == altura){
                    System.out.println("Esto es un cuadrado, elija valores diferentes");
                    System.out.println("Ingresa el valor del lado");
                    base = entrada.nextInt();
                    System.out.println("Ingresa el valor de la altura");
                    altura = entrada.nextInt();}
                

                area = base*altura;
                perimetro = 2*base + 2*altura;

                System.out.println("El area del cuadrado es de: "+area+" uniades cuadradas");
                System.out.println("El perimetro del cuadrado es de: "+perimetro+" unidaes");

                break;

            case 2:
                System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();

                while (base <= 0){
                    System.out.println("Ingresa el valor de base positivo");
                    base = entrada.nextInt();}

                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();

                while (altura <= 0){
                    System.out.println("Ingresa el valor de la altura positivo");
                    altura = entrada.nextInt();}

                area = (base*altura)/2;

                lado = Math.hypot(base, (base/2));

                perimetro = base + 2*lado;

                System.out.println("El area del triangulo es de: "+area+" unidades cuadradas");
                System.out.println("El perimetro del triangulo es de: "+perimetro+" unidades");

                break;

            case 3:
                System.out.println("Ingresa el valor de la radio");
                base = entrada.nextInt();

                while (base <= 0){
                    System.out.println("Ingresa el valor del radio positivo");
                    base = entrada.nextInt();}

                volumen = (4*3.1416*base*base*base)/3;

                System.out.println("El volumen de la esfera es de: "+volumen+" unidades cubicas");
                break;

            case 4: 
                System.out.println("Ingresa el valor de la radio");
                base = entrada.nextInt();

                while (base <= 0){
                    System.out.println("Ingresa el valor del radio positivo");
                    base = entrada.nextInt();}

                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();

                while (altura <= 0){
                    System.out.println("Ingresa el valor de la altura positivo");
                    altura = entrada.nextInt();}

                volumen = 3.1416*base*base*altura;

                System.out.println("El volumen del cilindro es de: "+volumen+" unidades cubicas");
                break;

            default:
                System.out.println("oko");
        }

            System.out.println("Desea repetir Areas, perimetros y volumenes, introduzca ,y, para si");
            letra = entrada.next().charAt(0);

        }while(letra == 'y');

        break;

        case 7:

            do{
                System.out.println("¿Qusieres ver la tabal?, si es asi responda con s");
                letra = entrada.next().charAt(0);

                if (letra == 's')
                {
                    System.out.println("\tN\t\t\t");
                    System.out.println("\t1\t10\t100\t1000");
                    System.out.println("\t2\t20\t200\t2000");
                    System.out.println("\t3\t30\t300\t3000");
                    System.out.println("\t4\t40\t400\t4000");
                    System.out.println("\t5\t50\t500\t5000");
                    System.out.println("\t6\t60\t600\t6000");
                    System.out.println("\t7\t70\t700\t7000");
                    System.out.println("\t8\t80\t800\t8000");
                    System.out.println("\t9\t90\t900\t9000");
                    System.out.println("\t10\t100\t1000\t1000");
                }
                else
                {
                    System.out.println("A weno");
                }

                System.out.println("¿Desea repetir Tabla?, introduzca ,y, para si");
                letra = entrada.next().charAt(0);
            
            }while (letra == 'y');

        break;

        case 8:
                
        do{
                resultado = 1;

                System.out.println("Introduzca el valor");
                num1 = entrada.nextInt();

                while (num1 < 0)
                {
                    System.out.println("Introduzca el valor positivo por fa");
                    num1 = entrada.nextInt();
                }

                while (num1 != 0)
                {
                    resultado = resultado * num1;

                    num1--;
                }

                System.out.println("El resultado del factorial del numero es: "+resultado);

                System.out.println("¿Desea repetir Factorial de un numero?, introduzca ,y, para si");
                letra = entrada.next().charAt(0);

        }while(letra == 'y');

            break;

        case 9:

        break;

        case 10:

        break;

        case 11:

        break;

        case 12:

        break;

        case 13:

        do{

        resultado = 0;

        solucion = 1;

        resta = 0;

        System.out.println("Elija la operacion que quiera hacer");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multipilcacion");
        System.out.println("4.- Dvision");
        System.out.println("5.- Salir");

        opcion = entrada.nextInt();

        switch (opcion) {

            case 1:

            do{
                System.out.println("Introduzca el numero, cuando termine introduzca el 0");
                num1 = entrada.nextInt();
                
                while(num1<0){
                    System.out.println("Numeros positivos por fa, intente otra vez");
                    num1 = entrada.nextInt();}

                resultado = resultado + num1;
            }while(num1 != 0);

            System.out.println("El resultado de la suma es: "+resultado);

            break;

            case 2:

                System.out.println("Introduzca el primer numero, cuando termine introduzca el 0");
                resta = entrada.nextInt();

                while(resta < 0){
                    System.out.println("Numeros positivos por fa, intente otra vez");
                    resta = entrada.nextInt();}

            do{

                System.out.println("Introduzca el numero, cuando termine introduzca el 0");
                num1 = entrada.nextInt();

                resta = resta + num1*(-1);

            }while(num1 != 0);

            System.out.println("El resultado de la resta es: "+resta);

            break;

            case 3:

            do{
                System.out.println("Introduzca el numero, cuando termine introduzca el 1");
                num1 = entrada.nextInt();
                
                while(num1<0){
                    System.out.println("Numeros positivos por fa, intente otra vez");
                    num1 = entrada.nextInt();}

                solucion = solucion * num1;
            }while(num1 != 1);



            System.out.println("El resultado de la multiplicacion es: "+solucion);

            break;

            case 4:

            do{
                System.out.println("Introduzca el numero, cuando termine introduzca el 1");
                num1 = entrada.nextInt();
                
                while(num1<0){
                    System.out.println("Numeros positivos por fa, intente otra vez");
                    num1 = entrada.nextInt();
                }

                solucion = num1 / solucion;

            }while(num1 != 1);

            System.out.println("El resultado de la division es: "+solucion);

            break;

            default:

                System.out.println("Weno ahi pa la otra");
        }
        
        System.out.println("¿Desea repetir Calculadora convencional?, introduzca ,y, para si");
        letra = entrada.next().charAt(0);

        }while (letra == 'y');

        break;
        
        default:

            System.out.println("Gracias por participar");

    }
        System.out.println("¿Deseas repetir el programa?, si lo desea escriba s");  
        letra = entrada.next().charAt(0);

    }while(letra == 's');
}
}