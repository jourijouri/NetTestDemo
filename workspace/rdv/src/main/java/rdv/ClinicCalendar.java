package rdv;

import java.util.ArrayList;
import java.util.List;

public class ClinicCalendar {
	public List<PatientAppointment> rdv;
	public ClinicCalendar() {
		
		this.rdv = new ArrayList<PatientAppointment>();
	
	}
	
	public void addAppointment(String patientFirstName, String patientLastName, String doctorKey, String dateTime) throws Exception {
		
		PatientAppointment patient = new PatientAppointment(patientFirstName, patientLastName, doctorKey, dateTime);
		rdv.add(patient);
	}
	
	
	public List<PatientAppointment>getAppointments(){
	return 	this.rdv;
	}
	public boolean HasAppointment() {
		if(this.rdv.size() != 0) {
			return true;
		}
		else
			return false;
	}
		
		
	}

	
	
	
	

