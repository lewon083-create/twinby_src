package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.DefaultNetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.SendingDataTaskHelper;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.th, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0513th implements UnderlyingNetworkTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f24788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f24789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0329m7 f24790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0281k9 f24791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M6 f24792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f24793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24795h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0488sh f24796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0018a3 f24797k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PublicLogger f24798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wo f24799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Sa f24800n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Yg f24801o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FullUrlFormer f24802p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0657zb f24803q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RequestDataHolder f24804r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ResponseDataHolder f24805s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SendingDataTaskHelper f24806t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f24807u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f24808v;

    public C0513th(@NonNull Y4 y42, @NonNull Yg yg, @NonNull C0657zb c0657zb, @NonNull FullUrlFormer<C0264jh> fullUrlFormer, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this(y42, yg, c0657zb, fullUrlFormer, requestDataHolder, responseDataHolder, y42.i(), y42.p(), y42.u(), requestBodyEncrypter);
    }

    public final C0281k9 a(C0488sh c0488sh, List list, C0264jh c0264jh) {
        C0281k9 c0281k9 = new C0281k9();
        C0076c9 c0076c9 = new C0076c9();
        c0076c9.f23568a = WrapUtils.getOrDefaultIfEmpty(this.f24790c.f24342b, c0264jh.getUuid());
        c0076c9.f23569b = WrapUtils.getOrDefaultIfEmpty(this.f24790c.f24341a, c0264jh.getDeviceId());
        this.f24794g = CodedOutputByteBufferNano.computeMessageSize(4, c0076c9) + this.f24794g;
        c0281k9.f24215b = c0076c9;
        C0370nn c0370nnC = C0382oa.I.C();
        C0439qh c0439qh = new C0439qh(this, c0281k9);
        synchronized (c0370nnC) {
            c0370nnC.f24456a.a(c0439qh);
        }
        c0281k9.f24214a = (C0205h9[]) c0488sh.f24739a.toArray(new C0205h9[0]);
        c0281k9.f24216c = a(c0488sh.f24741c);
        c0281k9.f24218e = (String[]) list.toArray(new String[0]);
        Set set = c0264jh.f24173x;
        String[] strArr = (String[]) set.toArray(new String[0]);
        c0281k9.f24219f = new byte[strArr.length][];
        for (int i = 0; i < set.size(); i++) {
            c0281k9.f24219f[i] = StringUtils.getUTF8Bytes(strArr[i]);
        }
        return c0281k9;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final String description() {
        return "ReportTask_" + ApiKeyUtils.createPartialApiKey(this.f24788a.f23283b.f22910b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f24802p;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final RequestDataHolder getRequestDataHolder() {
        return this.f24804r;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f24805s;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C0264jh) this.f24788a.f23291k.a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((C0667zl) C0382oa.I.z()).getClass();
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        Cursor cursorRawQuery;
        int iOptInt;
        M6 m62 = this.f24788a.f23286e;
        m62.getClass();
        ArrayList arrayList = new ArrayList();
        m62.f22653a.lock();
        try {
            SQLiteDatabase readableDatabase = m62.f22655c.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(AbstractC0551v5.f24873b, null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues);
                        arrayList.add(contentValues);
                    } catch (Throwable unused) {
                        try {
                            arrayList = new ArrayList();
                        } finally {
                            ko.a(cursorRawQuery);
                            m62.f22653a.unlock();
                        }
                    }
                }
            } else {
                cursorRawQuery = null;
            }
        } catch (Throwable unused2) {
            cursorRawQuery = null;
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        ContentValues contentValues2 = (ContentValues) arrayList.get(0);
        this.f24789b.clear();
        for (Map.Entry<String, Object> entry : contentValues2.valueSet()) {
            this.f24789b.put(entry.getKey(), entry.getValue().toString());
        }
        String asString = contentValues2.getAsString("report_request_parameters");
        if (TextUtils.isEmpty(asString)) {
            C0329m7 c0329m7 = new C0329m7();
            this.f24790c = c0329m7;
            this.f24801o.f23348c = c0329m7;
        } else {
            try {
                C0329m7 c0329m72 = new C0329m7(new C0181gb(asString));
                this.f24790c = c0329m72;
                this.f24801o.f23348c = c0329m72;
            } catch (Throwable unused3) {
                C0329m7 c0329m73 = new C0329m7();
                this.f24790c = c0329m73;
                this.f24801o.f23348c = c0329m73;
            }
        }
        C0264jh config = this.f24803q.getConfig();
        List list = config.f24172w;
        if (ko.a((Collection) list)) {
            return false;
        }
        this.f24802p.setHosts(config.f24166q);
        if (!config.u() || ko.a((Collection) this.f24802p.getAllHosts())) {
            this.f24808v = true;
            return false;
        }
        this.f24793f = null;
        C0488sh c0488shA = a(config);
        this.f24796j = c0488shA;
        if (c0488shA.f24739a.isEmpty()) {
            return false;
        }
        wo woVar = this.f24799m;
        synchronized (woVar) {
            iOptInt = woVar.f24991a.a().optInt("report_request_id", -1);
        }
        int i = iOptInt + 1;
        this.f24807u = i;
        this.f24801o.f23350e = i;
        C0281k9 c0281k9A = a(this.f24796j, list, config);
        this.f24791d = c0281k9A;
        this.f24793f = this.f24796j.f24740b;
        this.f24806t.prepareAndSetPostData(MessageNano.toByteArray(c0281k9A));
        return true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.f24806t.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z5) {
        String strA;
        if (z5) {
            a(false);
        } else if (this.f24805s.getResponseCode() == 400) {
            a(true);
        }
        if (z5) {
            for (int i = 0; i < this.f24796j.f24739a.size(); i++) {
                for (C0153f9 c0153f9 : ((C0205h9) this.f24796j.f24739a.get(i)).f23983c) {
                    if (c0153f9 != null && (strA = Pf.a(c0153f9)) != null) {
                        this.f24798l.info(strA, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.f24806t.isResponseValid();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f24808v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.f24808v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
        ((C0302l5) this.f24788a.f23296p).f24272d.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        ((C0302l5) this.f24788a.f23296p).f24272d.set(true);
        if (this.f24808v) {
            ((C0302l5) this.f24788a.f23296p).f();
        }
    }

    public C0513th(Y4 y42, Yg yg, C0657zb c0657zb, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, M6 m62, PublicLogger publicLogger, wo woVar, RequestBodyEncrypter requestBodyEncrypter) {
        this(y42, publicLogger, m62, yg, woVar, c0657zb, new C0018a3(1024000, "event value in ReportTask", publicLogger), AbstractC0622y1.a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    public C0513th(Y4 y42, PublicLogger publicLogger, M6 m62, Yg yg, wo woVar, C0657zb c0657zb, C0018a3 c0018a3, Pj pj2, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.f24789b = new LinkedHashMap();
        this.f24794g = 0;
        this.f24795h = 0;
        this.i = -1;
        this.f24808v = false;
        this.f24806t = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.f24801o = yg;
        this.f24788a = y42;
        this.f24792e = m62;
        this.f24798l = publicLogger;
        this.f24797k = c0018a3;
        this.f24799m = woVar;
        this.f24803q = c0657zb;
        this.f24800n = pj2;
        this.f24804r = requestDataHolder;
        this.f24805s = responseDataHolder;
        this.f24802p = fullUrlFormer;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }

    public static Z8[] a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        Z8[] z8Arr = new Z8[length];
        Iterator<String> itKeys = jSONObject.keys();
        int i = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Z8 z82 = new Z8();
                z82.f23375a = next;
                z82.f23376b = jSONObject.getString(next);
                z8Arr[i] = z82;
            } catch (Throwable unused) {
            }
            i++;
        }
        return z8Arr;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th2) {
    }

    public final void a(boolean z5) {
        boolean z10;
        wo woVar = this.f24799m;
        int i = this.f24807u;
        synchronized (woVar) {
            xo xoVar = woVar.f24991a;
            xoVar.a(xoVar.a().put("report_request_id", i));
        }
        C0205h9[] c0205h9Arr = this.f24791d.f24214a;
        int i10 = 0;
        while (i10 < c0205h9Arr.length) {
            try {
                C0205h9 c0205h9 = c0205h9Arr[i10];
                long jLongValue = ((Long) this.f24793f.get(i10)).longValue();
                Uk uk2 = (Uk) Of.f22802b.get(c0205h9.f23982b.f23932c);
                if (uk2 == null) {
                    uk2 = Uk.FOREGROUND;
                }
                z10 = z5;
                try {
                    this.f24792e.a(jLongValue, uk2.f23108a, c0205h9.f23983c.length, z10);
                    Of.a(c0205h9);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                z10 = z5;
            }
            i10++;
            z5 = z10;
        }
        M6 m62 = this.f24792e;
        long jA = this.f24788a.f23290j.a();
        m62.f22654b.lock();
        try {
            if (AbstractC0601x5.f25005a.booleanValue()) {
                m62.c();
            }
            SQLiteDatabase writableDatabase = m62.f22655c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("sessions", AbstractC0551v5.f24874c, new String[]{String.valueOf(jA)});
            }
        } catch (Throwable unused3) {
        }
        m62.f22654b.unlock();
    }

    @NonNull
    public final C0488sh a(@NonNull C0264jh c0264jh) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList3 = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor cursorA = a();
            if (cursorA != null) {
                JSONObject jSONObject2 = jSONObject;
                C0222i0 c0222i0 = null;
                while (cursorA.moveToNext() && this.f24795h < 100) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(cursorA, contentValues);
                        C0503t7 model = new C0528u7(null, 1, null).toModel(contentValues);
                        Long l10 = model.f24757a;
                        if (l10 != null) {
                            C0478s7 c0478s7 = model.f24760d;
                            C0256j9 c0256j9A = Of.a(c0478s7.f24730a, c0478s7.f24731b, c0478s7.f24732c);
                            String locale = c0264jh.getLocale();
                            Uk uk2 = model.f24758b;
                            C0179g9 c0179g9 = new C0179g9();
                            c0179g9.f23930a = c0256j9A;
                            c0179g9.f23931b = locale;
                            if (uk2 != null) {
                                Integer num = (Integer) Of.f22801a.get(uk2);
                                c0179g9.f23932c = num != null ? num.intValue() : 0;
                            }
                            int iComputeUInt64Size = this.f24794g + CodedOutputByteBufferNano.computeUInt64Size(1, Long.MAX_VALUE);
                            this.f24794g = iComputeUInt64Size;
                            int iComputeMessageSize = iComputeUInt64Size + CodedOutputByteBufferNano.computeMessageSize(2, c0179g9);
                            this.f24794g = iComputeMessageSize;
                            if (iComputeMessageSize >= 250880) {
                                break;
                            }
                            C0463rh c0463rhA = a(l10.longValue(), c0179g9, c0264jh, arrayList3, arrayList.size());
                            if (c0463rhA == null) {
                                continue;
                            } else {
                                if (c0222i0 == null) {
                                    c0222i0 = c0463rhA.f24689b;
                                } else if (!c0222i0.equals(c0463rhA.f24689b)) {
                                    break;
                                }
                                arrayList2.add(l10);
                                arrayList.add(c0463rhA.f24688a);
                                if (!TextUtils.isEmpty(c0463rhA.f24689b.f24033a)) {
                                    try {
                                        jSONObject2 = new JSONObject(c0463rhA.f24689b.f24033a);
                                    } catch (Throwable unused) {
                                    }
                                }
                                if (c0463rhA.f24690c) {
                                    break;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorA;
                        jSONObject = jSONObject2;
                        try {
                            arrayList3.add(th);
                        } finally {
                            ko.a(cursor);
                        }
                    }
                }
                jSONObject = jSONObject2;
            }
            ko.a(cursorA);
        } catch (Throwable th3) {
            th = th3;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            this.f24800n.reportError("protobuf_serialization_error", (Throwable) it.next());
        }
        return new C0488sh(arrayList, arrayList2, jSONObject);
    }

    public static C0222i0 a(ContentValues contentValues) {
        C0151f7 model = new C0177g7(null, 1, null).toModel(contentValues);
        return new C0222i0((String) WrapUtils.getOrDefault(model.f23840g.f23738g, ""), ((Long) WrapUtils.getOrDefault(model.f23840g.f23739h, 0L)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C0463rh a(long r17, io.appmetrica.analytics.impl.C0179g9 r19, io.appmetrica.analytics.impl.C0264jh r20, java.util.ArrayList r21, int r22) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C0513th.a(long, io.appmetrica.analytics.impl.g9, io.appmetrica.analytics.impl.jh, java.util.ArrayList, int):io.appmetrica.analytics.impl.rh");
    }

    public final Cursor a() {
        SQLiteDatabase readableDatabase;
        M6 m62 = this.f24792e;
        LinkedHashMap linkedHashMap = this.f24789b;
        m62.f22653a.lock();
        try {
            readableDatabase = m62.f22655c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        Cursor cursorQuery = readableDatabase != null ? readableDatabase.query("sessions", null, M6.a(linkedHashMap), M6.a(new String[]{Long.toString(0L)}, linkedHashMap), null, null, "id ASC", null) : null;
        m62.f22653a.unlock();
        return cursorQuery;
    }

    public final Cursor a(long j10, Uk uk2) {
        SQLiteDatabase readableDatabase;
        M6 m62 = this.f24792e;
        m62.f22653a.lock();
        try {
            readableDatabase = m62.f22655c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        Cursor cursorQuery = readableDatabase != null ? readableDatabase.query("events", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j10), Integer.toString(uk2.f23108a)}, null, null, "number_in_session ASC", null) : null;
        m62.f22653a.unlock();
        return cursorQuery;
    }
}
