package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gv0 implements pa.b, pa.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rv0 f5908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ng f5911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue f5912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HandlerThread f5913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dv0 f5914h;
    public final long i;

    public gv0(Context context, ng ngVar, String str, String str2, dv0 dv0Var) {
        this.f5909c = str;
        this.f5911e = ngVar;
        this.f5910d = str2;
        this.f5914h = dv0Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f5913g = handlerThread;
        handlerThread.start();
        this.i = System.currentTimeMillis();
        rv0 rv0Var = new rv0(context, handlerThread.getLooper(), this, this, 19621000);
        this.f5908b = rv0Var;
        this.f5912f = new LinkedBlockingQueue();
        rv0Var.d();
    }

    public final void a() {
        rv0 rv0Var = this.f5908b;
        if (rv0Var != null) {
            if (rv0Var.r() || rv0Var.s()) {
                rv0Var.f();
            }
        }
    }

    public final void b(int i, long j10, Exception exc) {
        dv0 dv0Var = this.f5914h;
        if (dv0Var != null) {
            dv0Var.c(i, System.currentTimeMillis() - j10, exc);
        }
    }

    @Override // pa.c
    public final void c0(ma.b bVar) {
        try {
            b(4012, this.i, null);
            this.f5912f.put(new xv0());
        } catch (InterruptedException unused) {
        }
    }

    @Override // pa.b
    public final void l0(int i) {
        try {
            b(4011, this.i, null);
            this.f5912f.put(new xv0());
        } catch (InterruptedException unused) {
        }
    }

    @Override // pa.b
    public final void n0() {
        uv0 uv0Var;
        long j10 = this.i;
        HandlerThread handlerThread = this.f5913g;
        try {
            uv0Var = (uv0) this.f5908b.n();
        } catch (DeadObjectException | IllegalStateException unused) {
            uv0Var = null;
        }
        if (uv0Var != null) {
            try {
                wv0 wv0Var = new wv0(1, 1, this.f5911e.f8295b, this.f5909c, this.f5910d);
                Parcel parcelD0 = uv0Var.D0();
                vg.c(parcelD0, wv0Var);
                Parcel parcelP1 = uv0Var.p1(parcelD0, 3);
                xv0 xv0Var = (xv0) vg.b(parcelP1, xv0.CREATOR);
                parcelP1.recycle();
                b(5011, j10, null);
                this.f5912f.put(xv0Var);
            } finally {
                try {
                } finally {
                }
            }
        }
    }
}
