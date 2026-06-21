package yads;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nm2 implements zj.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f41294a;

    public nm2(Object obj) {
        this.f41294a = new WeakReference(obj);
    }

    @Override // zj.c
    public final Object getValue(Object obj, dk.i iVar) {
        return this.f41294a.get();
    }

    @Override // zj.d
    public final void setValue(Object obj, dk.i iVar, Object obj2) {
        this.f41294a = new WeakReference(obj2);
    }
}
