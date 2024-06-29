package DesignPattern.Singleton;

/*Create only one instance of class which access same across globally(Application).
* Four way to implements -> Eager, Lazy, Synchronization, DoubleLocking.
* By default in Spring application all bean initialization with Singleton Scope.
* @Singleton annotation in Entity class.
* Usage :- Caching - HashMap, DB connection Object.
* */
public class SingletonDemo {
    public static void main (String args[]){
        System.out.println("Singleton Demo");
        /*Eager*/
        DbConnectionEager dbConnectionEager = DbConnectionEager.getInstance();
        DbConnectionEager dbConnectionEager1 = DbConnectionEager.getInstance();
        /*Lazy*/
        DbConnectionLazy dbConnectionLazy = DbConnectionLazy.getInstance();
        DbConnectionLazy dbConnectionLazy1 = DbConnectionLazy.getInstance();
        /*Synchronization*/
        DbConnectionSynchronization dbConnectionSynchronization = DbConnectionSynchronization.getInstance();
        DbConnectionSynchronization dbConnectionSynchronization1 = DbConnectionSynchronization.getInstance();
        /*Double Locking*/
        DbConnectionDoubleLocking dbConnectionDoubleLocking = DbConnectionDoubleLocking.getInstance();
        DbConnectionDoubleLocking dbConnectionDoubleLocking1 = DbConnectionDoubleLocking.getInstance();
    }
}