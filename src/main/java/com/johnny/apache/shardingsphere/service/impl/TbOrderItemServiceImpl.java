package com.johnny.apache.shardingsphere.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.johnny.apache.shardingsphere.mapper.TbOrderItemMapper;
import com.johnny.apache.shardingsphere.service.api.TbOrderItemService;
@Service
public class TbOrderItemServiceImpl implements TbOrderItemService{

    @Resource
    private TbOrderItemMapper tbOrderItemMapper;

}
