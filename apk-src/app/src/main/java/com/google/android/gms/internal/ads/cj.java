package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public enum cj implements un1 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4225b;

    cj(int i10) {
        this.f4225b = i10;
    }

    @Override // com.google.android.gms.internal.ads.un1
    public final int h() {
        return this.f4225b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f4225b);
    }
}
