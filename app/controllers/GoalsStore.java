
        package controllers;

                import models.Assessment;
                import models.Member;
                import play.Logger;
                import play.mvc.Controller;
                import utils.Analytics;
                import utils.MemberStats;

                import java.util.Collections;
                import java.util.List;

public class GoalsStore extends Controller
{
    public static void index()
    {
        List<Member> members = Member.findAll();
        Logger.info("Rendering Trainer Dashboard");
        render("trainerdashboard.html", members);
    }