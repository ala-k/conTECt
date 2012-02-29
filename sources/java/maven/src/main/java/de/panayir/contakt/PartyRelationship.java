package de.panayir.contect;

import java.util.Date;

import static org.joda.time.DateTime.now;

/**
 *
 * @author A la K
 * @since 0.1
 * Created: 20120223-103826
 */
public class PartyRelationship {

    private long id;
    private String name;
    private String description;
    private Date date;
    private PartyRole supplierRole;
    private PartyRole clientRole;



    public PartyRelationship() {
        date = now().toDate();
    }

    public PartyRelationship(final String _name) {
        this();
        name = _name;
    }

    public PartyRelationship(final String _name, final PartyRole _supplierRole, final PartyRole _clientRole) {
        this(_name);
        supplierRole = _supplierRole;
        clientRole = _clientRole;
    }



    public long getId() {
        return id;
    }

    public void setId(final long _id) {
        id = _id;
    }



    public String getName() {
        return name;
    }

    public void setName(final String _name) {
        name = _name;
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



    public PartyRole getSupplierRole() {
        return supplierRole;
    }

    public void setSupplierRole(final PartyRole _supplierRole) {
        supplierRole = _supplierRole;
    }



    public PartyRole getClientRole() {
        return clientRole;
    }

    public void setClientRole(final PartyRole _clientRole) {
        clientRole = _clientRole;
    }

}
