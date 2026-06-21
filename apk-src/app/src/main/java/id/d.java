package id;

import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.internal.measurement.m1;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseAnalytics f21299c;

    public d(FirebaseAnalytics firebaseAnalytics, int i) {
        this.f21298b = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(firebaseAnalytics);
                this.f21299c = firebaseAnalytics;
                break;
            default:
                Objects.requireNonNull(firebaseAnalytics);
                this.f21299c = firebaseAnalytics;
                break;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f21298b) {
            case 0:
                m1 m1Var = this.f21299c.f14753a;
                m1Var.getClass();
                g0 g0Var = new g0();
                m1Var.c(new f1(m1Var, g0Var, 5));
                return g0Var.l0(120000L);
            default:
                m1 m1Var2 = this.f21299c.f14753a;
                m1Var2.getClass();
                g0 g0Var2 = new g0();
                m1Var2.c(new f1(m1Var2, g0Var2, 6));
                return (Long) g0.D0(g0Var2.n0(120000L), Long.class);
        }
    }
}
