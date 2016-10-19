package javap2.week1;


public class Tester 
{
  public static void main (String[] args) 
  {
    Person p = new Person("Clarissa");
    System.out.println(p);
    Person s = new Student("Jose",12345);
    System.out.println(s);
    String s1 = new String("String 1");
    String s2 = new String("String 1");
    if (s1 == s2) {
        System.out.println("Equal");
    }
    else {
        System.out.println("Not equal");
    }
    String text = "Practice, practice, practice!";
    System.out.println(text.indexOf("prac"));
    text = "Hurray!!#! It's Friday! finally...";
    String[] words = text.split("!+");
    System.out.println(words[2]);
    String s_ = "Hello";
    s_.concat(" World!");
    System.out.println(s_);
  }
}