package com.google.firebase.messaging;

import a0.d1;
import a0.o2;
import a0.z1;
import ad.b1;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ContentValues;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.util.Base64;
import android.util.Log;
import android.view.Surface;
import com.google.android.gms.internal.ads.y50;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.screenshot.impl.C0683n;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.sentry.IScope;
import io.sentry.ITransaction;
import io.sentry.Scope;
import io.sentry.android.core.internal.gestures.SentryGestureListener;
import j3.p0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.internal.Intrinsics;
import ni.g1;
import ni.m1;
import t.v0;
import yads.vq1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements sb.f, g9.b, f9.h, j1.i, sb.c, sb.a, m3.g, Scope.IWithTransaction, l4.m, OnCompleteListener, z1, k0.a, FunctionWithThrowable, e1.l, vq1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14861e;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i) {
        this.f14858b = i;
        this.f14859c = obj;
        this.f14860d = obj2;
        this.f14861e = obj3;
    }

    @Override // a0.z1
    public void a(o2 o2Var) {
        l6.i iVar = (l6.i) this.f14859c;
        TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) this.f14860d;
        m1 m1Var = (m1) this.f14861e;
        iVar.getClass();
        textureRegistry$SurfaceProducer.setCallback(new m7.a(5, o2Var));
        textureRegistry$SurfaceProducer.setSize(o2Var.f179b.getWidth(), o2Var.f179b.getHeight());
        Surface forcedNewSurface = textureRegistry$SurfaceProducer.getForcedNewSurface();
        o2Var.b(forcedNewSurface, Executors.newSingleThreadExecutor(), new g1(iVar, forcedNewSurface, m1Var));
    }

    @Override // io.sentry.Scope.IWithTransaction
    public void accept(ITransaction iTransaction) {
        ((SentryGestureListener) this.f14859c).lambda$applyScope$3((IScope) this.f14860d, (ITransaction) this.f14861e, iTransaction);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x014b A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:4:0x0019, B:12:0x002b, B:13:0x003f, B:17:0x0046, B:18:0x004d, B:20:0x0053, B:21:0x0069, B:22:0x00c9, B:24:0x00cf, B:25:0x00e7, B:27:0x00f9, B:29:0x00fd, B:30:0x0109, B:31:0x0121, B:33:0x0127, B:35:0x0135, B:37:0x013d, B:41:0x014b, B:43:0x015d), top: B:75:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0176  */
    @Override // f9.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ed.d apply(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.o.apply(java.lang.Object):ed.d");
    }

    @Override // e1.l
    public void b(Surface surface) {
        j0.i iVar;
        y50 y50Var = (y50) this.f14859c;
        j1.h hVar = (j1.h) this.f14860d;
        o2 o2Var = (o2) this.f14861e;
        int iM = t.z.m(y50Var.f12501b);
        if (iM != 0) {
            if (iM == 1) {
                if (o2Var.a()) {
                    com.google.android.gms.internal.auth.g.e("VideoEncoderSession", "Not provide surface, " + Objects.toString(o2Var, "EMPTY") + " is already serviced.");
                    hVar.b(null);
                    y50Var.a();
                    return;
                }
                y50Var.f12506g = surface;
                com.google.android.gms.internal.auth.g.e("VideoEncoderSession", "provide surface: " + surface);
                o2Var.b(surface, (Executor) y50Var.f12503d, new f7.i(4, y50Var));
                y50Var.f12501b = 4;
                hVar.b((e1.c0) y50Var.f12505f);
                return;
            }
            if (iM != 2) {
                if (iM == 3) {
                    if (((x0.q) y50Var.f12508j) != null && (iVar = (j0.i) y50Var.i) != null) {
                        iVar.execute(new v0(18, y50Var, surface));
                    }
                    com.google.android.gms.internal.auth.g.O("VideoEncoderSession", "Surface is updated in READY state: " + surface);
                    return;
                }
                if (iM != 4) {
                    throw new IllegalStateException("State " + pe.a.y(y50Var.f12501b) + " is not handled");
                }
            }
        }
        com.google.android.gms.internal.auth.g.e("VideoEncoderSession", "Not provide surface in ".concat(pe.a.y(y50Var.f12501b)));
        hVar.b(null);
    }

    @Override // sb.f
    public Task c(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f14859c;
        String str = (String) this.f14860d;
        z zVar = (z) this.f14861e;
        String str2 = (String) obj;
        v7.f fVarD = FirebaseMessaging.d(firebaseMessaging.f14766b);
        String strE = firebaseMessaging.e();
        String strA = firebaseMessaging.i.a();
        synchronized (fVarD) {
            String strA2 = z.a(str2, strA, System.currentTimeMillis());
            if (strA2 != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) fVarD.f34767c).edit();
                editorEdit.putString(v7.f.m(strE, str), strA2);
                editorEdit.commit();
            }
        }
        if (zVar == null || !str2.equals(zVar.f14904a)) {
            fd.g gVar = firebaseMessaging.f14765a;
            gVar.a();
            if ("[DEFAULT]".equals(gVar.f16759b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    gVar.a();
                    sb2.append(gVar.f16759b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new i(firebaseMessaging.f14766b).b(intent);
            }
        }
        return b4.s(str2);
    }

    @Override // l4.m
    public b1 d(int i, p0 p0Var, int[] iArr) {
        l4.j jVar = (l4.j) this.f14859c;
        String str = (String) this.f14860d;
        String str2 = (String) this.f14861e;
        ad.g0 g0VarQ = ad.j0.q();
        for (int i10 = 0; i10 < p0Var.f26351a; i10++) {
            g0VarQ.b(new l4.l(i, p0Var, i10, jVar, iArr[i10], str, str2));
        }
        return g0VarQ.g();
    }

    @Override // g9.b
    public Object execute() {
        d9.a aVar = (d9.a) this.f14859c;
        y8.j jVar = (y8.j) this.f14860d;
        y8.i iVar = (y8.i) this.f14861e;
        f9.j jVar2 = (f9.j) aVar.f15722d;
        jVar2.getClass();
        v8.d dVar = jVar.f36554c;
        String str = iVar.f36546a;
        String str2 = jVar.f36552a;
        String strM = ya.e.m("SQLiteEventStore");
        if (Log.isLoggable(strM, 3)) {
            Log.d(strM, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) jVar2.d(new o(jVar2, iVar, jVar, 2))).getClass();
        aVar.f15719a.R(jVar, 1, false);
        return null;
    }

    @Override // sb.a
    public Object g(Task task) {
        he.d dVar;
        URL url;
        switch (this.f14858b) {
            case 7:
                ge.e eVar = (ge.e) this.f14859c;
                Task task2 = (Task) this.f14860d;
                Task task3 = (Task) this.f14861e;
                if (!task2.isSuccessful() || task2.getResult() == null) {
                    return b4.s(Boolean.FALSE);
                }
                he.d dVar2 = (he.d) task2.getResult();
                return (task3.isSuccessful() && (dVar = (he.d) task3.getResult()) != null && dVar2.f20497c.equals(dVar.f20497c)) ? b4.s(Boolean.FALSE) : eVar.f20126d.d(dVar2).e(eVar.f20124b, new ge.d(eVar));
            default:
                he.k kVar = (he.k) this.f14859c;
                Task task4 = (Task) this.f14860d;
                Task task5 = (Task) this.f14861e;
                if (!task4.isSuccessful()) {
                    return b4.q(new ge.f("Firebase Installations failed to get installation auth token for config update listener connection.", task4.getException()));
                }
                if (!task5.isSuccessful()) {
                    return b4.q(new ge.f("Firebase Installations failed to get installation ID for config update listener connection.", task5.getException()));
                }
                try {
                    try {
                        url = new URL(kVar.c(kVar.f20538n));
                        break;
                    } catch (MalformedURLException unused) {
                        Log.e("FirebaseRemoteConfig", "URL is malformed");
                        url = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    kVar.i(httpURLConnection, (String) task5.getResult(), ((zd.a) task4.getResult()).f46244a);
                    return b4.s(httpURLConnection);
                } catch (IOException e3) {
                    return b4.q(new ge.f("Failed to open HTTP stream connection", e3));
                }
        }
    }

    @Override // j1.i
    public Object m(j1.h hVar) {
        Surface surface;
        switch (this.f14858b) {
            case 5:
                j1.k kVar = (j1.k) this.f14859c;
                j0.i iVar = (j0.i) this.f14860d;
                Collection collection = (Collection) this.f14861e;
                hVar.a(new d1(22, kVar), iVar);
                k0.j.a(kVar, new a7.l(16, hVar), iVar);
                return "surfaceList[" + collection + "]";
            default:
                y50 y50Var = (y50) this.f14859c;
                o2 o2Var = (o2) this.f14860d;
                e1.d dVar = (e1.d) this.f14861e;
                try {
                    wf.b bVar = (wf.b) y50Var.f12504e;
                    Executor executor = (Executor) y50Var.f12502c;
                    int i = o2Var.f184g;
                    bVar.getClass();
                    e1.c0 c0Var = new e1.c0(executor, dVar, i);
                    y50Var.f12505f = c0Var;
                    e1.k kVar2 = c0Var.f15923g;
                    if (kVar2 instanceof e1.b0) {
                        e1.b0 b0Var = (e1.b0) kVar2;
                        Executor executor2 = (Executor) y50Var.f12503d;
                        o oVar = new o(y50Var, hVar, o2Var, 17);
                        synchronized (b0Var.f15902b) {
                            b0Var.f15905e = oVar;
                            executor2.getClass();
                            b0Var.f15906f = executor2;
                            surface = b0Var.f15903c;
                            break;
                        }
                        if (surface != null) {
                            try {
                                executor2.execute(new e1.y(3, oVar, surface));
                            } catch (RejectedExecutionException e3) {
                                com.google.android.gms.internal.auth.g.l(b0Var.f15907g.f15917a, "Unable to post to the supplied executor.", e3);
                            }
                        }
                    } else {
                        hVar.d(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
                    }
                    break;
                } catch (e1.e0 e7) {
                    com.google.android.gms.internal.auth.g.l("VideoEncoderSession", "Unable to initialize video encoder.", e7);
                    hVar.d(e7);
                }
                return "ConfigureVideoEncoderFuture " + y50Var;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        sb.m mVarS;
        mh.a aVar = (mh.a) this.f14859c;
        r3.b bVar = (r3.b) this.f14860d;
        hi.g gVar = (hi.g) this.f14861e;
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isSuccessful()) {
            Log.w("InAppReviewPlugin", "onComplete: Unsuccessfully requested review flow");
            gVar.b("error", "In-App Review API unavailable", null);
            return;
        }
        Log.i("InAppReviewPlugin", "onComplete: Successfully requested review flow");
        uc.b bVar2 = (uc.b) task.getResult();
        Activity activity = aVar.f28899d;
        Intrinsics.b(activity);
        uc.c cVar = (uc.c) bVar2;
        if (cVar.f34444c) {
            mVarS = b4.s(null);
        } else {
            Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
            intent.putExtra("confirmation_intent", cVar.f34443b);
            intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
            sb.g gVar2 = new sb.g();
            intent.putExtra("result_receiver", new uc.d((Handler) bVar.f32189d, gVar2));
            activity.startActivity(intent);
            mVarS = gVar2.f32858a;
        }
        Intrinsics.checkNotNullExpressionValue(mVarS, "launchReviewFlow(...)");
        mVarS.addOnCompleteListener(new e8.e(gVar, 7));
    }

    @Override // sb.c
    public void onFailure(Exception exc) {
        g8.e eVar = (g8.e) this.f14859c;
        Activity activity = (Activity) this.f14860d;
        f8.a aVar = (f8.a) this.f14861e;
        if (!(exc instanceof na.k)) {
            if (((na.d) exc).f29186b.f2633b == 8502) {
                eVar.h(eVar.f20025f);
                return;
            } else {
                aVar.onError(3);
                return;
            }
        }
        if (activity == null) {
            aVar.onError(3);
            return;
        }
        na.k kVar = (na.k) exc;
        if (kVar.f29186b.f2633b != 6) {
            aVar.onError(3);
            return;
        }
        try {
            kVar.a(activity, eVar.f20024e);
        } catch (IntentSender.SendIntentException unused) {
            aVar.onError(3);
        }
    }

    @Override // m3.g
    public void accept(Object obj) {
        i4.i0 i0Var = (i4.i0) this.f14859c;
        ((i4.j0) obj).g(i0Var.f20926a, (i4.c0) this.f14860d, (f4.g) this.f14861e);
    }

    @Override // f9.h
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        v8.c cVar;
        Cursor cursor;
        f9.j jVar;
        v8.c cVar2;
        b9.c cVar3;
        b9.c cVar4;
        int i = this.f14858b;
        int i10 = 5;
        int i11 = 4;
        int i12 = 3;
        b9.c cVar5 = b9.c.CACHE_FULL;
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        Object obj2 = this.f14861e;
        Object obj3 = this.f14860d;
        Object obj4 = this.f14859c;
        switch (i) {
            case 2:
                f9.j jVar2 = (f9.j) obj4;
                y8.i iVar = (y8.i) obj3;
                y8.m mVar = iVar.f36548c;
                String str = iVar.f36546a;
                y8.j jVar3 = (y8.j) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = jVar2.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * jVar2.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                f9.a aVar = jVar2.f16716e;
                if (jSimpleQueryForLong >= aVar.f16697a) {
                    jVar2.i(1L, cVar5, str);
                    return -1L;
                }
                Long lB = f9.j.b(sQLiteDatabase, jVar3);
                if (lB != null) {
                    jInsert = lB.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", jVar3.f36552a);
                    contentValues.put("priority", Integer.valueOf(i9.a.a(jVar3.f36554c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = jVar3.f36553b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i16 = aVar.f16701e;
                byte[] bArr2 = mVar.f36562b;
                boolean z5 = bArr2.length <= i16;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(iVar.f36549d));
                contentValues2.put("uptime_ms", Long.valueOf(iVar.f36550e));
                contentValues2.put("payload_encoding", mVar.f36561a.f34805a);
                contentValues2.put("code", iVar.f36547b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z5));
                contentValues2.put("payload", z5 ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z5) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i16));
                    for (int i17 = 1; i17 <= iCeil; i17++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i17 - 1) * i16, Math.min(i17 * i16, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i17));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(iVar.f36551f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 3:
                f9.j jVar4 = (f9.j) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                y8.j jVar5 = (y8.j) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j10 = cursor2.getLong(0);
                    int i18 = cursor2.getInt(7) != 0 ? i15 : 0;
                    q9.o oVar = new q9.o();
                    oVar.f31951f = new HashMap();
                    String string = cursor2.getString(i15);
                    if (string != null) {
                        oVar.f31946a = string;
                        oVar.f31949d = Long.valueOf(cursor2.getLong(i13));
                        oVar.f31950e = Long.valueOf(cursor2.getLong(3));
                        if (i18 != 0) {
                            String string2 = cursor2.getString(4);
                            if (string2 == null) {
                                cVar2 = f9.j.f16712g;
                            } else {
                                cVar2 = new v8.c(string2);
                            }
                            oVar.f31948c = new y8.m(cVar2, cursor2.getBlob(5));
                            jVar = jVar4;
                        } else {
                            String string3 = cursor2.getString(4);
                            if (string3 == null) {
                                cVar = f9.j.f16712g;
                            } else {
                                cVar = new v8.c(string3);
                            }
                            Cursor cursorQuery = jVar4.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num");
                            try {
                                Cursor cursor3 = cursorQuery;
                                ArrayList arrayList2 = new ArrayList();
                                int length = 0;
                                while (cursor3.moveToNext()) {
                                    byte[] blob = cursor3.getBlob(0);
                                    arrayList2.add(blob);
                                    length += blob.length;
                                    break;
                                }
                                byte[] bArr3 = new byte[length];
                                int i19 = 0;
                                int length2 = 0;
                                while (i19 < arrayList2.size()) {
                                    byte[] bArr4 = (byte[]) arrayList2.get(i19);
                                    f9.j jVar6 = jVar4;
                                    cursor = cursorQuery;
                                    try {
                                        System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                        length2 += bArr4.length;
                                        i19++;
                                        cursorQuery = cursor;
                                        jVar4 = jVar6;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor.close();
                                        throw th;
                                    }
                                }
                                jVar = jVar4;
                                cursorQuery.close();
                                oVar.f31948c = new y8.m(cVar, bArr3);
                            } catch (Throwable th3) {
                                th = th3;
                                cursor = cursorQuery;
                            }
                        }
                        if (!cursor2.isNull(6)) {
                            oVar.f31947b = Integer.valueOf(cursor2.getInt(6));
                        }
                        arrayList.add(new f9.b(j10, jVar5, oVar.i()));
                        jVar4 = jVar;
                        i13 = 2;
                        i15 = 1;
                    } else {
                        throw new NullPointerException("Null transportName");
                    }
                }
                return null;
            case 4:
                f9.j jVar7 = (f9.j) obj4;
                HashMap map = (HashMap) obj3;
                y yVar = (y) obj2;
                ArrayList arrayList3 = (ArrayList) yVar.f14901d;
                Cursor cursor4 = (Cursor) obj;
                jVar7.getClass();
                while (cursor4.moveToNext()) {
                    String string4 = cursor4.getString(i14);
                    int i20 = cursor4.getInt(1);
                    b9.c cVar6 = b9.c.REASON_UNKNOWN;
                    if (i20 != 0) {
                        if (i20 == 1) {
                            cVar6 = b9.c.MESSAGE_TOO_OLD;
                        } else if (i20 == 2) {
                            cVar3 = cVar5;
                            cVar4 = cVar3;
                        } else if (i20 == i12) {
                            cVar6 = b9.c.PAYLOAD_TOO_BIG;
                        } else if (i20 == i11) {
                            cVar6 = b9.c.MAX_RETRIES_REACHED;
                        } else if (i20 == i10) {
                            cVar6 = b9.c.INVALID_PAYLOD;
                        } else if (i20 == 6) {
                            cVar6 = b9.c.SERVER_ERROR;
                        } else {
                            ya.e.f("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i20));
                        }
                        cVar4 = cVar5;
                        cVar3 = cVar6;
                    } else {
                        cVar4 = cVar5;
                        cVar3 = cVar6;
                    }
                    long j11 = cursor4.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new b9.d(j11, cVar3));
                    cVar5 = cVar4;
                    i10 = 5;
                    i11 = 4;
                    i12 = 3;
                    i14 = 0;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i21 = b9.e.f2006c;
                    new ArrayList();
                    arrayList3.add(new b9.e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                yVar.f14900c = (b9.g) jVar7.d(new f9.g(jVar7.f16714c.b()));
                yVar.f14902e = new b9.b(new b9.f(jVar7.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * jVar7.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), f9.a.f16696f.f16697a));
                yVar.f14899b = (String) jVar7.f16717f.get();
                return new b9.a((b9.g) yVar.f14900c, Collections.unmodifiableList(arrayList3), (b9.b) yVar.f14902e, (String) yVar.f14899b);
            default:
                return io.appmetrica.analytics.screenshot.impl.d0.a((io.appmetrica.analytics.screenshot.impl.g0) obj4, (io.appmetrica.analytics.screenshot.impl.d0) obj3, (C0683n) obj2, (ActivityManager) obj);
        }
    }
}
