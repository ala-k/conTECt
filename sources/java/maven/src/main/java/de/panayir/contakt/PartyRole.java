package de.panayir.contect;

/**
 *
 * @author A la K
 * @since 0.1
 * Created: 20120223-103822
 */
public class PartyRole {

    private long id;
    private String name;
    private String description;
    private Party party;



    public PartyRole() {
    }


    public PartyRole(final String _name) {
        this();
        name = prepareName(_name);

    }


    private String prepareName(final String name) {
        if ( null != name ) {
            return name.trim().toLowerCase();
        }
        return null;
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
        name = prepareName(_name);
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(final String _description) {
        description = _description;
    }



    public Party getParty() {
        return party;
    }

    public void setParty(final Party _party) {
        party = _party;
    }



    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PartyRole other = (PartyRole) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 89 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

}
