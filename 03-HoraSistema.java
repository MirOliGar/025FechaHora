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
import java.util.GregorianCalendar;

/**
 *
 * @author Mireia Oliver García - mireia.oliver.11@gmail.com
 */
public class Main {

    public static final GregorianCalendar CAL
            = new GregorianCalendar();

    public static void main(String[] args) {

        int day = CAL.get(Calendar.DAY_OF_MONTH);
        int mon = CAL.get(Calendar.MONTH)+1;
        int yea = CAL.get(Calendar.YEAR);

        System.out.printf("Fecha del sistema...: %02d/%02d/%02d%n", day, mon, yea);
    }
}
