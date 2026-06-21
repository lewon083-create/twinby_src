package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yc1 extends o91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ei1 f12592b;

    public yc1(String str, ei1 ei1Var) {
        this.f12591a = str;
        this.f12592b = ei1Var;
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final boolean a() {
        return this.f12592b != ei1.RAW;
    }

    public final String toString() {
        int iOrdinal = this.f12592b.ordinal();
        return t.z.f("(typeUrl=", this.f12591a, ", outputPrefixType=", iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }
}
