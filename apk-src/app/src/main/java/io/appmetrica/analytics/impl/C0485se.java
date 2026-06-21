package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.se, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0485se implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0581wa f24737a;

    public C0485se() {
        this(new C0581wa(20480, 100, 1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ci fromModel(@NonNull Map<String, String> map) {
        Ln lnA = this.f24737a.a(map);
        C0330m8 c0330m8 = new C0330m8();
        c0330m8.f24356b = ((C0376o4) lnA.f22636b).f24464b;
        Map map2 = (Map) lnA.f22635a;
        if (map2 != null) {
            c0330m8.f24355a = new C0305l8[map2.size()];
            int i = 0;
            for (Map.Entry entry : map2.entrySet()) {
                c0330m8.f24355a[i] = new C0305l8();
                c0330m8.f24355a[i].f24276a = StringUtils.getUTF8Bytes((String) entry.getKey());
                c0330m8.f24355a[i].f24277b = StringUtils.getUTF8Bytes((String) entry.getValue());
                i++;
            }
        }
        InterfaceC0070c3 interfaceC0070c3 = lnA.f22636b;
        int i10 = ((C0376o4) interfaceC0070c3).f23478a;
        return new Ci(c0330m8, interfaceC0070c3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0485se(@NonNull C0581wa c0581wa) {
        this.f24737a = c0581wa;
    }

    @NonNull
    public final Map<String, String> a(@NonNull Ci ci2) {
        throw new UnsupportedOperationException();
    }
}
