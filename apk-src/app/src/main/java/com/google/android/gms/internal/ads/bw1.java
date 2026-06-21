package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bw1 implements td0, lx1, mb0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ bw1 f3933c = new bw1(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ bw1 f3934d = new bw1(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ bw1 f3935e = new bw1(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ bw1 f3936f = new bw1(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ bw1 f3937g = new bw1(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ bw1 f3938h = new bw1(7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3939b;

    public /* synthetic */ bw1(int i) {
        this.f3939b = i;
    }

    @Override // com.google.android.gms.internal.ads.lx1
    public /* synthetic */ int a(Object obj) {
        HashMap map = mx1.f8033a;
        String str = ((dx1) obj).f4712a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public bw1(Context context) {
        this.f3939b = 6;
        new n90(context, 20);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.clear();
        map2.clear();
    }

    @Override // com.google.android.gms.internal.ads.td0
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void mo0a(Object obj) {
        b bVar;
        switch (this.f3939b) {
            case 0:
                ((iw1) obj).a();
                return;
            case 1:
                ((iw1) obj).a();
                return;
            case 2:
                pp0 pp0Var = ((kw1) obj).f7322a.f8472l;
                if (pp0Var != null) {
                    pw1 pw1Var = (pw1) pp0Var.f9149c;
                    synchronized (pw1Var.f5931b) {
                        bVar = pw1Var.f5962s;
                        break;
                    }
                    if (bVar != null) {
                        synchronized (bVar.f3523c) {
                            bVar.f3525e.getClass();
                            break;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ez1) obj).getClass();
                return;
        }
    }
}
