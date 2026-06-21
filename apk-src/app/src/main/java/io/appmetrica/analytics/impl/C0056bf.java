package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0056bf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f23503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T7 f23504c;

    public C0056bf(String str, JSONObject jSONObject, T7 t72) {
        this.f23502a = str;
        this.f23503b = jSONObject;
        this.f23504c = t72;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.f23502a + "', additionalParams=" + this.f23503b + ", source=" + this.f23504c + '}';
    }
}
