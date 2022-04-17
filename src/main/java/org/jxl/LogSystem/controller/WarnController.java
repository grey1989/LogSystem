package org.jxl.LogSystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.jxl.LogSystem.common.JsonResponse;
import org.jxl.LogSystem.service.WarnService;
import org.jxl.LogSystem.model.Warn;


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
@RequestMapping("/warn")
public class WarnController {

    private final Logger logger = LoggerFactory.getLogger( WarnController.class );

    @Autowired
    private WarnService warnService;

    /**
    * 描述：根据Id 查询
    *
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonResponse getById(@PathVariable("id") Long id)throws Exception {
        Warn  warn =  warnService.getById(id);
        return JsonResponse.success(warn);
    }

    /**
    * 描述：根据Id删除
    *
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public JsonResponse deleteById(@PathVariable("id") Long id) throws Exception {
        warnService.removeById(id);
        return JsonResponse.success(null);
    }


    /**
    * 描述：根据Id 更新
    *
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public JsonResponse updateWarn(@PathVariable("id") Long  id,Warn  warn) throws Exception {
        warn.setWarnId(id);
        warnService.updateById(warn);
        return JsonResponse.success(null);
    }


    /**
    * 描述:创建Warn
    *
    */
    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse create(Warn  warn) throws Exception {
        warnService.save(warn);
        return JsonResponse.success(null);
    }

    /**
    * 描述:查询Warn列表
    *
    */
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public JsonResponse getList() throws Exception {
        Object result = warnService.list(null);
        return JsonResponse.success(result);
    }

}

