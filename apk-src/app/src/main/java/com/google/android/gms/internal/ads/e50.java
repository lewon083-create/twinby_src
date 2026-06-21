package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e50 implements z60, q9.a, q70, r60, i60, a80 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ua.a f4837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xw f4838c;

    public e50(ua.a aVar, xw xwVar) {
        this.f4837b = aVar;
        this.f4838c = xwVar;
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void D(wj wjVar) {
        xw xwVar = this.f4838c;
        synchronized (xwVar.f12354d) {
            dx dxVar = xwVar.f12352b;
            synchronized (dxVar.f4700b) {
                dxVar.f4703e.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void H() {
        xw xwVar = this.f4838c;
        synchronized (xwVar.f12354d) {
            try {
                if (xwVar.f12360k != -1) {
                    LinkedList linkedList = xwVar.f12353c;
                    if (!linkedList.isEmpty()) {
                        ww wwVar = (ww) linkedList.getLast();
                        if (wwVar.f11910b == -1) {
                            wwVar.f11911c.f12351a.getClass();
                            wwVar.f11910b = SystemClock.elapsedRealtime();
                            xwVar.f12352b.a(xwVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final void k() {
        xw xwVar = this.f4838c;
        synchronized (xwVar.f12354d) {
            try {
                if (xwVar.f12360k != -1) {
                    xwVar.f12351a.getClass();
                    xwVar.f12358h = SystemClock.elapsedRealtime();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void l(eq0 eq0Var) {
        ua.a aVar = this.f4837b;
        xw xwVar = this.f4838c;
        aVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (xwVar.f12354d) {
            try {
                xwVar.f12360k = jElapsedRealtime;
                if (jElapsedRealtime != -1) {
                    xwVar.f12352b.a(xwVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // q9.a
    public final void onAdClicked() {
        xw xwVar = this.f4838c;
        synchronized (xwVar.f12354d) {
            if (xwVar.f12360k != -1) {
                ww wwVar = new ww(xwVar);
                wwVar.f11911c.f12351a.getClass();
                wwVar.f11909a = SystemClock.elapsedRealtime();
                xwVar.f12353c.add(wwVar);
                xwVar.i++;
                dx dxVar = xwVar.f12352b;
                synchronized (dxVar.f4700b) {
                    cx cxVar = dxVar.f4703e;
                    synchronized (cxVar.f4357f) {
                        cxVar.f4360j++;
                    }
                }
                dxVar.a(xwVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void y(wj wjVar) {
        xw xwVar = this.f4838c;
        synchronized (xwVar.f12354d) {
            dx dxVar = xwVar.f12352b;
            synchronized (dxVar.f4700b) {
                dxVar.f4703e.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void z() {
        xw xwVar = this.f4838c;
        synchronized (xwVar.f12354d) {
            try {
                if (xwVar.f12360k != -1 && xwVar.f12357g == -1) {
                    xwVar.f12351a.getClass();
                    xwVar.f12357g = SystemClock.elapsedRealtime();
                    xwVar.f12352b.a(xwVar);
                }
                dx dxVar = xwVar.f12352b;
                synchronized (dxVar.f4700b) {
                    cx cxVar = dxVar.f4703e;
                    synchronized (cxVar.f4357f) {
                        cxVar.f4361k++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void N() {
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void i() {
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void r() {
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void w() {
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void A(boolean z5) {
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void B(wj wjVar) {
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void E(ku kuVar) {
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void x(boolean z5) {
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void F(ru ruVar, String str, String str2) {
    }
}
