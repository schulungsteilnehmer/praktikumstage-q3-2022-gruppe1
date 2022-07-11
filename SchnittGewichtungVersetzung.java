public class SchnittGewichtungVersetzung {

    public static void main(String[] args) {
        int[] leistungskurse = new int[2];
        int[] grundkurse = new int[6];
        for (int i=0; i<2; i++){
            leistungskurse[i]=15;
        }
        for (int i=0; i<6; i++){
            grundkurse[i]=15;
        }
        calcAverage(leistungskurse, grundkurse);
        wirdVersetzt(leistungskurse, grundkurse);
    }
    public static void calcAverage(int leistungskurse[], int grundkurse[]){
        int pointTotal = 0;
        for (int i=0; i<2; i++){
            pointTotal+=leistungskurse[i]*2;
        }
        for (int i=0; i<6; i++){
            pointTotal+=grundkurse[i];
        }
        double npAverage = pointTotal/10;
        double average = (17-npAverage)/3;
        average = Math.round(average*10)/10.0;
        System.out.println("Notenschnitt: " + average);
    }
    public static boolean wirdVersetzt(int leistungskurse[], int grundkurse[]) {
        int unterkurse = 0;
        for (int i = 0; i < 2; i++) {
            if (leistungskurse[i] < 5) {
                unterkurse++;
            }
        }
        for (int i = 0; i < 6; i++) {
            if (grundkurse[i] < 5) {
                unterkurse++;
            }
        }
        if (unterkurse > 2) {
            return false;
        } else {
            return true;
        }
    }
}
