package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nx0 extends lx0 {
    public static nx0 i;

    public static final nx0 f(Context context) {
        nx0 nx0Var;
        synchronized (nx0.class) {
            try {
                if (i == null) {
                    i = new nx0(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
                }
                nx0Var = i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nx0Var;
    }

    public final jx0 g(long j10, boolean z5) {
        boolean z10;
        synchronized (nx0.class) {
            try {
                kx0 kx0Var = this.f7673g;
                kx0Var.getClass();
                synchronized (kx0.class) {
                    z10 = ((SharedPreferences) ((n90) kx0Var.f7326c).f8249d).getBoolean("paidv2_publisher_option", true);
                }
                if (z10) {
                    return a(null, null, j10, z5);
                }
                return new jx0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        synchronized (nx0.class) {
            try {
                n90 n90Var = this.f7672f;
                if (((SharedPreferences) n90Var.f8249d).contains(this.f7667a)) {
                    c(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
