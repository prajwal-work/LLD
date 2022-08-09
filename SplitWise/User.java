class User {

    private String name;
    private int uid;
    //private Balance balance;

    public User(String name, int uid) {
        this.name = name;
        this.uid = uid;
        
    }
    public String getName() {
        return name;
    }
    public int getUid() {
        return uid;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
   
}