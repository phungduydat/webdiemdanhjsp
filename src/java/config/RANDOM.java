/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import com.oracle.wls.shaded.org.apache.bcel.generic.AALOAD;

/**
 *
 * @author duyda
 */
public class RANDOM {

    public String random() {
        String ram = null;
            double randomDouble = Math.random();
            String code = String.valueOf( (int)Math.floor(((Math.random() * 8999999) + 1000000)));
        return code;
    }

    public static void main(String[] args) {
        RANDOM r = new RANDOM();
        System.out.println(r);
    }

}
