package com.dake.service;

import org.springframework.transaction.annotation.Transactional;


public class OutterTx {

    @Transactional
    public void outterMethod() {
        System.out.println("---------外部事务---------");
        InnerTx innerTx = new InnerTx();
        innerTx.innerMethod();
    }
}
