package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0450r4 extends AbstractC0475s4 {
    public C0450r4(@NonNull C0440qi c0440qi) {
        super(c0440qi);
    }

    public final void a(@NonNull EnumC0078cb enumC0078cb, @NonNull List<Qg> list) {
        if (!AbstractC0605x9.f25017h.contains(enumC0078cb)) {
            list.add(this.f24726a.f24655s);
        }
        if (AbstractC0605x9.f25011b.contains(enumC0078cb)) {
            return;
        }
        list.add(this.f24726a.f24640c);
    }
}
