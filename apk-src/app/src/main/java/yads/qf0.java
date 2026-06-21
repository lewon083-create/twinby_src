package yads;

import android.content.Intent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f42286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f42287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f42288c;

    public qf0(Intent intent, sf0 sf0Var, tf0 tf0Var) {
        this.f42286a = intent;
        this.f42287b = sf0Var;
        this.f42288c = tf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf0)) {
            return false;
        }
        qf0 qf0Var = (qf0) obj;
        return Intrinsics.a(this.f42286a, qf0Var.f42286a) && Intrinsics.a(this.f42287b, qf0Var.f42287b) && Intrinsics.a(this.f42288c, qf0Var.f42288c);
    }

    public final int hashCode() {
        return this.f42288c.hashCode() + ((this.f42287b.hashCode() + (this.f42286a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DelegatedActivityLaunchInfo(pendingIntent=" + this.f42286a + ", onLaunchSucceed=" + this.f42287b + ", onLaunchFailed=" + this.f42288c + ")";
    }
}
