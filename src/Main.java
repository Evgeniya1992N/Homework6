public class Main {
    public static void main(String[] args) {
        // Task 1
        for (int i = 1; i <=10; i++)
        System.out.println("Cycle iteration " + i );
        //Task 2
        for (int i = 10; i >=1; i = i-1)
        System.out.println("Cycle iteration " + i );
        //Task 3
        for (int i = 0; i % 2 == 0 & i < 17; i = i+2)
        System.out.println("Cycle iteration " + i );
        //Task 4
        for (int i = 10; i>=(-10); i = i -1)
        System.out.println("Cycle iteration " + i );
        //Task 5
        for (int i = 1904; i <= 2096; i = i + 4){
        System.out.println( i + " год является високосным" );
        }
        //Task 6
        for (int i = 7; i <= 98; i = i + 7){
        System.out.println( i );
        }
        //Task 7
        for (int i = 1; i <= 512; i = i * 2){
        System.out.println( i );
        }
        //Task 8
        int savings = 29000;
        int total = 0;
            for (int i = 1; i <= 12; i++) {
                total = i * savings;
                System.out.println( "месяц " + i + " сумма накоплений равна " + total +  " рублей." );
            }
            //Task 9
        for (int i = 1; i <= 12; i++) {
            total = i * (savings + savings/100);
            System.out.println( "месяц " + i + " сумма накоплений равна " + total +  " рублей." );
        }
        //Task 10
        int result = 1;
        for (int i = 1; i <= 10; i++) {
            result = i * 2;
            System.out.println( "2*" + i + "=" + result );
        }
        }
    }
