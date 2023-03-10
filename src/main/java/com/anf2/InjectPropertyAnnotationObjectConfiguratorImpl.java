package com.anf2;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/**
 * @author Stepan Anfi
 * 3/9/2023
 */
public class InjectPropertyAnnotationObjectConfiguratorImpl implements ObjectConfigurator {
    private Map<String, String> propertiesMap;

    @SneakyThrows
    public InjectPropertyAnnotationObjectConfiguratorImpl() {
        String path = ClassLoader.getSystemClassLoader().getResource("application.properties").getPath();
        Stream<String> lines = new BufferedReader(new FileReader(path)).lines();
        propertiesMap = lines.map(line -> line.split("=")).collect(toMap(arr -> arr[0], arr -> arr[1]));
    }

    @Override
    @SneakyThrows
    public void configure(Object t, ApplicationContext context) {
        Class<?> implClass = t.getClass();
        for (Field field : implClass.getDeclaredFields()) {
            InjectProperty annotation = field.getAnnotation(InjectProperty.class);

            if (annotation != null) {
                String value;
                if (annotation.value().isEmpty()) {
                    value = propertiesMap.get(field.getName());
                } else {
                    value = propertiesMap.get(annotation.value());
                }

                field.setAccessible(true);
                field.set(t, value);
            }
        }
    }
}
