public class var_argsssss {
    static int sum(int ...arr){
        int result=0;
        for (int element:arr){
            result+=element;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 2,4,5 and 6 is: "+sum(2,4,5,6));
        System.out.println("The sum without putting an input is "+sum());
    }
}
