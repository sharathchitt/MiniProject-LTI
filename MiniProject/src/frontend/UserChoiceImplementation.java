package frontend;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.opencsv.CSVWriter;

import backend.ComplaintFields;
import backend.ComplaintsCSVLoader;

public class UserChoiceImplementation {
	
	ComplaintsCSVLoader csvLoad = new ComplaintsCSVLoader();
	
	Map<String, ComplaintFields> complaintsData = new HashMap<String, ComplaintFields>();
	
	public void loadData()
	{
		csvLoad.loadCSV();
		complaintsData = csvLoad.getComplaints();
	}

	
	 public void displayComplaintsByYear(String year) {
		 
		 Set<Entry<String, ComplaintFields>> entries = complaintsData.entrySet();
		 Iterator<Entry<String, ComplaintFields>> items = entries.iterator();
		 
		 while(items.hasNext()) {
			 
			 Entry<String, ComplaintFields> item = items.next();
			 if(item.getValue().getDateReceived().contains(year))
			 {
				 System.out.println("Complaint ID: "+item.getKey()+" "+"Issue: "+item.getValue().getIssue()+" "+"----Sub-Issue(if any): "+item.getValue().getSubIssue());;
			 }
			 else
				 System.out.println("Please enter a valid year.");
			 
		 }
	 }
	 
	 public void displayComplaintsByBank(String bankName)
	 {
		 Set<Entry<String, ComplaintFields>> entries = complaintsData.entrySet();
		 Iterator<Entry<String, ComplaintFields>> items = entries.iterator();
		 
		 while(items.hasNext())
		 {
			 Entry<String, ComplaintFields> item = items.next();
			 if(item.getValue().getCompany().contains(bankName))
			 	System.out.println("Complaint ID: "+item.getKey()+" "+"Issue: "+item.getValue().getIssue()+" "+"----Sub-Issue(if any): "+item.getValue().getSubIssue());
			 
		 	else
		 		System.out.println("Enter a valid bank name.");
			 		
		 }
	 }
	 
	 public void displayComplaintsByID(String ID)
	 {
		 Set<Entry<String, ComplaintFields>> entries = complaintsData.entrySet();
		 Iterator<Entry<String, ComplaintFields>> items = entries.iterator();

		 while(items.hasNext())
		 {
			 Entry<String, ComplaintFields> item = items.next();
			 
			 if(item.getValue().getComplaintId().contains(ID)) {
				 System.out.println("Complaint ID: "+item.getKey()+" "+"Issue: "+item.getValue().getIssue()+" "+"----Sub-Issue(if any): "+item.getValue().getSubIssue());

		 }

		 }
	 }
	 
	 public void complaintsClosed()
	 {
		 Set<Entry<String, ComplaintFields>> entries = complaintsData.entrySet();
		 Iterator<Entry<String, ComplaintFields>> items = entries.iterator();
		 while(items.hasNext())
		 {
			 Entry<String, ComplaintFields> item = items.next();
			 String response=item.getValue().getCompanyResponse();
			 if(response.equalsIgnoreCase("Closed") || response.equalsIgnoreCase("Closed with explanation"))
				 System.out.println("Complaint Recevied date: "+item.getValue().getDateReceived()+" "+"Complaint ID: "+item.getKey()+" "+"Issue: "+item.getValue().getIssue()+" "+"----Sub-Issue(if any): "+item.getValue().getSubIssue());

	
		 }
		 
	 }
	 
	 public void gotTimelyResponse()
	 {
		 Set<Entry<String, ComplaintFields>> entries = complaintsData.entrySet();
		 Iterator<Entry<String, ComplaintFields>> items = entries.iterator();
		 while(items.hasNext())
		 {
			 Entry<String, ComplaintFields> item = items.next();
			 String response=item.getValue().getTimelyResponse();
			 if(response.equalsIgnoreCase("Yes"))
				 System.out.println("Complaint Recevied date: "+item.getValue().getDateReceived()+" "+"Complaint ID: "+item.getKey()+" "+"Issue: "+item.getValue().getIssue()+" "+"----Sub-Issue(if any): "+item.getValue().getSubIssue());

		 
		 }
	 }

	 public void addNewComplaint()
	 {
		 try {
			 String path="H:\\LTInfotech\\Java_Full_Stack_Training\\Mini_Project\\complaints.csv";

			 FileWriter fw = new FileWriter(path, true);
			 BufferedWriter bw = new BufferedWriter(fw);
			 PrintWriter printWriter = new PrintWriter(bw);
			
			 ComplaintFields userObj = new ComplaintFields("10/25/2021","Credit Card", "NA", "Credit limit not changed", "NA", "MasterCard", "IN", "600001", "AndriodAPP", "11/25/2021", "Limit was set", "Yes", "No", "145623");
			
			 StringBuilder sb = new StringBuilder();
						 
			 //sb.append("\n");
			 sb.append(userObj.getDateReceived());
			 sb.append(",");
			 sb.append(userObj.getProduct());
			 sb.append(",");
			 sb.append(userObj.getSubProduct());
			 sb.append(",");
			 sb.append(userObj.getIssue());
			 sb.append(",");
			 sb.append(userObj.getSubIssue());
			 sb.append(",");
			 sb.append(userObj.getCompany());
			 sb.append(",");
			 sb.append(userObj.getState());
			 sb.append(",");
			 sb.append(userObj.getZipCode());
			 sb.append(",");
			 sb.append(userObj.getSubmittedVia());
			 sb.append(",");
			 sb.append(userObj.getDateSentToCompany());
			 sb.append(",");
			 sb.append(userObj.getCompanyResponse());
			 sb.append(",");
			 sb.append(userObj.getTimelyResponse());
			 sb.append(",");
			 sb.append(userObj.getConsumerDisputed());
			 sb.append(",");
			 sb.append(userObj.getComplaintId());
			 sb.append("\n");

			 printWriter.println(sb);
			 
			 System.out.println("\n----Write Successfull !----");
			 printWriter.close();

			 
		 }catch(IOException e)
		 {
			 e.printStackTrace();
		 }
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
