package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wt implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f11894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt f11895d;

    public /* synthetic */ wt(xt xtVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i) {
        this.f11893b = i;
        this.f11894c = uncaughtExceptionHandler;
        this.f11895d = xtVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        switch (this.f11893b) {
            case 0:
                uncaughtExceptionHandler = this.f11894c;
                try {
                    try {
                        this.f11895d.g(th2);
                        break;
                    } catch (Throwable unused) {
                        u9.i.e("AdMob exception reporter failed reporting the exception.");
                        break;
                    }
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th2);
                        return;
                    }
                    return;
                } finally {
                }
            default:
                uncaughtExceptionHandler = this.f11894c;
                try {
                    try {
                        this.f11895d.g(th2);
                        break;
                    } catch (Throwable unused2) {
                        u9.i.e("AdMob exception reporter failed reporting the exception.");
                        break;
                    }
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th2);
                        return;
                    }
                    return;
                } finally {
                }
        }
    }
}
