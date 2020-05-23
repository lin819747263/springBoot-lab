package com.linmsen.springbootmapstruct;

public class Test {

    public static void main(String[] args) {
        UserVO userVO = new UserVO().setName("56456").setPassword("55555");
        UserBO userBO = UserConvert.INSTANCE.convert(userVO);
        System.out.println(userBO);
    }
}
