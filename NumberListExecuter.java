public class NumberListExecuter {

    public static  void main(String args[]){
        NumberList listObject = new NumberList();
        listObject.addToList();
        listObject.displayList();
        
        listObject.removeEveryThirdElementWithRemove();
        listObject.displayList();
        
    }
    
}
