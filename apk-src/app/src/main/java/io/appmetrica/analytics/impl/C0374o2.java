package io.appmetrica.analytics.impl;

import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0374o2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0344mm fromModel(@NonNull C0349n2 c0349n2) {
        C0294km c0294km;
        C0344mm c0344mm = new C0344mm();
        c0344mm.f24384a = new C0319lm[c0349n2.f24393a.size()];
        for (int i = 0; i < c0349n2.f24393a.size(); i++) {
            C0319lm c0319lm = new C0319lm();
            Pair pair = (Pair) c0349n2.f24393a.get(i);
            c0319lm.f24319a = (String) pair.first;
            if (pair.second != null) {
                c0319lm.f24320b = new C0294km();
                C0324m2 c0324m2 = (C0324m2) pair.second;
                if (c0324m2 == null) {
                    c0294km = null;
                } else {
                    C0294km c0294km2 = new C0294km();
                    c0294km2.f24251a = c0324m2.f24329a;
                    c0294km = c0294km2;
                }
                c0319lm.f24320b = c0294km;
            }
            c0344mm.f24384a[i] = c0319lm;
        }
        return c0344mm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0349n2 toModel(@NonNull C0344mm c0344mm) {
        ArrayList arrayList = new ArrayList();
        for (C0319lm c0319lm : c0344mm.f24384a) {
            String str = c0319lm.f24319a;
            C0294km c0294km = c0319lm.f24320b;
            arrayList.add(new Pair(str, c0294km == null ? null : new C0324m2(c0294km.f24251a)));
        }
        return new C0349n2(arrayList);
    }
}
