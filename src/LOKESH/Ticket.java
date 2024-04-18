package LOKESH;

public class Ticket {
    public void booking() {
        System.out.println("booking a ticket");
    }
}

class Waiting extends Ticket {
    public void booking() {
        System.out.println("i paid the money");
    }
}

class Checked extends Ticket {
    public void booking() {
        System.out.println("ticket is collected");
    }
}

class main {
    public static void main(String[] args) {
        Ticket myTicket = new Ticket();
        Waiting myWaiting = new Waiting();
        Checked myChecked = new Checked();
        myTicket.booking();
        myWaiting.booking();
        myChecked.booking();

    }
}
