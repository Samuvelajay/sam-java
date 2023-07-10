package busrev;

public class bus {
    private int busno;
     private boolean ac;
     private int capacity;//get and set method
     bus(int no,boolean ac,int cap){
    	 this.busno=no;
    	 this.ac=ac;
    	 this.capacity=cap;
    	 
     }
     public int getBusno() {
    	 return busno;
     }
     public boolean isAc() {
    	 return ac;
     }
     public int getCapacity() {//accessor method
    	 return capacity;
     }
     public void setAc(boolean val) {
    	 ac=val;
     }
     public int setCapacity(int cap) { //mutator
    	 capacity=cap;
     }
     public void displayBusinfo() {
    	 System.out.println("bus no:"+busno+" ac:");
     }

}
