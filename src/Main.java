//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(" Gange tabel");

        System.out.print(" ");
// den her er de første 1.2.3.4 osv..
        for (int j = 1; j <= 9; j++) {

            System.out.print(" " + j);
        }
        // \n er et linje skift, 2 linjer tror jeg
        System.out.println("\n");

        //Display table body?
// den første for(int her er de 1 | og 2 | osv man ser derned af
        for(int i=1; i<= 9; i++) {
            System.out.println(i + " | ");

            for (int j = 1; j <= 9; j++) {
// den her laver vidst udregninger, google nok den der %4d
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}