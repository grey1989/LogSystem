package org.jxl.LogSystem.service.impl;

import org.jxl.LogSystem.model.User;
import org.jxl.LogSystem.mapper.UserMapper;
import org.jxl.LogSystem.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jxl
 * @since 2022-04-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
