public class JobHunter {
  private boolean hasDegree;
  private boolean hasStudentLoan;
  
  public boolean isJobJunting(){
    if (hasDegree && hasStudentLoan){
      return true;
  } else {
    return false;
  }
}
}