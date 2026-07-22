package com.tsuki.enumtest;

public class EnumTest1 {
    public static void main(String[] args) {
        /*//创建一个订单状态对象
        OrderState os = OrderState.WAIT_DELIVER;
        //调用方法,前面的getName()方法是public的,所以可以调用
        System.out.println(os.getName());*/

        //values()方法，用于返回枚举类的所有实例,返回的是一个数组
        OrderState[] arr = OrderState.values();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("----------------------");

        //valueof()方法，用于根据字符串创建枚举类的实例,每次输出的都是枚举类的实例，一个
        OrderState os = OrderState.valueOf("WAIT_PAY");
        System.out.println(os);




        /*switch (os) {
            case WAIT_PAY:
                System.out.println("订单状态是待支付");
                break;
            case WAIT_DELIVER:
                System.out.println("订单状态是待发货");
                break;
            case WAIT_RECEIVE:
                System.out.println("订单状态是待收货");
                break;
            case WAIT_EVALUATE:
                System.out.println("订单状态是待评价");
                break;
            case COMPLETED:
                System.out.println("订单状态是已完成");
                break;
            case CANCELLED:
                System.out.println("订单状态是已取消");
                break;
            case REFUNDED:
                System.out.println("订单状态是已退款");
                break;
        }*/
    }
}
