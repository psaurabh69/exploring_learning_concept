package MultipleThread;

public class PrintEvenNumber extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Print Even Number : ");
            this.notify();
        }
    }
}
