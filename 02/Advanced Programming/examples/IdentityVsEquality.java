import java.util.Objects;

public class IdentityVsEquality {

    public static void main(String[] args) {

        System.out.println(new String("test") == "test");

        System.out.println(new String("test") == new String("test"));

        System.out.println("test" == "test");

        System.out.println("test" == "te" + "st");

        System.out.println("test".equals("test"));
        
        System.out.println(new String("test").equals("test"));

    }

}
