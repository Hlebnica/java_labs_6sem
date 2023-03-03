package acceslevels;

public class App2 {
    public static void main(String[] args) {
        SecretGetter sg = new SecretGetter();
        sg.getSecret();
    }
}

class SecretGetter extends Secret {

}
