package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v implements LastKnownLocationExtractorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f25196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25197c;

    public v(@NotNull String str, @NotNull s sVar, @NotNull String str2) {
        this.f25195a = str;
        this.f25196b = sVar;
        this.f25197c = str2;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final u getExtractor(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor iHandlerExecutor, @NotNull LocationListener locationListener) {
        return new u(context, this.f25196b.a(permissionExtractor), locationListener, this.f25195a);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    @NotNull
    public final String getIdentifier() {
        return this.f25197c;
    }
}
