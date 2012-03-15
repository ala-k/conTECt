package de.panayir.contect;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.joda.time.DateTime.now;

/**
 *
 * @author A la K
 * @since 0.1
 * Created: 20120223-091135
 */
public abstract class Party {

    private long id;
    private Date date;
    private String description;
    private String name;
    private List<PartyRole> roles;



    public Party() {
        date = now().toDate();
        prepareRoles();
    }


    public Party(final String _name) {
        this();
        name = _name;
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



    public List<PartyRole> getRoles() {
        return roles;
    }

    public void setRoles(final List<PartyRole> _roles) {
        if ( null != _roles ) {
            roles = _roles;
        }
    }

    public void addRole(final PartyRole _role) {
        if ( null != _role ) {
            if ( ! roles.contains(_role) ) {
                roles.add(_role);
            }
        }
    }

    public boolean removeRole(final PartyRole _role) {
        if ( null != _role ) {
            return roles.remove(_role);
        }
        return false;
    }

    public void addRoles(final PartyRole... _roles) {
        for ( final PartyRole role : _roles ) {
            addRole(role);
        }
    }



    private void prepareRoles() {
        if ( null == roles ) {
            roles = new ArrayList<PartyRole>();
        }
    }

}
