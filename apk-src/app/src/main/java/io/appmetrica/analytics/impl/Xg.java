package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Xg implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TimePassedChecker timePassedChecker = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        Ye yeY = C0382oa.I.y();
        if (timePassedChecker.didTimePassMillis(yeY.f(), TimeUnit.DAYS.toMillis(1L), "[ReportKotlinVersionTask]")) {
            KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
            Pair pair = new Pair("major", Integer.valueOf(kotlinVersion.getMajor()));
            Pair pair2 = new Pair("minor", Integer.valueOf(kotlinVersion.getMinor()));
            Pair pair3 = new Pair("patch", Integer.valueOf(kotlinVersion.getPatch()));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(kotlinVersion.getMajor());
            sb2.append('.');
            sb2.append(kotlinVersion.getMinor());
            sb2.append('.');
            sb2.append(kotlinVersion.getPatch());
            Map mapG = kotlin.collections.j0.g(pair, pair2, pair3, new Pair("version", sb2.toString()));
            Pj pj2 = AbstractC0366nj.f24449a;
            pj2.getClass();
            pj2.a(new Oj("kotlin_version", mapG));
            yeY.c(systemTimeProvider.currentTimeMillis()).b();
        }
    }
}
