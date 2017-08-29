//This class will store  booked assesments
//Trainers	can	perform	CRUD	on
        //assessment	bookings	such	as:
       // • view	them,
      //  • cancel	them,
       // • update	the	assessment	details
     //   associated	with	these	bookings.
     //   • schedule	a	future	assessment
      //  with	a	member.
        package models;

import play.db.jpa.Model;

import javax.persistence.CascadeType;
import javax.persistence.*;
import java.util.*;

@Entity
public class AssesmentBookings extends Model {

    public String name, description, duration, time, date;

    @OneToMany(cascade = CascadeType.ALL)
    public List<Member> members = new ArrayList<>();

    @ElementCollection
    public Map<Member, String> suites = new HashMap<>();


}
