public class SingleInstance {
    
    private static SingleInstance single = new SingleInstance();
    
    private SingleInstance()
    {
    }

    public static SingleInstance getInstance(){
        return single;
    }

    public void showMessage(){
        System.out.println("Hello from SingleInstance");
    }
}
