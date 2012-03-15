package de.panayir.contect;

import java.util.Date;

import static org.joda.time.DateTime.now;

/**
 *
 * @author A la K
 * @since 0.1
 * Created: 20120223-091214
 */
public class Note {

    private long id;
    private Date date;
    private String text;



    public Note() {
        date = now().toDate();
    }


    public Note(final String _text) {
        this();
        text = _text;
    }



    public Date getDate() {
        return date;
    }

    public void setDate(final Date _date) {
        date = _date;
    }



    public long getId() {
        return id;
    }

    public void setId(final long _id) {
        id = _id;
    }



    public String getText() {
        return text;
    }

    public void setText(final String _text) {
        text = _text;
    }

}
