package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Jn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F3 f22541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Co f22542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f22543c;

    public Jn(Toggle toggle) {
        F3 f32 = new F3(C0382oa.k().y());
        this.f22541a = f32;
        Co co = new Co();
        this.f22542b = co;
        this.f22543c = new ConjunctiveCompositeThreadSafeToggle(kotlin.collections.s.f(f32, co, toggle == null ? new uo() : toggle), "loc-def");
    }
}
