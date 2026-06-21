package oe;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f30664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30665c;

    public l(Method method, Object obj) {
        this.f30664b = method;
        this.f30665c = obj;
    }

    @Override // oe.d
    public final Object j(Class cls) {
        d.a(cls);
        return this.f30664b.invoke(this.f30665c, cls);
    }
}
