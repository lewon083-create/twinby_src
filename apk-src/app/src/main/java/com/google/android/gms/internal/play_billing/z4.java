package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public enum z4 {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14394b;

    z4(int i) {
        this.f14394b = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f14394b);
    }
}
