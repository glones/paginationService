public class PaginationService {
  private String[] data;
  private int elementsPerPage;

  public PaginationService(String[] data, int elementsPerPage) {
    this.data = data;
    this.elementsPerPage = elementsPerPage;
  }

  // create getElementsCount() method
  public int getElementsCount(){
    return 0;
  }

  // create getPageNumberByElementIndex(int index) method
  public int getPageNumberByElementIndex(int index){
    return 0;
  }
}