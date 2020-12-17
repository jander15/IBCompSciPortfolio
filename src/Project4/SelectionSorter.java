package Project4;

public class SelectionSorter implements Sorter {

    int iterations=0;


    public String[] sort(String[] values) {

        String[] sortedArr = values;
        String[] retArr = new String[values.length];

        String temp;
        int num =0;

        for (int min = 0; min < sortedArr.length-1; min++) {
            for (int current = min; current < sortedArr.length-1; current++) {
                iterations++;

                if((int)sortedArr[current].charAt(0)>(int)sortedArr[current+1].charAt(0)){
                    num=current;
                }
            }
            temp=sortedArr[num];
            sortedArr[num]=sortedArr[min];
            sortedArr[min]=temp;
        }
        for (int i = 0; i < sortedArr.length; i++) {
            retArr[i]=sortedArr[i].toString();
        }
        System.out.println("sorted by the SelectionSorter!");
        return retArr;
    }


}

