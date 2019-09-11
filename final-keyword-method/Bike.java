// Final Keyword for Methods
class Bike{
    final void run() // Final Method
    {
        System.out.println("Running");
    }
}
class Honda extends Bike{
    void run(){
        System.out.println("Running Safely at 100 Km/h");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
    }
}