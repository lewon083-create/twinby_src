package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.screenshot.impl.C0670a;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0670a extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0673d f25463a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0670a(C0673d c0673d) {
        super(0);
        this.f25463a = c0673d;
    }

    public static final void a(C0673d c0673d) {
        ((C0692x) c0673d.f25469b).a("AndroidApiScreenshotCaptor");
    }

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Activity.ScreenCaptureCallback invoke() {
        final C0673d c0673d = this.f25463a;
        return new Activity.ScreenCaptureCallback() { // from class: vh.a
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                C0670a.a(c0673d);
            }
        };
    }
}
