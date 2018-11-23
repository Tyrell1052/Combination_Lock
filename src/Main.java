public class Main {

    public static void main(String[] args) {
        ComboLock testLock = new ComboLock(5,18,28);
        System.out.println("The lock is open: " + testLock.open());
        testLock.turnCounterClockwise(5);
        testLock.turnClockwise(27);
        testLock.turnCounterClockwise(10);
        System.out.println("The lock is open: " + testLock.open());
        testLock.reset();
    }
}
