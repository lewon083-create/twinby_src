package com.google.gson.internal.bind;

import me.w;
import me.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
class TypeAdapters$35 implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f14940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f14941c;

    public TypeAdapters$35(Class cls, w wVar) {
        this.f14940b = cls;
        this.f14941c = wVar;
    }

    @Override // me.x
    public final w a(me.k kVar, com.google.gson.reflect.a aVar) {
        Class<?> rawType = aVar.getRawType();
        if (this.f14940b.isAssignableFrom(rawType)) {
            return new n(this, rawType);
        }
        return null;
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.f14940b.getName() + ",adapter=" + this.f14941c + "]";
    }
}
