package Exercise2;


//FunctionalInterface - interfejs z jedna metoda abstrakcyjna!

public interface Workable {


    public static String interfaceName = "Workable";

    public String name = "Elo";

    public boolean doWork();

    public default void printInterfaceName(){
        System.out.println(interfaceName);
    }

    static int getInt(){
        return 1;
    }

    private static long getLong(){
        return 1L;
    }

    private static double getDouble(){
        return 1.0;
    }
}
