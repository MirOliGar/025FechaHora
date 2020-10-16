/* 
 * Copyright 2020 Mireia Oliver García - mireia.oliver.11@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mireia Oliver García - mireia.oliver.11@gmail.com
 */

public class Main {
//Todo lo que sea "static" va fuera del Main.
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    
    //Captura la hora local y permite introducir por separado.
    public static final Calendar CAL = Calendar.getInstance();

    public static void main(String[] args) {
        //Declarar variables (Hora entrada)
        int he = 8;
        int me = 20;
        int se = 0;
                
        //Variables (Hora actual)
        int ha = CAL.get(Calendar.HOUR);
        int ma = CAL.get(Calendar.MINUTE);
        int sa = CAL.get(Calendar.SECOND);
      
        //HORA TOTAL (expresiones)
        int te = he*3600 + me*60 + se; //pasar a segundos
        int ta = ha*3600 + ma*60 + sa; //pasar a segundos
        int dif = ta - te; //segundos
        int hd = dif / 3600; //pasar a horas
        dif = dif - hd * 3600; //pasar a horas
        int md = dif / 60; //pasar a minutos
        int sd = dif - md * 60; //pasar a minutos
        
        //he (Hora de entrada)
        try {
            System.out.print("Hora de entrada....: ");
            he = SCN.nextInt();
        } catch (Exception e) {
            System.out.println("Error. Entrada incorrecta");
        } finally { //enteros, boolean, decimales
            SCN.nextLine();
        }
        
        //me (Minuto de entrada)
        try {
            System.out.print("Minuto de entrada....: ");
            me = SCN.nextInt();
        } catch (Exception e) {
            System.out.println("Error. Entrada incorrecta");
        } finally { //enteros, boolean, decimales
            SCN.nextLine();
        }
        
        //se (Segundo de entrada)
        try {
            System.out.print("Segundo de entrada....: ");
            se = SCN.nextInt();
        } catch (Exception e) {
            System.out.println("Error. Entrada incorrecta");
        } finally { //enteros, boolean, decimales
            SCN.nextLine();
        }

        System.out.printf("Hora actual....: %02d:%02d:%02d%n", ha, ma, sa);
        System.out.printf("Hora inicio....: %02d:%02d:%02d%n", he, me, se);
        System.out.printf("Tiempo clase....: %02d:%02d:%02d%n", hd, md, sd);
    }
}
