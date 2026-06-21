package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m1 f13837e;

    public j1(m1 m1Var, boolean z5) {
        Objects.requireNonNull(m1Var);
        this.f13837e = m1Var;
        this.f13834b = System.currentTimeMillis();
        this.f13835c = SystemClock.elapsedRealtime();
        this.f13836d = z5;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        m1 m1Var = this.f13837e;
        if (m1Var.f13881d) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e3) {
            m1Var.d(e3, false, this.f13836d);
            b();
        }
    }

    public void b() {
    }
}
