package Converter;

public class BinaryNumber {
    private String digits;

    public BinaryNumber(String digits) throws Exception {

        for (int i=0;i<digits.length();i++){
            if(!(digits.substring(i,i+1).equals("0")  || digits.substring(i,i+1).equals("1"))){
                Exception invalidInput = new Exception("not a valid Binary Number");
                throw invalidInput;
            }
        }

        this.digits = digits;
        System.out.println("binary number successfully created!");
    }

    public BinaryNumber (int decimalNumber){
        
    }

    public int convertToDecimal() {
        int sum=0;
        for (int i = digits.length()-1; i >=0; i--) {
            sum+=Integer.valueOf(digits.substring(i,i+1))*Math.pow(2,digits.length()-1-i);
        }
        return sum;
    }
}
