package ob;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements g0.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f30243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f30244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f30245d;

    public l(n nVar, String str) {
        this.f30245d = nVar;
        pa.c0.f(str);
        this.f30244c = str;
        this.f30243b = -1L;
    }

    public List b() {
        List list;
        n nVar = (n) this.f30245d;
        ArrayList arrayList = new ArrayList();
        String str = (String) this.f30244c;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = nVar.r0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.f30243b)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j10 = cursorQuery.getLong(0);
                        long j11 = cursorQuery.getLong(3);
                        boolean z5 = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j10 > this.f30243b) {
                            this.f30243b = j10;
                        }
                        try {
                            com.google.android.gms.internal.measurement.c3 c3Var = (com.google.android.gms.internal.measurement.c3) v0.p0(com.google.android.gms.internal.measurement.d3.z(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            c3Var.b();
                            ((com.google.android.gms.internal.measurement.d3) c3Var.f13840c).F(string);
                            long j12 = cursorQuery.getLong(2);
                            c3Var.b();
                            ((com.google.android.gms.internal.measurement.d3) c3Var.f13840c).G(j12);
                            arrayList.add(new k(j10, j11, z5, (com.google.android.gms.internal.measurement.d3) c3Var.e()));
                        } catch (IOException e3) {
                            s0 s0Var = ((l1) nVar.f15951b).f30265g;
                            l1.k(s0Var);
                            s0Var.f30411g.h(s0.K(str), "Data loss. Failed to merge raw event. appId", e3);
                        }
                    } while (cursorQuery.moveToNext());
                } else {
                    list = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e7) {
                s0 s0Var2 = ((l1) nVar.f15951b).f30265g;
                l1.k(s0Var2);
                s0Var2.f30411g.h(s0.K(str), "Data loss. Error querying raw events batch. appId", e7);
                list = arrayList;
            }
            return list;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    @Override // g0.v
    public g0.r2 c() {
        return (g0.r2) this.f30245d;
    }

    @Override // g0.v
    public int d() {
        g0.v vVar = (g0.v) this.f30244c;
        if (vVar != null) {
            return vVar.d();
        }
        return 1;
    }

    @Override // g0.v
    public long getTimestamp() {
        g0.v vVar = (g0.v) this.f30244c;
        if (vVar != null) {
            return vVar.getTimestamp();
        }
        long j10 = this.f30243b;
        if (j10 != -1) {
            return j10;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // g0.v
    public g0.u h() {
        g0.v vVar = (g0.v) this.f30244c;
        return vVar != null ? vVar.h() : g0.u.f19766b;
    }

    @Override // g0.v
    public g0.s k() {
        g0.v vVar = (g0.v) this.f30244c;
        return vVar != null ? vVar.k() : g0.s.f19736b;
    }

    @Override // g0.v
    public g0.t n() {
        g0.v vVar = (g0.v) this.f30244c;
        return vVar != null ? vVar.n() : g0.t.f19756b;
    }

    public l(n nVar, String str, long j10) {
        this.f30245d = nVar;
        pa.c0.f(str);
        this.f30244c = str;
        this.f30243b = nVar.n0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j10)}, -1L);
    }

    public l(g0.v vVar, g0.r2 r2Var, long j10) {
        this.f30244c = vVar;
        this.f30245d = r2Var;
        this.f30243b = j10;
    }
}
