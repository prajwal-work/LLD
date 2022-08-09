import java.util.List;
import java.util.Map;

public class Group {
    private int gid;
    private String group_name;
    private List<User> members;
    private double total_amount;
    private Map<User, Balance> map;
    private double amount_per;
    
    public Group(int gid, String group_name, List<User> members, Map<User, Balance> map) {
        this.gid = gid;
        this.group_name = group_name;
        this.members = members;
        this.total_amount = 0.0;
        this.map = map;
        this.amount_per = total_amount/members.size();
    }
    
    public void setGid(int gid) {
        this.gid = gid;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    public void setMap(Map<User, Balance> map) {
        this.map = map;
    }

    public int getGid() {
        return gid;
    }

    public String getGroup_name() {
        return group_name;
    }

    public List<User> getMembers() {
        return members;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public Map<User, Balance> getMap() {
        return map;
    }

    public double getAmount_per() {
        return amount_per;
    }
    

}
