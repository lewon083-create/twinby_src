package com.google.gson.internal.bind;

import java.lang.reflect.Field;
import java.security.PrivilegedAction;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements PrivilegedAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Field f14986a;

    public o(Field field) {
        this.f14986a = field;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        this.f14986a.setAccessible(true);
        return null;
    }
}
