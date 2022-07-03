public class SingleInstanceTest {
    
    public static void main(String[] args){
        SingleInstance single1 = SingleInstance.getInstance();

        single1.showMessage();
    }
}
