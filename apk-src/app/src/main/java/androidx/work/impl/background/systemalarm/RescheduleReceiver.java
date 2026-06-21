package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import l7.n;
import m7.l;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1776a = n.i("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        n.g().e(f1776a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            l lVarO = l.O(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (l.f28729m) {
                try {
                    lVarO.f28737j = pendingResultGoAsync;
                    if (lVarO.i) {
                        pendingResultGoAsync.finish();
                        lVarO.f28737j = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (IllegalStateException e3) {
            n.g().f(f1776a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e3);
        }
    }
}
