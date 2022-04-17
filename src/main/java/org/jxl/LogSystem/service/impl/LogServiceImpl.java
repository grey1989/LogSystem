package org.jxl.LogSystem.service.impl;

import org.jxl.LogSystem.model.Log;
import org.jxl.LogSystem.mapper.LogMapper;
import org.jxl.LogSystem.service.LogService;
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
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements LogService {

}
