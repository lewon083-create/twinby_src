package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum J8 {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22523a;

    J8(int i) {
        this.f22523a = i;
    }

    public static J8 a(Integer num) {
        if (num != null) {
            for (J8 j82 : values()) {
                if (j82.f22523a == num.intValue()) {
                    return j82;
                }
            }
        }
        return NONE;
    }
}
