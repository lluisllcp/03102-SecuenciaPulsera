/* 
 * Copyright 2019 Lluís CP - aw.lluiscerda@gmail.com.
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

/**
 *
 * @author Lluís CP - aw.lluiscerda@gmail.com
 */
public class Main {
    public static void main(String[] args) {
      //Constantes
        final String NOMBRE = ("Marta");
        final double DIN_INI = 1.0;
        final String NOMB_ARTIC = ("Pulsera hippy");
        final double PREC_ART = 0.70;
        
        //mensaje
        System.out.println("Secuencia de Pulsera");
        System.out.println("====================");
        System.out.printf("Nombre de la niña ...: %s%n", NOMBRE);
        System.out.println("Dinero inicial ......: " + DIN_INI + " €");
        System.out.println("---");
        System.out.println("Artículo a comprar ..: " + NOMB_ARTIC);
        System.out.printf("Precio artículo .....: %.2f €%n", PREC_ART);
        System.out.println("---");
        System.out.printf("Dinero restante .....: %.2f €%n", DIN_INI - PREC_ART);
        
    }
    
}
