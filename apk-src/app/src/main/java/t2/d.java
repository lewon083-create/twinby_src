package t2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements p2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2.h f33402a;

    public d(p2.h delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f33402a = delegate;
    }

    @Override // p2.h
    public final Object a(Function2 function2, oj.c cVar) {
        return this.f33402a.a(new c(function2, null, 0), cVar);
    }

    @Override // p2.h
    public final kk.e getData() {
        return this.f33402a.getData();
    }
}
