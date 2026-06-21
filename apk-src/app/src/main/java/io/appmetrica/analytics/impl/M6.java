package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class M6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock.ReadLock f22653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantReadWriteLock.WriteLock f22654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z6 f22655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L6 f22656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f22657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f22658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f22659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Y4 f22660h;
    public final AtomicLong i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f22661j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final I6 f22662k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0177g7 f22663l;

    static {
        HashSet hashSet = new HashSet();
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        hashSet.add(0);
        hashSet.add(6400);
    }

    public M6(Y4 y42, Z6 z62, I6 i62, C0177g7 c0177g7) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f22653a = reentrantReadWriteLock.readLock();
        this.f22654b = reentrantReadWriteLock.writeLock();
        this.f22657e = new Object();
        this.f22658f = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.i = atomicLong;
        this.f22661j = new ArrayList();
        this.f22655c = z62;
        this.f22659g = y42.getContext();
        this.f22660h = y42;
        this.f22662k = i62;
        this.f22663l = c0177g7;
        atomicLong.set(b());
        L6 l62 = new L6(this, y42);
        this.f22656d = l62;
        l62.setName(a(y42));
    }

    public final long a() {
        this.f22653a.lock();
        try {
            return this.i.get();
        } finally {
            this.f22653a.unlock();
        }
    }

    public final long b() {
        SQLiteDatabase readableDatabase;
        this.f22653a.lock();
        try {
            readableDatabase = this.f22655c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        long jQueryRowsCount = readableDatabase != null ? DBUtils.queryRowsCount(readableDatabase, "events") : 0L;
        this.f22653a.unlock();
        return jQueryRowsCount;
    }

    public final void c() {
        Cursor cursor;
        Cursor cursorRawQuery;
        this.f22653a.lock();
        Cursor cursorRawQuery2 = null;
        try {
            SQLiteDatabase readableDatabase = this.f22655c.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(" SELECT DISTINCT id From sessions order by id asc ", new String[0]);
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("All sessions in db: ");
                    while (cursorRawQuery.moveToNext()) {
                        stringBuffer.append(cursorRawQuery.getString(0));
                        stringBuffer.append(", ");
                    }
                    cursorRawQuery2 = readableDatabase.rawQuery(" SELECT DISTINCT session_id From events order by session_id asc ", new String[0]);
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("All sessions in reports db: ");
                    while (cursorRawQuery2.moveToNext()) {
                        stringBuffer2.append(cursorRawQuery2.getString(0));
                        stringBuffer2.append(", ");
                    }
                } catch (Throwable unused) {
                    cursor = cursorRawQuery2;
                    cursorRawQuery2 = cursorRawQuery;
                    cursorRawQuery = cursorRawQuery2;
                    cursorRawQuery2 = cursor;
                }
            } else {
                cursorRawQuery = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        this.f22653a.unlock();
        ko.a(cursorRawQuery);
        ko.a(cursorRawQuery2);
    }

    public final void d() {
        this.f22656d.start();
    }

    public final long a(Set set) {
        this.f22653a.lock();
        Cursor cursorRawQuery = null;
        long j10 = 0;
        try {
            SQLiteDatabase readableDatabase = this.f22655c.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb2 = new StringBuilder("SELECT count() FROM events");
                if (!set.isEmpty()) {
                    sb2.append(" WHERE ");
                }
                Iterator it = set.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (i > 0) {
                        sb2.append(" OR ");
                    }
                    sb2.append("type == " + num);
                    i++;
                }
                cursorRawQuery = readableDatabase.rawQuery(sb2.toString(), null);
                if (cursorRawQuery.moveToFirst()) {
                    j10 = cursorRawQuery.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        ko.a(cursorRawQuery);
        this.f22653a.unlock();
        return j10;
    }

    public final void a(T8 t82) {
        this.f22661j.add(t82);
    }

    public static String a(Fa fa) {
        return "DatabaseWorker [" + fa.b().e() + "]";
    }

    public final void a(long j10, Uk uk2, long j11) {
        JSONObject jSONObject;
        boolean zB;
        C0528u7 c0528u7 = new C0528u7(null, 1, 0 == true ? 1 : 0);
        C0264jh c0264jh = (C0264jh) this.f22660h.f23291k.a();
        Long lValueOf = Long.valueOf(j10);
        Long lValueOf2 = Long.valueOf(j11);
        try {
            jSONObject = new JSONObject().put("dId", c0264jh.getDeviceId()).put("uId", c0264jh.getUuid()).put("appVer", c0264jh.getAppVersion()).put("appBuild", c0264jh.getAppBuildNumber()).put("kitBuildType", c0264jh.getAnalyticsSdkBuildType()).put("osVer", c0264jh.getOsVersion()).put("osApiLev", c0264jh.getOsApiLevel()).put(VKApiCodes.PARAM_LANG, c0264jh.getLocale()).put("root", c0264jh.getDeviceRootStatus()).put("app_debuggable", ((O5) c0264jh).f22771a).put(CommonUrlParts.APP_FRAMEWORK, c0264jh.getAppFramework()).put("attribution_id", c0264jh.f24167r).put("analyticsSdkVersionName", c0264jh.getAnalyticsSdkVersionName()).put("kitBuildNumber", c0264jh.getAnalyticsSdkBuildNumber());
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        Long lValueOf3 = Long.valueOf(Hn.a());
        Wj wj2 = Vj.f23155a;
        synchronized (wj2) {
            zB = wj2.f23227b.b(true);
        }
        ContentValues contentValuesA = c0528u7.fromModel(new C0503t7(lValueOf, uk2, string, new C0478s7(lValueOf2, lValueOf3, Boolean.valueOf(zB))));
        if (contentValuesA == null) {
            return;
        }
        this.f22654b.lock();
        try {
            SQLiteDatabase writableDatabase = this.f22655c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, contentValuesA);
            }
        } catch (Throwable unused2) {
        }
        this.f22654b.unlock();
    }

    public final void a(ContentValues contentValues) {
        synchronized (this.f22657e) {
            this.f22658f.add(contentValues);
        }
        synchronized (this.f22656d) {
            this.f22656d.notifyAll();
        }
    }

    public final int a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.f22662k.a(sQLiteDatabase, String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", TextUtils.join(", ", AbstractC0605x9.i), TextUtils.join(", ", AbstractC0605x9.f25018j), 10), 2, this.f22660h.f23283b.f22910b, true).f22374b;
        } catch (Throwable th2) {
            Pj pj2 = AbstractC0366nj.f24449a;
            pj2.getClass();
            pj2.a(new C0391oj("deleteExcessiveReports exception", th2));
            return 0;
        }
    }

    public final void a(long j10, int i, int i10, boolean z5) {
        if (i10 <= 0) {
            return;
        }
        this.f22654b.lock();
        try {
            String str = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j10), "session_type", Integer.toString(i), "id", "events", Integer.toString(i10 - 1));
            SQLiteDatabase writableDatabase = this.f22655c.getWritableDatabase();
            if (writableDatabase != null) {
                G6 g6A = this.f22662k.a(writableDatabase, str, 1, this.f22660h.f23283b.f22910b, z5);
                if (g6A.f22373a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = g6A.f22373a.iterator();
                    while (it.hasNext()) {
                        Integer asInteger = ((ContentValues) it.next()).getAsInteger("type");
                        asInteger.intValue();
                        arrayList.add(asInteger);
                    }
                    Iterator it2 = this.f22661j.iterator();
                    while (it2.hasNext()) {
                        ((T8) it2.next()).b(arrayList);
                    }
                }
                List list = g6A.f22373a;
                if (list != null) {
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        a((ContentValues) list.get(i11), "Event removed from db");
                    }
                }
                this.i.addAndGet(-g6A.f22374b);
            }
        } catch (Throwable unused) {
        }
        this.f22654b.unlock();
    }

    public final ContentValues a(long j10, Uk uk2) {
        ContentValues contentValues = new ContentValues();
        this.f22653a.lock();
        Cursor cursorRawQuery = null;
        try {
            SQLiteDatabase readableDatabase = this.f22655c.getReadableDatabase();
            if (readableDatabase != null) {
                Locale locale = Locale.US;
                cursorRawQuery = readableDatabase.rawQuery("SELECT report_request_parameters FROM sessions WHERE id = " + j10 + " AND type = " + uk2.f23108a + " ORDER BY id DESC LIMIT 1", null);
                if (cursorRawQuery.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues2);
                    contentValues = contentValues2;
                }
            }
        } catch (Throwable unused) {
        }
        ko.a(cursorRawQuery);
        this.f22653a.unlock();
        return contentValues;
    }

    public static String a(LinkedHashMap linkedHashMap) {
        StringBuilder sb2 = new StringBuilder("id >= ?");
        for (String str : linkedHashMap.keySet()) {
            sb2.append(sb2.length() > 0 ? " AND " : "");
            sb2.append(str + " = ? ");
        }
        if (TextUtils.isEmpty(sb2.toString())) {
            return null;
        }
        return sb2.toString();
    }

    public static String[] a(String[] strArr, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final void a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (AbstractC0605x9.f25013d.contains(EnumC0078cb.a(asInteger != null ? asInteger.intValue() : -1))) {
            C0151f7 c0151f7A = new C0177g7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
            PublicLogger publicLogger = this.f22660h.f23293m;
            EnumC0078cb enumC0078cb = c0151f7A.f23837d;
            C0125e7 c0125e7 = c0151f7A.f23840g;
            publicLogger.info(Pf.a(str, enumC0078cb, c0125e7.f23733b, c0125e7.f23734c), new Object[0]);
        }
    }

    public static boolean a(M6 m62) {
        boolean zIsEmpty;
        synchronized (m62.f22657e) {
            zIsEmpty = m62.f22658f.isEmpty();
        }
        return zIsEmpty;
    }
}
