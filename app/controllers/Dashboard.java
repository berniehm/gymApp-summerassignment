package controllers;

import models.Assessment;
import models.Member;
import play.Logger;
import play.mvc.Controller;
import utils.Analytics;

import java.util.List;

public class Dashboard extends Controller
{
  public static void index()
  {
    Logger.info("Rendering Dashboard");
    Member member = Member.findByEmail("homer@simpson.com");
    List<Assessment> assessments = Assessment.findAll();
    double bmi = 0;
    if (assessments.size() > 0) {
      Assessment assessment = assessments.get(assessments.size() - 1);
      bmi = Analytics.calculateBMI(member, assessment);
    }
    render("dashboard.html", member, assessments, bmi);
  }

  public static void addAssessment(double weight, double chest, double thigh, double upperarm, double waist, double hips)
  {
    Logger.info("Creating Assessment");
    Member member = Member.findByEmail("homer@simpson.com");
    Assessment assessment = new Assessment(weight, chest, thigh, upperarm, waist, hips);
    member.assessments.add(assessment);
    member.save();
    redirect("/dashboard");
  }
}
