package com.google.gson.internal.bind;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import me.w;
import me.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class CollectionTypeAdapterFactory implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l6.i f14920b;

    public CollectionTypeAdapterFactory(l6.i iVar) {
        this.f14920b = iVar;
    }

    @Override // me.x
    public final w a(me.k kVar, com.google.gson.reflect.a aVar) {
        Type type = aVar.getType();
        Class rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        oe.d.c(Collection.class.isAssignableFrom(rawType));
        Type typeL = oe.d.l(type, rawType, oe.d.g(type, rawType, Collection.class), new HashMap());
        if (typeL instanceof WildcardType) {
            typeL = ((WildcardType) typeL).getUpperBounds()[0];
        }
        Class cls = typeL instanceof ParameterizedType ? ((ParameterizedType) typeL).getActualTypeArguments()[0] : Object.class;
        return new n(kVar, cls, kVar.d(com.google.gson.reflect.a.get(cls)), this.f14920b.d(aVar));
    }
}
