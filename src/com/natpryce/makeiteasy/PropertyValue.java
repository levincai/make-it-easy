package com.natpryce.makeiteasy;

import com.natpryce.makeiteasy.Property;
import com.natpryce.makeiteasy.PropertyCollector;
import com.natpryce.makeiteasy.PropertyProvider;

public class PropertyValue<T,V> implements PropertyProvider<T> {
    public final Property<T,V> property;
    public final V value;
    
    public PropertyValue(Property<T,V> property, V value) {
        this.property = property;
        this.value = value;
    }

    public void providePropertiesTo(PropertyCollector<? extends T> propertyCollector) {
        propertyCollector.collectPropertyValue(this);
    }
}