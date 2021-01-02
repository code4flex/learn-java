package com.code4flex.design.module.sample.infrastructure.general.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * sample 配置
 *
 * @author marvin
 */
@Component
@ConfigurationProperties(prefix = "sample")
public class SampleConfig {

    /** name */
    private static String name;

    /** version */
    private static String version;

    public static String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        SampleConfig.name = name;
    }

    public static String getVersion()
    {
        return version;
    }

    public void setVersion(String version)
    {
        SampleConfig.version = version;
    }
}
