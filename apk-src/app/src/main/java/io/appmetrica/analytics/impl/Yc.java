package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Yc implements JsonParser, Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteConfigExtensionConfiguration f23326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JsonParser f23327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Converter f23328c;

    public Yc(@NotNull RemoteConfigExtensionConfiguration<Object> remoteConfigExtensionConfiguration) {
        this.f23326a = remoteConfigExtensionConfiguration;
        this.f23327b = remoteConfigExtensionConfiguration.getJsonParser();
        this.f23328c = remoteConfigExtensionConfiguration.getProtobufConverter();
    }

    @NotNull
    public final byte[] a(@NotNull Object obj) {
        return (byte[]) this.f23328c.fromModel(obj);
    }

    @Nullable
    public final Object b(@NotNull JSONObject jSONObject) {
        return this.f23327b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return (byte[]) this.f23328c.fromModel(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parse(JSONObject jSONObject) {
        return this.f23327b.parse(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return this.f23327b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return this.f23328c.toModel((byte[]) obj);
    }

    @NotNull
    public final Object a(@NotNull JSONObject jSONObject) {
        return this.f23327b.parse(jSONObject);
    }

    @NotNull
    public final Object a(@NotNull byte[] bArr) {
        return this.f23328c.toModel(bArr);
    }

    @NotNull
    public final RemoteConfigExtensionConfiguration<Object> a() {
        return this.f23326a;
    }
}
