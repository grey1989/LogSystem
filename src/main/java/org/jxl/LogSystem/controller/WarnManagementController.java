package org.jxl.LogSystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.jxl.LogSystem.common.JsonResponse;
import org.jxl.LogSystem.service.WarnManagementService;
import org.jxl.LogSystem.model.WarnManagement;


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
@RequestMapping("/warnManagement")
public class WarnManagementController {

    private final Logger logger = LoggerFactory.getLogger( WarnManagementController.class );

    @Autowired
    private WarnManagementService warnManagementService;

    /**
    * 描述：根据Id 查询
    *
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonResponse getById(@PathVariable("id") Long id)throws Exception {
        WarnManagement  warnManagement =  warnManagementService.getById(id);
        return JsonResponse.success(warnManagement);
    }

    /**
    * 描述：根据Id删除
    *
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public JsonResponse deleteById(@PathVariable("id") Long id) throws Exception {
        warnManagementService.removeById(id);
        return JsonResponse.success(null);
    }


    /**
    * 描述：根据Id 更新
    *
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public JsonResponse updateWarnManagement(@PathVariable("id") Long  id,WarnManagement  warnManagement) throws Exception {
        warnManagement.setWarnManagementId(id);
        warnManagementService.updateById(warnManagement);
        return JsonResponse.success(null);
    }


    /**
    * 描述:创建WarnManagement
    *
    */
    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse create(WarnManagement  warnManagement) throws Exception {
        warnManagementService.save(warnManagement);
        return JsonResponse.success(null);
    }

    /**
    * 描述:查询WarnManagement列表
    *
    */
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public JsonResponse getList() throws Exception {
        Object result = warnManagementService.list(null);
        return JsonResponse.success(result);
    }

}

