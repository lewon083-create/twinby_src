package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Zl extends N5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A3 f23391b;

    public Zl(@NonNull Context context, @NonNull String str) {
        this(context, str, new SafePackageManager(), C0382oa.k().f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.N5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0037am load(@NonNull M5 m52) {
        C0037am c0037am = (C0037am) super.load(m52);
        C0140em c0140em = m52.f22651a;
        c0037am.f23451d = c0140em.f23790f;
        c0037am.f23452e = c0140em.f23791g;
        Yl yl2 = (Yl) m52.componentArguments;
        String str = yl2.f23354a;
        if (str != null) {
            c0037am.f23453f = str;
            c0037am.f23454g = yl2.f23355b;
        }
        Map<String, String> map = yl2.f23356c;
        c0037am.f23455h = map;
        c0037am.i = (C0474s3) this.f23391b.a(new C0474s3(map, T7.f23005c));
        Yl yl3 = (Yl) m52.componentArguments;
        c0037am.f23457k = yl3.f23357d;
        c0037am.f23456j = yl3.f23358e;
        C0140em c0140em2 = m52.f22651a;
        c0037am.f23458l = c0140em2.f23799p;
        c0037am.f23459m = c0140em2.f23801r;
        long j10 = c0140em2.f23805v;
        if (c0037am.f23460n == 0) {
            c0037am.f23460n = j10;
        }
        return c0037am;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new C0037am();
    }

    public Zl(@NonNull Context context, @NonNull String str, @NonNull SafePackageManager safePackageManager, @NonNull A3 a32) {
        super(context, str, safePackageManager);
        this.f23391b = a32;
    }

    @NonNull
    public final C0037am a() {
        return new C0037am();
    }
}
