package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Wg extends Qg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N8 f23222b;

    public Wg(@NonNull Y4 y42) {
        this(y42, y42.j());
    }

    @Override // io.appmetrica.analytics.impl.Qg
    public final boolean a(@NonNull Q5 q5) {
        EnumC0128ea enumC0128ea;
        if (!TextUtils.isEmpty(q5.getName())) {
            N8 n82 = this.f23222b;
            String name = q5.getName();
            if (n82.f22726c == null) {
                n82.a();
            }
            int iHashCode = name.hashCode();
            if (n82.f22726c.f22830b.contains(Integer.valueOf(iHashCode))) {
                enumC0128ea = EnumC0128ea.NON_FIRST_OCCURENCE;
            } else {
                P8 p82 = n82.f22726c;
                EnumC0128ea enumC0128ea2 = p82.f22829a ? EnumC0128ea.FIRST_OCCURRENCE : EnumC0128ea.UNKNOWN;
                if (p82.f22832d < 1000) {
                    p82.f22830b.add(Integer.valueOf(iHashCode));
                    p82.f22832d++;
                } else {
                    p82.f22829a = false;
                }
                S8 s82 = n82.f22725b;
                P8 p83 = n82.f22726c;
                IBinaryDataHelper iBinaryDataHelper = s82.f22951c;
                R8 r8 = s82.f22950b;
                s82.f22949a.getClass();
                iBinaryDataHelper.insert("event_hashes", r8.toByteArray(Q8.a(p83)));
                enumC0128ea = enumC0128ea2;
            }
            q5.f22869k = enumC0128ea;
        }
        return false;
    }

    public Wg(Y4 y42, N8 n82) {
        super(y42);
        this.f23222b = n82;
    }
}
