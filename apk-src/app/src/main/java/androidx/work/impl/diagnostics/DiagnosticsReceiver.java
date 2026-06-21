package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import ka.k;
import l7.n;
import m7.l;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1783a = n.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = f1783a;
        n.g().e(str, "Requesting diagnostics", new Throwable[0]);
        try {
            l.O(context).k(new k(DiagnosticsWorker.class).A());
        } catch (IllegalStateException e3) {
            n.g().f(str, "WorkManager is not initialized", e3);
        }
    }
}
