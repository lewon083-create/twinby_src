package yads;

import java.lang.Thread;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ja3 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ko2 f39799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f39800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pt2 f39801c;

    public ja3(ct1 ct1Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, pt2 pt2Var) {
        this.f39799a = ct1Var;
        this.f39800b = uncaughtExceptionHandler;
        this.f39801c = pt2Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        try {
            Set set = this.f39801c.f42043n0;
            if (set == null) {
                set = kotlin.collections.d0.f27478b;
            }
            Set set2 = k33.f40059a;
            if (k33.a(th2.getStackTrace(), set)) {
                this.f39799a.reportUnhandledException(th2);
            }
            if (this.f39801c.f42041m0 || (uncaughtExceptionHandler = this.f39800b) == null) {
                return;
            }
        } catch (Throwable th3) {
            try {
                ij.k kVar = ij.m.f21341c;
                this.f39799a.reportError("Failed to report uncaught exception", th3);
                Unit unit = Unit.f27471a;
            } finally {
                try {
                    if (this.f39801c.f42041m0 || (uncaughtExceptionHandler = this.f39800b) == null) {
                        return;
                    }
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                } catch (Throwable th4) {
                }
            }
            if (this.f39801c.f42041m0) {
                return;
            } else {
                return;
            }
        }
        uncaughtExceptionHandler.uncaughtException(thread, th2);
    }
}
