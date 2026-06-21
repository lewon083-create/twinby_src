package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0[] f1434a;

    @Override // androidx.datastore.preferences.protobuf.r0
    public final b1 a(Class cls) {
        for (r0 r0Var : this.f1434a) {
            if (r0Var.b(cls)) {
                return r0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean b(Class cls) {
        for (r0 r0Var : this.f1434a) {
            if (r0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
