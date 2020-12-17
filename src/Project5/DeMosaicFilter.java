package Project5;

public class DeMosaicFilter implements Filter{

    @Override
    public void filter(PixelImage theImage) {
        Pixel[][] data = theImage.getData();

        for (int row = 1; row < theImage.getHeight()-1; row++) {
            for (int col = 1; col < theImage.getWidth()-1; col++) {

            //isolate only blue pixels (rgb)
                //red is channel 1
                //green is channel 2
                //blue is channel 3
                //red is done
                if(data[row][col].color==1) {
                    //average the green pixels
                    data[row][col].green=(data[row-1][col].green+data[row+1][col].green+data[row][col+1].green+data[row][col-1].green)/4;
                    //average the red pixels
                    data[row][col].blue=(data[row-1][col-1].blue+data[row-1][col+1].blue+data[row+1][col-1].blue+data[row+1][col+1].blue)/4;
                }
                //green

                //blue is done
                if(data[row][col].color==3) {
                    //average the green pixels
                    data[row][col].green=(data[row-1][col].green+data[row+1][col].green+data[row][col+1].green+data[row][col-1].green)/4;
                    //average the red pixels
                    data[row][col].red=(data[row-1][col-1].red+data[row-1][col+1].red+data[row+1][col-1].red+data[row+1][col+1].red)/4;
                }

            }
        }
        theImage.setData(data);

    }
}
