package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class P1 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f22818e = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ga f22819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0477s6 f22820b = C0071c4.l().n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0403p6 f22821c = new C0403p6();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cn f22822d = new Cn();

    public P1(C0303l6 c0303l6) {
        this.f22819a = c0303l6;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        StackTraceElement[] stackTraceElementArrB;
        try {
            f22818e.set(true);
            Ga ga2 = this.f22819a;
            C0569vn c0569vnApply = this.f22821c.apply(thread);
            Cn cn = this.f22822d;
            Thread threadA = cn.f22237a.a();
            ArrayList arrayListA = cn.a(threadA, thread);
            if (thread != threadA) {
                try {
                    stackTraceElementArrB = cn.f22237a.b();
                    if (stackTraceElementArrB == null) {
                        try {
                            stackTraceElementArrB = threadA.getStackTrace();
                        } catch (SecurityException unused) {
                        }
                    }
                } catch (SecurityException unused2) {
                    stackTraceElementArrB = null;
                }
                arrayListA.add(0, (C0569vn) cn.f22238b.apply(threadA, stackTraceElementArrB));
            }
            ga2.a(th2, new V(c0569vnApply, arrayListA, this.f22820b.f24729a.a()));
        } catch (Throwable th3) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th3, th3.getMessage(), new Object[0]);
        }
    }
}
