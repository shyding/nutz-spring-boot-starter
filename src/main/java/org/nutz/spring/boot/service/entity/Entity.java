package org.nutz.spring.boot.service.entity;

import java.io.Serializable;

import org.nutz.json.Json;
import org.nutz.json.JsonFormat;

/**
 * @author kerbores(kerbores@gmail.com)
 *
 */
public class Entity implements Serializable {

    private static final long serialVersionUID = 1L;

    public <T extends Entity> T exchange(Class<T> clazz) {
        return Json.fromJson(clazz, Json.toJson(this, JsonFormat.compact().ignoreJsonShape()));
    }

    @Override
    public String toString() {
        return Json.toJson(this, JsonFormat.nice());
    }
}
