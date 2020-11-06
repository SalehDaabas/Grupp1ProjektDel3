package grupp1Del3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // Skapar objekt av klassen Passenger
        Passenger passenger = new Passenger();
        //Skapar objekt av klassen Tickets
        Ticket ticket = new Ticket();


        int p = 1;
        ticket.test();
        while (p==1) {


            switch (ticket.mainVariable) {

                case 1:
                    passenger.createPassenger();
                    passenger.passengerList();
                //kallar på getprice metoden som finns i Ticket klassen.
                    ticket.getPrice();
                    ticket.getTicket();
                    System.out.println("Namn: " + passenger.getName() + "\n" + ticket.getReceipt());
                    p=1;
                    break;
                case 2:
                    passenger.showList();
                    p=0;
                    break;
            }

            if (ticket.mainVariable == 1) {
                System.out.println("Tryck 1 för att lägga till en resenär. Tryck 2 för att få listan");
                ticket.mainVariable = scanner.nextInt();
            }

        }




    }

}
