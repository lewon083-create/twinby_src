package x0;

import com.google.android.gms.internal.measurement.b4;
import g0.s1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0.c0 f35624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f35625b;

    @Override // g0.s1
    public final void a(Object obj) {
        f2.g.h("SourceStreamRequirementObserver can be updated from main thread only", b4.E());
        boolean zEquals = Boolean.TRUE.equals((Boolean) obj);
        if (this.f35625b == zEquals) {
            return;
        }
        this.f35625b = zEquals;
        g0.c0 c0Var = this.f35624a;
        if (c0Var == null) {
            com.google.android.gms.internal.auth.g.e("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
        } else if (zEquals) {
            c0Var.p();
        } else {
            c0Var.c();
        }
    }

    public final void b() {
        f2.g.h("SourceStreamRequirementObserver can be closed from main thread only", b4.E());
        com.google.android.gms.internal.auth.g.e("VideoCapture", "SourceStreamRequirementObserver#close: mIsSourceStreamRequired = " + this.f35625b);
        g0.c0 c0Var = this.f35624a;
        if (c0Var == null) {
            com.google.android.gms.internal.auth.g.e("VideoCapture", "SourceStreamRequirementObserver#close: Already closed!");
            return;
        }
        if (this.f35625b) {
            this.f35625b = false;
            if (c0Var != null) {
                c0Var.c();
            } else {
                com.google.android.gms.internal.auth.g.e("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
            }
        }
        this.f35624a = null;
    }

    @Override // g0.s1
    public final void onError(Throwable th2) {
        com.google.android.gms.internal.auth.g.P("VideoCapture", "SourceStreamRequirementObserver#onError", th2);
    }
}
