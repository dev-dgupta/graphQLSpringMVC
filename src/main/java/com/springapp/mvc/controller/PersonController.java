package com.springapp.mvc.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.springapp.mvc.beans.PersonBean;
import com.springapp.mvc.beans.PersonModelBean;
import com.springapp.mvc.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.ui.ModelMap;

/**
 * Created by Divya.Gupta on 19-06-2017.
 */

@Controller
public class PersonController {

    @Autowired
    private IPersonService personService;

    @RequestMapping(value = "/getPersonDetails", method = RequestMethod.GET)
    @ResponseBody
    public String getPersonDetails(@ModelAttribute("personBean") PersonBean personBean, ModelMap modelMap) {
        Gson gson = new GsonBuilder().create();
        Map<String, Object> map = new HashMap<String, Object>();
        String output;
        if (!chkNull(personBean.getUserid())) {
            PersonModelBean personModelBean = personService.getPersonDetails(personBean.getUserid());
            output = gson.toJson(personModelBean);
        } else {
            output = getErrorStr(gson, map);
        }

        modelMap.addAttribute("model", output);
        return "jsonView";
    }


    private String getErrorStr(Gson gson, Map<String, Object> map) {
        map.put("status", "0");
        map.put("message", "Please enter a valid user id.");
        return gson.toJson(map);
    }

    public static boolean chkNull(Object value) {
        if (value == null) {
            return true;
        }
        String strValue = null;
        if (value instanceof Integer) {
            strValue = value.toString();
        } else if (value instanceof Long) {
            strValue = value.toString();
        } else if (value instanceof Double) {
            strValue = value.toString();
        } else if (value instanceof Float) {
            strValue = value.toString();
        } else if (value instanceof String) {
            strValue = value.toString();
        } else if (value instanceof List) {
            List list = (List) value;
            return (list.isEmpty());
        } else if (value instanceof Map) {
            Map map = (Map) value;
            return (map.isEmpty());
        } else if (value instanceof Set) {
            Set set = (Set) value;
            return (set.isEmpty());
        }
        //strValue will never null in or condition...removed null check
        if (strValue == null || "undefined".equals(strValue.trim()) || "null".equals(strValue.trim()) || "-1".equals(strValue.trim()) || strValue.trim().length() == 0) {
            return true;
        }
        return false;

    }
}
