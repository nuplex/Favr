package co.favrapp.favr.favr.backend;

import java.util.ArrayList;

/**
 * Created by chijioke on 8/21/15.
 */
public class User {

    //nothing here is final

    /**
     * Pertinent Facebook Data, such as first name, last name, email
     */
    public String firstName;
    private String lastName;
    public String username;
    public String email;

    public String phoneNumber; //this might be an object rather than a string

    private boolean isVerified; //phone number verified

    private int favrsPickedUp;
    private int favrsDropped;
    private int favrsCanceled;
    private int favrsCompleted;
    private int favrsCreated;

    private ArrayList<Favr>


}
