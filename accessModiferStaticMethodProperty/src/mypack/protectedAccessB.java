package mypack;
import pack.*;
class protectedAccessB {
    public static void main(String args[]){

        protectedAccessA obj = new protectedAccessA();

        obj.msg();

    }
}
