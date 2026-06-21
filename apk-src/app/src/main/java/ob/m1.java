package ob;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g4 f30291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r1 f30292d;

    public /* synthetic */ m1(r1 r1Var, g4 g4Var, int i) {
        this.f30290b = i;
        this.f30291c = g4Var;
        this.f30292d = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f30290b) {
            case 0:
                r1 r1Var = this.f30292d;
                r1Var.f30382b.B();
                r1Var.f30382b.X(this.f30291c);
                break;
            case 1:
                r1 r1Var2 = this.f30292d;
                r1Var2.f30382b.B();
                z3 z3Var = r1Var2.f30382b;
                if (z3Var.f30628z != null) {
                    ArrayList arrayList = new ArrayList();
                    z3Var.A = arrayList;
                    arrayList.addAll(z3Var.f30628z);
                }
                n nVar = z3Var.f30607d;
                z3.T(nVar);
                l1 l1Var = (l1) nVar.f15951b;
                g4 g4Var = this.f30291c;
                String str = g4Var.f30131b;
                pa.c0.i(str);
                pa.c0.f(str);
                nVar.C();
                nVar.D();
                try {
                    SQLiteDatabase sQLiteDatabaseR0 = nVar.r0();
                    String[] strArr = {str};
                    int iDelete = sQLiteDatabaseR0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseR0.delete("events", "app_id=?", strArr) + sQLiteDatabaseR0.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseR0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseR0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseR0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseR0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseR0.delete("queue", "app_id=?", strArr) + sQLiteDatabaseR0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseR0.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseR0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseR0.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseR0.delete("upload_queue", "app_id=?", strArr);
                    if (l1Var.f30263e.M(null, d0.f30018h1)) {
                        iDelete += sQLiteDatabaseR0.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    if (iDelete > 0) {
                        s0 s0Var = l1Var.f30265g;
                        l1.k(s0Var);
                        s0Var.f30418o.h(str, "Reset analytics data. app, records", Integer.valueOf(iDelete));
                    }
                } catch (SQLiteException e3) {
                    s0 s0Var2 = l1Var.f30265g;
                    l1.k(s0Var2);
                    s0Var2.f30411g.h(s0.K(str), "Error resetting analytics data. appId, error", e3);
                }
                if (g4Var.i) {
                    z3Var.X(g4Var);
                }
                break;
            default:
                z3 z3Var2 = this.f30292d.f30382b;
                z3Var2.B();
                z3Var2.m0(this.f30291c);
                break;
        }
    }
}
