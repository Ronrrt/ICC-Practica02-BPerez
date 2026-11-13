package icc;

/**
 * Programa para crear una simulacion de inversion.
 * @author Brandon Perez Hernandez
 * @version 1.0
 * @version de Java:OpenJDK 25.0.4.1
 */

public class Fecha {
    private int anio;
    private int mes;
    private int dia;
    
    /**
    * Constructor por default, crea una fecha automatica en 01/01/2026.
    */
    public Fecha () {
        this.dia= 1;
        this.mes= 1;
        this.anio= 2026;
    }

    /**
    * Constructor de una fecha a partir de los valores numéricos de día, mes y año.
    * @param dia - dia de la nueva fecha.
    * @param mes - mes de la nueva fecha.
    * @param anio - anio de la nueva fecha.
    */
    public Fecha (int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    /**
    * Constructor de una fecha a partir del día, año y el mes en una cadena de texto.
    * @param dia - dia de la nueva fecha.
    * @param mes2 - mes de la nueva fecha.
    * @param anio - anio de la nueva fecha.
    */
    public Fecha (int dia, String mes2, int anio) { 
        int mes = mestoNum(mes2);
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }


    /**
    * Método para asignar valor al dia, mes, anio de la nueva fecha.
    * @param dia - nuevo valor para el dia.
    * @param mes - nuevo valor para el mes.
    * @param anio - nuevo valor para el anio.
    */
    public void asignarFecha(int dia, int mes, int anio) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }


    /** Método para obtener el anio de la fechs.
    * @return int - el anio de la fecha.
    */
    public int obtenerAnio () {
    return anio;
    }

    /** Método para obtener el mes de la fecha.
    * @return int - el mes de la fecha.
    */
    public int obtenerMes () {
    return mes;
    }

    /** Método para obtener el dia de la fecha.
    * @return int - el dia de la fecha.
    */
    public int obtenerDia () {
    return dia;
    }

    /**
    * Método para determinar si los parámetros de día, mes y año  que conforman a la fecha son una fecha válida.
    * @param dia - día de la fecha a verificar, asegurando que no exceda el límite del mes.
    * @param mes - mes de la fecha a verificar, asegurando que esté solo en un valor numerico de 1 a 12.
    * @param anio - año de la fecha a verificar.
    * @return boolean - true si todos los parámetros juntos forman una fecha válida, false en caso contrario.
    */
    public boolean validar ( int dia, int mes, int anio) {
        if (mes==1){
            if (dia > 31) {
            System.out.println("Dia no valido");
            return false;
            } 
        }
         else if (mes==2){
            int comprobacion;
            if (esBisiesto(anio)) {
                comprobacion = 29;
            } else {
                comprobacion = 28;
            }
            if (dia > comprobacion) {
                System.out.println("Dia no valido");
                return false;
            }
        } else if (mes==3){
            if (dia > 31) {
            System.out.println("Dia no valido");
            return false;
            } 
        }else if (mes==4){
            if (dia > 30) {
            System.out.println("Dia no valido");
            return false;
            } 
        }else if (mes==5){
            if (dia > 31) {
            System.out.println("Dia no valido");
            return false;
            } 
        }else if (mes==6){
            if (dia > 30) {
            System.out.println("Dia no valido");
            return false;
            } 
        }else if (mes==7){
            if (dia > 31) {
            System.out.println("Dia no valido");
            return false;
            } 
        }else if (mes==8){
            if (dia > 31) {
            System.out.println("Dia no valido");
            return false;
            } 
        }else if (mes==9){
            if (dia > 30) {
            System.out.println("Dia no valido");
            return false;
            } 
        }else if (mes==10){
            if (dia > 31) {
            System.out.println("Dia no valido");
            return false;
            } 
        }else if (mes==11){
            if (dia > 30) {
            System.out.println("Dia no valido");
            return false;
            } 
        }else if (mes==12){
            if (dia > 31) {
            System.out.println("Dia no valido");
            return false;
            } 
        }else if (mes<1 || mes>12){
            System.out.println("Mes no valido");
            return false;
        }else if (dia<=0 ){
            System.out.println("Dia no valido");
            return false;
        }
        return true;
    }

    /**
    * Método para calcular la diferencia entre dos fechas validas usando la fórmula
    * |Cantidad en dias de Fecha1 - Candidad en dias de Fecha2|
    * @param dia - dia que es parte de la fecha completa respecto al que se quiere determinar la diferencia.
    * @param mes - mes que es parte de la fecha completa respecto al que se quiere determinar la diferencia.
    * @param anio - anio que es parte de la fecha completa respecto al que se quiere determinar la diferencia.
    * @return int - diferencia entre las dos fechas o error que equivale a 0.
    */
    public int diferencia (int dia, int mes, int anio) { 
    if (validar( dia, mes, anio) == false) {
        System.out.println("Fecha no valida");
        return 0;
    }else {
            return Math.abs(fechatoDia( this.dia, this.mes,  this.anio) - fechatoDia(dia,  mes,  anio));
        }
    }

  
    /**
    * Método para sumar  o restar días a una fecha y calcular la fecha nueva.
    * @param dia - día inicial.
    * @param mes - mes inicial.
    * @param anio - año inicial.
    * @param diaplus - cantidad de días a sumar (puede ser negativo para restar días).
    * @return int - el día tras sumar los dias sumados o restados.
    */
    public int sumarDias(int dia, int mes, int anio, int diaplus) {
        int resultado = dia + diaplus;
        boolean calculando = true; 

      
        while (calculando) {
            
            int verificacion = 28;
            if (esBisiesto(anio)) {
                verificacion = 29;
            }

            if (mes == 1 && resultado > 31) { 
                mes++;
                resultado = resultado - 31; 
            }else if (mes == 2 && resultado > verificacion) { 
                mes++; 
                resultado = resultado - verificacion; 
            }else if (mes == 3 && resultado > 31) { 
                mes++;
                resultado = resultado - 31;
            }else if (mes == 4 && resultado > 30) { 
                mes++;
                resultado = resultado - 30; 
            }else if (mes == 5 && resultado > 31) { 
                mes++;
                resultado = resultado - 31;
            }else if (mes == 6 && resultado > 30) { 
                mes++; 
                resultado = resultado - 30; 
            }else if (mes == 7 && resultado > 31) { 
                mes++; 
                resultado = resultado - 31;
            } else if (mes == 8 && resultado > 31) { 
                mes++;
                resultado = resultado - 31; 
            }else if (mes == 9 && resultado > 30) { 
                mes++;
                resultado = resultado - 30;
            }else if (mes == 10 && resultado > 31) {
                mes++; 
                resultado = resultado - 31; 
            }else if (mes == 11 && resultado > 30) { 
                mes++; 
                resultado = resultado - 30; 
            }else if (mes == 12 && resultado > 31) {
                mes++; 
                resultado = resultado - 31;
            }
            else {
                calculando = false; 
            }

            if (mes > 12) {
                anio++;
                mes = 1;
            }
        }

       
        while (resultado < 1) {
            mes--;
            
            if (mes < 1) {
                mes = 12;
                anio--;
            }
            if (mes == 1) { resultado = resultado + 31; }
            else if (mes == 2) { 
               
                if (esBisiesto(anio)) { 
                    resultado = resultado + 29; 
                } else { 
                    resultado = resultado + 28; 
                }
            }else if (mes == 3){ 
                resultado = resultado + 31;
            }else if (mes == 4) {
                resultado = resultado + 30;
            }else if (mes == 5) {
                resultado = resultado + 31; 
            }else if (mes == 6) { 
                resultado = resultado + 30; 
            }else if (mes == 7) { 
                resultado = resultado + 31; 
            }else if (mes == 8) { 
                resultado = resultado + 31; 
            }else if (mes == 9) {
                resultado = resultado + 30;
            }else if (mes == 10) {
                resultado = resultado + 31;
            }else if (mes == 11) {
                resultado = resultado + 30; 
            }else if (mes == 12) {
                resultado = resultado + 31;
            }
        }

        this.anio = anio;
        this.mes = mes;
        this.dia = resultado;     

        return this.dia;
    }



    /**
    * Método para determinar si dos fechas son iguales.
    * @param fech - Objeto fecha contra el cual se va a comparar.
    * @return boolean - true si son iguales y false en otro caso.
    */
    public boolean equals (Object fech) {
     Fecha fecha = (Fecha)fech;
    return anio == fecha.obtenerAnio() && mes == fecha.obtenerMes() && dia == fecha.obtenerDia();
    }

    /**
    * Método para convertir el nombre de un mes expresado en cadena de texto a su  equivalencia en numero.
    * @param mes - cadena de texto con el nombre del mes.
    * @return int - el numero respecto al mes: enero=1, febrero=2, marzo=3, abril=4, mayo=5, junio=6,
    * julio=7, agosto=8, septiembre=9, octubre=10, noviembre=11, diciembre=12 y en caso contrario -1.
    */
    public int mestoNum (String mes) {
            if (mes.equals("enero")) {
                return 1;
            } else if (mes.equals("febrero")) {
                return 2;
            } else if (mes.equals("marzo")) {
                return 3;
            } else if (mes.equals("Abril")) {
                return 4;
            } else if (mes.equals("mayo")) {
                return 5;
            } else if (mes.equals("junio")) {
                return 6;
            } else if (mes.equals("julio")) {
                return 7;
            } else if (mes.equals("agosto")) {
                return 8;
            } else if (mes.equals("septiembre")) {
                return 9;
            } else if (mes.equals("octubre")) {
                return 10;
            } else if (mes.equals("noviembre")) {
                return 11;
            } else if (mes.equals("diciembre")) {
                return 12;
            } else {
                System.out.println("Mes no valido");
                return -1;
            }
           
    }
    
    /**
    * Método para convertir el número de un mes a su equivalente en cadena de texto.
    * @param mes - número de un mes que se va convertir en el mes escrito en cadena de texto.
    * @return String - el mes escrit respecto al numero del mes dado: 1=enero 2=Febrero, 3=marzo, 4=abril, 5=mayo, 6=junio,
    * 7=julio, 8=agosto, 9=septiembre, 10=octubre, 11=noviembre, 12=diciembre y en caso contrario unknown.
    */
    public String NumtoMes (int mes) {
            if (mes == 1) {
                return "enero";
            } else if (mes == 2) {
                return "febrero";
            } else if (mes == 3) {
                return "marzo";
            } else if (mes == 4) {
                return "abril";
            } else if (mes == 5) {
                return "mayo";
            } else if (mes == 6) {
                return "junio";
            } else if (mes == 7) {
                return "julio";
            } else if (mes == 8) {
                return "agosto";
            } else if (mes == 9) {
                return "septiembre";
            } else if (mes == 10) {
                return "octubre";
            } else if (mes == 11) {
                return "noviembre";
            } else if (mes == 12) {
                return "diciembre";
            } else {
                System.out.println("Mes no valido");
                return "unknown";
            }
           
    }
    /**
    * Método para calcular si un anio es bisiesto usando la formula :
    * (anio/4 (¿es divisible entre 4?) y anio/100 (¿es divisible entre 100?) ) o (anio/400 (¿es divisible entre 400?) )
    * @param anio - anio que se desea determinar.
    * @return boolean - true si el resultado de la formula es true y false en caso contrario.
    */
    public boolean esBisiesto (int anio){
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)){
            return true;
        }else {
            return false;
        }
    }

    /**
    * Método para saber la cantidad de días transcurridos de una fecha dada.
    * @param dia - día del mes de la fecha.
    * @param mes2 - nombre del mes  de la fecha en cadena de texto.
    * @param anio - anio de la fecha, necesario para saber si es anio bisiesto.
    * @return int - total de días transcurridos en el anio.
    */
    public int diasTranscuridosAnio (int dia, String mes2, int anio){
     int mes= mestoNum(mes2);
  
        if (mes == 1){
            dia= dia + 0;
        }else if (mes == 2){
           dia= dia + 31;
        }else if (mes == 3){
             if (esBisiesto(anio) == false){
                dia= dia + 59;
            }else if (esBisiesto(anio) == true){
                dia= dia + 60;
            }
        }else if (mes == 4){
            if (esBisiesto(anio) == false){
                dia= dia + 90;
            }else if (esBisiesto(anio) == true){
                dia= dia + 91;
            }
        }else if (mes == 5){
           if (esBisiesto(anio) == false){
                dia= dia + 120;
            }else if (esBisiesto(anio) == true){
                dia= dia + 121;
            }
        }else if (mes == 6){
            if (esBisiesto(anio) == false){
                dia= dia + 151;
            }else if (esBisiesto(anio) == true){
                dia= dia + 152;
            }
        }else if (mes == 7){
            if (esBisiesto(anio) == false){
                dia= dia + 181;
            }else if (esBisiesto(anio) == true){
                dia= dia + 182;
            }
        }else if (mes == 8){
            if (esBisiesto(anio) == false){
                dia= dia + 212;
            }else if (esBisiesto(anio) == true){
                dia= dia + 213;
            }
        }else if (mes == 9){
             if (esBisiesto(anio) == false){
                dia= dia + 243;
            }else if (esBisiesto(anio) == true){
                dia= dia + 244;
            }
        }else if (mes == 10){
             if (esBisiesto(anio) == false){
                dia= dia + 273;
            }else if (esBisiesto(anio) == true){
                dia= dia + 274;
            }
        }else if (mes == 11){
            if (esBisiesto(anio) == false){
                dia= dia + 304;
            }else if (esBisiesto(anio) == true){
                dia= dia + 305;
            }
        }else if (mes == 12){
            if (esBisiesto(anio) == false){
                dia= dia + 334;
            }else if (esBisiesto(anio) == true){
                dia= dia + 335;
            }
        }
    
        return dia;
    }

    /**
    * Método para convertir una fecha Completa a dias
    * @param anio - anio que es parte de la fecha completa que con la formula
    *  dia + |(anio*365)|+|anio/4|-|anio/100|+|anio/400| lo pasamos a dias que tan sirve para anios bisiestos.
    * @param mes - mes que es parte de la fecha completa.
    * @param dia - dia que es parte de la fecha completa.
    * @return int - dia que son ya los dias totales de la fecha.
    */
    public int fechatoDia (int dia, int mes, int anio){
     dia = dia + (Math.abs(anio*365))+(Math.abs(anio/4))-(Math.abs(anio/100))+(Math.abs(anio/400));      

        if (mes == 1){
            dia= dia + 0;
        }else if (mes == 2){
           dia= dia + 31;
        }else if (mes == 3){
             if (esBisiesto(anio) == false){
                dia= dia + 59;
            }else if (esBisiesto(anio) == true){
                dia= dia + 60;
            }
        }else if (mes == 4){
            if (esBisiesto(anio) == false){
                dia= dia + 90;
            }else if (esBisiesto(anio) == true){
                dia= dia + 91;
            }
        }else if (mes == 5){
           if (esBisiesto(anio) == false){
                dia= dia + 120;
            }else if (esBisiesto(anio) == true){
                dia= dia + 121;
            }
        }else if (mes == 6){
            if (esBisiesto(anio) == false){
                dia= dia + 151;
            }else if (esBisiesto(anio) == true){
                dia= dia + 152;
            }
        }else if (mes == 7){
            if (esBisiesto(anio) == false){
                dia= dia + 181;
            }else if (esBisiesto(anio) == true){
                dia= dia + 182;
            }
        }else if (mes == 8){
            if (esBisiesto(anio) == false){
                dia= dia + 212;
            }else if (esBisiesto(anio) == true){
                dia= dia + 213;
            }
        }else if (mes == 9){
             if (esBisiesto(anio) == false){
                dia= dia + 243;
            }else if (esBisiesto(anio) == true){
                dia= dia + 244;
            }
        }else if (mes == 10){
             if (esBisiesto(anio) == false){
                dia= dia + 273;
            }else if (esBisiesto(anio) == true){
                dia= dia + 274;
            }
        }else if (mes == 11){
            if (esBisiesto(anio) == false){
                dia= dia + 304;
            }else if (esBisiesto(anio) == true){
                dia= dia + 305;
            }
        }else if (mes == 12){
            if (esBisiesto(anio) == false){
                dia= dia + 334;
            }else if (esBisiesto(anio) == true){
                dia= dia + 335;
            }
        }
    
        return dia;
    }

    /**
    * Método para convertir una fecha a cadena de caracteres.
    * @return String -- la fecha en formato de cadena.
    */
    public String toString() {
        return dia+"/"+ NumtoMes(mes)+"/"+anio;
    }


/*
    public static void main (String [] args){

        // 1.Constructores y toString()

        Fecha fechaDefault = new Fecha();
        System.out.println("Fecha por default: " + fechaDefault); 
        
        Fecha fechaNum = new Fecha(15, 8, 2023);
        System.out.println("Fecha con numeros (15/8/2023): " + fechaNum);
        
        Fecha fechaText = new Fecha(20, "Noviembre", 2024);
        System.out.println("Fecha con texto (20/Noviembre/2024): " + fechaText);

        // 2. obtener() y asignar()

        fechaDefault.asignarFecha(10, 12, 2026);
        System.out.println("Nueva fecha : " + fechaDefault.obtenerDia() + "/" + 
        fechaDefault.obtenerMes() + "/" + fechaDefault.obtenerAnio());

        // 3.validar()

        System.out.print("Validar 29/2/2024 ¿Valido? ");
        System.out.println(fechaDefault.validar(29, 2, 2024)); 
        
        System.out.print("Validar 29/2/2023 ¿Valido? ");
        System.out.println(fechaDefault.validar(29, 2, 2023)); 
        
        System.out.print("Validar 31/4/2026 ¿Valido? ");
        System.out.println(fechaDefault.validar(31, 4, 2026));

        // 4.diferencia()

        Fecha fecha1 = new Fecha(1, 1, 2026);
        System.out.println("Diferencia entre 01/01/2026 y 10/01/2026: " + fecha1.diferencia(10, 1, 2026) + " dias");

        // 5.sumarDias()

        Fecha fecha2 = new Fecha(28, 2, 2024); 
        System.out.println("Fecha original: " + fecha2);
        fecha2.sumarDias(28, 2, 2024, 5); 
        System.out.println("Fecha despues de la suma: " + fecha2);

        // 6.equals()

        Fecha fecha3 = new Fecha(15, 5, 2026);
        Fecha fecha4 = new Fecha(15, 5, 2026);
        System.out.println("Son iguales (15/5/2026) y (15/5/2026)? " + fecha3.equals(fecha4));

        // 7. mestoNum() y NumtoMes()
        System.out.println(fechaDefault.mestoNum("Octubre"));
        System.out.println("NumtoMes(4): " + fechaDefault.NumtoMes(4));

        // 8.esBisiesto()
        System.out.println("Es 2024 bisiesto? " + fechaDefault.esBisiesto(2024));
        System.out.println("Es 2026 bisiesto? " + fechaDefault.esBisiesto(2026));

        // 9. diasTranscurridosAnio() y fechatoDia()
        System.out.println("Dias transcurridos al 15 de Marzo 2024 : " + 
                     fechaDefault.diasTranscuridosAnio(15, "Marzo", 2024));
        System.out.println("Fecha a dias absolutos (01/01/2026): " + fechaDefault.fechatoDia(1, 1, 2026));
        
    }
   */ 

    
















   





   



}