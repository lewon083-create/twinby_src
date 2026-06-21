package com.google.gson.internal.bind;

import me.v;
import me.w;
import me.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l6.i f14921b;

    public JsonAdapterAnnotationTypeAdapterFactory(l6.i iVar) {
        this.f14921b = iVar;
    }

    public static w b(l6.i iVar, me.k kVar, com.google.gson.reflect.a aVar, ne.a aVar2) {
        w kVar2;
        Object objL = iVar.d(com.google.gson.reflect.a.get(aVar2.value())).l();
        if (objL instanceof w) {
            kVar2 = (w) objL;
        } else if (objL instanceof x) {
            kVar2 = ((x) objL).a(kVar, aVar);
        } else {
            boolean z5 = objL instanceof v;
            if (!z5 && !(objL instanceof me.o)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objL.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            kVar2 = new k(z5 ? (v) objL : null, objL instanceof me.o ? (me.o) objL : null, kVar, aVar, null);
        }
        return (kVar2 == null || !aVar2.nullSafe()) ? kVar2 : new m(kVar2, 3);
    }

    @Override // me.x
    public final w a(me.k kVar, com.google.gson.reflect.a aVar) {
        ne.a aVar2 = (ne.a) aVar.getRawType().getAnnotation(ne.a.class);
        if (aVar2 == null) {
            return null;
        }
        return b(this.f14921b, kVar, aVar, aVar2);
    }
}
