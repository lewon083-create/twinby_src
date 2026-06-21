package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xb1 extends ca.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12108d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb1(int i, byte[] bArr) {
        super(bArr);
        this.f12108d = i;
    }

    @Override // ca.a
    public final androidx.datastore.preferences.protobuf.k c(int i, byte[] bArr) {
        switch (this.f12108d) {
            case 0:
                return new wb1(bArr, i, 0);
            default:
                return new wb1(bArr, i, 1);
        }
    }
}
