package com.google.android.gms.internal.ads;

import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uz implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11136b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11138d;

    public /* synthetic */ uz(k00 k00Var, long j10) {
        this.f11138d = k00Var;
        this.f11137c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11136b) {
            case 0:
                ((k00) this.f11138d).f7056b.U0(this.f11137c, true);
                break;
            case 1:
                FlutterJNI flutterJNI = (FlutterJNI) this.f11138d;
                if (flutterJNI.isAttached()) {
                    flutterJNI.unregisterTexture(this.f11137c);
                    break;
                }
                break;
            case 2:
                ((ob.x) this.f11138d).I(this.f11137c);
                break;
            default:
                ob.u2 u2Var = (ob.u2) this.f11138d;
                ob.x xVar = ((ob.l1) u2Var.f15951b).f30272o;
                ob.l1.f(xVar);
                xVar.F(this.f11137c);
                u2Var.f30446f = null;
                break;
        }
    }

    public uz(ob.x xVar, long j10) {
        this.f11137c = j10;
        Objects.requireNonNull(xVar);
        this.f11138d = xVar;
    }

    public uz(ob.u2 u2Var, long j10) {
        this.f11137c = j10;
        Objects.requireNonNull(u2Var);
        this.f11138d = u2Var;
    }

    public uz(long j10, FlutterJNI flutterJNI) {
        this.f11137c = j10;
        this.f11138d = flutterJNI;
    }
}
