public class Main {
    public static void main(String[] args) {
        int year=2000;
        boolean leap=false;

        if (year % 4 == 0)
            leap=true;
        if (year % 100 == 0)
            leap=false;
        if (year % 400 == 0)
            leap=true;
        System.out.println (leap);

        boolean leap2;
        leap2=year%4==0 && (year%100 !=0);
    }
}