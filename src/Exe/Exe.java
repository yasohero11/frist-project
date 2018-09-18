package Exe;

import java.util.Scanner;
//Youssef updated
public class Exe {
	public static Scanner input = new Scanner(System.in);
	static int  price  , Amount;;
	static int priceL = 1, priceM = 1, priceS = 1, count = 0;
	public static String order = null;

	public static int getMenu() {
		int x;
		count = 0;
		System.out.println("Welcome to Pizza Hut");
		System.out.println("---------------------");

		String[] name = { "1. for chicken pizza", "2. for pizza cordon bleu", "3. for pizza ranchi", "4. for margreta",
				"5. for HotDog ", "6. for Varaitey of meat ", "7. for Super Supreme", "8. for carnivore ",
				"9. for Classeic Pepperone ", "10 . for Random pick" };
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

		x = input.nextInt();
		while (x > 10 || x == 0) {
			System.out.println("please enter a number from the menu");
			x = input.nextInt();
		}

		return x;
	}

	public static int getAmount() {
		Amount = input.nextInt();
		while (Amount > 500) {
			System.out.println("Please enter the amount between (1 to 500)");
			Amount = input.nextInt();
		}
		return Amount;
	}

        public static char getSize() {
		char Size = 'l';

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the pizza" + "\n" + "Large(L)" + "\n" + "Medium(M)" + "\n" + "Small(S)");
		count = 0;
		while (count < 100) {
			Size = input.next().toUpperCase().charAt(0);

			switch (Size) {
			case 'L':
				price = priceL * Amount;
				count = 100;
				break;
			case 'M':
				price = priceM * Amount;
				count = 100;
				break;
			case 'S':
				price = priceS * Amount;
				count = 100;
				break;
			default:

				System.out.println("Please enter one of the following Sizes Large(L) Or Medium(M) or Small(S)");
				count++;

			}
		}

		return Size;
	}

	public static char getAnswer() {
		count = 0;
		char answer = 'l';

		System.out.println("Would you like to add extra cheese on your pizza?" + "\n" + "(Y)Yes Or (N)NO");

		while (count < 100) {
			answer = input.next().toUpperCase().charAt(0);
			if (answer == 'Y') {
				//price = price + (20 * Amount);
				order = "With extra cheese";
				count = 100;
			} else if (answer == 'N') {
				order = "Without Extra cheese";
				count = 100;
			}

			else
				System.out.println("Please enter one of the following letters (Y or N)");
			count++;
		}
		return answer;
	}

	public static void main(String[] args) {

		int amountUser;
		char sizeUser;
		char answerUser;
		char answer;
		int priceAll = 0;
		char again = 'y';

		do {
			int choiceUser = getMenu();
			if (choiceUser == 1) {
				priceL = 50;
				priceM = 30;
				priceS = 20;
				System.out.println("Enter the amount of the pizza");
				amountUser = getAmount();
				sizeUser = getSize();
				answerUser = getAnswer();

				System.out.println("your order is" + " " + amountUser + " " + "(" + sizeUser + ")" + "  "
						+ "chicken pizza" + " " + order + "\n" + "price :" + price);
			}

			if (choiceUser == 2) {
				priceL = 60;
				priceM = 45;
				priceS = 30;
				System.out.println("Enter the amount of the pizza");
				amountUser = getAmount();
				sizeUser = getSize();
				answerUser = getAnswer();
				System.out.println("your order is" + " " + amountUser + " " + "(" + sizeUser + ")" + "  "
						+ "pizza cordon bleu" + " " + order + "\n" + "price :" + price);
			}

			if (choiceUser == 3) {
				priceL = 60;
				priceM = 45;
				priceS = 30;
				System.out.println("Enter the amount of the pizza");
				amountUser = getAmount();
				sizeUser = getSize();
				answerUser = getAnswer();
				System.out.println("your order is" + " " + amountUser + " " + "(" + sizeUser + ")" + "  "
						+ "pizza ranchi" + " " + order + "\n" + "price :" + price);
			}

			if (choiceUser == 4) {
				System.out.println("Enter the amount of the pizza");
				amountUser = getAmount();
				order = null;
				System.out.println(
						"need it with  mozzarella or rumi cheese \n choose \n 1 for mozarella \n 2 for rumi  ");
				int y = input.nextInt();
				while (y != 1 && y != 2) {
					System.out.println(" Please enter \n 1 for mozarella \\n 2 for rumi  ");
					y = input.nextInt();
				}

				if (y == 1) {
					priceL = 55;
					priceM = 42;
					priceS = 34;
					order = " With mozarella ";
				} else if (y == 2) {
					priceL = 58;
					priceM = 44;
					priceS = 37;
					order = " With rumi";
				} else
					System.out.println(" NOt Found ");
				    sizeUser = getSize();
				System.out.println("your order is  " + amountUser + "  (" + sizeUser + ")  " + "margreta  " + order
						+ "\n" + "price : " + price);
			}

			if (choiceUser == 5) {
				System.out.println("Enter the amount of the pizza");
				amountUser = getAmount();
				order = null;
				System.out.println("need it with mashrom ?\n (Y) for Yes \n (N) for No ");
				char y = input.next().toUpperCase().charAt(0);
				while (y != 'Y' && y != 'N') {
					System.out.println(" Again need it with mashrom ?\\n (Y) for Yes \\n (N) for No ");
					y = input.next().toUpperCase().charAt(0);
				}
				if (y == 'Y') {
					priceL = 58;
					priceM = 42;
					priceS = 31;
					order = "with mashrom";
				} else if (y == 'N') {
					priceL = 55;
					priceM = 40;
					priceS = 30;
					order = "without mashrom";
				} else
					System.out.println(" NOt Found ");

				sizeUser = getSize();
				System.out.println("your order is  " + amountUser + "  (" + sizeUser + ")  " + " HotDog " + order + "\n"
						+ "price : " + price);
			}

			if (choiceUser == 6) {
				System.out.println("Enter the amount of the pizza");
				order = null;
				amountUser = getAmount();
				System.out.println("need it with Sasuage or liver \n choose 1 for Sasuage \n 2 for liver  ");
				int y = input.nextInt();
				while (y != 1 && y != 2) {
					System.out.println("please enter one of choise \n 1 for Sasuage \n 2 for liver ");
					y = input.nextInt();
				}
				if (y == 1) {
					priceL = 63;
					priceM = 46;
					priceS = 35;
					order = " With sasuage ";
				} else if (y == 2) {
					priceL = 55;
					priceM = 45;
					priceS = 33;
					order = " With liver ";
				} else
					System.out.println("please enter one of choise ");
				    sizeUser = getSize();
				System.out.println("your order is  " + amountUser + "  (" + sizeUser + ")   " + "Varaitey of meat "
						+ order + "\n" + "price : " + price);
			}

			if (choiceUser == 7) {
				priceL = 60;
				priceM = 45;
				priceS = 30;
				System.out.println("Enter the amount of the pizza");
				amountUser = getAmount();
				sizeUser = getSize();
				answerUser = getAnswer();
				System.out.println("your order is" + " " + amountUser + " " + "(" + sizeUser + ")" + " "
						+ "Super Supreme" + " " + order + "\n" + "price :" + price);
			}

			if (choiceUser == 8) {
				priceL = 60;
				priceM = 45;
				priceS = 30;
				System.out.println("Enter the amount of the pizza");
				amountUser = getAmount();
				sizeUser = getSize();
				answerUser = getAnswer();
				System.out.println("your order is" + " " + amountUser + " " + "(" + sizeUser + ")" + " " + "Carnivore"
						+ " " + order + "\n" + "price :" + price);
			}

			if (choiceUser == 9) {
				priceL = 60;
				priceM = 45;
				priceS = 30;
				System.out.println("Enter the amount of the pizza");
				amountUser = getAmount();
				sizeUser = getSize();
				answerUser = getAnswer();
				System.out.println("your order is" + " " + amountUser + " " + "(" + sizeUser + ")" + "  "
						+ "Classeic Pepperone " + " " + order + "\n" + "price :" + price);
			}

			if (choiceUser == 10) { // Random pick

				choiceUser = 1 + (int) (Math.random() * 9);

				if (choiceUser == 1) {
					priceL = 50;
					priceM = 30;
					priceS = 20;
					System.out.println("Enter the amount of the pizza");
					amountUser = getAmount();
					sizeUser = getSize();
					answerUser = getAnswer();
					System.out.println("your order is" + " " + amountUser + " " + "(" + sizeUser + ")" + "  "
							+ "chicken pizza" + " " + order + "\n" + "price :" + price);
				}

				if (choiceUser == 2) {
					priceL = 60;
					priceM = 45;
					priceS = 30;
					System.out.println("Enter the amount of the pizza");
					amountUser = getAmount();
					sizeUser = getSize();
					answerUser = getAnswer();
					System.out.println("your order is" + " " + amountUser + " " + "(" + sizeUser + ")" + "  "
							+ "pizza cordon bleu" + " " + order + "\n" + "price :" + price);
				}

				if (choiceUser == 3) {
					priceL = 60;
					priceM = 45;
					priceS = 30;
					System.out.println("Enter the amount of the pizza");
					amountUser = getAmount();
					sizeUser = getSize();
					answerUser = getAnswer();
					System.out.println("your order is" + " " + amountUser + " " + "(" + sizeUser + ")" + "  "
							+ "pizza ranchi" + " " + order + "\n" + "price :" + price);
				}
				if (choiceUser == 4) {
					System.out.println("Enter the amount of the pizza");
					order = null;
					amountUser = getAmount();
					System.out.println(
							"need it with  mozzarella or rumi cheese \n choose \n 1 for mozarella \n 2 for rumi  ");
					int y = input.nextInt();
					while (y != 1 && y != 2) {
						System.out.println(" Please enter \n 1 for mozarella \\n 2 for rumi  ");
						y = input.nextInt();
					}
					if (y == 1) {
						priceL = 55;
						priceM = 42;
						priceS = 34;
						order = " With mozarella ";
						order = "";
					} else if (y == 2) {
						priceL = 58;
						priceM = 44;
						priceS = 37;
						order = " With rumi";
					} else
						System.out.println(" NOt Found ");
					sizeUser = getSize();
					System.out.println("your order is" + " " + amountUser + " " + "(" + sizeUser + ")" + "  "
							+ "margreta" + " " + order + "\n" + "price :" + price);
				}

				if (choiceUser == 5) {
					System.out.println("Enter the amount of the pizza");
					order = null;
					amountUser = getAmount();
					System.out.println("need it with mashrom ?\n (Y) for Yes \n (N) for No ");
					char e = input.next().toUpperCase().charAt(0);
					while (e != 'Y' && e != 'N') {
						System.out.println(" Again need it with mashrom ?\\n (Y) for Yes \\n (N) for No ");
						e = input.next().toUpperCase().charAt(0);
					}
					if (e == 'Y') {
						priceL = 58;
						priceM = 42;
						priceS = 31;
						order = "with mashrom";
					} else if (e == 'N') {
						priceL = 55;
						priceM = 40;
						priceS = 30;
						order = "without mashrom";
					} else
						System.out.println(" NOt Found ");
					sizeUser = getSize();
					System.out.println("your order is" + " " + amountUser + " " + "(" + sizeUser + ")" + "  " + ""
							+ "HotDog" + order + "\n" + "price :" + price);
				}

				if (choiceUser == 6) {
					System.out.println("Enter the amount of the pizza");
					order = null;
					amountUser = getAmount();
					System.out.println("need it with Sasuage or liver \n choose 1 for Sasuage \n 2 for liver  ");
					int x = input.nextInt();
					while (x != 1 && x != 2) {
						System.out.println("please enter one of choise \n 1 for Sasuage \n 2 for liver ");
						x = input.nextInt();
					}
					if (x == 1) {
						priceL = 63;
						priceM = 46;
						priceS = 35;
						order = " With sasuage ";
					} else if (x == 2) {
						priceL = 55;
						priceM = 45;
						priceS = 33;
						order = " With liver ";
					} else
						System.out.println("please enter one of choise ");
					sizeUser = getSize();
					System.out.println("your order is" + " " + amountUser + " " + "(" + sizeUser + ")" + "  "
							+ "Varaitey of meat" + " " + order + "\n" + "price :" + price);
				}

				if (choiceUser == 7) {
					priceL = 60;
					priceM = 45;
					priceS = 30;
					System.out.println("Enter the amount of the pizza");
					amountUser = getAmount();
					sizeUser = getSize();
					answerUser = getAnswer();
					System.out.println("your order is" + " " + amountUser + " " + "(" + sizeUser + ")" + " "
							+ "Super Supreme" + " " + order + "\n" + "price :" + price);
				}

				if (choiceUser == 8) {
					priceL = 60;
					priceM = 45;
					priceS = 30;
					System.out.println("Enter the amount of the pizza");
					amountUser = getAmount();
					sizeUser = getSize();
					answerUser = getAnswer();
					System.out.println("your order is" + " " + amountUser + " " + "(" + sizeUser + ")" + " "
							+ "Carnivore" + " " + order + "\n" + "price :" + price);
				}

				if (choiceUser == 9) {
					priceL = 60;
					priceM = 45;
					priceS = 30;
					System.out.println("Enter the amount of the pizza");
					amountUser = getAmount();
					sizeUser = getSize();
					answerUser = getAnswer();
					System.out.println("your order is" + " " + amountUser + " " + "(" + sizeUser + ")" + "  "
							+ "Classeic Pepperone " + " " + order + "\n" + "price :" + price);
				}
			}
			System.out.println("\n" + "would you like French Fries with your order ?" + "\n" + "(Y)Yes Or (N)NO");
			count = 0;
			while (count < 100) {
				answer = input.next().toUpperCase().charAt(0);
				switch (answer) {
				case 'Y':
					System.out.println("How many backets do u want? ");
					amountUser = getAmount();
					int priceF = (5 * Amount);
					price = price + priceF;
					count = 100;
					System.out.println(Amount + " of French fries :" + priceF);
					break;
				case 'N':
					count = 100;
					break;
				default:
					System.out.println("Please enter one of the following letters (Y or N)");
				}
			}
			System.out.println("would you like a drink  with your order ?" + "\n" + "(Y)Yes Or (N)NO");
			count = 0;
			while (count < 100) {
				answer = input.next().toUpperCase().charAt(0);
				if (answer == 'Y') {
					System.out.println("\n" + "How many drinks do you want ?");
					amountUser = getAmount();
					System.out.println("1. for Pepsi" + "\n" + "2. for Mirinda " + "\n" + "3. for Cocacola" + "\n"
							+ "4. for Fanta");
					int count2 = 0;
					while (count2 < 100) {
						int x = input.nextInt();
						switch (x) {
						case 1:
							price = price + (10 * amountUser);
							System.out.print(amountUser + " " + "Pepsi");
							count = 100;
							count2 = 100;
							break;
						case 2:
							price = price + (9 * amountUser);
							System.out.print(amountUser + " " + "Mirinda");
							count = 100;
							count2 = 100;
							break;
						case 3:
							price = price + (11 * amountUser);
							System.out.print(amountUser + " " + "Cocacola");
							count = 100;
							count2 = 100;
							break;
						case 4:
							price = price + (8 * amountUser);
							System.out.print(amountUser + " " + "Fanta");
							count = 100;
							count2 = 100;
							break;
						default:
							System.out.println("please enter a number from the menu");
							count2++;
						}
					}
				} else if (answer == 'N') {
					count = 100;
				} else
					System.out.println("Please enter one of the following letters (Y or N)");
				count++;
			}

			System.out.println("\n Are you need Katchup\n Choose \n (Y) for Yes \n (N) for No ");
			char I = input.next().toUpperCase().charAt(0);
			int y = 0;
			while (I != 'Y' && I != 'N') {
				System.out.println(" Please   Choose \\n (Y) for Yes \\n (N) for No");
				I = input.next().toUpperCase().charAt(0);
			}
			if (I == 'Y') {
				System.out.println("How many");
				y = input.nextInt();
				int katchup0price = y * 2;
				price = price + katchup0price;
				System.out.println("Number of ketchup is : " + y + " Price : " + katchup0price);
			} else if (I == 'N') {
				System.out.println("Number of ketchup is : " + y);
			} else
				System.out.println("Not found");

			priceAll = priceAll + price;
			System.out.println("\n" + "\n" + "Do you want to order again?" + "\n" + "(Y)Yes Or (Any Key)NO");
			again = input.next().toUpperCase().charAt(0);

		} while (again == 'Y');
		System.out.println("The Total price : " + " " + priceAll);

		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println("           GOOD BYE          ");
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
	}
}
