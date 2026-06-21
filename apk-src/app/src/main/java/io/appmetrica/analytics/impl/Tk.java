package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Tk {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f23030d = "SESSION_SLEEP_START";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f23031e = "SESSION_LAST_EVENT_OFFSET";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f23032f = "SESSION_ID";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f23033g = "SESSION_COUNTER_ID";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f23034h = "SESSION_INIT_TIME";
    public static final String i = "SESSION_IS_ALIVE_REPORT_NEEDED";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    protected final Ve f23036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0181gb f23037c;

    public Tk(@NonNull Ve ve2, @NonNull String str) {
        this.f23036b = ve2;
        this.f23035a = str;
        C0181gb c0181gb = new C0181gb();
        try {
            String strH = ve2.h(str);
            if (!TextUtils.isEmpty(strH)) {
                c0181gb = new C0181gb(strH);
            }
        } catch (Throwable unused) {
        }
        this.f23037c = c0181gb;
    }

    public final Tk a(long j10) {
        a(f23034h, Long.valueOf(j10));
        return this;
    }

    public final Tk b(long j10) {
        a(f23031e, Long.valueOf(j10));
        return this;
    }

    public final Long c() {
        return this.f23037c.a(f23034h);
    }

    public final Tk d(long j10) {
        a(f23032f, Long.valueOf(j10));
        return this;
    }

    public final Long e() {
        return this.f23037c.a(f23033g);
    }

    public final Long f() {
        return this.f23037c.a(f23032f);
    }

    public final Long g() {
        return this.f23037c.a(f23030d);
    }

    public final boolean h() {
        return this.f23037c.length() > 0;
    }

    public final Boolean i() {
        C0181gb c0181gb = this.f23037c;
        c0181gb.getClass();
        try {
            return Boolean.valueOf(c0181gb.getBoolean(i));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Tk a(boolean z5) {
        a(i, Boolean.valueOf(z5));
        return this;
    }

    public final void b() {
        this.f23036b.e(this.f23035a, this.f23037c.toString());
        this.f23036b.b();
    }

    public final Tk c(long j10) {
        a(f23033g, Long.valueOf(j10));
        return this;
    }

    public final Long d() {
        return this.f23037c.a(f23031e);
    }

    public final Tk e(long j10) {
        a(f23030d, Long.valueOf(j10));
        return this;
    }

    public final void a(String str, Object obj) {
        try {
            this.f23037c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        this.f23037c = new C0181gb();
        b();
    }
}
