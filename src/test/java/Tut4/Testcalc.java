package Tut4;

public class Testcalc 
   
{

    public void testAdd()
    {
        assert( 333 == (new Calc().add(111,222)) );
    }
	public void testSubtract()
    {
        assert( 111 == (new Calc().subtract(333,222)) );
    }
}
