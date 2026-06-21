package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f21 extends BroadcastReceiver implements a21, oy0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f5198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f5199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5200d = true;

    public f21(Context context, ExecutorService executorService) {
        this.f5198b = context;
        this.f5199c = executorService;
    }

    @Override // com.google.android.gms.internal.ads.a21
    public final void a(HashMap map) {
        boolean z5;
        synchronized (this) {
            z5 = this.f5200d;
        }
        map.put("up", Boolean.valueOf(z5));
    }

    @Override // com.google.android.gms.internal.ads.a21
    public final void b(HashMap map) {
        boolean z5;
        synchronized (this) {
            z5 = this.f5200d;
        }
        map.put("up", Boolean.valueOf(z5));
    }

    @Override // com.google.android.gms.internal.ads.a21
    public final void c(HashMap map, Context context, View view) {
        boolean z5;
        synchronized (this) {
            z5 = this.f5200d;
        }
        map.put("up", Boolean.valueOf(z5));
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final ed.d h() {
        return vv.B(new do0(10, this), this.f5199c);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            synchronized (this) {
                this.f5200d = true;
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            synchronized (this) {
                this.f5200d = false;
            }
        }
    }
}
