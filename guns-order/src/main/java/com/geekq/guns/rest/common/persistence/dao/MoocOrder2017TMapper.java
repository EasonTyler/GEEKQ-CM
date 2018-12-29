package com.geekq.guns.rest.common.persistence.dao;

import com.baomidou.mybatisplus.plugins.Page;
import com.geekq.guns.rest.common.persistence.model.MoocOrder2017T;
import com.geekq.guns.api.order.vo.OrderVO;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 订单信息表 Mapper 接口
 * </p>
 *
 * @author jiangzh
 * @since 2018-09-24
 */
public interface MoocOrder2017TMapper extends BaseMapper<MoocOrder2017T> {

    String getSeatsByFieldId(@Param("fieldId") String fieldId);

    OrderVO getOrderInfoById(@Param("orderId") String orderId);

    List<OrderVO> getOrdersByUserId(@Param("userId")Integer userId, Page<OrderVO> page);

    String getSoldSeatsByFieldId(@Param("fieldId")Integer fieldId);

}
