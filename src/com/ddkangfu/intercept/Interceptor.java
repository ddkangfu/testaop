package com.ddkangfu.intercept;

import com.ddkangfu.invoke.Invocation;

import java.lang.reflect.InvocationTargetException;

public interface Interceptor {

    /**
     * 事前方法
     * @return 是否成功
     */
    boolean before();

    /**
     * 事后方法
     */
    void after();

    /**
     * 取代原有事件方法
     * @param invocation 回调参数，可以通过它的procced方法，回调原有事件
     * @return 原有事件返回的对象
     * @throws InvocationTargetException 调用目标异常
     * @throws IllegalAccessException  非法访问异常
     */
    Object around(Invocation invocation) throws InvocationTargetException, IllegalAccessException;

    /**
     * 事后返回方法，事件没有发生异常执行
     */
    void afterReturning();

    /**
     * 事后异常方法，当事件发生异常后执行
     */
    void afterThrowing();


    /**
     * 是否使用around方法取代原有方法
     * @return true - 是， false - 否
     */
    boolean useAround();
}