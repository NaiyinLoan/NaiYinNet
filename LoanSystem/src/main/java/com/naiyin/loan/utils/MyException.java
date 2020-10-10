package com.naiyin.loan.utils;

/**
 *  自定义异常, 不能是RuntimeException的子类, 就可以写在rollback-for表达式里
 * @author runmu
 * @version 1.0
 * @date 15:54 2019/8/9
 */
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
