package com.connect2fly.c2flybacken.security;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Data
@Configuration
@ConfigurationProperties("auth")
public class SecurityProperties {
    private String secretKey;
}
