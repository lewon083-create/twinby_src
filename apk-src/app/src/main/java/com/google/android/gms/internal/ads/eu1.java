package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eu1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5073f;

    public /* synthetic */ eu1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f5069b = i;
        this.f5070c = obj;
        this.f5071d = obj2;
        this.f5072e = obj3;
        this.f5073f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ii iiVar;
        boolean z5;
        long j10;
        switch (this.f5069b) {
            case 0:
                Pair pair = (Pair) this.f5071d;
                ((bv1) ((gu1) this.f5070c).f5907b.f12166j).f(((Integer) pair.first).intValue(), (hy1) pair.second, (zx1) this.f5072e, (ey1) this.f5073f);
                return;
            case 1:
                Pair pair2 = (Pair) this.f5071d;
                ((bv1) ((gu1) this.f5070c).f5907b.f12166j).a(((Integer) pair2.first).intValue(), (hy1) pair2.second, (zx1) this.f5072e, (ey1) this.f5073f);
                return;
            default:
                ni niVar = (ni) this.f5073f;
                ki kiVar = (ki) this.f5071d;
                oq0 oq0Var = (oq0) this.f5070c;
                try {
                    mi miVar = (mi) kiVar.n();
                    boolean zX = kiVar.x();
                    li liVar = (li) this.f5072e;
                    if (zX) {
                        Parcel parcelD0 = miVar.D0();
                        vg.c(parcelD0, liVar);
                        Parcel parcelP1 = miVar.p1(parcelD0, 2);
                        iiVar = (ii) vg.b(parcelP1, ii.CREATOR);
                        parcelP1.recycle();
                    } else {
                        Parcel parcelD02 = miVar.D0();
                        vg.c(parcelD02, liVar);
                        Parcel parcelP12 = miVar.p1(parcelD02, 1);
                        iiVar = (ii) vg.b(parcelP12, ii.CREATOR);
                        parcelP12.recycle();
                    }
                    if (!iiVar.c()) {
                        niVar.d(new RuntimeException("No entry contents."));
                        ((com.google.android.gms.internal.measurement.i4) oq0Var.f8764e).t();
                        return;
                    }
                    oi oiVar = new oi(oq0Var, iiVar.e());
                    int i = oiVar.read();
                    if (i == -1) {
                        throw new IOException("Unable to read from cache.");
                    }
                    oiVar.unread(i);
                    synchronized (iiVar) {
                        z5 = iiVar.f6496c;
                    }
                    boolean zG = iiVar.g();
                    synchronized (iiVar) {
                        j10 = iiVar.f6498e;
                    }
                    niVar.b(new qi(oiVar, z5, zG, j10, iiVar.f()));
                    return;
                } catch (RemoteException e3) {
                    e = e3;
                    u9.i.f("Unable to obtain a cache service instance.", e);
                    niVar.d(e);
                    ((com.google.android.gms.internal.measurement.i4) oq0Var.f8764e).t();
                    return;
                } catch (IOException e7) {
                    e = e7;
                    u9.i.f("Unable to obtain a cache service instance.", e);
                    niVar.d(e);
                    ((com.google.android.gms.internal.measurement.i4) oq0Var.f8764e).t();
                    return;
                }
        }
    }
}
