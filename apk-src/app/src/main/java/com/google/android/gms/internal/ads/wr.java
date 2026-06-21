package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wr implements w9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nr f11880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr f11881d;

    public /* synthetic */ wr(yr yrVar, nr nrVar, int i) {
        this.f11879b = i;
        this.f11880c = nrVar;
        this.f11881d = yrVar;
    }

    @Override // w9.c
    public final void w(la.m mVar) {
        switch (this.f11879b) {
            case 0:
                int i = mVar.f28098c;
                try {
                    String canonicalName = this.f11881d.f12691b.getClass().getCanonicalName();
                    String str = (String) mVar.f28099d;
                    String str2 = (String) mVar.f28100e;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 43 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
                    sb2.append(canonicalName);
                    sb2.append("failed to loaded mediation ad: ErrorCode = ");
                    sb2.append(i);
                    sb2.append(". ErrorMessage = ");
                    sb2.append(str);
                    sb2.append(". ErrorDomain = ");
                    sb2.append(str2);
                    u9.i.c(sb2.toString());
                    nr nrVar = this.f11880c;
                    nrVar.i1(mVar.j());
                    nrVar.c4(i, str);
                    nrVar.O(i);
                } catch (RemoteException e3) {
                    u9.i.f("", e3);
                    return;
                }
                break;
            default:
                int i10 = mVar.f28098c;
                try {
                    String canonicalName2 = this.f11881d.f12691b.getClass().getCanonicalName();
                    String str3 = (String) mVar.f28099d;
                    String str4 = (String) mVar.f28100e;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(canonicalName2).length() + 41 + String.valueOf(i10).length() + 17 + String.valueOf(str3).length() + 16 + String.valueOf(str4).length());
                    sb3.append(canonicalName2);
                    sb3.append("failed to load mediation ad: ErrorCode = ");
                    sb3.append(i10);
                    sb3.append(". ErrorMessage = ");
                    sb3.append(str3);
                    sb3.append(". ErrorDomain = ");
                    sb3.append(str4);
                    u9.i.c(sb3.toString());
                    nr nrVar2 = this.f11880c;
                    nrVar2.i1(mVar.j());
                    nrVar2.c4(i10, str3);
                    nrVar2.O(i10);
                } catch (RemoteException e7) {
                    u9.i.f("", e7);
                }
                break;
        }
    }
}
