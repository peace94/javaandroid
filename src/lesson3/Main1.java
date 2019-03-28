package lesson3;

public class Main1 {
    public static void main(String[] args) {
        for (int i = 0; i < 365 ; i++) {
            for (int j = 0; j < 24; j++) {
                for (int k = 0; k < 60; k++) {
                    for (int l = 0; l < 60; l++) {
                        System.out.println("Proshlo dnei: "+i+" Proshlo chasov: "+j+" Proshlo minut: "+k+" Proshlo second: "+l);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
