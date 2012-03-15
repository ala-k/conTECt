package de.panayir.contect;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author A la K
 * @since 0.1
 * Created: 20120223-091147
 */
public class Person extends Party {
    private enum Type {
        EMAILS,
        TELEPHONES,
        ADDRESSES,
        NOTES,
        IMAGES,
        HOMEPAGES,
        INST_MSG;
    }

    private String title;
    private String firstName;
    private String middleName;
    private String nickName;
    private Date dateOfBirth;
    private Gender gender;
    private Image photo;
    private Telephone telephone;
    private Email email;
    private Address address;
    private List<Homepage> homepages;
    private List<Note> notes;
    private List<Telephone> telephones;
    private List<Instantmessaging> instantmessages;
    private List<Email> emails;
    private List<Address> addresses;
    private List<Image> images;



    public Person() {
        super();
        prepareContainer(Type.ADDRESSES);
        prepareContainer(Type.EMAILS);
        prepareContainer(Type.HOMEPAGES);
        prepareContainer(Type.IMAGES);
        prepareContainer(Type.NOTES);
        prepareContainer(Type.TELEPHONES);
        prepareContainer(Type.INST_MSG);
    }


    public Person(final String _firstName, final String _name, final Gender _gender, final Date _dateOfBirth) {
        this();
        setName(_name);
        firstName   = _firstName;
        dateOfBirth = _dateOfBirth;
        gender      = _gender;
    }



    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(final Date _dateOfBirth) {
        dateOfBirth = _dateOfBirth;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String _firstName) {
        firstName = _firstName;
    }



    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(final String _middleName) {
        middleName = _middleName;
    }



    public String getNickName() {
        return nickName;
    }

    public void setNickName(final String _nickName) {
        nickName = _nickName;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(final String _title) {
        title = _title;
    }



    public Gender getGender() {
        return gender;
    }

    public void setGender(final Gender _gender) {
        gender = _gender;
    }



    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address _address) {
        if ( null != _address ) {
            address = _address;
        }
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(final List<Address> _addresses) {
        if ( null != _addresses ) {
            addresses = _addresses;
        }
    }

    public void addAddress(final Address _address) {
        if ( null != _address ) {
            if ( ! addresses.contains(_address) ) {
                addresses.add(_address);
            }
        }
    }

    public boolean removeAddress(final Address _address) {
        if ( null != _address ) {
            return addresses.remove(_address);
        }
        return false;
    }



    public Email getEmail() {
        return email;
    }

    public void setEmail(final Email _email) {
        email = _email;
        if ( ! emails.contains(_email) ) {
            emails.add(_email);
        }
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(final List<Email> _emails) {
        if ( null != _emails ) {
            emails = _emails;
        }
    }

    public void addEmail(final Email _email) {
        if ( null != _email ) {
            if ( ! emails.contains(_email) ) {
                emails.add(_email);
            }
        }
    }

    public boolean removeEmail(final Email _email) {
        if ( null != _email ) {
            return emails.remove(_email);
        }
        return false;
    }



    public List<Homepage> getHomepages() {
        return homepages;
    }

    public void setHomepages(final List<Homepage> _homepages) {
        if ( null != _homepages ) {
            homepages = _homepages;
        }
    }

    public void addHomepage(final Homepage _homepage) {
        if ( null != _homepage ) {
            if ( ! homepages.contains(_homepage) ) {
                homepages.add(_homepage);
            }
        }
    }

    public boolean removeHomepage(final Homepage _homepage) {
        if ( null != _homepage ) {
            return homepages.remove(_homepage);
        }
        return false;
    }



    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(final Image _photo) {
        photo = _photo;
        if ( ! images.contains(_photo) ) {
            images.add(_photo);
        }
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(final List<Image> _images) {
        if ( null != _images ) {
            images = _images;
        }
    }

    public void addImage(final Image _image) {
        if ( null != _image ) {
            if ( ! images.contains(_image) ) {
                images.add(_image);
            }
        }
    }

    public boolean removeImage(final Image _image) {
        if ( null != _image ) {
            return images.remove(_image);
        }
        return false;
    }



    public List<Instantmessaging> getInstantmessages() {
        return instantmessages;
    }

    public void setInstantmessages(final List<Instantmessaging> _instantmessages) {
        if ( null != _instantmessages ) {
            instantmessages = _instantmessages;
        }
    }

    public void addInstantmessaging(final Instantmessaging _instantmessage) {
        if ( null != _instantmessage ) {
            if ( ! instantmessages.contains(_instantmessage) ) {
                instantmessages.add(_instantmessage);
            }
        }
    }

    public boolean removeInstantmessaging(final Instantmessaging _instantmessage) {
        if ( null != _instantmessage ) {
            return instantmessages.remove(_instantmessage);
        }
        return false;
    }



    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(final List<Note> _notes) {
        if ( null != _notes ) {
            notes = _notes;
        }
    }

    public void addNote(final Note _note) {
        if ( null != _note ) {
            if ( ! notes.contains(_note) ) {
                notes.add(_note);
            }
        }
    }

    public boolean removeNote(final Note _note) {
        if ( null != _note ) {
            return notes.remove(_note);
        }
        return false;
    }



    public Telephone getTelephone() {
        return telephone;
    }

    public void setTelephone(final Telephone _telephone) {
        telephone = _telephone;
        if ( ! telephones.contains(_telephone) ) {
            telephones.add(_telephone);
        }
    }

    public List<Telephone> getTelephones() {
        return telephones;
    }

    public void setTelephones(final List<Telephone> _telephones) {
        if ( null != _telephones ) {
            telephones = _telephones;
        }
    }

    public void addTelephone(final Telephone _telephone) {
        if ( null != _telephone ) {
            if ( ! telephones.contains(_telephone) ) {
                telephones.add(_telephone);
            }
        }
    }

    public boolean removeTelephone(final Telephone _telephone) {
        if ( null != _telephone ) {
            return telephones.remove(_telephone);
        }
        return false;
    }



    private void prepareContainer(final Type _type) {
        switch (_type) {
            case TELEPHONES: if ( null == telephones )      telephones      = new ArrayList<Telephone>();        break;
            case EMAILS:     if ( null == emails )          emails          = new ArrayList<Email>();            break;
            case NOTES:      if ( null == notes )           notes           = new ArrayList<Note>();             break;
            case ADDRESSES:  if ( null == addresses )       addresses       = new ArrayList<Address>();          break;
            case IMAGES:     if ( null == images )          images          = new ArrayList<Image>();            break;
            case HOMEPAGES:  if ( null == homepages )       homepages       = new ArrayList<Homepage>();         break;
            case INST_MSG:   if ( null == instantmessages ) instantmessages = new ArrayList<Instantmessaging>(); break;
        }
    }

}
