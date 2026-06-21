package io.appmetrica.analytics.impl;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ha, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0206ha extends B4 {
    public C0206ha(@NotNull C0625y4 c0625y4) {
        super(c0625y4);
    }

    @Override // io.appmetrica.analytics.impl.B4
    public final boolean a(@NotNull Q5 q5, @NotNull C0550v4 c0550v4) {
        Bundle bundle = q5.f22871m;
        Ya ya2 = bundle != null ? (Ya) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null;
        if (ya2 != null) {
            if (ya2.f23324d) {
                C0401p4 c0401p4 = c0550v4.f24870b.f25074d.f25099a;
                Boolean bool = c0401p4.f24559n;
                Boolean bool2 = c0401p4.i;
                C0382oa.I.c().c(bool != null ? bool.booleanValue() : true);
                C0382oa.I.h().b(bool2);
            }
        }
        this.f22125a.a(ya2);
        return false;
    }
}
