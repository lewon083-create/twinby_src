package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class th0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10607d;

    public /* synthetic */ th0(int i, Object obj, Object obj2) {
        this.f10605b = i;
        this.f10606c = obj;
        this.f10607d = obj2;
    }

    private final void a() {
        Object l21Var;
        IInterface iInterface;
        IBinder iBinder = (IBinder) this.f10607d;
        int i = m21.f7748b;
        if (iBinder == null) {
            l21Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
            l21Var = iInterfaceQueryLocalInterface instanceof n21 ? (n21) iInterfaceQueryLocalInterface : new l21(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService", 1);
        }
        w21 w21Var = (w21) this.f10606c;
        yi0 yi0Var = w21Var.f11603b;
        yi0Var.f12630k = l21Var;
        ((fa1) yi0Var.f12625e).a("linkToDeath", new Object[0]);
        try {
            iInterface = (n21) yi0Var.f12630k;
        } catch (RemoteException e3) {
            ((fa1) w21Var.f11603b.f12625e).d(e3, "linkToDeath failed", new Object[0]);
        }
        if (iInterface == null) {
            throw null;
        }
        ((cb.a) iInterface).f2256c.linkToDeath((x21) yi0Var.i, 0);
        yi0 yi0Var2 = w21Var.f11603b;
        yi0Var2.f12622b = false;
        synchronized (((ArrayList) yi0Var2.f12627g)) {
            try {
                Iterator it = ((ArrayList) yi0Var2.f12627g).iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                ((ArrayList) yi0Var2.f12627g).clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void b() {
        g1 g1Var = (g1) this.f10606c;
        synchronized (((vs1) this.f10607d)) {
        }
        String str = cq0.f4293a;
        bv1 bv1Var = g1Var.f5591b.f6261b.f8792t;
        bv1Var.r(bv1Var.w((hy1) bv1Var.f3917d.f6145f), 1013, new zu1(25));
    }

    private final void c() {
        yi0 yi0Var;
        na1 na1Var = (na1) this.f10606c;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.f10607d;
        if (((aw1) na1Var.f8261e) == null || (yi0Var = (yi0) ((com.google.android.gms.internal.consent_sdk.c) ((xo0) na1Var.f8262f).f12221c).f13342f) == null || audioDeviceInfo.equals((AudioDeviceInfo) yi0Var.f12629j)) {
            return;
        }
        yi0Var.f12629j = audioDeviceInfo;
        yi0Var.h(hv1.a((Context) yi0Var.f12623c, (s50) yi0Var.f12630k, audioDeviceInfo));
    }

    private final void d() {
        b4.d dVar = (b4.d) this.f10606c;
        th0 th0Var = (th0) this.f10607d;
        ((yw1) dVar.f1869f).b();
        b4.h hVar = (b4.h) dVar.f1868e;
        synchronized (hVar.f1886b) {
            hVar.d();
            th0Var.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0286 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.th0.run():void");
    }

    public /* synthetic */ th0(ht0 ht0Var, Object obj, int i) {
        this.f10605b = i;
        this.f10606c = obj;
        this.f10607d = ht0Var;
    }

    public th0(c6 c6Var, WebView webView, String str) {
        this.f10605b = 13;
        this.f10606c = webView;
        this.f10607d = str;
    }
}
