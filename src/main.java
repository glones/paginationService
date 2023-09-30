public class main {

    public static void main(String[] args) {

        String[] data = {"poem", "poem","poem","poem","poem","poem","poem","poem","poem","poem"};
        int elementsPage = 2;

        PaginationService paginationService = new PaginationService(data, elementsPage);

        System.out.println(paginationService.getElementsCount());
        System.out.println(paginationService.getPageNumberByElementIndex(7));

        System.out.println("some");
    }
}
