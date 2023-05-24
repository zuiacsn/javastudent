
import java.util.*;

public class Main {
    private Map<String, Map<String, Integer>> medalTable;

    public Main() {
        medalTable = new HashMap<>();
        medalTable.put("挪威", new HashMap<String, Integer>() {{
            put("金牌", 16);
            put("银牌", 8);
            put("铜牌", 13);
        }});
        medalTable.put("中国", new HashMap<String, Integer>() {{
            put("金牌", 8);
            put("银牌", 4);
            put("铜牌", 2);
        }});
        medalTable.put("美国", new HashMap<String, Integer>() {{
            put("金牌", 8);
            put("银牌", 10);
            put("铜牌", 7);
        }});
        medalTable.put("冰岛", new HashMap<String, Integer>() {{
            put("金牌", 0);
            put("银牌", 0);
            put("铜牌", 0);
        }});
        medalTable.put("荷兰", new HashMap<String, Integer>() {{
            put("金牌", 8);
            put("银牌", 5);
            put("铜牌", 4);
        }});
        medalTable.put("印度", new HashMap<String, Integer>() {{
            put("金牌", 0);
            put("银牌", 0);
            put("铜牌", 0);
        }});
    }

    // (1) 查询所有获奖信息
    public void printMedalTable() {
        System.out.println("代表队\t金牌\t银牌\t铜牌\t合计");
        for (Map.Entry<String, Map<String, Integer>> entry : medalTable.entrySet()) {
            String team = entry.getKey();
            Map<String, Integer> medals = entry.getValue();
            int gold = medals.get("金牌");
            int silver = medals.get("银牌");
            int bronze = medals.get("铜牌");
            int total = gold + silver + bronze;
            System.out.println(team + "\t" + gold + "\t" + silver + "\t" + bronze + "\t" + total);
        }
    }

    // (2) 韩聪、隋文静为中国再添一枚金牌，请修改中国代表队的数据
    public void addChinaGold() {
        medalTable.get("中国").put("金牌", medalTable.get("中国").get("金牌") + 1);
    }

    // (3) 补充德国代表队的获奖信息：金牌12、银牌10、铜牌5
    public void addGermanyMedals() {
        medalTable.put("德国", new HashMap<String, Integer>() {{
            put("金牌", 12);
            put("银牌", 10);
            put("铜牌", 5);
        }});
    }

    // (4) 查询获得9枚金牌的代表队的获奖信息
    public void printTeamsWithNineGold() {
        System.out.println("获得9枚金牌的代表队:");
        for (Map.Entry<String, Map<String, Integer>> entry : medalTable.entrySet()) {
            String team = entry.getKey();
            Map<String, Integer> medals = entry.getValue();
            int gold = medals.get("金牌");
            if (gold == 9) {
                int silver = medals.get("银牌");
                int bronze = medals.get("铜牌");
                int total = gold + silver + bronze;
                System.out.println(team + "\t" + gold + "\t" + silver + "\t" + bronze + "\t" + total);
            }
        }
    }

    // (5) 查询冰岛代表队的获奖信息
    public void printIcelandMedals() {
        System.out.println("冰岛代表队获奖信息:");
        Map<String, Integer> medals = medalTable.get("冰岛");
        int gold = medals.get("金牌");
        int silver = medals.get("银牌");
        int bronze = medals.get("铜牌");
        int total = gold + silver + bronze;
        System.out.println("冰岛\t" + gold + "\t" + silver + "\t" + bronze + "\t" + total);
    }


}

