package controllers;

import models.Assessment;
import play.Logger;
import play.mvc.Controller;

import java.util.List;

public class Dashboard extends Controller
{
  public static void index()
  {
    Logger.info("Rendering Dashboard");
    List<Assessment> assessments = Assessment.findAll();
    render("dashboard.html", assessments);
  }
}
