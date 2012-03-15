package de.panayir.contect;

import java.util.Date;

import static org.joda.time.DateTime.now;

/**
 *
 * @author A la K
 * @since 0.1
 * Created: 20120223-091242
 */
public class Instantmessaging {

    private long id;
    private Date date;
    private Date validFrom;
    private Date validTo;
    private String description;
    private String username;
    private String alias;
    private IMType protocol;



    public Instantmessaging() {
        date = now().toDate();
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



    public String getUsername() {
        return username;
    }

    public void setUsername(final String _username) {
        username = _username;
    }



    public String getAlias() {
        return alias;
    }

    public void setAlias(String _alias) {
        alias = _alias;
    }



    public IMType getProtocol() {
        return protocol;
    }

    public void setProtocol(IMType _protocol) {
        protocol = _protocol;
    }



    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Instantmessaging other = (Instantmessaging) obj;
        if (this.protocol != other.protocol) {
            return false;
        }
        if ((this.username == null) ? (other.username != null) : !this.username.equals(other.username)) {
            return false;
        }
        return true;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + (this.username != null ? this.username.hashCode() : 0);
        hash = 19 * hash + (this.protocol != null ? this.protocol.hashCode() : 0);
        return hash;
    }

}
