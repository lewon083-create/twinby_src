package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    public static o0 a(Object obj, Object obj2) {
        o0 o0VarB = (o0) obj;
        o0 o0Var = (o0) obj2;
        if (!o0Var.isEmpty()) {
            if (!o0VarB.f1454b) {
                o0VarB = o0VarB.b();
            }
            o0VarB.a();
            if (!o0Var.isEmpty()) {
                o0VarB.putAll(o0Var);
            }
        }
        return o0VarB;
    }
}
