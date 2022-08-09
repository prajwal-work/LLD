import java.util.Map;

public class Service {

    void updateBalance(Event event){
        //System.out.println("update called");
        double bill = event.getbill();
        Group group = event.getGroup();
        double curr_amount = group.getTotal_amount();
        double updated_amount = curr_amount + bill;

        group.setTotal_amount(updated_amount);

        
        int total_members = group.getMembers().size();
        double amountPer = bill/total_members;
        Map<User, Double> contribution = event.getContribution();
        double total_event_contribution = 0.0;

        for(User u : contribution.keySet()){
            total_event_contribution += contribution.get(u);
        }

        if(total_event_contribution!=bill){
            System.out.println("Sum of contribution and total bill are not equal, hence event won't be counted.");
            return;
        }

        Map<User, Balance> map = group.getMap();
        
        for(User u : map.keySet()){
            if(contribution.keySet().contains(u)){
                //System.out.println("did it?");
                Balance balance = map.get(u);
                double curr_delta = balance.getDelta();
                System.out.println(contribution.get(u));
                double updated_delta = curr_delta +  (amountPer - contribution.get(u));
                balance.setDelta(updated_delta);
                double curr_contribution = balance.getContribution();
                double updated_contribution = curr_contribution + contribution.get(u);
                balance.setContribution(updated_contribution);   
                map.put(u, balance);  
            }
            else{
                Balance balance = map.get(u);
                double curr_delta = balance.getDelta();
                double updated_delta = curr_delta + amountPer;
                balance.setDelta(updated_delta);
            }
        }
    }
}
