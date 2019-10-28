/* 
 * Copyright 2019 Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es.
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

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es
 */
public class Main {

    public static final Random RND = new Random();
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        final String CARNE = "Carne";
        final String PESCADO = "Pescado";
        final int TENEDOR_CARNE = 3;
        final int TENEDOR_PESCADO = 4;
        final int NADA = 0;
        String tipoComida;
        int tenedor;

        System.out.println("Alternativa Tenedor");
        System.out.println("===================");

        System.out.print("Tipo de comida .: ");
        tipoComida = SCN.nextLine();

        if (tipoComida.equals(CARNE)) {
            
            tenedor = TENEDOR_CARNE;
            
        } else if (tipoComida.equals(PESCADO)) {

            tenedor = TENEDOR_PESCADO;
            
        } else {

            tenedor = NADA;
            
        }

        System.out.println("Tenedor con ...: " + tenedor + " púas");

    }

}
