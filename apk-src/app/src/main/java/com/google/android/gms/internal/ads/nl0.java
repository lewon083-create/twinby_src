package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8359d;

    public /* synthetic */ nl0(int i, int i10, int i11, int i12) {
        this.f8356a = i;
        this.f8357b = i10;
        this.f8358c = i11;
        this.f8359d = i12;
    }

    public boolean a(int i) {
        if (i == 1) {
            if (this.f8356a - this.f8357b <= 1) {
                return false;
            }
        } else if (this.f8358c - this.f8359d <= 1) {
            return false;
        }
        return true;
    }
}
