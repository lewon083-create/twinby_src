package com.google.gson.internal.bind;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import me.w;
import me.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class MapTypeAdapterFactory implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l6.i f14922b;

    public MapTypeAdapterFactory(l6.i iVar) {
        this.f14922b = iVar;
    }

    @Override // me.x
    public final w a(me.k kVar, com.google.gson.reflect.a aVar) {
        Type[] actualTypeArguments;
        Type type = aVar.getType();
        if (!Map.class.isAssignableFrom(aVar.getRawType())) {
            return null;
        }
        Class clsH = oe.d.h(type);
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            oe.d.c(Map.class.isAssignableFrom(clsH));
            Type typeL = oe.d.l(type, clsH, oe.d.g(type, clsH, Map.class), new HashMap());
            actualTypeArguments = typeL instanceof ParameterizedType ? ((ParameterizedType) typeL).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        Type[] typeArr = actualTypeArguments;
        return new e(this, kVar, typeArr[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? p.f14989c : kVar.d(com.google.gson.reflect.a.get(type2)), typeArr[1], kVar.d(com.google.gson.reflect.a.get(actualTypeArguments[1])), this.f14922b.d(aVar));
    }
}
