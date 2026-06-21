package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f1439b = new w(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1440a;

    public l0(n nVar) {
        c0.a(nVar, "output");
        this.f1440a = nVar;
        nVar.f1447a = this;
    }

    public void a(int i, Object obj, c1 c1Var) {
        n nVar = (n) this.f1440a;
        nVar.k0(i, 3);
        c1Var.b((a) obj, nVar.f1447a);
        nVar.k0(i, 4);
    }

    public l0() {
        r0 r0Var;
        z0 z0Var = z0.f1519c;
        try {
            r0Var = (r0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            r0Var = f1439b;
        }
        r0[] r0VarArr = {w.f1498b, r0Var};
        k0 k0Var = new k0();
        k0Var.f1434a = r0VarArr;
        Charset charset = c0.f1368a;
        this.f1440a = k0Var;
    }
}
