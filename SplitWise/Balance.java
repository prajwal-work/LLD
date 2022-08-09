class Balance {
    
    private double contribution;
    private double delta;

    

    public Balance(double contribution, double delta) {
        this.contribution = contribution;
        this.delta = delta;
    }

    public double getContribution() {
        return contribution;
    }
    public double getDelta() {
        return delta;
    }
    public void setContribution(double contribution) {
        this.contribution = contribution;
    }
    public void setDelta(double delta) {
        this.delta = delta;
    }
    
    
}
