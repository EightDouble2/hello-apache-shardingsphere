package com.johnny.apache.shardingsphere.tests;

import com.johnny.apache.shardingsphere.domain.TbOrder;
import com.johnny.apache.shardingsphere.mapper.TbOrderItemMapper;
import com.johnny.apache.shardingsphere.mapper.TbOrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ShardingSphereTests {

    @Resource
    private TbOrderMapper tbOrderMapper;

    @Resource
    private TbOrderItemMapper tbOrderItemMapper;

    @Test
    public void testInsertOrder() {
        TbOrder tbOrder = new TbOrder();
        tbOrder.setOrderId(1L);
        tbOrder.setUserId(1L);

        tbOrderMapper.insert(tbOrder);
    }

    @Test
    public void testInsertOrder1() {
        TbOrder tbOrder = new TbOrder();
        tbOrder.setOrderId(2L);
        tbOrder.setUserId(2L);

        tbOrderMapper.insert(tbOrder);
    }

    @Test
    public void testSelectAll() {
        List<TbOrder> tbOrders = tbOrderMapper.selectAll();
        tbOrders.forEach(tbOrder -> {
            System.out.println(tbOrder);
        });
    }
}
