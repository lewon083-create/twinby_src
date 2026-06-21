package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class N8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S8 f22725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public P8 f22726c;

    public N8(S8 s82, int i) {
        this.f22724a = i;
        this.f22725b = s82;
    }

    public final void a() {
        P8 p82;
        S8 s82 = this.f22725b;
        s82.getClass();
        try {
            byte[] bArr = s82.f22951c.get("event_hashes");
            if (bArr == null || bArr.length == 0) {
                Q8 q82 = s82.f22949a;
                s82.f22950b.getClass();
                C0555v9 c0555v9 = new C0555v9();
                q82.getClass();
                p82 = new P8(c0555v9.f24893a, c0555v9.f24894b, c0555v9.f24895c, CollectionUtils.hashSetFromIntArray(c0555v9.f24896d));
            } else {
                Q8 q83 = s82.f22949a;
                C0555v9 state = s82.f22950b.toState(bArr);
                q83.getClass();
                p82 = new P8(state.f24893a, state.f24894b, state.f24895c, CollectionUtils.hashSetFromIntArray(state.f24896d));
            }
        } catch (Throwable unused) {
            Q8 q84 = s82.f22949a;
            s82.f22950b.getClass();
            C0555v9 c0555v92 = new C0555v9();
            q84.getClass();
            p82 = new P8(c0555v92.f24893a, c0555v92.f24894b, c0555v92.f24895c, CollectionUtils.hashSetFromIntArray(c0555v92.f24896d));
        }
        this.f22726c = p82;
        int i = p82.f22831c;
        int i10 = this.f22724a;
        if (i != i10) {
            p82.f22831c = i10;
            p82.f22832d = 0;
            S8 s83 = this.f22725b;
            IBinaryDataHelper iBinaryDataHelper = s83.f22951c;
            R8 r8 = s83.f22950b;
            s83.f22949a.getClass();
            iBinaryDataHelper.insert("event_hashes", r8.toByteArray(Q8.a(p82)));
        }
    }
}
