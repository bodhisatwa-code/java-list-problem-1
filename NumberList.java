import java.util.*;

public class NumberList {

    public NumberList(){
        super();
    }

    public ArrayList<Integer> list  = new ArrayList<Integer>();
    
    public void addToList(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How long you want the list to be : ");
        int len = scanner.nextInt();
        System.out.println("------------------------------------");
        for(int i=0; i < len ; i++){
            System.out.print("Enter element : "+(i+1)+" : ");
            this.list.add(scanner.nextInt());
            System.out.println("");
        }
        System.out.println("List filled up nicely");
        System.out.println("------------------------------------");
        scanner.close();
    }

    public void displayList(){
        System.out.println("The list is : ");
        for(int i=0;i<this.list.size();i++){
            System.out.print(this.list.get(i)+" ");
        }
        System.out.println("");
    }

    public void removeEveryThirdElement(){
        
        for(int i=0;i<this.list.size();i++){
            if((i+1)%3 ==0){
                
                System.out.println("Element removed : "+ this.list.get(i));
            }
        }

    }
}