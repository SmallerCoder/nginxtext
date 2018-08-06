package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * The class ServerInfoController.
 *
 * Description:
 *
 * @author: huangjiawei
 * @since: 2018年8月6日
 * @version: $Revision$ $Date$ $LastChangedBy$
 *
 */
@RestController
public class ServerInfoController {

	@RequestMapping(value = "/getServerInfo.json", method = RequestMethod.GET)
	public String getServerInfo() {
		return "This is the first server,port on 8081";
	}

}
