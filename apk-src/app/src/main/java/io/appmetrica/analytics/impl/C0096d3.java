package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0096d3 implements so {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I8 f23653a;

    public C0096d3() {
        this(new I8());
    }

    @Override // io.appmetrica.analytics.impl.so
    @NonNull
    public final byte[] a(@NonNull O8 o82, @NonNull C0264jh c0264jh) {
        byte[] bArrDecode = new byte[0];
        String str = o82.f22776b;
        if (str != null) {
            try {
                bArrDecode = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        I8 i82 = this.f23653a;
        return ((H8) i82.f22444a.a(o82.f22788o)).a(bArrDecode);
    }

    public C0096d3(I8 i82) {
        this.f23653a = i82;
    }
}
