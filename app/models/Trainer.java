package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Trainer extends Model
{

  public String password;

  public Trainer(String email, String password)
  {

    this.password = password;
  }


  public boolean checkPassword(String password)
  {
    return this.password.equals(password);
  }
}
