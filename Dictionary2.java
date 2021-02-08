public class Dictionary2 extends Book2
{
  private int definitions;
  //------------------------------------------
  // Sets up the dictionary with the specified number of pages
  // (maintained by the Book parent class) and defenitions.
  //-------------------------------------------
  public Dictionary2 (int numPages,int numDefinitions)
  {
    super (numPages);
    defenitions = numDefinitions;
  }
  //--------------------------------------
  // Prints a message using both local and inherited values
  //--------------------------------------
  public void definitionMessage()
  {
    System.out.println ("Number of definitions: " + defenitions);
    System.out.println ("Defenitions per page: " + defenitions/pages);
  }
}