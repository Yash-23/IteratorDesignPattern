public class IteratorPatternDemo {
    public static void main(String[] args){
        CollectionOfNames cmrepo=new CollectionOfNames();
        for(Iterator iter = cmrepo.getIterator(); iter.hasNext();){
        String name = (String) iter.next();
            System.out.println("Name: "+name);
        }
    }
}
