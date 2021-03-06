/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.splunk;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SplunkEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SplunkEndpoint target = (SplunkEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "app": target.getConfiguration().setApp(property(camelContext, java.lang.String.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": target.getConfiguration().setConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "host": target.getConfiguration().setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "owner": target.getConfiguration().setOwner(property(camelContext, java.lang.String.class, value)); return true;
        case "port": target.getConfiguration().setPort(property(camelContext, int.class, value)); return true;
        case "scheme": target.getConfiguration().setScheme(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "count": target.getConfiguration().setCount(property(camelContext, int.class, value)); return true;
        case "earliesttime":
        case "earliestTime": target.getConfiguration().setEarliestTime(property(camelContext, java.lang.String.class, value)); return true;
        case "initearliesttime":
        case "initEarliestTime": target.getConfiguration().setInitEarliestTime(property(camelContext, java.lang.String.class, value)); return true;
        case "latesttime":
        case "latestTime": target.getConfiguration().setLatestTime(property(camelContext, java.lang.String.class, value)); return true;
        case "savedsearch":
        case "savedSearch": target.getConfiguration().setSavedSearch(property(camelContext, java.lang.String.class, value)); return true;
        case "search": target.getConfiguration().setSearch(property(camelContext, java.lang.String.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "streaming": target.getConfiguration().setStreaming(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "eventhost":
        case "eventHost": target.getConfiguration().setEventHost(property(camelContext, java.lang.String.class, value)); return true;
        case "index": target.getConfiguration().setIndex(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "raw": target.getConfiguration().setRaw(property(camelContext, boolean.class, value)); return true;
        case "source": target.getConfiguration().setSource(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcetype":
        case "sourceType": target.getConfiguration().setSourceType(property(camelContext, java.lang.String.class, value)); return true;
        case "tcpreceiverport":
        case "tcpReceiverPort": target.getConfiguration().setTcpReceiverPort(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslprotocol":
        case "sslProtocol": target.getConfiguration().setSslProtocol(property(camelContext, com.splunk.SSLSecurityProtocol.class, value)); return true;
        case "username": target.getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "usesunhttpshandler":
        case "useSunHttpsHandler": target.getConfiguration().setUseSunHttpsHandler(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

