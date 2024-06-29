package MultipleThread;

public class PrintOddNumber extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Print Odd Number : ");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
