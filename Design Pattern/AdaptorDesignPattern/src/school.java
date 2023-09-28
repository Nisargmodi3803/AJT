public class school
{
    public static void main(String[] args) {
        penAdaptor adaptor = new penAdaptor();
        schoolAssignment sw = new schoolAssignment();
        sw.setP(adaptor);
        sw.writeAssignment("Hello world!!!");
    }
}
