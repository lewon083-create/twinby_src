package com.google.firebase.messaging;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.ads.kw0;
import com.google.android.gms.internal.ads.vy;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14789a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f14790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f14791c;

    public /* synthetic */ a0() {
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        vy vyVar = (vy) this.f14791c;
        if (vyVar != null) {
            Context context = ((FirebaseMessaging) vyVar.f11529e).f14766b;
            this.f14790b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f14789a) {
            case 0:
                vy vyVar = (vy) this.f14791c;
                if (vyVar != null && vyVar.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    vy vyVar2 = (vy) this.f14791c;
                    ((FirebaseMessaging) vyVar2.f11529e).getClass();
                    FirebaseMessaging.b(vyVar2, 0L);
                    Context context2 = this.f14790b;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f14791c = null;
                    return;
                }
                return;
            default:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    l6.i iVar = (l6.i) this.f14791c;
                    oa.n nVar = (oa.n) ((ed.c) iVar.f27979d).f16336d;
                    nVar.f29864d.set(null);
                    kw0 kw0Var = nVar.f29868h.f29849o;
                    kw0Var.sendMessage(kw0Var.obtainMessage(3));
                    AlertDialog alertDialog = (AlertDialog) iVar.f27978c;
                    if (alertDialog.isShowing()) {
                        alertDialog.dismiss();
                    }
                    synchronized (this) {
                        try {
                            Context context3 = this.f14790b;
                            if (context3 != null) {
                                context3.unregisterReceiver(this);
                            }
                            this.f14790b = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public a0(l6.i iVar) {
        this.f14791c = iVar;
    }
}
