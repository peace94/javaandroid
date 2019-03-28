package lesson9.hw;

public class Mo {
    int mo;
    String ko;

    public Mo() {

    }

    public Mo(int mo, String ko) {
        this.mo = mo;
        this.ko = ko;
    }

    public Mo(int mo) {
        this.mo = mo;
    }

    public Mo(String ko) {
        this.ko = ko;
    }

    public void setMo(int mo) {
        this.mo = mo;
    }

    public void setKo(String ko) {
        this.ko = ko;
    }

    public int getMo() {
        return mo;
    }

    public String getKo() {
        return ko;
    }
}
