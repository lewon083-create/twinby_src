package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0408pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f24572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2 f24573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RunnableC0433qb f24574c;

    public C0408pb(Handler handler, J2 j22) {
        this.f24572a = handler;
        this.f24573b = j22;
        this.f24574c = new RunnableC0433qb(handler, j22);
    }

    public static void a(Handler handler, J2 j22, Runnable runnable) {
        handler.removeCallbacks(runnable, j22.f22480b.f22439b.getApiKey());
        handler.postAtTime(runnable, j22.f22480b.f22439b.getApiKey(), SystemClock.uptimeMillis() + ((long) (((Integer) WrapUtils.getOrDefault(j22.f22480b.f22439b.getSessionTimeout(), 10)).intValue() * 500)));
    }
}
