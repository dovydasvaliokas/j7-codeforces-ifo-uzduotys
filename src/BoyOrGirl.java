import java.util.HashSet;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/236/A
public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);
        String username = skait.nextLine();
        rezultatoIsvedimas(username);
    }

//    /**
//     * Suranda kiek unikalių raidžių yra žodyje. Veikia tokiu principu:
//     * Eina per kiekvieną raidę ir tikrina ar tos raidės pirmo pasikartojimo (indexOf()) indeksas sutampa su paskutiniu pasikartojimu (lastIndexOf()), jeigu sutampa - ta raidė unikali.
//     * Pvz. žodyje tvartas: raidės 't' indexOf() bus 0, o lastIndexOf() bus 4 - jie nesutampa, reiškias ir t raidė nebus unikali. O pvz. v raidės indexOf() bus 1 bei tu pačiu ir lastIndexOf() bus 1, todėl ta raidė yra unikali
//     * @param zodis
//     * @return
//     */
//    public static int kiekYraUnikaliuRaidziuZodyje(String zodis) {
//        int kiekis = 0;
//        for (int i = 0; i < zodis.length(); i++) {
//            if (zodis.indexOf(zodis.charAt(i)) == zodis.lastIndexOf(zodis.charAt(i))) {
//                kiekis++;
//            }
//            else {
//                System.out.println("zodis.charAt(i) = " + zodis.charAt(i));
//                System.out.println("zodis.indexOf(zodis.charAt(i)) = " + zodis.indexOf(zodis.charAt(i)));
//                System.out.println("zodis.lastIndexOf(zodis.charAt(i)) = " + zodis.lastIndexOf(zodis.charAt(i)));
//            }
//        }
//        return kiekis;
//    }

    /**
     * Pasirodo čia reikėjo rasti ne kiek yra unikalių, bet tiesiog dubliuojančių raidžių neįskaityti. Pvz žodyje "wjmzbmr" yra 6 skirtingos raidės. Nes nors ir `m` raidė kartojassi, ją vis vien VIENĄ kartą įskaičiuoja.
     * Kadangi sąlyga truputį "pasikeitė" (yra padarytas kitam variantui metodas) tai šiam variantui geriausiai tiktų HashSet naudojimas. Set - tai duomenų struktūra, kurioje negali būti duplikatų
     * @param zodis tikrinamas žodis
     * @return kiek yra raidžių skirtingų
     */
    public static int kiekYraUnikaliuRaidziuZodyje(String zodis) {
        HashSet<Character> skirtingosRaides = new HashSet<>();
        for (int i = 0; i < zodis.length(); i++) {
            skirtingosRaides.add(zodis.charAt(i));
        }
        return skirtingosRaides.size();
    }

    /**
     * Patikrina ar skaičius lyginis
     * @param x skaičiuss
     * @return true, jei lyginis, false jeigu ne
     */
    public static boolean arLyginis(int x) {
        return x % 2 == 0;
    }


    /**
     * Išveda atitinkamą žinutę priklausosmai nuo gauto žodžio
     * @param zodis žodis
     */
    public static void rezultatoIsvedimas(String zodis) {
        if (!arLyginis(kiekYraUnikaliuRaidziuZodyje(zodis))) {
            System.out.println("IGNORE HIM!");
        }
        else {
            System.out.println("CHAT WITH HER!");
        }
    }
}
