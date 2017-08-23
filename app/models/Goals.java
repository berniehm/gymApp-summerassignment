
//This class will store clases created by a trainer for the member to aid the achevement of goals
package models;

import play.db.jpa.Model;

import javax.persistence.CascadeType;
import javax.persistence.*;
import java.util.*;

@Entity
public class Goals extends Model {

    public String name, description, date, trainer;

    @OneToMany(cascade = CascadeType.ALL)
    public List<Member> members = new ArrayList<>();

    @ElementCollection
    public Map<Member, String> suites = new HashMap<>();


    public Goals(String name, String description,  String date)
    {
        this.name = name;
        this.description = description;
        this.date=date;

    }
}