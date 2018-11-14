package com.csoptt.custom;

import com.csoptt.utils.base.controller.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页
 *
 * @author liuzixi
 * @date 2018-11-14
 */
@RestController
@RequestMapping("/eval/index")
@Api(description = "首页")
public class IndexController extends BaseController {
}
