package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class S8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q8 f22949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R8 f22950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinaryDataHelper f22951c;

    public S8(Context context, R4 r42) {
        this(new R8(), new Q8(), C0382oa.k().B().a(context, r42));
    }

    public S8(R8 r8, Q8 q82, IBinaryDataHelper iBinaryDataHelper) {
        this.f22950b = r8;
        this.f22949a = q82;
        this.f22951c = iBinaryDataHelper;
    }
}
