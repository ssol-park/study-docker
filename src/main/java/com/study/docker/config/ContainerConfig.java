package com.study.docker.config;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.ajp.AbstractAjpProtocol;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContainerConfig {

    @Value("${server.tomcat.ajp.protocol}")
    private String ajpProtocol;

    @Value("${server.tomcat.ajp.port}")
    private int ajpPort;

    @Bean
    public ServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.addAdditionalTomcatConnectors(createAjpConnector());

        return tomcat;
    }

    private Connector createAjpConnector() {
        Connector ajpConnector = new Connector(ajpProtocol);
        ajpConnector.setPort(ajpPort);
        ajpConnector.setSecure(false);
        ajpConnector.setAllowTrace(false);
        ajpConnector.setScheme("http");
        ((AbstractAjpProtocol) ajpConnector.getProtocolHandler()).setSecretRequired(false); // 해당 줄을 추가함

        return ajpConnector;
    }
}
