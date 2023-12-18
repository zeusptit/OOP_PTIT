
import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Rain> rain = new ArrayList<>();
        Map<String, Rain> map = new TreeMap<>();
        int idx = 1;
        while(n-- != 0){
            Rain temp = new Rain(idx++, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            if(!map.containsKey(temp.getStationLocation())){
                map.put(temp.getStationLocation(), temp);
            }else{
                temp.setStationID(map.get(temp.getStationLocation()).getStationID());
                temp.setRainTime(map.get(temp.getStationLocation()).getRainTime() + temp.getRainTime());
                temp.setRainRecord(map.get(temp.getStationLocation()).getRainRecord() + temp.getRainRecord());
                map.put(temp.getStationLocation(), temp);
            }
        }
        for(String key : map.keySet()){
            Rain x = map.get(key);
            rain.add(x);
        }
        Collections.sort(rain);
        for(Rain x : rain){
            System.out.println(x);
        }
    }
}
/*
10
Dong Anh
07:30
08:00
60
Cau Giay
07:45
08:12
50
Soc Son
08:00
09:15
78
Dong Anh
18:50
20:00
88
Cau Giay
19:01
20:00
77
Soc Son
19:06
20:21
66
Dong Anh
21:00
21:40
49
Cau Giay
21:50
22:20
68
Dong Anh
22:15
23:45
30
Cau Giay
22:50
23:45
35
 */
