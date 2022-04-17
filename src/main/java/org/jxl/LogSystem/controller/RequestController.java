package org.jxl.LogSystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.jxl.LogSystem.common.JsonResponse;
import org.jxl.LogSystem.service.RequestService;
import org.jxl.LogSystem.model.Request;


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
@RequestMapping("/request")
public class RequestController {

    private final Logger logger = LoggerFactory.getLogger( RequestController.class );

    @Autowired
    private RequestService requestService;

    /**
    * 描述：根据Id 查询
    *
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonResponse getById(@PathVariable("id") Long id)throws Exception {
        Request  request =  requestService.getById(id);
        return JsonResponse.success(request);
    }

    /**
    * 描述：根据Id删除
    *
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public JsonResponse deleteById(@PathVariable("id") Long id) throws Exception {
        requestService.removeById(id);
        return JsonResponse.success(null);
    }


    /**
    * 描述：根据Id 更新
    *
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public JsonResponse updateRequest(@PathVariable("id") Long  id,Request  request) throws Exception {
        request.setRequestID(id);
        requestService.updateById(request);
        return JsonResponse.success(null);
    }


    /**
    * 描述:创建Request
    *
    */
    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse create(Request  request) throws Exception {
        requestService.save(request);
        return JsonResponse.success(null);
    }

    /**
    * 描述:查询Request列表
    *
    */
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public JsonResponse getList() throws Exception {
        Object result = requestService.list(null);
        return JsonResponse.success(result);
    }

}

