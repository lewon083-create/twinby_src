package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Mf implements so {
    @Override // io.appmetrica.analytics.impl.so
    public final byte[] a(O8 o82, C0264jh c0264jh) {
        if (!TextUtils.isEmpty(o82.f22776b)) {
            try {
                byte[] bArrDecode = Base64.decode(o82.f22776b, 0);
                C0338mg c0338mg = (bArrDecode == null || bArrDecode.length == 0) ? null : new C0338mg(bArrDecode);
                Uf uf2 = new Uf();
                String str = c0338mg.f24372a;
                uf2.f23098a = str == null ? new byte[0] : str.getBytes();
                uf2.f23100c = c0338mg.f24373b;
                uf2.f23099b = c0338mg.f24374c;
                int iOrdinal = c0338mg.f24375d.ordinal();
                int i = 1;
                if (iOrdinal != 1) {
                    i = 2;
                    if (iOrdinal != 2) {
                        i = 0;
                    }
                }
                uf2.f23101d = i;
                return MessageNano.toByteArray(uf2);
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }
}
