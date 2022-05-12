public class main {

    public static void main(String[] args) {
        Phone phone1 = new Phone( "Samsung", "Peter", 0.678, "");
        Phone phone2 = new Phone("Lenovo", "GigaChad", 0.5, "");
        Phone phone3 = new Phone( "Iphone", "Lox", 0.456, "");

        phone1.setNumber("87778023481");
        phone2.setNumber("87772462718");
        phone3.setNumber("87772352622");

        phone1.receiveCall(phone1.getName());
        System.out.println();
        phone2.receiveCall(phone2.getName());
        System.out.println();
        phone3.receiveCall(phone3.getName());
        System.out.println();

        phone1.receiveCall(phone1.getName(), phone1.getNumber());
        System.out.println();
        phone2.receiveCall(phone2.getName(), phone2.getNumber());
        System.out.println();
        phone3.receiveCall(phone3.getName(), phone3.getNumber());
        System.out.println();

        phone1.sendMessage(phone2, "hi");
    }
}
