package pointofsales.entities;

import java.util.Date;
import java.util.List;

public class User {
    private Address address;

    private String emailAddress;

    private Date endDate;

    private String firstName;

    private String id;

    private Boolean isActive;

    private String lastName;

    private String loginCode;

    private List<Note> notes;

    private List<PhoneNumber> phoneNumbers;

    private Role role;

    private Date startDate;
}
