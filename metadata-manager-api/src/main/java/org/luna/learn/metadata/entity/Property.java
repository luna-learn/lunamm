package org.luna.learn.metadata.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Property
 * @author Liu Yang
 * @date 2022/5/19 14:46
 */
abstract class Property implements Serializable {
    @JsonIgnore
    protected final Map<String, String> properties = new HashMap<>();

    public Map<String, String> getProperties() {
        return new HashMap<>(properties);
    }

    public void setProperty(String key, String value) {
        properties.put(key, value);
    }

    public void getProperty(String key, String defaultValue) {
        properties.getOrDefault(key, defaultValue);
    }
}
