package com.anf2;

/**
 * @author Stepan Anfi
 * 3/10/2023
 */

public interface ProxyConfigurator {
    Object replaceWithProxyIfNeeded(Object t, Class implClass);
}
