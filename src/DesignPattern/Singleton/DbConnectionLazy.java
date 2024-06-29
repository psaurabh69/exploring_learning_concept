package DesignPattern.Singleton;

/*Lazy initialization */
public class DbConnectionLazy {
    public static DbConnectionLazy connectionLazy;

    private DbConnectionLazy(){
    }

    public static DbConnectionLazy getInstance(){
        if(connectionLazy == null){
            connectionLazy = new DbConnectionLazy();
            System.out.println("Create new instance for DB connection by Lazy initialization : ");
        }
        return connectionLazy;
    }
}
