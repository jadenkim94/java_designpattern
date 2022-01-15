package chapter6.prac.num5;

public class ServerFactory {
    private static ServerProvider serverProvider = new ServerProvider(){
        public Server getServer(){
            return new ServerProxy();
        }
    };

    public synchronized static ServerProvider getInstance() {
        return serverProvider;
    }

    public static Server getServer(){
        return serverProvider.getServer();
    }

    public static void setServer(ServerProvider sp){
        serverProvider  = sp;
    }

}
