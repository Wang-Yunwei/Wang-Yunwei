package com.example.test;

import cn.hutool.core.lang.copier.Copier;

/**
 * @author WangYunwei [2023-11-27]
 */
public class GetCanonicalName {

    private String userName;

    public static void main(String[] main){

        // ===> com.example.test.DateTest
        System.out.printf("===> %s%n", DateTest.class.getCanonicalName());
    }
}
