// demostration of printf
class Demo202{
    public static void main(String args[]){
        int x = 100;
        System.out.printf(" Printing simple integer : x = %d \n", x);

        // this will print it upto 2 decimal places
        System.out.printf(" Formatted with precision : PI + %.2f\n",Math.PI);

        float n = 5.2f;
        //automactically append zero to the right most part of decimal
        System.out.printf(" Formated to specific width : n = %2.1f\n", n);
        // %2.1f

        n = 2324435.3f;
        //here number is formatted from right margin and occupies
        //  a width of 20 characters
        System.out.printf(" Formatted to right margin : n = %20.4f\n", n);
    }
}