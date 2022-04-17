package org.jxl.LogSystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.jxl.LogSystem.common.JsonResponse;
import org.jxl.LogSystem.service.UserService;
import org.jxl.LogSystem.model.User;


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
@RequestMapping("/user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger( UserController.class );

    @Autowired
    private UserService userService;

    /**
    * 描述：根据Id 查询
    *
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonResponse getById(@PathVariable("id") Long id)throws Exception {
        User  user =  userService.getById(id);
        return JsonResponse.success(user);
    }

    /**
    * 描述：根据Id删除
    *
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public JsonResponse deleteById(@PathVariable("id") Long id) throws Exception {
        userService.removeById(id);
        return JsonResponse.success(null);
    }


    /**
    * 描述：根据Id 更新
    *
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public JsonResponse updateUser(@PathVariable("id") Long  id,User  user) throws Exception {
        user.setUid(id);
        userService.updateById(user);
        return JsonResponse.success(null);
    }


    /**
    * 描述:创建User
    *
    */
    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse create(User  user) throws Exception {
        userService.save(user);
        return JsonResponse.success(null);
    }

    /**
    * 描述:查询User列表
    *
    */
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public JsonResponse getList() throws Exception {
        Object result = userService.list(null);
        return JsonResponse.success(result);
    }

}

