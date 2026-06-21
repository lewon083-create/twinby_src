package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ac, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0027ac implements InterfaceC0652z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0219hn f23430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z9 f23431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Z6 f23432e;

    public C0027ac(Context context, String str, @NonNull C0219hn c0219hn) {
        this(context, str, new Z9(str), c0219hn);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0652z6
    public final synchronized SQLiteDatabase a() {
        Z6 z62;
        try {
            this.f23431d.a();
            z62 = new Z6(this.f23428a, this.f23429b, this.f23430c, PublicLogger.getAnonymousInstance());
            this.f23432e = z62;
        } catch (Throwable unused) {
            return null;
        }
        return z62.getWritableDatabase();
    }

    public C0027ac(@NonNull Context context, @NonNull String str, @NonNull Z9 z92, @NonNull C0219hn c0219hn) {
        this.f23428a = context;
        this.f23429b = str;
        this.f23431d = z92;
        this.f23430c = c0219hn;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0652z6
    public final synchronized void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        ko.a((Closeable) this.f23432e);
        this.f23431d.b();
        this.f23432e = null;
    }
}
