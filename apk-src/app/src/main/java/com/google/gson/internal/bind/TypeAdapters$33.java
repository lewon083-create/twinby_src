package com.google.gson.internal.bind;

import me.w;
import me.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
class TypeAdapters$33 implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f14936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Class f14937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f14938d;

    public TypeAdapters$33(Class cls, Class cls2, w wVar) {
        this.f14936b = cls;
        this.f14937c = cls2;
        this.f14938d = wVar;
    }

    @Override // me.x
    public final w a(me.k kVar, com.google.gson.reflect.a aVar) {
        Class rawType = aVar.getRawType();
        if (rawType == this.f14936b || rawType == this.f14937c) {
            return this.f14938d;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f14937c.getName() + "+" + this.f14936b.getName() + ",adapter=" + this.f14938d + "]";
    }
}
