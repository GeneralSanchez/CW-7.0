class Main 
{
  //-----------------------------------------------------------
  // Instantiates a derived class and invokes its inherited and
  // local methods
  //------------------------------------------------------------
  public static void main(String[] args) 
  {
    System.out.println ("Andy Sanchez, CW 7.0");
    Dictionary2 webster = new Dictionary2 (1500,52500);
    webster.pageMessage();
    webster.definitionMessage();
  }
}