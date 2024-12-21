
public class Main {
    public static void main(String[] args) {
    // Задание 1
        Printable sum = new Printable() {
            @Override
            public int print(Object o, Object o2) {
                return (int) o + (int) o2;
            }
        };
        Printable mult = new Printable() {
            @Override
            public int print(Object o, Object o2) {
                return (int) o * (int) o2;
            }
        };
        System.out.println("Задание 1:");
        System.out.println("Сумма: " + sum.print(2,7));
        System.out.println("Произведение: " + mult.print(2,7));

        // Задание 2
        System.out.println('\n'+"Задание 2:");
        String a = "Hello ";
        String b = "World!";
        System.out.println(processTwoString(a,b));

    }
    public static  String processTwoString(String a, String b){
        return a + b;
    }
}

