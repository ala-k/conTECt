package de.panayir.contect;

import java.util.Date;

import static org.joda.time.DateTime.now;

/**
 *
 * @author A la K
 * @since 0.1
 * Created: 20120223-091300
 */
public class Email {

    private long id;
    private String description;
    private Date date;
    private Date validFrom;
    private Date validTo;
    private String email;

    public Email() {
        date = now().toDate();
    }

    public Email(final String _email) {
        this();
        email = _email;
    }



    public long getId() {
        return id;
    }

    public void setId(final long _id) {
        id = _id;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(final String _email) {
        email = _email;
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



    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Email other = (Email) obj;
        if ((this.email == null) ? (other.email != null) : !this.email.equals(other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.email != null ? this.email.hashCode() : 0);
        return hash;
    }

}
