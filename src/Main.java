public class Main {

    public static int tiskniObdelnik(int vyska, int sirka){
        int vyskaMax = 60, sirkaMax = 50, vyskaMin = 10, sirkaMin = 20;
        if (vyska < 0 || sirka < 0){
            System.out.println("Negativní hodnota");
            return 0;
        }
        if (vyska > vyskaMax || sirka > sirkaMax){
            System.out.println("Převyšování maxima");
            return 0;
        }
        if (vyska < vyskaMin || sirka < sirkaMin){
            System.out.println("Menší minimum");
            return 0;
        }
        for(int i = 0; i < vyska; i++){
            System.out.println();
            for(int j = 0; j < sirka; j++){
                if (i == 0 || i == vyska - 1){
                    System.out.print("*");
                } else {
                    if (j == 0 || j == sirka - 1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
        return 1;
    }

    public static void main(String[] args){
        tiskniObdelnik(20, 30);
    }
}
