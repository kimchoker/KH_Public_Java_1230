package TV만들기;

public class TVMain {
    public static void main(String[] args) {
        TvClass samsungTv = new TvClass();
        samsungTv.getTV();
        TvClass lgTv = new TvClass(true, 12, 28);
        lgTv.getTV();

    }


}
