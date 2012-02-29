package de.panayir.contect;

import java.util.Date;

import static org.joda.time.DateTime.now;

/**
 *
 * @author A la K
 * @since 0.1
 * Created: 20120223-091204
 */
public class Homepage {

    private long id;
    private String description;
    private Date date;
    private Date validFrom;
    private Date validTo;
    private String url;



    public Homepage() {
        date = now().toDate();
    }


    public Homepage(final String _url) {
        this();
        url = _url;
    }



    public long getId() {
        return id;
    }

    public void setId(final long _id) {
        id = _id;
    }



    public String getUrl() {
        return url;
    }

    public void setUrl(final String _url) {
        url = _url;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(final String _description) {
        description = _description;
    }



    public Date getDate() {
        return date;
    }

    public void setDate(final Date _date) {
        date = _date;
    }



    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(final Date _validFrom) {
        validFrom = _validFrom;
    }



    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(final Date _validTo) {
        validTo = _validTo;
    }


}
