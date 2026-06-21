package e9;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import y8.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements g9.b, nd.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f16312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16315f;

    public /* synthetic */ f(com.google.android.gms.internal.consent_sdk.c cVar, Iterable iterable, j jVar, long j10) {
        this.f16311b = 0;
        this.f16313d = cVar;
        this.f16314e = iterable;
        this.f16315f = jVar;
        this.f16312c = j10;
    }

    @Override // nd.g
    public ScheduledFuture a(m4.d dVar) {
        switch (this.f16311b) {
            case 1:
                nd.f fVar = (nd.f) this.f16313d;
                Runnable runnable = (Runnable) this.f16314e;
                return fVar.f29318c.schedule(new nd.d(fVar, runnable, dVar, 1), this.f16312c, (TimeUnit) this.f16315f);
            default:
                nd.f fVar2 = (nd.f) this.f16313d;
                Callable callable = (Callable) this.f16314e;
                return fVar2.f29318c.schedule(new nd.e(fVar2, callable, dVar, 0), this.f16312c, (TimeUnit) this.f16315f);
        }
    }

    @Override // g9.b
    public Object execute() {
        com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f16313d;
        Iterable iterable = (Iterable) this.f16314e;
        j jVar = (j) this.f16315f;
        f9.j jVar2 = (f9.j) ((f9.d) cVar.f13339c);
        jVar2.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + f9.j.k(iterable);
            SQLiteDatabase sQLiteDatabaseA = jVar2.a();
            sQLiteDatabaseA.beginTransaction();
            try {
                sQLiteDatabaseA.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                try {
                    Cursor cursor = cursorRawQuery;
                    while (cursor.moveToNext()) {
                        jVar2.i(cursor.getInt(0), b9.c.MAX_RETRIES_REACHED, cursor.getString(1));
                    }
                    cursorRawQuery.close();
                    sQLiteDatabaseA.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                    sQLiteDatabaseA.setTransactionSuccessful();
                } catch (Throwable th2) {
                    cursorRawQuery.close();
                    throw th2;
                }
            } finally {
                sQLiteDatabaseA.endTransaction();
            }
        }
        jVar2.d(new f9.f(((h9.a) cVar.f13343g).b() + this.f16312c, jVar));
        return null;
    }

    public /* synthetic */ f(nd.f fVar, Object obj, long j10, TimeUnit timeUnit, int i) {
        this.f16311b = i;
        this.f16313d = fVar;
        this.f16314e = obj;
        this.f16312c = j10;
        this.f16315f = timeUnit;
    }
}
