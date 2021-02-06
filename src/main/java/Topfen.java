public class Topfen {
  public Integer num=5;
  public Boolean hungry=false;

  public Boolean isHungry() {
    return hungry;
  }

  public void eat()
  {
    num--;
  }
  public void cook(){
    num++;
  }
  public void emptyfridge(){
   num=0;
  }
}
