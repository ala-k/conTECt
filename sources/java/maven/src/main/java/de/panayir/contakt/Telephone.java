package de.panayir.contect;

import java.util.Date;

import static org.joda.time.DateTime.now;

/**
 *
 * @author A la K
 * @since 0.1
 * Created: 20120223-091230
 */
public class Telephone {

    private long id;
    private String description;
    private Date date;
    private Date validFrom;
    private Date validTo;
    private String number;



    public Telephone() {
        date = now().toDate();
    }


    public Telephone(final String _number) {
        this();
        number = _number;
    }



    public Date getDate() {
        return date;
    }

    public void setDate(final Date _date) {
        date = _date;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(final String _description) {
        description = _description;
    }



    public long getId() {
        return id;
    }

    public void setId(final long _id) {
        id = _id;
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



    public String getNumber() {
        return number;
    }

    public void setNumber(final String _number) {
        number = _number;
    }



    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Telephone other = (Telephone) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.number == null) ? (other.number != null) : !this.number.equals(other.number)) {
            return false;
        }
        return true;
    }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 11 * hash + (this.number != null ? this.number.hashCode() : 0);
        return hash;
    }

}
