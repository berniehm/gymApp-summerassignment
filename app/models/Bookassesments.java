package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.Lob;
import java.util.Date;

@Entity
public class Assessment extends Model
{
    public double weight;
    public double chest;
    public double thigh;
    public double upperarm;
    public double waist;
    public double hips;
    public boolean trend;

    @Lob
    public String comment;
    public Date date;