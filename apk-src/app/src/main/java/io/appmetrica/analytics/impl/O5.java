package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class O5 extends BaseRequestConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0140em f22773c;

    public final String b() {
        return this.f22772b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.f22771a + "', mAppSystem='" + this.f22772b + "', startupState=" + this.f22773c + '}';
    }

    @NonNull
    public final String a() {
        return this.f22771a;
    }
}
