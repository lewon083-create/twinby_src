package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0435qd extends kotlin.jvm.internal.r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0181gb f24632a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0435qd(C0181gb c0181gb) {
        super(1);
        this.f24632a = c0181gb;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Yc yc2 = (Yc) ((Map.Entry) obj).getValue();
        return yc2.f23327b.parse(this.f24632a);
    }
}
