package com.dake.tx;

import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;



public class OutterTx {

//    public static void main(String[] args) {
//        outterMethod();
//    }

    @Test
    @Transactional
    public void outterMethod() {
        System.out.println("---------外部事务---------");
        InnerTx innerTx = new InnerTx();
        innerTx.innerMethod();
    }
}
