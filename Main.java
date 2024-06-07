import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("SAT DATA!!!!");

    // create data structure to store all total scores
    ArrayList<Integer> totalScore = new ArrayList<Integer>();
    
    try{
      Scanner s = new Scanner(new File("total.txt"));

      while(s.hasNext()){
        int score = Integer.parseInt(s.nextLine());
        totalScore.add(score);
      }
      s.close();
    }

    catch(Exception e){
      System.out.println("file not found");
    }
    int total=0;
    int count=0;
    for (int i: totalScore){
      total+=i;
      count++;
    }
    double average= (double)total/count;
    // make sure all data entered the ArrayList
    System.out.println(average);
    System.out.println(totalScore);
    System.out.println(totalScore.size());
    int min=totalScore.get(0);
    int max=totalScore.get(0);
 for (int k:totalScore){
   min=Math.min(min,k);
   max=Math.max(max,k);
 }
    System.out.println(min);
    System.out.println(max);
  }

}
