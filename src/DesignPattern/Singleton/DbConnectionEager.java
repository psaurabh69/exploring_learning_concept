package DesignPattern.Singleton;

public class DbConnectionEager {
    public static DbConnectionEager connObj = new DbConnectionEager();

    private DbConnectionEager(){

    }
    public static DbConnectionEager getInstance(){
        System.out.println("Create new instance for DB connection by Eager : ");
        return connObj;
    }
}
