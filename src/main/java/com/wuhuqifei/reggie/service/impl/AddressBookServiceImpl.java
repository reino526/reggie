package com.wuhuqifei.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuhuqifei.reggie.entity.AddressBook;
import com.wuhuqifei.reggie.mapper.AddressBookMapper;
import com.wuhuqifei.reggie.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
