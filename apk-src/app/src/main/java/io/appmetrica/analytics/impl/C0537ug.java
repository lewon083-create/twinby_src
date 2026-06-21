package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ug, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0537ug {
    public C0537ug(Pa pa2) {
    }

    public static Pa a(Context context, IHandlerExecutor iHandlerExecutor) {
        C0212hg c0212hg;
        if (ReflectionUtils.detectClassExists("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                c0212hg = new C0212hg(context, iHandlerExecutor);
            } catch (Throwable unused) {
                c0212hg = null;
            }
        } else {
            c0212hg = null;
        }
        return c0212hg == null ? new C0512tg() : c0212hg;
    }
}
