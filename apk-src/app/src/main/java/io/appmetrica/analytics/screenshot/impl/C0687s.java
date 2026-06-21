package io.appmetrica.analytics.screenshot.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0687s extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0690v f25509a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0687s(C0690v c0690v) {
        super(0);
        this.f25509a = c0690v;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((C0692x) this.f25509a.f25513b).a("ContentObserverScreenshotCaptor");
        return Unit.f27471a;
    }
}
