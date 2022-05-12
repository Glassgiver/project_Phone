public class Phone {
    private String number;
    private String model;
    private String ownerName;
    private double weight;
    private String text;

    public Phone(String model, String ownerName, double weight, String number) {
        this(number, model);
        this.ownerName = ownerName;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        this("Samsung", "Genry", 4.6, "82734728166");
    }

    public String getName(){
        return ownerName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void receiveCall(String ownerName){
        System.out.println(ownerName + " is calling!");
        System.out.println(getNumber());

    }

    public void receiveCall(String ownerName, String number){
        System.out.println(ownerName + " is calling!");
        System.out.println(number);

    }

    public void sendMessage(Phone Phone , String text){
        System.out.println(receiveMessage(text));
    }

    public String receiveMessage(String text){
        return text;
    }
}
