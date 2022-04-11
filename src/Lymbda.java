public class Lymbda {
    public static void main(String[] args) {
        NewInterface newInterface = (a) -> System.out.println(a);
        newInterface.printSomething("Print something");
        IterfaceToChetNechet chetNechet = (g) -> {
            if (g % 2 == 0) {
                System.out.println(g + " - это значение четное");
            } else {
                System.out.println(g + " - это значение нечетное");
            }
        };
        chetNechet.chetNechet(10);
        InterfaceForMathOperation sumOperation = (a, b) -> System.out.println(a + b+" - результат суммы");
        sumOperation.mathOperation(5,6);
        InterfaceForMathOperation delOperation =(a,b)-> System.out.println(a-b+" - результат вычитания");
        delOperation.mathOperation(6,4);
        InterfaceForMathOperation mulOperation=(a,b)-> System.out.println(a*b+" - результат умножения");
        mulOperation.mathOperation(8,9);
        InterfaceForMathOperation dele=(a,b)-> System.out.println(a/b+" - результат деления");
        dele.mathOperation(9,3);
    }
}
