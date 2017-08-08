
        package models;

                import play.db.jpa.Model;

                import javax.persistence.Entity;

          @Entity
        public  class Scheduledclass extends Model {
                  String name;
                  String duration;
                  String capacity;
                  String difficulty;
                  String time;
                  String date;
                  String trainer;
                  String suite;



                  public Scheduledclass(String name, String duration, String capacity , String difficulty , String time,String date,String trainer,String suite)
                  {
                this.name = name;
                this.duration = duration;
                this.capacity = capacity;
                this.difficulty = difficulty;
                this.time = time;
                this.date = date;
                this.suite = suite;
                this.trainer = trainer;
                }
                }