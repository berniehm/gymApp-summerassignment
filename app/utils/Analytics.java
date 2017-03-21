package utils;

import models.Assessment;
import models.Member;

public class Analytics
{
  public static double calculateBMI(Member member, Assessment assessment)
  {
    if (member.height <= 0)
      return 0;
    else
      return Conversion.round((assessment.weight / (member.height * member.height)), 2);
  }
}
