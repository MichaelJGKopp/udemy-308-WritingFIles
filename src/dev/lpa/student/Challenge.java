package dev.lpa.student;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenge {
  
  public static void main(String[] args) {
    
    String header = """
      Student Id,Country Code,Enrolled Year,Age,Gender,\
      Experienced,Course Code,Engagement Month,Engagement Year,\
      Engagement Type""";
    
    Course jmc = new Course("JMC", "Java Masterclass");
    Course pymc = new Course("PYC", "Python Masterclass");
    var students = Stream.generate(() -> Student.getRandomStudent(jmc, pymc))
      .limit(1)
       .map(Student::toString)
       .collect(Collectors.joining(",", "[,", "]"));
    
  }
}
