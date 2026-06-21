package oe;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f30668b;

    public n(Method method) {
        this.f30668b = method;
    }

    @Override // oe.d
    public final Object j(Class cls) {
        d.a(cls);
        return this.f30668b.invoke(null, cls, Object.class);
    }
}
