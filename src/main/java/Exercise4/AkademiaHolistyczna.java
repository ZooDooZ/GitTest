package Exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Exercise4.Client.getNumberOfClients;

public class AkademiaHolistyczna {

    List<Client> clientList = new ArrayList<>();

    public Client registeringTheClient() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Register client number: " + getNumberOfClients());

        System.out.println("Client name:");
        String str1 = keyboard.nextLine();
        String name = str1.substring(0, 1).toUpperCase() + str1.substring(1);

        System.out.println("Client surname:");
        String str2 = keyboard.nextLine();
        String surname = str2.substring(0, 1).toUpperCase() + str2.substring(1);


        int age;
        boolean guardianConsent = false;
        do {
            System.out.println("Age:");
            age = keyboard.nextInt();
            if (age < 18 && age > 0) {
                System.out.println("Consent of the parent or guardian is required!");
                guardianConsent = true;
            }
        }while(!(age > 0 && age < 100));
        keyboard.nextLine();


        System.out.println("Phone number:");
        String phoneNumber = keyboard.nextLine();

        System.out.println("Type of pass (enter number 1,2,3,4,5 or 6):\n1.GYM\n2.GYM with Trainer\n3.Group training" +
                "\n4.Personal training\n5.Sport card\n6.One time entries");
        int num  = keyboard.nextInt();
        TypeOfPass typeOfPass;

        switch (num) {
            case 1:
                typeOfPass = TypeOfPass.GYM;
                break;
            case 2:
                typeOfPass = TypeOfPass.GYM_WITH_TRAINER;
                break;
            case 3:
                typeOfPass = TypeOfPass.GROUP_TRAINING;
                break;
            case 4:
                typeOfPass = TypeOfPass.PERSONAL_TRAINING;
                break;
            case 5:
                typeOfPass = TypeOfPass.SPORTS_CARDS;
                break;
            default:
                typeOfPass = TypeOfPass.ONE_TIME_ENTRIES;
                break;
        }

        System.out.println("Healthy statement is required!");
        boolean isHealthyStatement = true;

        return new Client(name, surname, age, phoneNumber, typeOfPass, isHealthyStatement, guardianConsent);
    }

    public void addClient(Client client){
        clientList.add(client);
    }

    public void printNumberOfEachPass(){
        int gym = 0;
        int gymWithTrainer = 0;
        int personalTraining = 0;
        int sportsCard = 0;
        int oneTimeEntries = 0;
        int groupTraining = 0;

        for(Client client : clientList){
            if(client.getTypeOfPass() == TypeOfPass.GYM){
                gym++;
            } else if (client.getTypeOfPass() == TypeOfPass.GYM_WITH_TRAINER) {
                gymWithTrainer++;
            } else if (client.getTypeOfPass() == TypeOfPass.PERSONAL_TRAINING) {
                personalTraining++;
            } else if (client.getTypeOfPass() == TypeOfPass.GROUP_TRAINING) {
                groupTraining++;
            } else if (client.getTypeOfPass() == TypeOfPass.ONE_TIME_ENTRIES) {
                oneTimeEntries++;
            } else {
                sportsCard++;
            }
        }

        System.out.println("Number of Gym pass: " + gym);
        System.out.println("Number of Gym with Trainer pass: " + gymWithTrainer);
        System.out.println("Number of Group training pass: " + groupTraining);
        System.out.println("Number of Personal training pass: " + personalTraining);
        System.out.println("Number of Sports card pass: " + sportsCard);
        System.out.println("Number of One time entries pass: " + oneTimeEntries);
    }

    public void printClientList(){
        for(Client client : clientList){
            System.out.println(client);
            System.out.println();
        }
    }

    public void printNumberOfTotalClients(){
        System.out.println("Total number client of Akademia Holistyczna: " + clientList.size());
    }
}
