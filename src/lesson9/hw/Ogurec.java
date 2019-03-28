package lesson9.hw;

public class Ogurec {
    int o;
    String gu;
    String rec;

    public Ogurec() {

    }

    public Ogurec(int o, String gu, String rec) {
        this.o = o;
        this.gu = gu;
        this.rec = rec;
    }

    public Ogurec(int o, String gu) {
        this.o = o;
        this.gu = gu;
    }

    public Ogurec(int o) {
        this.o = o;
    }

    public Ogurec(String gu, String rec) {
        this.gu = gu;
        this.rec = rec;
    }

    public int getO() {
        return o;
    }

    public void setO(int o) {

        this.o = o;
    }

    public String getGu() {
        return gu;
    }

    public void setGu(String gu) {
        this.gu = gu;
    }

    public String getRec() {
        return rec;
    }

    public void setRec(String rec) {
        this.rec = rec;
    }
}

