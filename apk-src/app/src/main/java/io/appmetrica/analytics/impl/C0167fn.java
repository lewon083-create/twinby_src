package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0167fn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0646z0 f23900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Go f23901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0371o f23902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Vk f23903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F5 f23904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0103da f23905f;

    public C0167fn(C0646z0 c0646z0, Go go, C0371o c0371o, Vk vk2, F5 f52, C0103da c0103da) {
        this.f23900a = c0646z0;
        this.f23901b = go;
        this.f23902c = c0371o;
        this.f23903d = vk2;
        this.f23904e = f52;
        this.f23905f = c0103da;
    }

    public static Intent a(Activity activity) {
        return (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new ig.a(12));
    }

    public static final Intent b(Activity activity) {
        return activity.getIntent();
    }

    public C0167fn(C0646z0 c0646z0, Go go) {
        this(c0646z0, go, C0071c4.l().a(), C0071c4.l().o(), C0071c4.l().h(), C0071c4.l().k());
    }
}
