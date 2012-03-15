package de.panayir;

import java.text.DateFormat;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import de.panayir.contect.Gender;
import de.panayir.contect.IMType;
import de.panayir.contect.Person;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author geo
 */
public class MongoDBTest {

    private final static String ID = "_id";
    
    private Mongo mongo;
    
    @Before
    public void setup() throws Exception {
        mongo = new Mongo("127.0.0.1", 27017);
    }
    
    @After
    public void tearDown() {
        mongo.getDB("test").dropDatabase();
    }

    @Test
    public void saveAndReadPerson() throws Exception {
        DBObject person = createPerson();
        getCol().save(person);

        Object id = person.get(ID);
        assertNotNull(id);

        DBObject dbo = getCol().findOne(new BasicDBObject(ID, id));
        assertTrue(id.equals(dbo.get(ID)));
    }

    @Test
    public void savePersonWithHomepage() throws Exception {
        DBObject person = createPerson();
        BasicDBList hl = new BasicDBList();
        hl.add(BasicDBObjectBuilder.start("url", "http://www.google.com")
                .add("desc", "a search engine to find stuff on the web").get());
        hl.add(BasicDBObjectBuilder.start("url", "http://www.mongodb.org")
                .add("desc", "a document database").get());
        person.put("homepages", hl);

        getCol().save(person);

        DBObject dbo = getCol().findOne(new BasicDBObject(ID, person.get(ID)));
        BasicDBList l = (BasicDBList) dbo.get("homepages");
        DBObject g = (DBObject) l.get("0");
        DBObject m = (DBObject) l.get("1");

        assertEquals(2, l.size());
        assertEquals("http://www.google.com", g.get("url"));
        assertEquals("http://www.mongodb.org", m.get("url"));
    }
    
    @Test
    public void saveWithIM() throws Exception {
        DBObject person = createPerson();
        BasicDBList hl = new BasicDBList();
        hl.add(BasicDBObjectBuilder.start("username", "myAIM")
                .add("desc", "simple messaging")
                .add("protocol", IMType.AIM.name()).get());
        hl.add(BasicDBObjectBuilder.start("username", "myMSN")
                .add("desc", "a document database")
                .add("protocol", IMType.MSN.name()).get());
        person.put("instantmsgs", hl);

        getCol().save(person);

        DBObject dbo = getCol().findOne(new BasicDBObject(ID, person.get(ID)));
        BasicDBList l = (BasicDBList) dbo.get("instantmsgs");
        DBObject g = (DBObject) l.get("0");
        DBObject m = (DBObject) l.get("1");

        assertEquals(2, l.size());
        assertEquals(IMType.AIM.name(), g.get("protocol"));
        assertEquals(IMType.MSN.name(), m.get("protocol"));
    }

    private DBObject createPerson() throws Exception {
        int i = (int) (Math.random() * 10000);
        int d = (int) (Math.random() * 30);

        Person p = new Person("Hank" + i, "Moody" + i, Gender.MALE, DateFormat.getDateInstance().parse(d + ".01.1981"));

        return BasicDBObjectBuilder.start("lastname", p.getName())
                .add("firstname", p.getFirstName()).add("gender", p.getGender().ordinal())
                .add("date", p.getDateOfBirth()).get();
    }

    private DBCollection getCol() {
        return mongo.getDB("test").getCollection("person");
    }
}
