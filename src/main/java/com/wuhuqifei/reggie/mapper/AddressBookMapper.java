package com.wuhuqifei.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wuhuqifei.reggie.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;

/**
 * 地址簿的映射
 */
@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {
}
