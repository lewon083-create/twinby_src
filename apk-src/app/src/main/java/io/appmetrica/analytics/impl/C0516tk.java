package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0516tk implements ModuleRemoteConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SdkIdentifiers f24811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RemoteConfigMetaInfo f24812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f24813c;

    public C0516tk(@NotNull SdkIdentifiers sdkIdentifiers, @NotNull RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.f24811a = sdkIdentifiers;
        this.f24812b = remoteConfigMetaInfo;
        this.f24813c = obj;
    }

    @NotNull
    public final C0516tk a(@NotNull SdkIdentifiers sdkIdentifiers, @NotNull RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new C0516tk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    @NotNull
    public final RemoteConfigMetaInfo b() {
        return this.f24812b;
    }

    public final Object c() {
        return this.f24813c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0516tk)) {
            return false;
        }
        C0516tk c0516tk = (C0516tk) obj;
        return Intrinsics.a(this.f24811a, c0516tk.f24811a) && Intrinsics.a(this.f24812b, c0516tk.f24812b) && Intrinsics.a(this.f24813c, c0516tk.f24813c);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.f24813c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    @NotNull
    public final SdkIdentifiers getIdentifiers() {
        return this.f24811a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    @NotNull
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.f24812b;
    }

    public final int hashCode() {
        int iHashCode = (this.f24812b.hashCode() + (this.f24811a.hashCode() * 31)) * 31;
        Object obj = this.f24813c;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.f24811a + ", remoteConfigMetaInfo=" + this.f24812b + ", featuresConfig=" + this.f24813c + ')';
    }

    @NotNull
    public final SdkIdentifiers a() {
        return this.f24811a;
    }

    public static C0516tk a(C0516tk c0516tk, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            sdkIdentifiers = c0516tk.f24811a;
        }
        if ((i & 2) != 0) {
            remoteConfigMetaInfo = c0516tk.f24812b;
        }
        if ((i & 4) != 0) {
            obj = c0516tk.f24813c;
        }
        c0516tk.getClass();
        return new C0516tk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }
}
