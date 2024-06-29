package MultipleThread;

public class MultipleThreadDemo extends Thread{
    public static void main(String args[]) throws InterruptedException {
        System.out.println("Mutiple Thread Demo Started : ");
        PrintEvenNumber t1 = new PrintEvenNumber();
        PrintOddNumber t2 = new PrintOddNumber();
        t1.start();
        t2.start();
    }
}
