package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Yn extends B4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F6 f23359b;

    public Yn(@NonNull C0625y4 c0625y4, @NonNull F6 f62) {
        super(c0625y4);
        this.f23359b = f62;
    }

    @Override // io.appmetrica.analytics.impl.B4
    public final boolean a(@NonNull Q5 q5, @NonNull C0550v4 c0550v4) {
        C0401p4 c0401p4 = c0550v4.f24870b.f25074d.f25099a;
        this.f23359b.a(c0401p4.i);
        Lb lbM = C0382oa.I.m();
        if (Boolean.TRUE.equals(c0401p4.f24548b)) {
            lbM.a(true);
        } else {
            if (Boolean.FALSE.equals(c0401p4.f24548b)) {
                lbM.a(false);
            }
        }
        lbM.a(c0401p4.f24549c);
        Boolean bool = c0401p4.f24559n;
        C0382oa.I.c().b(bool != null ? bool.booleanValue() : true);
        return false;
    }
}
