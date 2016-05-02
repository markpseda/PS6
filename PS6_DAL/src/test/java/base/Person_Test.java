package base;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;
import base.PersonDAL;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

public class Person_Test {
	PersonDomainModel testPerson = new PersonDomainModel();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Addtest() {
		testPerson.setFirstName("Mark");
		testPerson.setLastName("Seda");
		testPerson.setCity("Dover");
		testPerson.setPostalCode(12344);
		testPerson.setStreet("251 Mifflin Road");
		testPerson.setPersonID();
		PersonDAL.addPerson(testPerson);
	}
	@Test
	public void Deletetest() {
		PersonDAL.deletePerson(testPerson.getPersonID());
	}
	@Test
	public void Updatetest() {
		assertTrue(1==1);
	}
	@Test
	public void Gettest() {
		assertTrue(1==1);
	}

}
