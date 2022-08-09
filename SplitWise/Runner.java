import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {

        Service service = new Service();

        int gid = 69;
        String group_name = "test-group";
        List<User> members = new ArrayList<>();
        Map<User, Balance> map = new HashMap<>();
        
        //Balance balance = new Balance(0, 0);

        User u1 = new User("bhandu", 1);
        User u2 = new User("psyduck", 2);
        User u3 = new User("longbeach", 3);

        members.add(u1);
        members.add(u2);
        members.add(u3);

        map.put(u1, new Balance(0, 0));
        map.put(u2, new Balance(0, 0));
        map.put(u3, new Balance(0, 0));

        Group group = new Group(gid, group_name, members, map);

        Map<User, Double> contribution = new HashMap<>();

        contribution.put(u1, (double)200);
        contribution.put(u2, (double)340);

        Event event1 = new Event(540, contribution, group);
 
        service.updateBalance(event1);

        contribution.clear();

        contribution.put(u3, (double)590);
        contribution.put(u2, (double)469);
        Event event2 = new Event(1059, contribution, group);

        service.updateBalance(event2);
        contribution.clear();

        for(User u : map.keySet()){
            System.out.println(u.getName()+" has debt of "+map.get(u).getDelta()+" and contributed "+map.get(u).getContribution()+" in this trip.");
            System.out.println();
        }

    }
}
