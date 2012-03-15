package de.panayir.contect;

import java.io.File;
import java.util.Date;

import static org.joda.time.DateTime.now;

/**
 *
 * @author A la K
 * @since 0.1
 * Created: 20120223-091307
 */
public class Image {

    private long id;
    private String description;
    private Date date;
    private File file;



    public Image() {
        date = now().toDate();
    }



    public long getId() {
        return id;
    }

    public void setId(final long _id) {
        id = _id;
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



    public File getFile() {
        return file;
    }

    public void setFile(final File _file) {
        file = _file;
    }



    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Image other = (Image) obj;
        if (this.file != other.file && (this.file == null || !this.file.equals(other.file))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (this.file != null ? this.file.hashCode() : 0);
        return hash;
    }

}
