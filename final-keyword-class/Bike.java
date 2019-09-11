// Final Keyword for Class
final class Bike{}
    
class Honda extends Bike{
    void run(){
        System.out.println("Running Safely at 100 Km/h");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
    }
}