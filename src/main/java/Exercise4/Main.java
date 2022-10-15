package Exercise4;

public class Main {
    public static void main(String[] args) {

        AkademiaHolistyczna akademiaHolistyczna = new AkademiaHolistyczna();
//        //add first client
//        akademiaHolistyczna.addClient(akademiaHolistyczna.registeringTheClient());

//        //add second client
//        akademiaHolistyczna.addClient(akademiaHolistyczna.registeringTheClient());

        //print client list
//        akademiaHolistyczna.printClientList();

        Client client1 = new Client("John", "Lenon", 17, "123456789",
                TypeOfPass.PERSONAL_TRAINING, true, true);
        Client client2 = new Client("John", "Lenon", 17, "123456789",
                TypeOfPass.PERSONAL_TRAINING, true, true);


        System.out.println(client1.equals(client2));

//        Client client2 = new Client("Molo", "Belo", 35, "123456789",
//                TypeOfPass.ONE_TIME_ENTRIES, true);
//        Client client3 = new Client("Bolo", "Trelo", 42, "123456789",
//                TypeOfPass.GYM_WITH_TRAINER, true);
//        Client client4 = new Client("Kolo", "Mortadelo", 15, "123456789",
//                TypeOfPass.GYM, true, true);
//        Client client5 = new Client("Zomo", "Zomik", 18, "123456789",
//                TypeOfPass.SPORTS_CARDS, true);
//        Client client6 = new Client("Tepo", "Moki", 16, "123456789",
//                TypeOfPass.PERSONAL_TRAINING, true, true);
//        Client client7 = new Client("Eto", "Erto", 54, "123456789",
//                TypeOfPass.ONE_TIME_ENTRIES, true);
//        Client client8 = new Client("Bloto", "Aser", 61, "123456789",
//                TypeOfPass.GYM_WITH_TRAINER, true);
//        Client client9 = new Client("Optro", "Polik", 31, "123456789",
//                TypeOfPass.GYM, true);
//        Client client10 = new Client("Wero", "Zaki", 26, "123456789",
//                TypeOfPass.SPORTS_CARDS, true);
//
//        akademiaHolistyczna.addClient(client1);
//        akademiaHolistyczna.addClient(client2);
//        akademiaHolistyczna.addClient(client3);
//        akademiaHolistyczna.addClient(client4);
//        akademiaHolistyczna.addClient(client5);
//        akademiaHolistyczna.addClient(client6);
//        akademiaHolistyczna.addClient(client7);
//        akademiaHolistyczna.addClient(client8);
//        akademiaHolistyczna.addClient(client9);
//        akademiaHolistyczna.addClient(client10);
//
////        //print client list
////        akademiaHolistyczna.printClientList();
//
//        // print number of each pass
//        akademiaHolistyczna.printNumberOfEachPass();
//        System.out.println();
//
//        // print total client number
//        akademiaHolistyczna.printNumberOfTotalClients();
    }
}
