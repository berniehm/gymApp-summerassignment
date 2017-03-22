package utils;

import models.Assessment;
import models.Member;
import play.Logger;

import java.util.List;

public class Analytics
{
  public static MemberStats generateMemberStats(Member member)
  {
    MemberStats stats = new MemberStats();

    double weight = member.startingweight;
    List<Assessment> assessments = member.assessments;
    if (assessments.size() > 0) {
      Assessment assessment = assessments.get(assessments.size() - 1);
      weight = assessment.weight;
    }
    stats.bmi = calculateBMI(member, weight);
    stats.bmiCategory = determineBMICategory(stats.bmi);
    return stats;
  }

  public static double calculateBMI(Member member, double weight)
  {
    if (member.height <= 0)
      return 0;
    else
      return Conversion.round((weight / (member.height * member.height)), 2);
  }

  public static String determineBMICategory(double bmiValue)
  {
    for (BMI bmi : BMI.values()) {
      if (bmi.bmiCategory(bmiValue)) {
        return bmi.toString();
      }
    }
    return "No category available.";
  }
}
