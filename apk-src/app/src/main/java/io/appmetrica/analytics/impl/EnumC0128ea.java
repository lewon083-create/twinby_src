package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ea, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0128ea {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23758a;

    EnumC0128ea(int i) {
        this.f23758a = i;
    }

    public static EnumC0128ea a(Integer num) {
        if (num != null) {
            for (EnumC0128ea enumC0128ea : values()) {
                if (enumC0128ea.f23758a == num.intValue()) {
                    return enumC0128ea;
                }
            }
        }
        return UNKNOWN;
    }
}
