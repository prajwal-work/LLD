import java.util.Map;
class Event {

    private double bill;
    private Map<User, Double> contribution;
    private Group group;
    
    public Event(double bill, Map<User, Double> contribution, Group group) {
        this.bill = bill;
        this.contribution = contribution;
        this.group = group;
    }
    
    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public double getbill() {
        return bill;
    }
    public void setbill(double bill) {
        this.bill = bill;
    }
    public Map<User, Double> getContribution() {
        return contribution;
    }
    public void setContribution(Map<User, Double> contribution) {
        this.contribution = contribution;
    }

    
    
}
