package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Jb {
    public static List a(Configuration configuration) {
        return AndroidUtils.isApiAchieved(24) ? Kb.a(configuration) : kotlin.collections.r.c(Ge.a(configuration.locale));
    }
}
