package de.panayir.contect;

import java.util.Date;

import static org.joda.time.DateTime.now;

/**
 *
 * @author A la K
 * @since 0.1
 * Created: 20120223-091313
 */
public class Address {

    private long id;
    private String description;
    private Date date;
    private Date validFrom;
    private Date validTo;
    private String street;
    private String housenr;
    private String zipcode;
    private String city;
    private String state;
    private String country;



    public Address() {
        date = now().toDate();
    }


    public Address(final String _street, final String _housenr, final String _zipcode, final String _city,
            final String _state, final String _country) {
        this();
        street = _street;
        housenr = _housenr;
        zipcode = _zipcode;
        city = _city;
        state = _state;
        country = _country;
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

    public void setValidTo(final Date valid_To) {
        validTo = valid_To;
    }



    public long getId() {
        return id;
    }

    public void setId(final long _id) {
        id = _id;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(final String _street) {
        street = _street;
    }



    public String getHousenr() {
        return housenr;
    }

    public void setHousenr(final String _housenr) {
        housenr = _housenr;
    }



    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(final String _zipcode) {
        zipcode = _zipcode;
    }



    public String getCity() {
        return city;
    }

    public void setCity(final String _city) {
        city = _city;
    }



    public String getState() {
        return state;
    }

    public void setState(final String _state) {
        state = _state;
    }



    public String getCountry() {
        return country;
    }

    public void setCountry(final String _country) {
        country = _country;
    }



    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Address other = (Address) obj;
        if ((this.street == null) ? (other.street != null) : !this.street.equals(other.street)) {
            return false;
        }
        if ((this.housenr == null) ? (other.housenr != null) : !this.housenr.equals(other.housenr)) {
            return false;
        }
        if ((this.zipcode == null) ? (other.zipcode != null) : !this.zipcode.equals(other.zipcode)) {
            return false;
        }
        if ((this.city == null) ? (other.city != null) : !this.city.equals(other.city)) {
            return false;
        }
        if ((this.country == null) ? (other.country != null) : !this.country.equals(other.country)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (this.street != null ? this.street.hashCode() : 0);
        hash = 37 * hash + (this.housenr != null ? this.housenr.hashCode() : 0);
        hash = 37 * hash + (this.zipcode != null ? this.zipcode.hashCode() : 0);
        hash = 37 * hash + (this.city != null ? this.city.hashCode() : 0);
        hash = 37 * hash + (this.country != null ? this.country.hashCode() : 0);
        return hash;
    }

}
