package org.jxl.LogSystem.service.impl;

import org.jxl.LogSystem.model.App;
import org.jxl.LogSystem.mapper.AppMapper;
import org.jxl.LogSystem.service.AppService;
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
public class AppServiceImpl extends ServiceImpl<AppMapper, App> implements AppService {

}
