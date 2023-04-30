public class NameRepository implements Container {
    public String names[] = {"jaivik rj" , "John Wick" ,"lekha Wolla" , "Lone Wolf" , "alex paul"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int i;

        @Override
        public boolean hasNext() {

            if(i < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return names[i++];
            }
            return null;
        }
    }
}