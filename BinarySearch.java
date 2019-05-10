public boolean binarySearch(int[] arr, int key)
{
    int low = 0;
    int high = arr.length - 1;
    while(high >= low) {
        int middle = (low + high) / 2;
        if(arr[middle] == key) {
            return true;
        }
        if(arr[middle] < key) {
            low = middle + 1;
        }
        else if(arr[middle] > key) {
            high = middle - 1;
        }
    }
    return false;
}