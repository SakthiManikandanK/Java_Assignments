import java.util.*;

public class StockPrice {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("KFC",500);
        map.put("MC",175);
        map.put("Pizza Hut",250);
        map.put("Hot Chick",300);
        map.put("Thalapakatti",600);
        map.put("A2b",150);
        int sum=0;
        int count=0;
        int max=Collections.max(map.values());
        List<String> keys = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()==max) {
                keys.add(entry.getKey());
            }
            sum=sum+ entry.getValue();
            count++;
        }
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while(it.hasNext()) {
            if(it.next().getValue() <  200) {
                it.remove();
            }
        }
        int Avg=sum/count;

        System.out.println("Company with max stock price : "+keys);
        System.out.println("Average of company stock price : "+Avg);
        System.out.println("Map after Removing lower stock price below 200  : " + map);

    }
}
