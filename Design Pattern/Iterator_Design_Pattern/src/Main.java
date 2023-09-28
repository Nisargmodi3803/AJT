public class Main
{
    public static void main(String[] args) {
        Names names = new Names();

        for(iterator itr = names.getIterator();itr.hasNext();)
        {
            String name = (String) itr.next();
            System.out.println(name);
        }
    }
}
