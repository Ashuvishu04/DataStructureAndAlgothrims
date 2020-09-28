package InterviewQuestions;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import sun.jvm.hotspot.utilities.IntArray;

public class topKWords {

  public static void main(String[] args) {
    String[] input = {"i", "love", "leetcode", "i", "love", "coding"};
    topKFrequent(input,2);
  }

  public static List<String> topKFrequent(String[] words, int k) {
    Map<String, Integer> frequency = new HashMap<>();

    for(String word : words){
      frequency.put(word,frequency.getOrDefault(word,0)+1);
    }

    PriorityQueue<String> priorityQueue = new PriorityQueue<>(new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        int f1 = frequency.get(o1);
        int f2 = frequency.get(o2);

        if(f1==f2) return o2.compareTo(o1);
        return f1 - f2;
      }
    });

    for (Map.Entry<String,Integer> entry : frequency.entrySet()){
      priorityQueue.add(entry.getKey());
      if(priorityQueue.size()>k) priorityQueue.poll();
    }

    List<String> res = new LinkedList<>();
    while (!priorityQueue.isEmpty()) res.add(priorityQueue.poll());

    Collections.reverse(res);

    return res;
  }

  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer,Integer> frequency = new HashMap<Integer,Integer>();

    for(Integer num : nums){
      frequency.put(num,frequency.getOrDefault(num,0)+1);
    }

    PriorityQueue<Integer> pq = new PriorityQueue(new Comparator<Integer>(){
          @Override
          public int compare(Integer a,Integer b){
            int f1 =  frequency.get(a);
            int f2 =  frequency.get(b);

            if(f1==f2) return b-a;
            return f1-f2;
          }
        });

    for (Map.Entry<Integer,Integer> entry : frequency.entrySet()){
      pq.add(entry.getKey());
      if(pq.size()>k) pq.poll();
    }

    List<Integer> res = new LinkedList<>();
    while (!pq.isEmpty()) res.add(pq.poll());

    Collections.reverse(res);

    return res.stream().mapToInt(m->m.intValue()).toArray();
  }
}


