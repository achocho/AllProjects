import java.util.*;

public class Main {
	public static void main(String[] args) {

		boolean EnterTickets = true;
		String name = "Mecho Puh";
		List<Ticket> tickets = new ArrayList<>();
		boolean WrongAnswer = false;
		double price = 5;
		while (EnterTickets) {
			try {

				Scanner scan = new Scanner(System.in);
				Scanner scan1 = new Scanner(System.in);

				if (!WrongAnswer) {
					System.out.println("Enter how many people are going to watch.");
					int people = scan.nextInt();
					String[] DisName = { "Ivan", "Georgi", "Peter" };
					if (people >= 20) {
						tickets.add(new GroupTicket(name, price, people));

					} else {
						boolean DiscountedTicket = false;
						System.out.println("Not enough people for group ticket");
						System.out.println("Enter your name");
						String PName = scan1.nextLine();
						for (int i = 0; i < DisName.length; i++) {
							if (PName.equals(DisName[i])) {
								tickets.add(new DiscountTicket(name, price, people));
								DiscountedTicket = true;

							}

						}

						if (!DiscountedTicket) {
							tickets.add(new NormalTicket(name, price, people));

						}
					}
					for (int i = 0; i < tickets.size(); i++) {
						System.out.println(tickets.get(i).getClass().getName() + " :" + tickets.get(i).getPrice());

					}
				}
				try {
					System.out.println("Do you want to exit?");
					String exit = scan1.nextLine();
					if (exit.equalsIgnoreCase("yes")) {
						EnterTickets = false;

					} else if (exit.equalsIgnoreCase("no")) {
						EnterTickets = true;
						WrongAnswer = false;

					} else {
						throw new Exception("Enter valid answer[yes/no]");

					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					System.out.println();
					WrongAnswer = true;

				}
			} catch (Exception e) {
				System.out.println("Enter valid information!!!");

			}
		}

		System.out.println("Bill is :" + Price(tickets, name) + " lv");
	}

	static float Sum = 0;

	public static float Price(List<Ticket> list, String SceneName) {

		List<Ticket> tickets = new ArrayList<>();
		for (Ticket a : list) {
			if (a.getSceneName().equalsIgnoreCase(SceneName)) {
				tickets.add(a);

			}

		}
		for (int i = 0; i < tickets.size(); i++) {
			Sum += tickets.get(i).getPrice();

		}
		return Sum;
	}
}