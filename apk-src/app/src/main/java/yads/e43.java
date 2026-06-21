package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e43 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f43 f38009a;

    public e43(f43 f43Var) {
        this.f38009a = f43Var;
    }

    public static void a(f43 f43Var) {
        int iB = f43.b(f43Var.f38376d, f43Var.f38379g);
        boolean zA = f43.a(f43Var.f38376d, f43Var.f38379g);
        if (f43Var.f38380h == iB && f43Var.i == zA) {
            return;
        }
        f43Var.f38380h = iB;
        f43Var.i = zA;
        ((xn0) f43Var.f38375c).a(zA, iB);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        f43 f43Var = this.f38009a;
        f43Var.f38374b.post(new t.a0(21, f43Var));
    }
}
