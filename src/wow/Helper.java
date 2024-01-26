package wow;
public class Helper {
int s;
public Helper(int k){
    this.s=k;
}
public void get(){
    System.out.println(this.s);
}

public void mul(int num, int times){
    int temp=num;
    for(int i=0;i<times;i++){
        System.out.print(temp);
        System.out.println(" ");
        temp+=num;
    }
}

}
