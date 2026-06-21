package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ah, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0032ah extends Qg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0585we f23436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProtobufStateStorage f23437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0648z2 f23438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0095d2 f23439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0473s2 f23440f;

    public C0032ah(Y4 y42, C0585we c0585we) {
        this(y42, c0585we, ((Qm) Om.a(U1.class)).create(y42.getContext()), new C0648z2(y42.getContext()), new C0095d2(), new C0473s2(y42.getContext()));
    }

    @Override // io.appmetrica.analytics.impl.Qg
    public final boolean a(@NonNull Q5 q5) {
        Y4 y42 = this.f22888a;
        y42.f23283b.toString();
        if (!y42.f23300t.c() || !y42.x()) {
            return false;
        }
        U1 u12 = (U1) this.f23437c.read();
        List list = u12.f23053a;
        C0623y2 c0623y2 = u12.f23054b;
        C0648z2 c0648z2 = this.f23438d;
        c0648z2.getClass();
        U1 u13 = null;
        C0623y2 c0623y2A = AndroidUtils.isApiAchieved(28) ? C0548v2.a(c0648z2.f25108a, c0648z2.f25109b) : null;
        List list2 = u12.f23055c;
        List list3 = (List) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f23440f.f24723a, "getting available providers", "location manager", Collections.EMPTY_LIST, new C0448r2());
        C0585we c0585we = this.f23436b;
        Context context = this.f22888a.f23282a;
        c0585we.getClass();
        ArrayList arrayListA = new Oi(context, new SafePackageManager()).a();
        if (CollectionUtils.areCollectionsEqual(arrayListA, list)) {
            arrayListA = null;
        }
        if (arrayListA != null || !ko.a(c0623y2, c0623y2A) || !CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (arrayListA != null) {
                list = arrayListA;
            }
            u13 = new U1(list, c0623y2A, list3);
        }
        if (u13 != null) {
            C0306l9 c0306l9 = y42.f23294n;
            Q5 q5A = Q5.a(q5, u13.f23053a, u13.f23054b, this.f23439e, u13.f23055c);
            c0306l9.a(q5A, Qk.a(c0306l9.f24280c.b(q5A), q5A.i));
            long jCurrentTimeSeconds = c0306l9.i.currentTimeSeconds();
            c0306l9.f24287k = jCurrentTimeSeconds;
            c0306l9.f24278a.a(jCurrentTimeSeconds).b();
            this.f23437c.save(u13);
            return false;
        }
        if (!y42.A()) {
            return false;
        }
        C0306l9 c0306l92 = y42.f23294n;
        Q5 q5A2 = Q5.a(q5, u12.f23053a, u12.f23054b, this.f23439e, u12.f23055c);
        c0306l92.a(q5A2, Qk.a(c0306l92.f24280c.b(q5A2), q5A2.i));
        long jCurrentTimeSeconds2 = c0306l92.i.currentTimeSeconds();
        c0306l92.f24287k = jCurrentTimeSeconds2;
        c0306l92.f24278a.a(jCurrentTimeSeconds2).b();
        return false;
    }

    public C0032ah(Y4 y42, C0585we c0585we, ProtobufStateStorage protobufStateStorage, C0648z2 c0648z2, C0095d2 c0095d2, C0473s2 c0473s2) {
        super(y42);
        this.f23436b = c0585we;
        this.f23437c = protobufStateStorage;
        this.f23438d = c0648z2;
        this.f23439e = c0095d2;
        this.f23440f = c0473s2;
    }
}
