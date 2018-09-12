package com.hgy.designpatterns.behavioralpatterns.mediatorpattern;

import java.util.Date;

/**
 * @author Evan
 * @Date 2018/9/12
 */
public class ChatRoom {
    public static void showMessage(User user,String message){
        System.out.println(new Date().toString()  + " [" + user.getName() +"] : " + message);
    }
}
