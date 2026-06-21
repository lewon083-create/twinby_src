package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0620y extends kotlin.jvm.internal.r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0470s f25054a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0620y(C0470s c0470s) {
        super(1);
        this.f25054a = c0470s;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f25054a.f24716h = (byte[]) obj;
        return Unit.f27471a;
    }
}
