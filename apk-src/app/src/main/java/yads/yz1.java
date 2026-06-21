package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yz1 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f45205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z00 f45206b;

    public /* synthetic */ yz1() {
        this(new Handler(Looper.getMainLooper()));
    }

    public static final void c(yz1 yz1Var) {
        z00 z00Var = yz1Var.f45206b;
        if (z00Var != null) {
            z00Var.onReturnedToApplication();
        }
    }

    public final void a() {
        this.f45205a.post(new zl.e1(this, 1));
    }

    public final void b() {
        this.f45205a.post(new zl.e1(this, 0));
    }

    @Override // yads.g1
    public final void onReturnedToApplication() {
        this.f45205a.post(new zl.e1(this, 2));
    }

    public static final void a(yz1 yz1Var) {
        z00 z00Var = yz1Var.f45206b;
        if (z00Var != null) {
            z00Var.closeNativeAd();
        }
    }

    public static final void b(yz1 yz1Var) {
        z00 z00Var = yz1Var.f45206b;
        if (z00Var != null) {
            z00Var.onAdClicked();
        }
        z00 z00Var2 = yz1Var.f45206b;
        if (z00Var2 != null) {
            z00Var2.onLeftApplication();
        }
    }

    public yz1(Handler handler) {
        this.f45205a = handler;
    }

    public final void a(j5 j5Var) {
        this.f45205a.post(new zl.n(10, this, j5Var));
    }

    public static final void a(yz1 yz1Var, j5 j5Var) {
        z00 z00Var = yz1Var.f45206b;
        if (z00Var != null) {
            z00Var.a(j5Var);
        }
    }
}
