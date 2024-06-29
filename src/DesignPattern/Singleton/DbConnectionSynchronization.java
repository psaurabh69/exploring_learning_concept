package DesignPattern.Singleton;

public class DbConnectionSynchronization {
    public static DbConnectionSynchronization connectionSynch;

    private DbConnectionSynchronization(){
    }

    synchronized public static DbConnectionSynchronization getInstance(){
        if(connectionSynch == null){
            connectionSynch = new DbConnectionSynchronization();
            System.out.println("Create new instance for DB connection by Synchronization : ");
        }
        return connectionSynch;
    }
}
