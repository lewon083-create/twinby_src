package yads;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q2 implements f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f42138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z9 f42139b;

    public q2(Activity activity, z9 z9Var) {
        this.f42138a = activity;
        this.f42139b = z9Var;
    }

    public final void a(int i, Bundle bundle) {
        z9 z9Var = this.f42139b;
        if (z9Var != null) {
            z9Var.a(i, bundle);
        }
    }
}
