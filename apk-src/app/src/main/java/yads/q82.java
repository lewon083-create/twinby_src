package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q82 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r82 f42217a;

    public q82(r82 r82Var) {
        this.f42217a = r82Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iB = r82.b(context);
        if (lb3.f40466a < 31 || iB != 5) {
            this.f42217a.a(iB);
        } else {
            o82.a(context, this.f42217a);
        }
    }
}
