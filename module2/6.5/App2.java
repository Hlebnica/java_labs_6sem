public class App2 {
    public static void main(String[] args) {
        
    }    
}


interface Message {
    int maxSize = 1488;

    public void send();
    public void delete(int id);
    public String read(int id);
}