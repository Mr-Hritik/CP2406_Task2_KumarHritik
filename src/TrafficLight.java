public class TrafficLight {
    private double rateOfChange = 0.8;
    private String recentColor = "Green";
    private int redTime = 0;
    private int greenTime = 0;


    public String getRecentColor(){
        return recentColor;
    }

    public void operate(){

        if (recentColor.equals("Red")){
            rateOfChange = 1;
            redTime += 1;
        }
        else{
            rateOfChange = 0;
            greenTime +=1;
        }

        if(redTime == 11 || greenTime == 6){
            redTime = 0;
            greenTime = 0;
            rateOfChange = 0.2;
        }
        double num = Math.random();
        if(num < rateOfChange) {
            recentColor = "Red";
        }
        else
            recentColor = "Green";
    }
}
