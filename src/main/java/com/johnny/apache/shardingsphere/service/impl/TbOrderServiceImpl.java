package com.johnny.apache.shardingsphere.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.johnny.apache.shardingsphere.mapper.TbOrderMapper;
import com.johnny.apache.shardingsphere.service.api.TbOrderService;
@Service
public class TbOrderServiceImpl implements TbOrderService{

    @Resource
    private TbOrderMapper tbOrderMapper;

}
