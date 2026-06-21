package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vm0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11423e;

    public vm0(String str, boolean z5, boolean z10, boolean z11, boolean z12) {
        this.f11419a = str;
        this.f11420b = z5;
        this.f11421c = z10;
        this.f11422d = z11;
        this.f11423e = z12;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void a(Object obj) {
        Bundle bundle = ((w50) obj).f11646a;
        String str = this.f11419a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z5 = this.f11420b;
        bundle.putInt("test_mode", z5 ? 1 : 0);
        boolean z10 = this.f11421c;
        bundle.putInt("linked_device", z10 ? 1 : 0);
        if (z5 || z10) {
            wk wkVar = al.va;
            q9.s sVar = q9.s.f31967e;
            if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                bundle.putInt("risd", !this.f11422d ? 1 : 0);
            }
            if (((Boolean) sVar.f31970c.a(al.za)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f11423e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void i(Object obj) {
        Bundle bundle = ((w50) obj).f11647b;
        String str = this.f11419a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z5 = this.f11420b;
        bundle.putInt("test_mode", z5 ? 1 : 0);
        boolean z10 = this.f11421c;
        bundle.putInt("linked_device", z10 ? 1 : 0);
        if (z5 || z10) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.za)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f11423e);
            }
        }
    }
}
