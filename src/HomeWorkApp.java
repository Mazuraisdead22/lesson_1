public class HomeWorkApp {

    public static void main(String[] args) {
        compareNumbers();
        printColor();
        checkSumSign();
        printThreeWords();

    }
    public static void compareNumbers(){
        int a = -22;
        int b = 22;
        if(a >= b){
            System.out.println("a >= b");
        }else{
            System.out.println("a < b");
        }

    }

    public static void printColor() {
        int value = 222;
        if(value <= 0){
            System.out.println("Красный");
        }else if(value >= 100){
            System.out.println("Зелёный");
        }else{
            System.out.println("Желтый");
        }
    }

    public static void checkSumSign() {
        int a = 7;
        int b = 22;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
}

