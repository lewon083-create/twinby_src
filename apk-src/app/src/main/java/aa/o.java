package aa;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.internal.ads.al;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PackageInfo f675e;

    public o(Context context, long j10, PackageInfo packageInfo, a0 a0Var, ScheduledExecutorService scheduledExecutorService) {
        this.f671a = context;
        this.f673c = j10;
        this.f675e = packageInfo;
        this.f672b = a0Var;
        this.f674d = scheduledExecutorService;
    }

    public static final void b(int i, Bundle bundle) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3241v8)).booleanValue()) {
            a0.u.u(p9.k.C.f31304k, bundle, a0.u.c(i));
        }
    }

    public static final void c(int i, Bundle bundle) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i - 1);
    }

    public final boolean a() {
        return this.f672b.d().size() >= ((Integer) q9.s.f31967e.f31970c.a(al.f3227u8)).intValue();
    }
}
