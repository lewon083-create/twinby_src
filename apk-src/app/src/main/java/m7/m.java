package m7;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.b30;
import com.google.android.gms.internal.ads.om1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import l7.n;
import l7.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f28738u = n.i("WorkerWrapper");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f28739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f28741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public bb.e f28742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u7.j f28743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ListenableWorker f28744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x7.b f28745h;
    public l7.m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b30 f28746j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f28747k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public WorkDatabase f28748l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.google.android.gms.internal.consent_sdk.c f28749m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public r3.b f28750n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r3.b f28751o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f28752p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f28753q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public w7.j f28754r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ed.d f28755s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f28756t;

    public final void a(l7.m mVar) {
        boolean z5 = mVar instanceof l7.l;
        String str = f28738u;
        if (!z5) {
            if (mVar instanceof l7.k) {
                n.g().h(str, om1.k("Worker result RETRY for ", this.f28753q), new Throwable[0]);
                c();
                return;
            }
            n.g().h(str, om1.k("Worker result FAILURE for ", this.f28753q), new Throwable[0]);
            if (this.f28743f.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        n.g().h(str, om1.k("Worker result SUCCESS for ", this.f28753q), new Throwable[0]);
        if (this.f28743f.c()) {
            d();
            return;
        }
        r3.b bVar = this.f28750n;
        String str2 = this.f28740c;
        com.google.android.gms.internal.consent_sdk.c cVar = this.f28749m;
        WorkDatabase workDatabase = this.f28748l;
        workDatabase.c();
        try {
            cVar.o(3, str2);
            cVar.m(str2, ((l7.l) this.i).f28049a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str3 : bVar.y(str2)) {
                if (cVar.e(str3) == 5) {
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) bVar.f32188c;
                    l6.j jVarD = l6.j.d(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        jVarD.i(1);
                    } else {
                        jVarD.j(1, str3);
                    }
                    workDatabase_Impl.b();
                    Cursor cursorG = workDatabase_Impl.g(jVarD);
                    try {
                        if (cursorG.moveToFirst() && cursorG.getInt(0) != 0) {
                            n.g().h(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                            cVar.o(1, str3);
                            cVar.n(jCurrentTimeMillis, str3);
                        }
                    } finally {
                        cursorG.close();
                        jVarD.k();
                    }
                }
            }
            workDatabase.h();
            workDatabase.f();
            e(false);
        } catch (Throwable th2) {
            workDatabase.f();
            e(false);
            throw th2;
        }
    }

    public final void b() {
        List list = this.f28741d;
        String str = this.f28740c;
        WorkDatabase workDatabase = this.f28748l;
        if (!h()) {
            workDatabase.c();
            try {
                int iE = this.f28749m.e(str);
                s7.g gVarM = workDatabase.m();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) gVarM.f32795b;
                workDatabase_Impl.b();
                u7.e eVar = (u7.e) gVarM.f32797d;
                r6.f fVarA = eVar.a();
                if (str == null) {
                    fVarA.d(1);
                } else {
                    fVarA.h(1, str);
                }
                workDatabase_Impl.c();
                try {
                    fVarA.k();
                    workDatabase_Impl.h();
                    if (iE == 0) {
                        e(false);
                    } else if (iE == 2) {
                        a(this.i);
                    } else if (!o.a(iE)) {
                        c();
                    }
                    workDatabase.h();
                    workDatabase.f();
                } finally {
                    workDatabase_Impl.f();
                    eVar.c(fVarA);
                }
            } catch (Throwable th2) {
                workDatabase.f();
                throw th2;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((d) it.next()).d(str);
            }
            e.a(this.f28746j, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f28740c;
        com.google.android.gms.internal.consent_sdk.c cVar = this.f28749m;
        WorkDatabase workDatabase = this.f28748l;
        workDatabase.c();
        try {
            cVar.o(1, str);
            cVar.n(System.currentTimeMillis(), str);
            cVar.k(-1L, str);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(true);
        }
    }

    public final void d() {
        String str = this.f28740c;
        com.google.android.gms.internal.consent_sdk.c cVar = this.f28749m;
        WorkDatabase workDatabase = this.f28748l;
        workDatabase.c();
        try {
            cVar.n(System.currentTimeMillis(), str);
            cVar.o(1, str);
            cVar.l(str);
            cVar.k(-1L, str);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(boolean r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.f28748l
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r5.f28748l     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.consent_sdk.c r0 = r0.n()     // Catch: java.lang.Throwable -> L42
            r0.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            l6.j r1 = l6.j.d(r2, r1)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = r0.f13337a     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0     // Catch: java.lang.Throwable -> L42
            r0.b()     // Catch: java.lang.Throwable -> L42
            android.database.Cursor r0 = r0.g(r1)     // Catch: java.lang.Throwable -> L42
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L2f
            r4 = 1
            if (r3 == 0) goto L31
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L31
            r3 = r4
            goto L32
        L2f:
            r6 = move-exception
            goto L90
        L31:
            r3 = r2
        L32:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.k()     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L44
            android.content.Context r0 = r5.f28739b     // Catch: java.lang.Throwable -> L42
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            v7.g.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r6 = move-exception
            goto L97
        L44:
            if (r6 == 0) goto L5a
            com.google.android.gms.internal.consent_sdk.c r0 = r5.f28749m     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f28740c     // Catch: java.lang.Throwable -> L42
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L42
            r0.o(r4, r1)     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.consent_sdk.c r0 = r5.f28749m     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f28740c     // Catch: java.lang.Throwable -> L42
            r2 = -1
            r0.k(r2, r1)     // Catch: java.lang.Throwable -> L42
        L5a:
            u7.j r0 = r5.f28743f     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            androidx.work.ListenableWorker r0 = r5.f28744g     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            boolean r0 = r0.isRunInForeground()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            m7.c r0 = r5.f28747k     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f28740c     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r0.f28707l     // Catch: java.lang.Throwable -> L42
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L42
            java.util.HashMap r3 = r0.f28703g     // Catch: java.lang.Throwable -> L79
            r3.remove(r1)     // Catch: java.lang.Throwable -> L79
            r0.h()     // Catch: java.lang.Throwable -> L79
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            goto L7c
        L79:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            throw r6     // Catch: java.lang.Throwable -> L42
        L7c:
            androidx.work.impl.WorkDatabase r0 = r5.f28748l     // Catch: java.lang.Throwable -> L42
            r0.h()     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase r0 = r5.f28748l
            r0.f()
            w7.j r0 = r5.f28754r
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.j(r6)
            return
        L90:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.k()     // Catch: java.lang.Throwable -> L42
            throw r6     // Catch: java.lang.Throwable -> L42
        L97:
            androidx.work.impl.WorkDatabase r0 = r5.f28748l
            r0.f()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.m.e(boolean):void");
    }

    public final void f() {
        com.google.android.gms.internal.consent_sdk.c cVar = this.f28749m;
        String str = this.f28740c;
        int iE = cVar.e(str);
        String str2 = f28738u;
        if (iE == 2) {
            n.g().e(str2, pe.a.f("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            e(true);
            return;
        }
        n nVarG = n.g();
        StringBuilder sbP = om1.p("Status for ", str, " is ");
        sbP.append(o.z(iE));
        sbP.append("; not doing any work");
        nVarG.e(str2, sbP.toString(), new Throwable[0]);
        e(false);
    }

    public final void g() {
        com.google.android.gms.internal.consent_sdk.c cVar = this.f28749m;
        String str = this.f28740c;
        WorkDatabase workDatabase = this.f28748l;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                if (cVar.e(str2) != 6) {
                    cVar.o(4, str2);
                }
                linkedList.addAll(this.f28750n.y(str2));
            }
            cVar.m(str, ((l7.j) this.i).f28048a);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.f28756t) {
            return false;
        }
        n.g().e(f28738u, om1.k("Work interrupted for ", this.f28753q), new Throwable[0]);
        if (this.f28749m.e(this.f28740c) == 0) {
            e(false);
            return true;
        }
        e(!o.a(r0));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3 A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:14:0x0056, B:17:0x0060, B:22:0x0082, B:24:0x0086, B:27:0x00ae, B:29:0x00b4, B:31:0x00ba, B:44:0x0102, B:36:0x00c3, B:39:0x00d2, B:41:0x00da), top: B:105:0x0056 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.m.run():void");
    }
}
