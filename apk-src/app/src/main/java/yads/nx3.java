package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nx3 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ox3 f41391a = ox3.f41764d;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z5;
        ox3 ox3Var;
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            ox3 ox3Var2 = this.f41391a;
            z5 = true;
            ox3Var2.a(true, ox3Var2.f41767c);
            ox3Var = this.f41391a;
        } else {
            if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                return;
            }
            ox3 ox3Var3 = this.f41391a;
            z5 = false;
            ox3Var3.a(false, ox3Var3.f41767c);
            ox3Var = this.f41391a;
        }
        ox3Var.f41766b = z5;
    }
}
