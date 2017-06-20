package com.springapp.mvc.service;

import com.springapp.mvc.beans.PersonModelBean;

/**
 * Created by Divya.Gupta on 20-06-2017.
 */
public interface IPersonService {

    PersonModelBean getPersonDetails(int userid);

}
