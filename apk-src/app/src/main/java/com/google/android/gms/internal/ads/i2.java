package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i2 implements g31 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i2 f6337c = new i2(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i2 f6338d = new i2(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i2 f6339e = new i2(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ i2 f6340f = new i2(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6341b;

    public /* synthetic */ i2(int i) {
        this.f6341b = i;
    }

    @Override // com.google.android.gms.internal.ads.g31
    public final /* synthetic */ boolean a(Object obj) {
        switch (this.f6341b) {
            case 0:
                n4 n4Var = (n4) obj;
                return n4Var.f8175b.equals("com.apple.iTunes") && n4Var.f8176c.equals("iTunSMPB");
            case 1:
                return ((i4) obj).f6360c.equals("iTunSMPB");
            case 2:
                return ((Map.Entry) obj).getKey() != null;
            default:
                return ((String) obj) != null;
        }
    }
}
