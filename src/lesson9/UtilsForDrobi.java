package lesson9;

public class UtilsForDrobi {
    public static int commonZnam(DrobnoeChislo a, DrobnoeChislo b) {
        int commoZnam = 1;
        for (int i = 1; i < a.getZnamenatel() * b.getZnamenatel(); i++) {
            if (i % a.getZnamenatel() == 0 && i % b.getZnamenatel() == 0) {
                commoZnam = i;
                break;
            }
        }
        return commoZnam;
    }
}
