package com.boot.test;

import com.boot.transaction.TransactionApplication;
import com.boot.transaction.service.TradeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TransactionApplication.class)
public class TradeTest {

    @Resource
    private TradeService tradeService ;
    /**
     * 没有事务管理
     * jack 减少了1000块钱，但是rose得到1000块钱
     * 1	jack	9000
     * 2	rose	10000
     */
    @Test
    public void testTrade1 (){
        tradeService.trade1("jack", "rose", 1000);
    }

    /**
     * 手动管理事务
     * 1	jack	10000
     * 2	rose	10000
     */
    @Test
    public void testTrade2 (){
        tradeService.trade2("jack", "rose", 1000);
    }

    /**
     * 注解管理事务
     * 1	jack	10000
     * 2	rose	10000
     */
    @Test
    public void testTrade3 (){
        tradeService.trade3("jack", "rose", 1000);
    }
}
