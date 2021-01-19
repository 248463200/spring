package com.pyh.base.dao;

import java.util.List;
import java.util.Map;

public interface CommonMapper<T> {


    List<T> list(Map<String,Object> map);

}
