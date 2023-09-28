public class Names implements Container
{
    public String[] name = {"Nisarg","Ayush","Diya"};

    @Override
    public iterator getIterator()
    {
        return new Nameiterator();
    }

    private class Nameiterator implements iterator
    {
        int index;
        @Override
        public Boolean hasNext()
        {
            if(index< name.length)
            {
                return true;
            }
            return false;
        }

        @Override
        public Object next()
        {
            if(this.hasNext())
            {
                return name[index++];
            }
            return null;
        }
    }

}
