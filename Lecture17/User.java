package Lecture17;

import Lecture17.User.Inner.SecInner;

public class User {
    public static class Inner{
        public Inner(){};
        public static class SecInner{
            public SecInner(){};
        }
    }
    public static void main(String[] args) {
        User u1 = new User();
        Inner u2 = new Inner();
        SecInner u3 = new SecInner();

    }
}
