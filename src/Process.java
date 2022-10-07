import java.util.*;

public class Process {
	static List<User> user = new ArrayList<>();
	static List<AtmBalance> Atm = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void addMoney() {
		int tota = 0;
		if (Atm.size() == 0) {
			System.out.println("Enter the no of 2000");
			int $2000 = sc.nextInt();
			System.out.println("Enter the no of 500");
			int $500 = sc.nextInt();
			System.out.println("Enter the no of 200");
			int $200 = sc.nextInt();
			System.out.println("Enter the no of 100");
			int $100 = sc.nextInt();
			int total = 100 * $100 + 200 * $200 + 500 * $500 + 2000 * $2000;
			AtmBalance a1 = new AtmBalance($2000, $500, $200, $100, total);
			Atm.add(a1);
			tota += total;
			System.out.println("Money successfully Added");
			System.out.println("The present Status of The ATM is " + tota);
		} else {
			int amout = 0;
			System.out.println("Enter the no of 2000");
			int $2000 = sc.nextInt();
			System.out.println("Enter the no of 500");
			int $500 = sc.nextInt();
			System.out.println("Enter the no of 200");
			int $200 = sc.nextInt();
			System.out.println("Enter the no of 100");
			int $100 = sc.nextInt();
			amout += 100 * $100 + 200 * $200 + 500 * $500 + 2000 * $2000;
			for (AtmBalance a : Atm) {
				int two = a.get$2000() + $2000;
				a.set$2000(two);
				int five = a.get$500() + $500;
				a.set$500(five);
				int twoh = a.get$200() + $200;
				a.set$200(twoh);
				int hun = a.get$100() + $100;
				a.set$100(hun);
				int tot = a.getTotal() + amout;
				a.setTotal(tot);
				tota += a.getTotal();
			}
			System.out.println("Money successfully Added");
			System.out.println("The present Status of The ATM is " + tota);
		}

	}

	public static void manualUser() {
		User u1 = new User(101, 1234, 4321, 4000, 6369);
		User u2 = new User(102, 3521, 4321, 4000, 6369);
		User u3 = new User(103, 3522, 1373, 4000, 6369);
		User u4 = new User(104, 3523, 1374, 4000, 6369);
		User u5 = new User(105, 3525, 1375, 4000, 6369);
		user.addAll(Arrays.asList(u1, u2, u3, u4, u5));
	}

	public static void atomaticUser() {
		System.out.println("enter Admin Id");
		String s = sc.next();
		System.out.println("enter password");
		String s1 = sc.next();
		if (s.equals("Admin") && s1.equals("Admin")) {
			System.out.println("Enter no of user ot add ");
			int n = sc.nextInt();
			while (n != 0) {
				System.out.println("Enter user id");
				int id = sc.nextInt();
				System.out.println("Enter pin");
				int pin = sc.nextInt();
				System.out.println("Enter account no");
				int accno = sc.nextInt();
				System.out.println("Enter balance");
				int balanc = sc.nextInt();
				System.out.println("Enter phonr no");
				int phone = sc.nextInt();
				User u1 = new User(id, pin, accno, balanc, phone);
				user.add(u1);
				System.out.println("User Succesfully added");
				n--;
			}
		} else {
			System.out.println("You are not eligible");
		}
		
	}

	public static void addUse() {

		System.out.println("1.Add Default user");
		System.out.println("2.Add your user");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			manualUser();
			System.out.println("users successfully added");
			break;
		case 2:
			atomaticUser();
			break;

		}

	}

	public static void balance() {
		System.out.println("enter userId");
		int id = sc.nextInt();
		System.out.println("enter Pin");
		int pass = sc.nextInt();
		boolean yes = true;
		for (User u : user) {
			if (u.getUserId() == id && u.getPin() == pass) {
				System.out.println(u.getBalance());
				yes = false;
			}

		}
		if (yes) {
			System.out.println("No such user found");
		}

	}

	public static void deposit() {
		System.out.println("enter userId");
		int id = sc.nextInt();
		System.out.println("enter Pin");
		int pass = sc.nextInt();
		int amout = 0;
		boolean yes = true;
		for (User u : user) {
			if (u.getUserId() == id && u.getPin() == pass) {
				System.out.println("Enter the no of 2000");
				int $2000 = sc.nextInt();
				System.out.println("Enter the no of 500");
				int $500 = sc.nextInt();
				System.out.println("Enter the no of 200");
				int $200 = sc.nextInt();
				System.out.println("Enter the no of 100");
				int $100 = sc.nextInt();
				amout += 100 * $100 + 200 * $200 + 500 * $500 + 2000 * $2000;
				int bal = u.getBalance() + amout;
				u.setBalance(bal);
				for (AtmBalance a : Atm) {
					int two = a.get$2000() + $2000;
					a.set$2000(two);
					int five = a.get$500() + $500;
					a.set$500(five);
					int twoh = a.get$200() + $200;
					a.set$200(twoh);
					int hun = a.get$100() + $100;
					a.set$100(hun);
					int tot = a.getTotal() + amout;
					a.setTotal(tot);
				}
				yes = false;
				System.out.println("Amount Deposited Successfully");
			}

		}
		if (yes) {
			System.out.println("No such user found");
		}
	}

	public static void transfer() {
		System.out.println("enter userId");
		int id = sc.nextInt();
		System.out.println("enter Pin");
		int pass = sc.nextInt();
		boolean yes = true;
		boolean no = true;
		for (User u : user) {
			if (u.getUserId() == id && u.getPin() == pass) {
				System.out.println("Your net Balance is Rs:" + u.getBalance());
				System.out.println("enter userId of the reciver");
				int id1 = sc.nextInt();
				System.out.println("enter Account numbwr of the reciver");
				int acc = sc.nextInt();
				int transfer = 0;
				yes = false;
				for (User s : user) {
					if (s.getUserId() == id1 && s.getAccount_no() == acc) {
						System.out.println("Enter the amount to be Transfered");
						int amt = sc.nextInt();
						no = false;
						if (amt > u.getBalance()) {
							System.out.println("Insufficient funds");

							break;
						} else {
							int val = s.getBalance() + amt;
							s.setBalance(val);
						}
						transfer = amt;

					}

				}
				if (no) {
					System.out.println("No such user found");
				}
				int val = u.getBalance() - transfer;
				u.setBalance(val);
				System.out.println("Your net Balance is Rs:" + u.getBalance());

			}

		}
		if (yes) {
			System.out.println("No such user found");
		}
	}

	public static void atmBalance() {
		for (AtmBalance a : Atm) {

			System.out.println("No.of Rs2000      " + a.get$2000());
			System.out.println("No.of Rs500       " + a.get$500());
			System.out.println("No.of Rs200       " + a.get$200());
			System.out.println("No.of Rs100       " + a.get$100());
			System.out.println("The net balance is" + a.getTotal());
		}
	}

	public static void withDraw() {
		int $2000 = 0;
		int $500 = 0;
		int $200 = 0;
		int $100 = 0;
		int total = 0;
		boolean g = false;
		for (AtmBalance a : Atm) {
			$2000 += a.get$2000();
			$500 += a.get$500();
			$200 += a.get$200();
			$100 += a.get$100();
			total += a.getTotal();

		}
		int x = 0;
		int c2000 = 0;
		int c200 = 0;
		int c500 = 0;
		int c100 = 0;
		System.out.println("enter userId");
		int id = sc.nextInt();
		System.out.println("enter Pin");
		int pass = sc.nextInt();
		boolean yes = true;
		for (User u : user) {
			boolean y = true;
			if (u.getUserId() == id && u.getPin() == pass) {
				yes = false;
				System.out.println("Enter the amount to be withdraw");
				int n = sc.nextInt();
				x += n;
				if (n > u.getBalance()) {
					System.out.println("Insuficient Balance");
					break;
				} else if (n > total) {
					System.out.println(" ATM  is Insuficient Balance");
					break;
				} else {
					while (n != 0) {
						if (n >= 2000) {
							int rem = n % 2000;
							int count = 0;
							while (n >= 2000) {
								count += 1;
								n = n / 2000;
							}
							c2000 += count;
							n = rem;

						} else if (n >= 500) {
							int rem = n % 500;
							int count = 0;
							while (n >= 500) {
								count += 1;
								n = n / 500;
							}
							c500 += count;
							n = rem;
						} else if (n >= 200) {
							int rem = n % 200;
							int count = 0;
							while (n >= 200) {
								count += 1;
								n = n / 200;
							}
							c200 += count;
							n = rem;
						} else if (n >= 100) {
							int rem = n % 100;
							int count = 0;
							while (n >= 100) {
								count += 1;
								n = n / 100;
							}
							c500 += count;
							n = rem;
						} else if (n < 100) {
							System.out.println("Your requset cannot be Processed");
							y = false;
							break;
						}
					}
				}
				if (y) {
					if ($2000 >= c2000 && $200 >= c200 && $500 >= c500 && $100 >= c100) {
						$2000 -= c2000;
						g = true;
						$200 -= c200;
						$500 -= c500;
						$100 -= c100;
						int val = u.getBalance() - x;
						u.setBalance(val);
						System.out.println("Your Current balance is " + u.getBalance());
					}
				} else {
					break;
				}

			}
			if (yes) {
				System.out.println("No such user found");
			}

		}
		if (g) {
			for (AtmBalance a : Atm) {
				a.set$100($100);
				a.set$200($200);
				a.set$500($500);
				a.set$2000($2000);
				int val = a.get$100() - x;
				a.setTotal(val);

			}
		}

	}

	public static void main(String[] args) {
		boolean f = true;
		System.out.println("Enter the operation to be made");
		while (f) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1.Add Money to the Atm");
			System.out.println("2.Add bank Account");
			System.out.println("3.View Balance");
			System.out.println("4.Deposit to Account");
			System.out.println("5.Money withDraw");
			System.out.println("6.Money Transfer");
			System.out.println("7.View ATM balance");
			System.out.println("8.Exit");
			System.out.println("--------------------------------------------------------------------");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("enter Admin Id");
				String s = sc.next();
				System.out.println("enter password");
				String s1 = sc.next();
				if (s.equals("Admin") && s1.equals("Admin")) {
					addMoney();
				} else {
					System.out.println("You are not eligible");
				}
				break;
			case 2:
				addUse();
				break;
			case 3:
				balance();
				break;
			case 4:
				deposit();
				break;
			case 5:
				withDraw();
				break;
			case 6:
				transfer();
				break;
			case 7:
				System.out.println("enter Admin Id");
				String s2 = sc.next();
				System.out.println("enter password");
				String s3 = sc.next();
				if (s2.equals("Admin") && s3.equals("Admin")) {
					atmBalance();
				} else {
					System.out.println("You are not eligible");
				}
				break;
			case 8:
				System.out.println("Thank you Visit Again💙");
				f = false;
				break;
			}
		}

	}

}
