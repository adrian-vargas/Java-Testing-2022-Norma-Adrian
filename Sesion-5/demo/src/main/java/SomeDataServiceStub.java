

class SomeDataServiceStub implements SomeDataService {


    @Override
    public int[] retrieveAllData() {
        return new int[] { 1, 2, 3 };
    }
}
