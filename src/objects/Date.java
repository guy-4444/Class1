package objects;

public class Date {

    public final int MAX_YEAR = 2024;

    private int d;
    private int m;
    private int y;

    public Date(int d, int m, int y) {
        setD(d);
        this.m = m;
        this.y = y;
    }

    public Date(Date another) {
        this.d = another.d;
        this.m = another.m;
        this.y = another.y;
    }

    public int getYearFromNow() {
        return MAX_YEAR - y;
    }

    public String getYearFromNowS() {
        int years = MAX_YEAR - y;

//        if (years >= 1000) {
//            return (years / 1000) + "k";
//        }
        return ("" + years);
    }

    public int getD() {
        return d;
    }

    private void setD(int d) {
        if (d >= 1  &&  d <= 31) {
            this.d = d;
        }
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return (   d > 9 ? d : "0" + d   ) + "/" + (   m > 9 ? m : "0" + m   ) + "/" + y;
    }
}
