package rdv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.format.DateTimeFormatter;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
@DisplayName("CALENDRIER DOIT")
class CalendarShould {
	
	public ClinicCalendar c1;
	@BeforeEach
public void init() {
		//creer calendrier (instancier)
	 c1 = new ClinicCalendar();
}
	@Test
	@Tag("aa")
	@DisplayName("la saisie des RDV")
	public void allowEntryOfAnAppointment() throws Exception {
		//valider la rentree des rdv
		c1.addAppointment("rania", "joudi", "12", "07/06/2013 10:11:59");
		List<PatientAppointment> mytestList =	c1.getAppointments();
		assertAll(
	() ->	assertNotNull(mytestList),
	() ->	assertEquals(1,mytestList.size()),
	() -> assertEquals("rania",mytestList.get(0).patientFirstName),
	() -> assertEquals("12", mytestList.get(0).doctorKey)
	);
	}
	
	@Test
	@DisplayName("listage des données RDV")
	public void ListAppointments() throws Exception {
		
	
		//valider la lecture des rdv
	c1.addAppointment("rania", "joudi", "15", "07/06/2013 10:11:59");
		c1.addAppointment("jjj", "jkkdi", "12", "07/06/2013 10:11:59");
	PatientAppointment EntredAppt = c1.rdv.get(0);
		
	List<PatientAppointment> mytestList =	c1.getAppointments();
		assertEquals(2,mytestList.size());
	assertEquals("rania", c1.rdv.get(0).patientFirstName);
		assertEquals("12", c1.rdv.get(1).doctorKey);
	assertSame("joudi",EntredAppt.getPatientLastName());
		
}
	
	@Test
	@Disabled
	@DisplayName("Format Date")
		public void FormatDateTimePattern() throws Exception{
			
			c1.addAppointment("rania", "joudi", "15", "07/06/2013 10:11:59");
			PatientAppointment EntredAppt = c1.rdv.get(0);
			//valider l'entité date
				assertEquals("07/06/2013 10:11:59", EntredAppt.getDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
	//	assertEquals("07/06/2013 10:11:59", EntredAppt.date);
		
		}
	@Nested
	@DisplayName("Liste des RDV ")
	class listStatus{
		
		@Test
		@DisplayName("est vide")
		public void returnFalseIfNoAppointment(){
			//valider lorsque la liste calendrier est vide
			assertFalse(c1.HasAppointment());
		}
		@Test
		@DisplayName("contient un élèment au moins")
		public void returnTrueIfHasAppointment() throws Exception{
			//valider lorsque la liste calendrier contient au moins un objet
			c1.addAppointment("rania", "joudi", "15", "07/06/2013 10:11:59");
			assertTrue(c1.HasAppointment());
		}
	}
	
}
