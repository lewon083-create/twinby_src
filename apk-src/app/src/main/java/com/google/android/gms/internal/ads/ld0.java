package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ld0 implements sr0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7487b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7489d;

    public ld0(si siVar, Map map) {
        this.f7488c = map;
        this.f7489d = siVar;
    }

    @Override // com.google.android.gms.internal.ads.sr0
    public final void b(String str) {
        int i = this.f7487b;
    }

    @Override // com.google.android.gms.internal.ads.sr0
    public final void g(pr0 pr0Var, String str, Throwable th2) {
        switch (this.f7487b) {
            case 0:
                Map map = (Map) this.f7488c;
                if (map.containsKey(pr0Var)) {
                    ((si) this.f7489d).b(((kd0) map.get(pr0Var)).f7202c);
                    return;
                }
                return;
            default:
                if (((Boolean) q9.s.f31967e.f31970c.a(al.W6)).booleanValue() && pr0.RENDERER == pr0Var) {
                    eh0 eh0Var = (eh0) this.f7488c;
                    if (eh0Var.b() != 0) {
                        p9.k.C.f31304k.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - eh0Var.b();
                        synchronized (eh0Var) {
                            synchronized (eh0Var.f4961j) {
                                eh0Var.f4957e = jElapsedRealtime;
                                break;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.sr0
    public final void x(pr0 pr0Var, String str) {
        switch (this.f7487b) {
            case 0:
                Map map = (Map) this.f7488c;
                if (map.containsKey(pr0Var)) {
                    ((si) this.f7489d).b(((kd0) map.get(pr0Var)).f7200a);
                    return;
                }
                return;
            default:
                if (((Boolean) q9.s.f31967e.f31970c.a(al.W6)).booleanValue()) {
                    if (pr0.RENDERER == pr0Var) {
                        eh0 eh0Var = (eh0) this.f7488c;
                        p9.k.C.f31304k.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        synchronized (eh0Var) {
                            synchronized (eh0Var.i) {
                                eh0Var.f4956d = jElapsedRealtime;
                                break;
                            }
                        }
                        return;
                    }
                    if (pr0.PRELOADED_LOADER == pr0Var || pr0.SERVER_TRANSACTION == pr0Var) {
                        eh0 eh0Var2 = (eh0) this.f7488c;
                        p9.k.C.f31304k.getClass();
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        synchronized (eh0Var2) {
                            synchronized (eh0Var2.f4958f) {
                                eh0Var2.f4953a = jElapsedRealtime2;
                                break;
                            }
                        }
                        fh0 fh0Var = (fh0) this.f7489d;
                        ((ut) fh0Var.f2254c).e(new com.google.android.gms.ads.identifier.c(fh0Var, eh0Var2.a(), 5));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.sr0
    public final void y(pr0 pr0Var, String str) {
        switch (this.f7487b) {
            case 0:
                Map map = (Map) this.f7488c;
                if (map.containsKey(pr0Var)) {
                    ((si) this.f7489d).b(((kd0) map.get(pr0Var)).f7201b);
                    return;
                }
                return;
            default:
                if (((Boolean) q9.s.f31967e.f31970c.a(al.W6)).booleanValue() && pr0.RENDERER == pr0Var) {
                    eh0 eh0Var = (eh0) this.f7488c;
                    if (eh0Var.b() != 0) {
                        p9.k.C.f31304k.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - eh0Var.b();
                        synchronized (eh0Var) {
                            synchronized (eh0Var.f4961j) {
                                eh0Var.f4957e = jElapsedRealtime;
                                break;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ld0(eh0 eh0Var, fh0 fh0Var) {
        this.f7488c = eh0Var;
        this.f7489d = fh0Var;
    }

    private final void a(String str) {
    }

    private final void c(String str) {
    }
}
