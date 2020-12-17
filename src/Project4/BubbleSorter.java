package Project4;

public class BubbleSorter implements Sorter {

    int iterations=0;

    public String[] sort(Double[] values) {

        Double[] sortedArr = values;
        String[] retArr = new String[values.length];

        for (int i = 0; i < sortedArr.length-1; i++) {
            for (int j = 0; j < sortedArr.length-1-i; j++) {
                iterations++;
                if(sortedArr[j]>sortedArr[j+1]){
                    double temp=sortedArr[j];
                    sortedArr[j]=sortedArr[j+1];
                    sortedArr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < sortedArr.length; i++) {
            retArr[i]=sortedArr[i].toString();
        }
        System.out.println("sorted by the BubbleSorter!");
        return retArr;
    }

    @Override
    public String[] sort(String[] values) {
        String[] sortedArr = values;

        for (int i = 0; i < sortedArr.length-1; i++) {
            for (int j = 0; j < sortedArr.length-1-i; j++) {
                iterations++;
                boolean change=false;
                int leastLetters = ((int)sortedArr[j].length()<(int)sortedArr[j+1].length()? (int)sortedArr[j].length():(int)sortedArr[j+1].length());
                for (int k = 0; k < leastLetters; k++) {
                    if((int)sortedArr[j].charAt(k)>(int)sortedArr[j+1].charAt(k)) {
                        change = true;
                        break;
                }else if((int)sortedArr[j].charAt(k)<(int)sortedArr[j+1].charAt(k)){
                        change=false;
                        break;
                    }else if(k+1==leastLetters && leastLetters==(int)sortedArr[j+1].length()){
                        change=true;
                    }
                }
                if(change){
                    String temp=sortedArr[j];
                    sortedArr[j]=sortedArr[j+1];
                    sortedArr[j+1]=temp;
                }

            }
        }

        System.out.println("sorted by the BubbleSorter!");
        System.out.println(Integer.toString(iterations)+" iterations");
        return sortedArr;
    }

}
