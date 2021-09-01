package backend;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ComplaintsCSVLoader {
	
	Map<String, ComplaintFields> complaintsDB = new HashMap<String, ComplaintFields>();
	
	public void loadCSV() {
		
		String filePath="H:\\LTInfotech\\Java_Full_Stack_Training\\Mini_Project\\complaints.csv";
		
		String line="";
		
		try {
		
			BufferedReader br = new BufferedReader(new FileReader(filePath));
		
			while ((line=br.readLine())!=null) {
				
				String[] entry = line.split(",");
				ComplaintFields compField = new ComplaintFields();
				compField.setDateReceived(entry[0]);
				compField.setProduct(entry[1]);
				compField.setSubProduct(entry[2]);
				compField.setIssue(entry[3]);
				compField.setSubIssue(entry[4]);
				compField.setCompany(entry[5]);
				compField.setState(entry[6]);
				compField.setZipCode(entry[7]);
				compField.setSubmittedVia(entry[8]);
				compField.setDateSentToCompany(entry[9]);
				compField.setCompanyResponse(entry[10]);
				compField.setTimelyResponse(entry[11]);
				compField.setConsumerDisputed(entry[12]);
				compField.setComplaintId(entry[13]);
				//Let us take the complaintId field as key for storing in the HashMap.
				
				complaintsDB.put(entry[13], compField);
				
			}
			br.close();
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public Map<String, ComplaintFields> getComplaints()
	{
		return complaintsDB;
	}
		
	
	
	
	

}
