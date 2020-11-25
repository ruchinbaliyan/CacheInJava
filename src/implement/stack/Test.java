package implement.stack;

public class Test
{
    public static void main( String[] args )
    {

        ImplStack st = new ImplStack();
        st.push(1);
        st.push(3);
        st.push(4);
        System.out.println(st.totalElements());
        System.out.println(st.popElement());
        System.out.println(st.peekElement());

    }
}