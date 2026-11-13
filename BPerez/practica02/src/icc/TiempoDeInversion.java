package icc;
import java.util.Scanner;

/**
 * Clase para ejecutar el programa de simulacion de inversion
 * Interactua con el usuario y recaba nombre del usuario, monto, fechas y 
 * da el rendimiento finalizando con la inicializacion de otra simulacion o
 * fin del programa.
 * @author Brandon Perez Hernandez
 * @version 1.0
 * @version de Java:OpenJDK 25.0.4.1
 */

public class TiempoDeInversion {
     public static void main(String[] args) {

        Scanner in =  new Scanner (System.in);
        String nombreInversionista;
        int monto;
        int diaIn = 1; int mesIn=1; String mesIn2 = "unknown"; int anioIn=1;
        int diaFin =1; int mesFin=1; String mesFin2 = "unknown"; int anioFin=1;
        int diasInversion = 0;
        int answerIn;
        int answeFin;
        String respuestaCiclo;

        System.out.println("Bienvenido, cual es su nombre? ");
        nombreInversionista = in.nextLine();

        do{
            
            System.out.println("Buenas "+nombreInversionista);
            do{
                System.out.println("Digame, cuanto es el monto que se quiere invertir?");
                monto = in.nextInt();
                if (monto <= 0){
                    System.out.println("Valor imposible vuelve a intentar");
                }
            }while(monto <= 0);
           

            
            System.out.println("Antes de ingresar la fecha de inicio de la inversion");

            do {

                System.out.println("Elige un formato valido");
                System.out.println("> \"dia/mes(palabra)/anio\" si este es el que deseas presiona 1");
                System.out.println("> \"dia/mes(numero)/anio\" si este es el que deseas presiona 2");
                System.out.println("> Mismo formato que la opcion 1 pero los valores por default son los iniciales de este anio si este es el que deseas presiona 3");
                
                answerIn = in.nextInt();
                
                
                in.nextLine(); 
            
                if (answerIn != 1 && answerIn != 2 && answerIn != 3) {
                System.out.println("Formato no existe. Intenta de nuevo.\n");
                }

            } while (answerIn != 1 && answerIn != 2 && answerIn != 3);

            
            
          if (answerIn == 1) {
                System.out.println("Eligio el formato NO.1");
                System.out.println("Inserte fecha de inicio de la inversion");
                
                Fecha temp3 = new Fecha();
                boolean fechaValida = false; 
                
                do {
                    System.out.println("Inserte dia:");
                    diaIn = in.nextInt();
                    in.nextLine(); 
                    
                    System.out.println("Inserte mes (palabra):");
                    mesIn2 = in.nextLine();
                    
                    int mesIn2Temp = temp3.mestoNum(mesIn2);
                    
                    System.out.println("Inserte anio:");
                    anioIn = in.nextInt();
                    in.nextLine(); 
                    
                    if (temp3.validar(diaIn, mesIn2Temp, anioIn)) {
                        fechaValida = true; 
                    } else {
                        System.out.println("Intenta ingresar la fecha nuevamente.\n");
                    }
                    
                } while (fechaValida != true); 
                
                System.out.println("Tu fecha inicial es: " + diaIn + "/" + mesIn2 + "/" + anioIn);
            }else if (answerIn== 2){
                System.out.println("Eligio el formato NO.2");
                System.out.println("Inserte fecha de inicio de la inversion");

                Fecha temp3 = new Fecha();
                boolean fechaValida = false; 

                do{
                    System.out.println("Inserte dia");
                    diaIn = in.nextInt();
                    in.nextLine();
                    System.out.println("Inserte mes(numero)");
                    mesIn = in.nextInt();
                    in.nextLine();
                    System.out.println("Inserte anio");
                    anioIn = in.nextInt();
                    in.nextLine();

                    if (temp3.validar(diaIn, mesIn, anioIn)) {
                        fechaValida = true; 
                    } else {
                        System.out.println("Intenta ingresar la fecha nuevamente.\n");
                    }

                } while (fechaValida != true);
                System.out.println("Tu fecha inicial es:"+ diaIn + "/" + mesIn + "/" + anioIn);
            }else if (answerIn== 3){
                System.out.println("Eligio el formato NO.3");
                System.out.println("Como se eligio la opcion 3 los valores se pondran por default en fechas iniciales de este anio");
                diaIn = 1;
                mesIn = 1;
                anioIn = 2026;
                System.out.println("Tu fecha inicial es:"+ diaIn + "/" + mesIn + "/" + anioIn);
            }

          
            System.out.println("antes de ingresar la fecha de fin de la inversion");

            do {
                System.out.println("Elige un formato valido");
                System.out.println("> \"dia/mes(palabra)/anio\" si este es el que deseas presiona 1");
                System.out.println("> \"dia/mes(numero)/anio\" si este es el que deseas presiona 2");
                System.out.println("> Mismo formato que la opcion 1 pero los valores por default son los iniciales de este anio si este es el que deseas presiona 3");
                
                answeFin = in.nextInt();
                
                in.nextLine(); 
            
                if (answeFin != 1 && answeFin != 2 && answeFin != 3) {
                System.out.println("Formato no existe. Intenta de nuevo.\n");
            }

            } while (answeFin != 1 && answeFin != 2 && answeFin != 3);

            if (answeFin== 1){
                System.out.println("Eligio el formato NO.1");
                System.out.println("Inserte fecha de fin de la inversion");

                Fecha temp3 = new Fecha();
                boolean fechaValida = false; 

                do{
                    System.out.println("Inserte dia");
                    diaFin = in.nextInt();
                    in.nextLine();
                    System.out.println("Inserte mes(palabra)");
                    mesFin2 = in.nextLine();

                    int mesFin2Temp = temp3.mestoNum(mesFin2);
                    
                    System.out.println("Inserte anio:");
                    anioFin = in.nextInt();
                    in.nextLine(); 
                    
                   
                    if (temp3.validar(diaFin, mesFin2Temp, anioFin)) {
                        fechaValida = true; 
                    } else {
                        System.out.println("Intenta ingresar la fecha nuevamente.\n");
                    }
                    


                } while (fechaValida != true);
                
                System.out.println("Tu fecha final es:"+ diaFin + "/" + mesFin2 + "/" + anioFin);
            }else if (answeFin== 2){
                System.out.println("Eligio el formato NO.2");
                System.out.println("Inserte fecha de fin de la inversion");

                Fecha temp3 = new Fecha();
                boolean fechaValida = false;

                do{
                    System.out.println("Inserte dia");
                    diaFin = in.nextInt();
                    in.nextLine();
                    System.out.println("Inserte mes(numero)");
                    mesFin = in.nextInt();
                    in.nextLine();
                    System.out.println("Inserte anio");
                    anioFin = in.nextInt();
                    in.nextLine();

                    if (temp3.validar(diaFin, mesFin, anioFin)) {
                            fechaValida = true; 
                        } else {
                            System.out.println("Intenta ingresar la fecha nuevamente.\n");
                        }
                }while (fechaValida != true);
                System.out.println("Tu fecha final es:"+ diaFin + "/" + mesFin + "/" + anioFin);
            }else if (answeFin== 3){
                System.out.println("Eligio el formato NO.3");
                System.out.println("Como se eligio la opcion 3 los valores se pondran por default en fechas iniciales de este anio");
                diaFin = 1;
                mesFin = 1;
                anioFin = 2026;
                System.out.println("Tu fecha final es:"+ diaFin + "/" + mesFin + "/" + anioFin);
            }

            if(answeFin == 1){
                Fecha temp = new Fecha();
                int mesFin3 = temp.mestoNum(mesFin2);
                Fecha Fecha1 = new Fecha( diaFin,  mesFin3,  anioFin);
                if (answerIn == 1 ){
                    Fecha temp2 = new Fecha();
                    int mesIn3 = temp2.mestoNum(mesIn2);
                    diasInversion = Fecha1.diferencia(diaIn, mesIn3, anioIn);
                } else if (answerIn == 2 ){
                    diasInversion = Fecha1.diferencia(diaIn, mesIn, anioIn);
                }else if (answerIn == 3 ){
                    diasInversion = Fecha1.diferencia(diaIn, mesIn, anioIn);
                }
            } else if(answeFin == 2){
                Fecha Fecha1 = new Fecha( diaFin,  mesFin,  anioFin);
                if (answerIn == 1 ){
                    Fecha temp2 = new Fecha();
                    int mesIn3 = temp2.mestoNum(mesIn2);
                    diasInversion = Fecha1.diferencia(diaIn, mesIn3, anioIn);
                } else if (answerIn == 2 ){
                    diasInversion = Fecha1.diferencia(diaIn, mesIn, anioIn);
                }else if (answerIn == 3 ){
                    diasInversion = Fecha1.diferencia(diaIn, mesIn, anioIn);
                }
            }if(answeFin == 3){
                Fecha Fecha1 = new Fecha( diaFin,  mesFin,  anioFin);
                if (answerIn == 1 ){
                    Fecha temp2 = new Fecha();
                    int mesIn3 = temp2.mestoNum(mesIn2);
                    diasInversion = Fecha1.diferencia(diaIn, mesIn3, anioIn);
                } else if (answerIn == 2 ){
                    diasInversion = Fecha1.diferencia(diaIn, mesIn, anioIn);
                }else if (answerIn == 3 ){
                    diasInversion = Fecha1.diferencia(diaIn, mesIn, anioIn);
                }
            }


            double Rendimiento = monto * 0.12*(diasInversion/365.0);
           
            System.out.println("Sus dias de inversion serian:"+ diasInversion);
            System.out.println("Su rendimiento al 12% es:"+ Rendimiento);

            System.out.println("¿Quieres hacer otra simulacion?");
            System.out.println("Elige si o no");
            respuestaCiclo = in.next();

        }while (respuestaCiclo.equals("si"));


    }
}
