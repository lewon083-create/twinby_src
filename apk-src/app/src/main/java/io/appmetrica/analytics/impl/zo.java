package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f25132b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vo f25133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vo f25134d;

    public zo(Context context) {
        this.f25131a = context;
        C0077ca c0077ca = new C0077ca(context, "appmetrica_vital.dat");
        this.f25133c = new vo(C0382oa.k().y(), c0077ca);
        this.f25134d = new vo(new Ye(C0382oa.k().B().e(context)), c0077ca);
    }

    public final vo a() {
        return this.f25133c;
    }

    public final vo b() {
        return this.f25134d;
    }
}
