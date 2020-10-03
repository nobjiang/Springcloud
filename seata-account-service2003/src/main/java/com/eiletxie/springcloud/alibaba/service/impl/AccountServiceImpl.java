package com.eiletxie.springcloud.alibaba.service.impl;

import com.eiletxie.springcloud.alibaba.dao.AccountDao;
import com.eiletxie.springcloud.alibaba.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;


/**
 * 账户业务实现类
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {




    @Resource
    AccountDao accountDao;


    /**
     * 扣减账户余额
     */
    @Override
    public void decrease(Long userId, BigDecimal money) {

        log.info("------->account-service中扣减账户余额开始");
/*
        try { TimeUnit.SECONDS.sleep(20); } catch (InterruptedException e) { e.printStackTrace(); }
*/
        accountDao.decrease(userId,money);
        log.info("------->account-service中扣减账户余额结束");
    }
}