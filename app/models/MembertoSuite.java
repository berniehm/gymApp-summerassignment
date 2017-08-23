package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class MembertoSuite extends Model
{
    public Long memberid;
    public String suite;
}
