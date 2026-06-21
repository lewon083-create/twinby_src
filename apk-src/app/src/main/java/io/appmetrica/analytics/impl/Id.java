package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Id {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f22447a;

    public Id(Nd nd2) {
        this.f22447a = nd2;
    }

    public final Jd a(Context context, Rg rg) {
        return new Jd(context, rg, this.f22447a, new ig.a(10), EnumC0078cb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, "actual");
    }

    public final Jd b(Context context, Rg rg) {
        return new Jd(context, rg, this.f22447a, new ig.a(9), EnumC0078cb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, "prev session");
    }

    public static final Zk a(G0 g02) {
        return new Gd(g02.f22368f.f22408d);
    }

    public static final Zk b(G0 g02) {
        return new X();
    }
}
