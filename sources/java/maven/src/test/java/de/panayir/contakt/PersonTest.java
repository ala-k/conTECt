package de.panayir.contakt;

import java.util.Date;
import java.util.List;

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.panayir.contect.Address;
import de.panayir.contect.Email;
import de.panayir.contect.Gender;
import de.panayir.contect.Homepage;
import de.panayir.contect.Note;
import de.panayir.contect.PartyRelationship;
import de.panayir.contect.PartyRole;
import de.panayir.contect.Person;
import de.panayir.contect.Telephone;

import static org.joda.time.DateMidnight.parse;
import static org.joda.time.DateTime.now;
import static org.junit.Assert.*;

/**
 *
 * @author A la K
 * @since 0.1
 * Created: 20120223-105350
 */
public class PersonTest {
    
    
    public PersonTest() {
    }



    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }



    /**
     * Test of getDateOfBirth method, of class Person.
     */
    @Test
    public void testGetDateOfBirth() {

        Person doe = new Person("John", "Doe",   Gender.MALE, DateMidnight.parse("1980-01-17").toDate() );
        Person zap = new Person("Adam", "Zapel", Gender.MALE, DateMidnight.parse("1980-02-23").toDate());

        PartyRole colleag1 = new PartyRole("colleague");
        PartyRole colleag2 = new PartyRole("colleague");
        PartyRole fellow1  = new PartyRole("fellow");
        PartyRole fellow2  = new PartyRole("fellow");
        PartyRole employer = new PartyRole("employer");
        PartyRole employee = new PartyRole("employee");

        PartyRelationship rel_coll1  = new PartyRelationship("working colleague",  colleag1, colleag2);
        PartyRelationship rel_fellow = new PartyRelationship("private fellowship", fellow1, fellow2);
        PartyRelationship rel_work   = new PartyRelationship("working employer/employee", employer, employee);


        doe.addRoles(colleag1, fellow1, employer);
        zap.addRoles(colleag2, fellow2, employee);




        doe.setDescription("Only unittesting doe");

        Address adr_doe = new Address("Doe-Street", "123", "45678", "Doe-Town", "Doe-State", "Doe-Country");
        adr_doe.setDescription("Unittesting Doe Address");

        Email eml_doe = new Email("doe@doe-online.com");
        eml_doe.setDate( DateMidnight.parse("2010-07-24").toDate() );
        eml_doe.setDescription("Main email address for doe.");

        Telephone tel_doe = new Telephone("01234567890 ");
        tel_doe.setDate( DateMidnight.parse("2011-01-17").toDate() );
        tel_doe.setDescription("Main telephone number for doe.");

        Homepage hp_doe = new Homepage("http://www.doe-online.com");
        hp_doe.setDescription("Homepage of doe.");

        Note nt_doe1 = new Note("Funny guy.");
        Note nt_doe2 = new Note("Cool guy.");


        doe.addAddress(adr_doe);
        doe.setEmail(eml_doe);
        doe.setTelephone(tel_doe);
        doe.addHomepage(hp_doe);
        doe.addNote(nt_doe1);
        doe.addNote(nt_doe2);




        zap.setDescription("Only unittesting zap");

        Address adr_zap = new Address("Doe-Street", "124", "45679", "Doe-Town", "Doe-State", "Doe-Country");
        adr_zap.setDescription("Unittesting Doe Address");

        Email eml_zap = new Email("zap@zap-online.com");
        eml_zap.setDate( DateMidnight.parse("2010-07-25").toDate() );
        eml_zap.setDescription("Main email address for zap.");

        Telephone tel_zap = new Telephone("01234567891 ");
        tel_zap.setDate( DateMidnight.parse("2011-01-18").toDate() );
        tel_zap.setDescription("Main telephone number for zap.");

        Homepage hp_zap = new Homepage("http://www.zap-online.com");
        hp_zap.setDescription("Homepage of zap.");

        Note nt_zap1 = new Note("More funny than Joe.");
        Note nt_zap2 = new Note("Nice guy.");


        zap.addAddress(adr_zap);
        zap.setEmail(eml_zap);
        zap.setTelephone(tel_zap);
        zap.addHomepage(hp_zap);
        zap.addNote(nt_zap1);
        zap.addNote(nt_zap2);

    }

}
