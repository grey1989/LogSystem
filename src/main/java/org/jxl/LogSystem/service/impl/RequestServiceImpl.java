package org.jxl.LogSystem.service.impl;

import org.jxl.LogSystem.model.Request;
import org.jxl.LogSystem.mapper.RequestMapper;
import org.jxl.LogSystem.service.RequestService;
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
public class RequestServiceImpl extends ServiceImpl<RequestMapper, Request> implements RequestService {

}
