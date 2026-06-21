package com.google.gson.internal.bind;

import me.w;
import me.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
class TypeAdapters$32 implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f14934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f14935c;

    public TypeAdapters$32(Class cls, w wVar) {
        this.f14934b = cls;
        this.f14935c = wVar;
    }

    @Override // me.x
    public final w a(me.k kVar, com.google.gson.reflect.a aVar) {
        if (aVar.getRawType() == this.f14934b) {
            return this.f14935c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f14934b.getName() + ",adapter=" + this.f14935c + "]";
    }
}
