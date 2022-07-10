// https://codeforces.com/problemset/problem/236/A
public class BoyOrGirl {
    public static void main(String[] args) {
        System.out.println("kiekYraUnikaliuRaidziuZodyje(\"tvartas\") = " + kiekYraUnikaliuRaidziuZodyje("tvartas"));
        System.out.println("kiekYraUnikaliuRaidziuZodyje(\"asdfg\") = " + kiekYraUnikaliuRaidziuZodyje("asdfg"));
        System.out.println("kiekYraUnikaliuRaidziuZodyje(\"bananas\") = " + kiekYraUnikaliuRaidziuZodyje("bananas"));
        System.out.println("kiekYraUnikaliuRaidziuZodyje(\"ananasas) = " + kiekYraUnikaliuRaidziuZodyje("ananasas"));


    }

    /**
     * Suranda kiek unikalių raidžių yra žodyje. Veikia tokiu principu:
     * Eina per kiekvieną raidę ir tikrina ar tos raidės pirmo pasikartojimo (indexOf()) indeksas sutampa su paskutiniu pasikartojimu (lastIndexOf()), jeigu sutampa - ta raidė unikali.
     * Pvz. žodyje tvartas: raidės 't' indexOf() bus 0, o lastIndexOf() bus 4 - jie nesutampa, reiškias ir t raidė nebus unikali. O pvz. v raidės indexOf() bus 1 bei tu pačiu ir lastIndexOf() bus 1, todėl ta raidė yra unikali
     * @param zodis
     * @return
     */
    public static int kiekYraUnikaliuRaidziuZodyje(String zodis) {
        int kiekis = 0;
        for (int i = 0; i < zodis.length(); i++) {
            if (zodis.indexOf(zodis.charAt(i)) == zodis.lastIndexOf(zodis.charAt(i))) {
                kiekis++;
            }
        }
        return kiekis;
    }
}
