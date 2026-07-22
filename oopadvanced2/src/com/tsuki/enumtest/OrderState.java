package com.tsuki.enumtest;

public enum OrderState {
    //创建一个枚举类，用于表示订单的状态,包括待支付、待发货、待收货、待评价、已完成、已取消、已退款
    WAIT_PAY("待支付"),
    WAIT_DELIVER("待发货"),
    WAIT_RECEIVE("待收货"),
    WAIT_EVALUATE("待评价"),
    COMPLETED("已完成"),
    CANCELLED("已取消"),
    REFUNDED("已退款");
    //注意逗号和分号的位置

    //属性
    private String name;

    //构造方法，这个构造方法是私有的，所以不能在外部调用，只能在枚举类内部调用
    private OrderState(String name) {
        this.name = name;
       /* System.out.println("看看我执行了吗" + name);*/
    }

    //get/set
    public String getName() {
        return name;
    }



}
