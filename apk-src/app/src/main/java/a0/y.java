package a0;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.sentry.IScope;
import io.sentry.ITransaction;
import io.sentry.Scope;
import io.sentry.ScopeCallback;
import io.sentry.android.core.internal.gestures.SentryGestureListener;
import io.sentry.flutter.SentryFlutterPlugin;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements j1.i, g0.j1, b4.x, OnCompleteListener, sb.a, g9.b, f9.h, md.e, sb.f, m3.g, Scope.IWithTransaction, ScopeCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f274d;

    public /* synthetic */ y(int i, Object obj, Object obj2) {
        this.f272b = i;
        this.f273c = obj;
        this.f274d = obj2;
    }

    private final Object e(Task task) {
        he.g gVar = (he.g) this.f273c;
        Date date = (Date) this.f274d;
        gVar.getClass();
        if (task.isSuccessful()) {
            he.m mVar = gVar.f20514g;
            synchronized (mVar.f20548b) {
                mVar.f20547a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
            return task;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return task;
        }
        if (exception instanceof ge.h) {
            he.m mVar2 = gVar.f20514g;
            synchronized (mVar2.f20548b) {
                mVar2.f20547a.edit().putInt("last_fetch_status", 2).apply();
            }
            return task;
        }
        he.m mVar3 = gVar.f20514g;
        synchronized (mVar3.f20548b) {
            mVar3.f20547a.edit().putInt("last_fetch_status", 1).apply();
        }
        return task;
    }

    @Override // g0.j1
    public void a(g0.k1 k1Var) {
        switch (this.f272b) {
            case 1:
                e2 e2Var = (e2) this.f273c;
                g0.j1 j1Var = (g0.j1) this.f274d;
                e2Var.getClass();
                j1Var.a(e2Var);
                break;
            default:
                a1.e eVar = (a1.e) this.f273c;
                g0.j1 j1Var2 = (g0.j1) this.f274d;
                eVar.getClass();
                j1Var2.a(eVar);
                break;
        }
    }

    @Override // io.sentry.Scope.IWithTransaction
    public void accept(ITransaction iTransaction) {
        ((SentryGestureListener) this.f273c).lambda$clearScope$2((IScope) this.f274d, iTransaction);
    }

    @Override // f9.h
    public Object apply(Object obj) {
        f9.j jVar = (f9.j) this.f273c;
        y8.j jVar2 = (y8.j) this.f274d;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        f9.a aVar = jVar.f16716e;
        ArrayList arrayListH = jVar.h(sQLiteDatabase, jVar2, aVar.f16698b);
        for (v8.d dVar : v8.d.values()) {
            if (dVar != jVar2.f36554c) {
                int size = aVar.f16698b - arrayListH.size();
                if (size <= 0) {
                    break;
                }
                x7.b bVarA = y8.j.a();
                bVarA.d(jVar2.f36552a);
                if (dVar == null) {
                    throw new NullPointerException("Null priority");
                }
                bVarA.f35979d = dVar;
                bVarA.f35978c = jVar2.f36553b;
                arrayListH.addAll(jVar.h(sQLiteDatabase, bVarA.a(), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayListH.size(); i++) {
            sb2.append(((f9.b) arrayListH.get(i)).f16702a);
            if (i < arrayListH.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        try {
            Cursor cursor = cursorQuery;
            while (cursor.moveToNext()) {
                long j10 = cursor.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j10));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j10), hashSet);
                }
                hashSet.add(new f9.i(cursor.getString(1), cursor.getString(2)));
            }
            cursorQuery.close();
            ListIterator listIterator = arrayListH.listIterator();
            while (listIterator.hasNext()) {
                f9.b bVar = (f9.b) listIterator.next();
                long j11 = bVar.f16702a;
                if (map.containsKey(Long.valueOf(j11))) {
                    q9.o oVarC = bVar.f16704c.c();
                    for (f9.i iVar : (Set) map.get(Long.valueOf(j11))) {
                        oVarC.g(iVar.f16710a, iVar.f16711b);
                    }
                    listIterator.set(new f9.b(j11, bVar.f16703b, oVarC.i()));
                }
            }
            return arrayListH;
        } catch (Throwable th2) {
            cursorQuery.close();
            throw th2;
        }
    }

    @Override // b4.x
    public int b(Object obj) {
        Context context = (Context) this.f274d;
        j3.o oVar = (j3.o) this.f273c;
        b4.p pVar = (b4.p) obj;
        String str = pVar.f1908b;
        return ((str.equals(oVar.f26335n) || str.equals(b4.y.c(oVar))) && pVar.c(context, oVar, false) && pVar.d(oVar)) ? 1 : 0;
    }

    @Override // sb.f
    public Task c(Object obj) {
        he.c cVar = (he.c) this.f273c;
        he.d dVar = (he.d) this.f274d;
        synchronized (cVar) {
            cVar.f20493c = b4.s(dVar);
        }
        return b4.s(dVar);
    }

    public void d(ni.j jVar) {
        fd.b bVar = (fd.b) this.f273c;
        ni.x0 x0Var = (ni.x0) this.f274d;
        bVar.f16748a = false;
        x0Var.a(jVar);
    }

    @Override // g9.b
    public Object execute() {
        switch (this.f272b) {
            case 7:
                com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f273c;
                Iterable iterable = (Iterable) this.f274d;
                f9.j jVar = (f9.j) ((f9.d) cVar.f13339c);
                jVar.getClass();
                if (iterable.iterator().hasNext()) {
                    jVar.a().compileStatement("DELETE FROM events WHERE _id in " + f9.j.k(iterable)).execute();
                    break;
                }
                break;
            default:
                com.google.android.gms.internal.consent_sdk.c cVar2 = (com.google.android.gms.internal.consent_sdk.c) this.f273c;
                for (Map.Entry entry : ((HashMap) this.f274d).entrySet()) {
                    ((f9.j) ((f9.c) cVar2.i)).i(((Integer) entry.getValue()).intValue(), b9.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d4 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #9 {all -> 0x0056, blocks: (B:11:0x003f, B:13:0x0042, B:14:0x0043, B:22:0x005f, B:62:0x00d0, B:64:0x00d4, B:66:0x00d7, B:70:0x00db, B:71:0x00dc, B:65:0x00d5), top: B:144:0x001b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dc A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #9 {all -> 0x0056, blocks: (B:11:0x003f, B:13:0x0042, B:14:0x0043, B:22:0x005f, B:62:0x00d0, B:64:0x00d4, B:66:0x00d7, B:70:0x00db, B:71:0x00dc, B:65:0x00d5), top: B:144:0x001b, inners: #10 }] */
    /* JADX WARN: Type inference failed for: r0v6, types: [he.k] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r15v39, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r15v5, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // sb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(com.google.android.gms.tasks.Task r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.y.g(com.google.android.gms.tasks.Task):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    @Override // md.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object l(q9.o r5) {
        /*
            r4 = this;
            int r0 = r4.f272b
            switch(r0) {
                case 11: goto L1f;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f273c
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r4.f274d
            md.b r1 = (md.b) r1
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L1a
            md.e r0 = r1.f28836f     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r5 = r0.l(r5)     // Catch: java.lang.Throwable -> L1a
            android.os.Trace.endSection()
            return r5
        L1a:
            r5 = move-exception
            android.os.Trace.endSection()
            throw r5
        L1f:
            java.lang.Object r0 = r4.f273c
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r4.f274d
            e5.g r1 = (e5.g) r1
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Object r5 = r5.a(r2)
            android.content.Context r5 = (android.content.Context) r5
            int r1 = r1.f16249b
            switch(r1) {
                case 11: goto L99;
                case 12: goto L8c;
                case 13: goto L4a;
                default: goto L34;
            }
        L34:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            java.lang.String r5 = r5.getPackageName()
            java.lang.String r5 = r1.getInstallerPackageName(r5)
            if (r5 == 0) goto L47
            java.lang.String r5 = com.google.firebase.FirebaseCommonRegistrar.a(r5)
            goto La5
        L47:
            java.lang.String r5 = ""
            goto La5
        L4a:
            int r1 = android.os.Build.VERSION.SDK_INT
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r3 = "android.hardware.type.television"
            boolean r2 = r2.hasSystemFeature(r3)
            if (r2 == 0) goto L5b
            java.lang.String r5 = "tv"
            goto La5
        L5b:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r3 = "android.hardware.type.watch"
            boolean r2 = r2.hasSystemFeature(r3)
            if (r2 == 0) goto L6a
            java.lang.String r5 = "watch"
            goto La5
        L6a:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r3 = "android.hardware.type.automotive"
            boolean r2 = r2.hasSystemFeature(r3)
            if (r2 == 0) goto L79
            java.lang.String r5 = "auto"
            goto La5
        L79:
            r2 = 26
            if (r1 < r2) goto L47
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.lang.String r1 = "android.hardware.type.embedded"
            boolean r5 = r5.hasSystemFeature(r1)
            if (r5 == 0) goto L47
            java.lang.String r5 = "embedded"
            goto La5
        L8c:
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            if (r5 == 0) goto L47
            int r5 = r5.minSdkVersion
            java.lang.String r5 = java.lang.String.valueOf(r5)
            goto La5
        L99:
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            if (r5 == 0) goto L47
            int r5 = r5.targetSdkVersion
            java.lang.String r5 = java.lang.String.valueOf(r5)
        La5:
            fe.a r1 = new fe.a
            r1.<init>(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.y.l(q9.o):java.lang.Object");
    }

    @Override // j1.i
    public Object m(j1.h hVar) {
        switch (this.f272b) {
            case 0:
                b0 b0Var = (b0) this.f273c;
                Context context = (Context) this.f274d;
                Executor executor = b0Var.f31d;
                executor.execute(new z(b0Var, context, executor, 1, hVar, SystemClock.elapsedRealtime()));
                return "CameraX initInternal";
            default:
                o2 o2Var = (o2) this.f273c;
                ((AtomicReference) this.f274d).set(hVar);
                return "SurfaceRequest-surface-recreation(" + o2Var.hashCode() + ")";
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f272b) {
            case 5:
                ((com.google.firebase.messaging.f) this.f273c).a((Intent) this.f274d);
                break;
            case 22:
                oi.j jVar = (oi.j) this.f273c;
                fj.z zVar = (fj.z) this.f274d;
                Intrinsics.checkNotNullParameter(task, "task");
                jVar.getClass();
                oi.j.c(task, zVar);
                break;
            case 23:
                oi.j jVar2 = (oi.j) this.f273c;
                fj.z zVar2 = (fj.z) this.f274d;
                Intrinsics.checkNotNullParameter(task, "task");
                jVar2.getClass();
                oi.j.c(task, zVar2);
                break;
            case 24:
                oi.j jVar3 = (oi.j) this.f273c;
                fj.z zVar3 = (fj.z) this.f274d;
                Intrinsics.checkNotNullParameter(task, "task");
                jVar3.getClass();
                oi.j.b(task, zVar3);
                break;
            case 25:
                oi.j jVar4 = (oi.j) this.f273c;
                fj.z zVar4 = (fj.z) this.f274d;
                Intrinsics.checkNotNullParameter(task, "task");
                jVar4.getClass();
                oi.j.c(task, zVar4);
                break;
            case 26:
                oi.j jVar5 = (oi.j) this.f273c;
                fj.z zVar5 = (fj.z) this.f274d;
                Intrinsics.checkNotNullParameter(task, "task");
                jVar5.getClass();
                oi.j.c(task, zVar5);
                break;
            case 27:
                oi.j jVar6 = (oi.j) this.f273c;
                fj.z zVar6 = (fj.z) this.f274d;
                Intrinsics.checkNotNullParameter(task, "task");
                jVar6.getClass();
                oi.j.b(task, zVar6);
                break;
            case 28:
                oi.j jVar7 = (oi.j) this.f273c;
                fj.z zVar7 = (fj.z) this.f274d;
                Intrinsics.checkNotNullParameter(task, "task");
                jVar7.getClass();
                oi.j.c(task, zVar7);
                break;
            default:
                oi.j jVar8 = (oi.j) this.f273c;
                fj.z zVar8 = (fj.z) this.f274d;
                Intrinsics.checkNotNullParameter(task, "task");
                jVar8.getClass();
                oi.j.c(task, zVar8);
                break;
        }
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        switch (this.f272b) {
            case 18:
                ((SentryGestureListener) this.f273c).lambda$startTracing$0((ITransaction) this.f274d, iScope);
                break;
            default:
                SentryFlutterPlugin.Companion.setContext$lambda$1((String) this.f273c, this.f274d, iScope);
                break;
        }
    }

    public /* synthetic */ y(Context context, j3.o oVar) {
        this.f272b = 3;
        this.f274d = context;
        this.f273c = oVar;
    }

    @Override // m3.g
    public void accept(Object obj) {
        i4.i0 i0Var = (i4.i0) this.f273c;
        ((i4.j0) obj).t(i0Var.f20926a, i0Var.f20927b, (f4.g) this.f274d);
    }
}
