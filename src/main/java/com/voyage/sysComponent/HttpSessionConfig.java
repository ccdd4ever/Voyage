package com.voyage.sysComponent;

import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @Author: void.
 * @Date: 9/29/16.
 */
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 60)
public class HttpSessionConfig {
}
