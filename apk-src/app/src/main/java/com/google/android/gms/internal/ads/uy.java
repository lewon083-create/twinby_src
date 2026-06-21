package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class uy implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11127b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11131f;

    public /* synthetic */ uy(k00 k00Var, View view, wv wvVar, int i) {
        this.f11129d = k00Var;
        this.f11130e = view;
        this.f11131f = wvVar;
        this.f11128c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11127b) {
            case 0:
                HashMap map = new HashMap();
                map.put("event", "precacheComplete");
                map.put("src", (String) this.f11129d);
                map.put("cachedSrc", (String) this.f11130e);
                map.put("totalBytes", Integer.toString(this.f11128c));
                ((xy) this.f11131f).n(map);
                return;
            case 1:
                ((k00) this.f11129d).l((View) this.f11130e, (wv) this.f11131f, this.f11128c - 1);
                return;
            default:
                v21 v21Var = (v21) this.f11129d;
                s21 s21Var = (s21) this.f11130e;
                int i = this.f11128c;
                ni.i iVar = (ni.i) this.f11131f;
                String str = v21Var.f11219b;
                try {
                    yi0 yi0Var = v21Var.f11218a;
                    if (yi0Var == null) {
                        throw null;
                    }
                    n21 n21Var = (n21) yi0Var.f12630k;
                    if (n21Var == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str);
                    bundle.putInt("displayMode", i);
                    String str2 = s21Var.f10157a;
                    if (!v21.b(str2)) {
                        str2.getClass();
                        bundle.putString("sessionToken", str2.trim());
                    }
                    String str3 = s21Var.f10158b;
                    if (!v21.b(str3)) {
                        str3.getClass();
                        bundle.putString("appId", str3.trim());
                    }
                    u21 u21Var = new u21(v21Var, iVar);
                    l21 l21Var = (l21) n21Var;
                    Parcel parcelD0 = l21Var.D0();
                    vg.c(parcelD0, bundle);
                    vg.e(parcelD0, u21Var);
                    l21Var.X1(parcelD0, 3);
                    return;
                } catch (RemoteException e3) {
                    v21.f11216c.d(e3, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i), str);
                    return;
                }
        }
    }

    public /* synthetic */ uy(v21 v21Var, s21 s21Var, int i, ni.i iVar) {
        this.f11129d = v21Var;
        this.f11130e = s21Var;
        this.f11128c = i;
        this.f11131f = iVar;
    }

    public uy(xy xyVar, String str, String str2, int i) {
        this.f11129d = str;
        this.f11130e = str2;
        this.f11128c = i;
        this.f11131f = xyVar;
    }
}
