package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Z6 extends SQLiteOpenHelper implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PublicLogger f23372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0219hn f23373c;

    public Z6(Context context, String str, C0219hn c0219hn, PublicLogger publicLogger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, AbstractC0601x5.f25006b);
        this.f23373c = c0219hn;
        this.f23371a = str;
        this.f23372b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th2) {
            this.f23372b.error(th2, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f23371a);
            Pj pj2 = AbstractC0366nj.f24449a;
            pj2.getClass();
            pj2.a(new C0391oj("db_read_error", th2));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th2) {
            this.f23372b.error(th2, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f23371a);
            Pj pj2 = AbstractC0366nj.f24449a;
            pj2.getClass();
            pj2.a(new C0391oj("db_write_error", th2));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f23373c.f24024a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        C0219hn c0219hn = this.f23373c;
        if (i <= i10) {
            c0219hn.getClass();
            return;
        }
        try {
            c0219hn.f24025b.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
        try {
            c0219hn.f24024a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C0219hn c0219hn = this.f23373c;
        c0219hn.getClass();
        try {
            InterfaceC0244in interfaceC0244in = c0219hn.f24027d;
            if (interfaceC0244in == null || interfaceC0244in.a(sQLiteDatabase)) {
                return;
            }
            try {
                c0219hn.f24025b.runScript(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            c0219hn.f24024a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        boolean z5;
        C0219hn c0219hn = this.f23373c;
        c0219hn.getClass();
        if (i10 > i) {
            for (int i11 = i + 1; i11 <= i10; i11++) {
                try {
                    Collection collection = (Collection) c0219hn.f24026c.f24625a.get(Integer.valueOf(i11));
                    if (collection != null) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            ((DatabaseScript) it.next()).runScript(sQLiteDatabase);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5 || (!c0219hn.f24027d.a(sQLiteDatabase))) {
            try {
                c0219hn.f24025b.runScript(sQLiteDatabase);
            } catch (Throwable unused2) {
            }
            try {
                c0219hn.f24024a.runScript(sQLiteDatabase);
            } catch (Throwable unused3) {
            }
        }
    }
}
