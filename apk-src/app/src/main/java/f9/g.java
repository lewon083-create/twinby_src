package f9;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import k6.t0;
import o4.v;
import u3.a0;
import u3.w;
import u3.y;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements h, m3.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16709b;

    public /* synthetic */ g(long j10) {
        this.f16709b = j10;
    }

    @Override // f9.h
    public Object apply(Object obj) {
        long j10 = this.f16709b;
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
        try {
            Cursor cursor = cursorRawQuery;
            cursor.moveToNext();
            return new b9.g(cursor.getLong(0), j10);
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // m3.k, yads.of1
    public void invoke(Object obj) {
        t0 t0Var;
        w wVar = (w) obj;
        y yVar = wVar.f34209b;
        if (wVar.equals(yVar.f34225j) && (t0Var = yVar.f34229n) != null) {
            a0 a0Var = (a0) t0Var.f27180c;
            a0Var.V0 = true;
            v vVar = a0Var.K0;
            Handler handler = vVar.f29700a;
            if (handler != null) {
                handler.post(new u3.k(vVar, this.f16709b));
            }
        }
    }
}
