package f9;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.camera2.TotalCaptureResult;
import t.n;
import t.o;
import yads.af;
import yads.of1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements h, j1.i, of1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16708c;

    public /* synthetic */ f(long j10, y8.j jVar) {
        this.f16707b = j10;
        this.f16708c = jVar;
    }

    @Override // f9.h
    public Object apply(Object obj) {
        y8.j jVar = (y8.j) this.f16708c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f16707b));
        String str = jVar.f36552a;
        v8.d dVar = jVar.f36554c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(i9.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", jVar.f36552a);
            contentValues.put("priority", Integer.valueOf(i9.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // yads.of1
    public void invoke(Object obj) {
        long j10 = this.f16707b;
        ((af) obj).getClass();
    }

    @Override // j1.i
    public Object m(final j1.h hVar) {
        o oVar = (o) this.f16708c;
        final long j10 = this.f16707b;
        oVar.a(new n() { // from class: t.i
            @Override // t.n
            public final boolean b(TotalCaptureResult totalCaptureResult) {
                if (!o.A(totalCaptureResult, j10)) {
                    return false;
                }
                hVar.b(null);
                return true;
            }
        });
        return "waitForSessionUpdateId:" + j10;
    }

    public /* synthetic */ f(Object obj, long j10) {
        this.f16708c = obj;
        this.f16707b = j10;
    }
}
