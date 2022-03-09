package com.alibaba.config;

import com.netflix.client.config.DefaultClientConfigImpl;
import com.netflix.client.config.IClientConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProviderConfig {

    @Bean
    public IClientConfig iClientConfig() {
        IClientConfig config = new DefaultClientConfigImpl();
        return config;
    }
}
