package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class T extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f22978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fi f22979b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u4, Fi fi2) {
        super(0);
        this.f22978a = u4;
        this.f22979b = fi2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        U u4 = this.f22978a;
        N n10 = u4.f23046h;
        Context context = u4.f23039a;
        Fi fi2 = this.f22979b;
        n10.getClass();
        return N.a(new M(n10, context, fi2));
    }
}
