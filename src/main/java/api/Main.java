package api;

import db.MyEntity;
import service.MySerivce;

public class Main {

    public static void main(String[] args) {
        MySerivce mySerivce = new MySerivce();
        System.out.println(mySerivce.getMyEntity());
        System.out.println(mySerivce.setMyEntity(new MyEntity("second")));
        System.out.println(mySerivce.getMyEntity());
    }
}
