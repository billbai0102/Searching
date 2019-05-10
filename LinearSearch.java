public boolean binarySearch(List <Integer> arr, int target){
{
    int low = 0;
    int high = arr.size - 1;
    while(high >= low) {
        int middle = (low + high) / 2;
        if(arr.get(middle).equals(key)) {
            return true;
        }
        if(arr.get(middle) < key) {
            low = middle + 1;
        }
        else if(arr.get(middle) > key) {
            high = middle - 1;
        }
    }
    return false;
}