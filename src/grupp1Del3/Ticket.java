package grupp1Del3;


import java.util.Scanner;

public class Ticket {

    // Skapar objekt av klassen Passenger
    Passenger passenger1 = new Passenger();
// Scan metoden
    Scanner scanner = new Scanner(System.in);

    int singleTicket;
    int monthlyTicket;
    int ticketType;
    private String receipt;
    int mainVariable;



    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public void test(){
        System.out.println("Hej! Tryck 1 för att lägga till passagerare. Tryck 2 för att se listan");
        validateInput();
        mainVariable = scanner.nextInt();

    }

    public void validateInput(){
        //kollar så att endast siffror accepteras.
        while (!scanner.hasNextInt()) {
            System.out.println("FEL VAL! \n Var god välj ett av alternativen");
            scanner.next();
        }
    }

        // Byt namn, det ska hetta nått med ticket
    public void getPrice() {


        //Efterfrågar passagerarens ålder
        System.out.println("Välj 1 för ålder 0-17 år, välj 2 för ålder 18-65 år, välj 3 för ålder 65+ år ");
        // For loop som gör att användaren kan endast välja 1,2 och 3. väljer användaren
        // nått annat kommer dyker ny text upp som säger att endast 1,2,3 är accepterat.
        for (int j = 0; j < 1; ) {
            //kollar så att endast siffror accepteras.
           validateInput();

            passenger1.setAge(scanner.nextInt());

            switch (passenger1.getAge()) {
                case 1:
                    System.out.println("Ungdomsbiljett: \n" + "Singelbiljett = 20kr. Månadsbiljett 450kr");
                    singleTicket = 20;
                    monthlyTicket = 450;
                    j = 1;// väljer användaren knapp 1 eller 3 så avslutas loopen
                        break;
                case 3:
                    singleTicket = 20;
                    monthlyTicket = 450;
                    j = 1;// väljer användaren knapp 1 eller 3 så avslutas loopen
                    System.out.println("Pensionärbiljett: \n" + "Singelbiljett = 20kr. Månadsbiljett 450kr");

                    break;// Om detta case stämmer så blir det break. alltså
                // det går inte vidare till nästa case.
                case 2:
                    singleTicket = 35;
                    monthlyTicket = 600;
                    j = 1; // Väljer användaren knapp 2 avslutas loopen
                    System.out.println("Vuxenbiljett: \n" + "Singelbiljett = 20kr. Månadsbiljett 450kr");
                    break;
                default:
                    j = 0; // Väljer användaren en annan siffra dyker detta
                    // Meddelandet upp.
                    System.out.println("FEL VAL! \n Var god välj 1 eller 2");

            }
        }
    }

        public void getTicket(){

        System.out.println("Välj 1 för Singelbiljett \n" + "Välj 2 för Månadskort");
        int i = 1;
        while (i == 1) {

           validateInput();

            // Användaren väljer 1 för singelbiljett och 2 för månadsbiljett
            ticketType = scanner.nextInt();

            if (ticketType == 1) {
                receipt = "Enkelbiljett";
                i = 0; // lopet kommer att avslutas
            } else if (ticketType == 2) {

                i = 0; // Lopet kommer att avslutas
                receipt = "Månadsbiljett";
            } else {
                i = 1; // Lopet körs om, om inte användaren väljer 1 eller 2
                System.out.println("FEL VAL! \n Var god välj 1 eller 2");
            }
        }





    }






}
