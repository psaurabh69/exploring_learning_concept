package DesignPattern.Singleton;

public class DbConnectionDoubleLocking {
    public static DbConnectionDoubleLocking connectionDoubleLocking;

    private DbConnectionDoubleLocking(){

    }
    public static DbConnectionDoubleLocking getInstance(){
        if(connectionDoubleLocking == null){
            synchronized (DbConnectionDoubleLocking.class){
                if(connectionDoubleLocking == null){
                    connectionDoubleLocking = new DbConnectionDoubleLocking();
                    System.out.println("Create new instance for DB connection by DoubleLocking : ");
                }
            }
        }
        return connectionDoubleLocking;
    }
}
