/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4_1302200103;

/**
 *
 * @author faishal
 */
public class Penjumlahan {
    
    
    public static < T extends Number> T JumlahTigaAngka(T a, T b, T c) {
        if (a == null || b == null || c == null) {
            return null;
        }
        if (a instanceof Double) {
            return (T) new Double(a.doubleValue() + b.doubleValue() + c.doubleValue());
        }else if (a instanceof Integer) {
            return (T) new Integer(a.intValue() + b.intValue() + c.intValue());
        }else if (a instanceof Float) {
            return (T) new Float(a.floatValue() + b.floatValue() + c.floatValue());
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        double a1 = 13.00; // NIM 1302200103
        double a2 = 2.00;
        double a3 = 20.00;
        System.out.println(Penjumlahan.JumlahTigaAngka(a1, a2, a3));
    }
}
