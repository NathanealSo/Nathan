
public class Date {
    private Integer D,M,Y;

    public Date(Integer d, Integer m, Integer y) {
        D = d;
        M = m;
        Y = y;
    }

    public Integer getD() {
        return D;
    }

    public void setD(Integer d) {
        D = d;
    }

    public Integer getM() {
        return M;
    }

    public void setM(Integer m) {
        M = m;
    }

    public Integer getY() {
        return Y;
    }

    public void setY(Integer y) {
        Y = y;
    }

    public static String GetDate(Date d){
        String D = FormatDate(d.getD());
        String M = FormatDate(d.getM());
        String Y = String.valueOf(d.getY());
        return D + "/" + M + "/" + Y;
    }
    static String FormatDate(int i){
        if (i < 10){
            return "0" + i;
        }
        return String.valueOf(i);
    }
}
