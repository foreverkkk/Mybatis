package com.zk.Utils;

import org.junit.Test;

import java.util.UUID;

@SuppressWarnings("all")
public class IdUtil {
    public static String getID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
    @Test
    public void test(){
        System.out.println(IdUtil.getID());
        System.out.println(IdUtil.getID());
        System.out.println(IdUtil.getID());
    }
}
