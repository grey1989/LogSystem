package org.jxl.LogSystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.jxl.LogSystem.common.JsonResponse;
import org.jxl.LogSystem.service.LogService;
import org.jxl.LogSystem.model.Log;


/**
 *
 *  前端控制器
 *
 *
 * @author jxl
 * @since 2022-04-17
 * @version v1.0
 */
@Controller
@RequestMapping("/log")
public class LogController {

    private final Logger logger = LoggerFactory.getLogger( LogController.class );

    @Autowired
    private LogService logService;

    /**
    * 描述：根据Id 查询
    *
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonResponse getById(@PathVariable("id") Long id)throws Exception {
        Log  log =  logService.getById(id);
        return JsonResponse.success(log);
    }

    /**
    * 描述：根据Id删除
    *
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public JsonResponse deleteById(@PathVariable("id") Long id) throws Exception {
        logService.removeById(id);
        return JsonResponse.success(null);
    }


    /**
    * 描述：根据Id 更新
    *
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public JsonResponse updateLog(@PathVariable("id") Long  id,Log  log) throws Exception {
        log.setLogID(id);
        logService.updateById(log);
        return JsonResponse.success(null);
    }


    /**
    * 描述:创建Log
    *
    */
    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse create(Log  log) throws Exception {
        logService.save(log);
        return JsonResponse.success(null);
    }

    /**
    * 描述:查询Log列表
    *
    */
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public JsonResponse getList() throws Exception {
        Object result = logService.list(null);
        return JsonResponse.success(result);
    }

}

