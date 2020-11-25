package JunitTests;
import implement.stack.ImplStack;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class ImplStackTest {

    private ImplStack st;

    @Before
    public void setup(){
        st =new ImplStack();
    }
    @Test
    public void pushTest(){

        assertEquals(0,st.totalElements());
        st.push(1);
        assertEquals(1,st.totalElements());
        st.push(2);

    }

    @Test
    public void popFromEmptyStack(){
        st= new ImplStack();
        assertEquals(-1,st.popElement());

    }
    @Test
    public void popFromStackTest(){

        st =new ImplStack();
        st.push(1);
        assertEquals(1,st.popElement());
        st.push(2);
        st.push(3);
        st.push(4);
        assertEquals(4,st.popElement());
        assertEquals(2,st.totalElements());

    }
    @Test
    public void peekFromEmptyStack()
    {
        st= new ImplStack();
        assertEquals(-1,st.peekElement());

    }
    @Test
    public void peekFromStack(){
        ImplStack st =new ImplStack();

        st.push(1);
        assertEquals(1,st.peekElement());
        st.push(2);
        st.popElement();
        st.popElement();
        assertEquals(-1,st.peekElement());
        st.push(3);
        st.push(4);
        st.popElement();
        assertEquals(3,st.peekElement());


    }

    @Test
    public void pollFromEmptyStack()
    {
        st= new ImplStack();
        assertEquals(-1,st.pollElement());

    }

    @Test
    public void pollElement(){
        ImplStack st = new ImplStack();
        st.push(1);
        st.push(2);
        st.push(3);
        assertEquals(3,st.pollElement());

    }
}
