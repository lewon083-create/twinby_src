package e9;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tasks.Task;
import io.appmetrica.analytics.impl.cp;
import io.sentry.clientreport.DiscardedEvent;
import j1.k;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import y8.j;
import yads.af;
import yads.of1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements g9.b, f9.h, sb.a, j1.i, of1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f16317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16319e;

    public /* synthetic */ g(he.g gVar, long j10, HashMap map) {
        this.f16316b = 2;
        this.f16318d = gVar;
        this.f16317c = j10;
        this.f16319e = map;
    }

    @Override // f9.h
    public Object apply(Object obj) {
        String str = (String) this.f16318d;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((b9.c) this.f16319e).f2003b;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z5 = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j10 = this.f16317c;
            if (z5) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put(DiscardedEvent.JsonKeys.REASON, Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    @Override // g9.b
    public Object execute() {
        com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f16318d;
        j jVar = (j) this.f16319e;
        f9.d dVar = (f9.d) cVar.f13339c;
        long jB = ((h9.a) cVar.f13343g).b() + this.f16317c;
        f9.j jVar2 = (f9.j) dVar;
        jVar2.getClass();
        jVar2.d(new f9.f(jB, jVar));
        return null;
    }

    @Override // sb.a
    public Object g(Task task) {
        return ((he.g) this.f16318d).b(task, this.f16317c, (HashMap) this.f16319e);
    }

    @Override // yads.of1
    public void invoke(Object obj) {
        long j10 = this.f16317c;
        Object obj2 = this.f16319e;
        ((af) obj).getClass();
    }

    @Override // j1.i
    public Object m(final j1.h hVar) {
        switch (this.f16316b) {
            case 3:
                final ed.d dVar = (ed.d) this.f16318d;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f16319e;
                k0.j.g(dVar, hVar);
                if (!dVar.isDone()) {
                    final long j10 = this.f16317c;
                    final ScheduledFuture scheduledFutureSchedule = scheduledExecutorService.schedule(new Callable() { // from class: k0.f
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(hVar.d(new TimeoutException("Future[" + dVar + "] is not done within " + j10 + " ms.")));
                        }
                    }, j10, TimeUnit.MILLISECONDS);
                    final int i = 0;
                    dVar.a(new Runnable() { // from class: k0.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    scheduledFutureSchedule.cancel(true);
                                    break;
                                default:
                                    scheduledFutureSchedule.cancel(true);
                                    break;
                            }
                        }
                    }, hl.d.j());
                }
                return "TimeoutFuture[" + dVar + "]";
            default:
                k kVar = (k) this.f16318d;
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f16319e;
                k0.j.g(kVar, hVar);
                j1.j jVar = kVar.f26173c;
                if (!jVar.isDone()) {
                    final ScheduledFuture<?> scheduledFutureSchedule2 = scheduledExecutorService2.schedule(new cp(21, hVar, kVar), this.f16317c, TimeUnit.MILLISECONDS);
                    final int i10 = 1;
                    jVar.a(new Runnable() { // from class: k0.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    scheduledFutureSchedule2.cancel(true);
                                    break;
                                default:
                                    scheduledFutureSchedule2.cancel(true);
                                    break;
                            }
                        }
                    }, hl.d.j());
                }
                return "TimeoutFuture[" + kVar + "]";
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, long j10, int i) {
        this.f16316b = i;
        this.f16318d = obj;
        this.f16319e = obj2;
        this.f16317c = j10;
    }
}
