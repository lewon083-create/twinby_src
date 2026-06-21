package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class il extends q.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f6526c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f6527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sd0 f6528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.google.firebase.messaging.y f6529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q.g f6530g;

    @Override // q.h
    public final void a(q.g gVar) {
        this.f6530g = gVar;
        try {
            ((b.b) gVar.f31543a).E0();
        } catch (RemoteException unused) {
        }
        this.f6529f = gVar.c(new hl(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f6530g = null;
        this.f6529f = null;
    }
}
