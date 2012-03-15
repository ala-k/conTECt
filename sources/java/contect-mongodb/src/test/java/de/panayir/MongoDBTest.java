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
import de.panayir.contect.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author geo
 */
public class MongoDBTest {

    private Mongo mongo;
    
    @Before
    public void setup() throws Exception {
        mongo = new Mongo("127.0.0.1", 27017);
    }

    @Test
    public void saveAndReadPerson() throws Exception {
        DBObject person = createPerson();

        DBCollection col = getCol();
        col.save(person);

        Object id = person.get("_id");
        Assert.assertNotNull(id);

        DBObject dbo = col.findOne(new BasicDBObject("_id", id));
        Assert.assertTrue(id.equals(dbo.get("_id")));
    }

    @Test
    public void savePersonWithHomepage() throws Exception {
        DBObject person = createPerson();

        DBObject homepage = BasicDBObjectBuilder.start("url", "http://www.google.com")
                .add("desc", "a search engine to find stuff on the web").get();

        BasicDBList hl = new BasicDBList();
        hl.add(homepage);
        person.put("homepage", hl);

        getCol().save(person);
    }

    private DBObject createPerson() throws Exception {
        int i = (int) Math.random() * 10000;
        int d = (int) Math.random() * 30;

        Person p = new Person("Hank" + i, "Moody" + i, Gender.MALE, DateFormat.getDateInstance().parse(d + ".01.1981"));

        return BasicDBObjectBuilder.start("lastname", p.getName())
                .add("firstname", p.getFirstName()).add("gender", p.getGender().ordinal())
                .add("date", p.getDateOfBirth()).get();
    }

    private DBCollection getCol() {
        return mongo.getDB("test").getCollection("person");
    }
}
