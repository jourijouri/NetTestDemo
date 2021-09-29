package rdv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class PatientAppointment {
	public String patientFirstName; 
	public String patientLastName;
	public String doctorKey; 
	public String dateStr; 
	public LocalDateTime date; 
	
	  
	 
	
	
	
	
	     
public PatientAppointment(String patientFirstName, String patientLastName, String doctorKey, String dateStr) throws Exception {
	super();
	this.patientFirstName = patientFirstName;
	this.patientLastName = patientLastName;
	this.doctorKey = doctorKey;
	
	
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	//String dateInString = "07/06/2013 10:11:59";
	try {
		this.date = LocalDateTime.parse(dateStr, formatter);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("error parsing date");
		throw new Exception("Error: " + e.getMessage());
		
}

}

public String getPatientFirstName() {
	return patientFirstName;
}








public void setPatientFirstName(String patientFirstName) {
	this.patientFirstName = patientFirstName;
}








public String getPatientLastName() {
	return patientLastName;
}








public void setPatientLastName(String patientLastName) {
	this.patientLastName = patientLastName;
}








public String getDoctorKey() {
	return doctorKey;
}








public void setDoctorKey(String doctorKey) {
	this.doctorKey = doctorKey;
}








public LocalDateTime getDate() {
	return date;
}








public void setDate(LocalDateTime date) {
	this.date = date;
}



}
