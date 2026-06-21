package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class I8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ec f22444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ec f22445b;

    public I8() {
        this(new W7(), new M9(), new C0040b());
    }

    public I8(W7 w72, M9 m9, C0040b c0040b) {
        Ec ec = new Ec(w72);
        this.f22444a = ec;
        ec.a(J8.NONE, w72);
        ec.a(J8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, m9);
        ec.a(J8.AES_VALUE_ENCRYPTION, c0040b);
        this.f22445b = new Ec(w72);
    }
}
