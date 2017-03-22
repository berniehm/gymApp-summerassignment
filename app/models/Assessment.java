package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.Lob;

@Entity
public class Assessment extends Model
{
  public double weight;
  public double chest;
  public double thigh;
  public double upperarm;
  public double waist;
  public double hips;

  @Lob
  public String comment;

  public Assessment(double weight, double chest, double thigh, double upperarm, double waist, double hips)
  {
    this.weight = weight;
    this.chest = chest;
    this.thigh = thigh;
    this.upperarm = upperarm;
    this.waist = waist;
    this.hips = hips;
  }
}
