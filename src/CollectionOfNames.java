public class CollectionOfNames implements Container {
    public String name[] = {"Yash","Aniboi", "Chirag", "Panghal"};
    @Override
    public Iterator getIterator(){
        return new CollectionOfNamesIterator();
    }
    private class CollectionOfNamesIterator implements Iterator{
        int i;
        @Override
        public boolean hasNext(){
            if(i< name.length){
                return true;
            }
            return false;
        }
        @Override
        public Object next(){
            if(this.hasNext()){
                return name[i++];
            }
            return null;
        }
    }
}
