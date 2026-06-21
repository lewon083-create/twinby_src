package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends Binder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a7.l f14840b;

    public i0(a7.l lVar) {
        this.f14840b = lVar;
    }

    public final void a(j0 j0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        f.access$000((f) this.f14840b.f491c, j0Var.f14843a).b(new com.yandex.div.core.dagger.b(1), new a0.a0(6, j0Var));
    }
}
