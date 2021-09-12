package com.dake.tx;

import org.springframework.transaction.annotation.Transactional;

public class InnerTx {

    @Transactional
    public void innerMethod(){
        System.out.println("---------内部事务，异常发生之前---------");
        int i = 1/0;
        System.out.println("---------内部事务，异常发生之后---------");
    }
}
