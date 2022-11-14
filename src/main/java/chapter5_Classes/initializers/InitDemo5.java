package chapter5_Classes.initializers;

import java.util.Arrays;
public class InitDemo5 {
    private static char[] alph;
    static {
        alph = new char[26];
        int i = 0;
        for (char c = 'a'; i < alph.length; c++, i++) {
            alph[i] = c;
        }
    }
    public static void main(String[] arg) {
        System.out.print(Arrays.toString(alph));
    }
} //[a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]