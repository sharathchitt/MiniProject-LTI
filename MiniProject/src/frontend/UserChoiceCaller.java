package frontend;

import java.util.Scanner;

public class UserChoiceCaller {
	
	public void callMeOnce()
	{
		UserChoiceImplementation implementor = new UserChoiceImplementation();
		
		//Lets load the CSV first !
		System.out.println("Loading data, please wait...");
		implementor.loadData();
		System.out.println("Complaints CSV Data loaded successfully.");
		
		Scanner ip = new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("\n=================Main Menu=================");
			System.out.println("\nWe offer the following services:");
			System.out.println("Press 1 to view all complaints by year");
			System.out.println("Press 2 to view all the complaints by specifying a bank name");
			System.out.println("Press 3 to view all complaints by complaintID");
			System.out.println("Press 4 to view all closed complaints");
			System.out.println("Press 5 to view all complaints that got a timely response");
			System.out.println("Press 6 to add a new complaint");
			System.out.println("Press 0 to Exit");
			System.out.print("Enter your choice...");
			choice=ip.nextInt();
			
			switch (choice) {
			case 0:
				System.out.println("Thank you for using our Portal !! See you soon !");
				System.exit(0);
			case 1:
				System.out.println("Please enter a year..");
				String userYear=ip.next();
				implementor.displayComplaintsByYear(userYear);
				break;
			case 2:
				System.out.println("Please enter a bank name: ");
				String userBank=ip.next();
				implementor.displayComplaintsByBank(userBank);
				break;
			case 3:
				System.out.println("Please enter a Complaint ID: ");
				String userID=ip.next();
				implementor.displayComplaintsByID(userID);
				break;
			case 4: 
				implementor.complaintsClosed();
				break;
			case 5:
				implementor.gotTimelyResponse();
				break;
			case 6:
				implementor.addNewComplaint();
				break;
			default:
				break;
			}
			
		}while(choice>=0);
		
	}

}
