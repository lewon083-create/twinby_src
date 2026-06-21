package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final en f5394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f5395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f5396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f5397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5399f;

    public fn(en enVar) {
        double dG;
        int i;
        xa.a aVarJ;
        this.f5394a = enVar;
        Uri uriL = null;
        try {
            aVarJ = enVar.j();
        } catch (RemoteException e3) {
            u9.i.f("", e3);
        }
        Drawable drawable = aVarJ != null ? (Drawable) xa.b.X1(aVarJ) : null;
        this.f5395b = drawable;
        try {
            uriL = this.f5394a.l();
        } catch (RemoteException e7) {
            u9.i.f("", e7);
        }
        this.f5396c = uriL;
        try {
            dG = this.f5394a.g();
        } catch (RemoteException e10) {
            u9.i.f("", e10);
            dG = 1.0d;
        }
        this.f5397d = dG;
        int iC = -1;
        try {
            i = this.f5394a.i();
        } catch (RemoteException e11) {
            u9.i.f("", e11);
            i = -1;
        }
        this.f5398e = i;
        try {
            iC = this.f5394a.c();
        } catch (RemoteException e12) {
            u9.i.f("", e12);
        }
        this.f5399f = iC;
    }
}
