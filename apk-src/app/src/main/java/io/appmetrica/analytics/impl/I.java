package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Savable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class I implements Savable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f22436a;

    public I(J j10) {
        this.f22436a = j10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean getValue() {
        return Boolean.valueOf(this.f22436a.f22469a.a(false));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    public final /* bridge */ /* synthetic */ void setValue(Object obj) {
        a(((Boolean) obj).booleanValue());
    }

    public final void a(boolean z5) {
        this.f22436a.f22469a.e(z5);
    }
}
