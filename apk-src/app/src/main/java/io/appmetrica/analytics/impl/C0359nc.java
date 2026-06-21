package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0359nc extends AbstractC0143f {
    public C0359nc(Context context, Ag ag2) {
        super(context, ag2);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0143f
    public final void b(@NonNull Q5 q5, @NonNull C0426q4 c0426q4) {
        boolean zBooleanValue = ((Boolean) WrapUtils.getOrDefault(c0426q4.f24613b.f24548b, Boolean.FALSE)).booleanValue();
        Lb lbM = C0382oa.I.m();
        lbM.a(zBooleanValue);
        lbM.a(c0426q4.f24613b.f24549c);
        Boolean bool = c0426q4.f24613b.f24559n;
        if (bool != null) {
            C0382oa.I.c().b(bool.booleanValue());
        }
        this.f23822b.a(q5, c0426q4);
    }
}
