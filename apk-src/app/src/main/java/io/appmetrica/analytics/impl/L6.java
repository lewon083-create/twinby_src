package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class L6 extends InterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f22602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M6 f22603b;

    public L6(M6 m62, Y4 y42) {
        this.f22603b = m62;
        this.f22602a = y42;
    }

    public final synchronized void a(ArrayList arrayList) {
        try {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ContentValues contentValues = (ContentValues) it.next();
                this.f22603b.getClass();
                Integer asInteger = contentValues.getAsInteger("type");
                asInteger.intValue();
                arrayList2.add(asInteger);
            }
            Iterator it2 = this.f22603b.f22661j.iterator();
            while (it2.hasNext()) {
                ((T8) it2.next()).a(arrayList2);
            }
            ((C0302l5) this.f22602a.f23296p).e();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList<ContentValues> arrayList;
        int iA;
        while (isRunning()) {
            try {
                synchronized (this) {
                    try {
                        if (M6.a(this.f22603b)) {
                            wait();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable unused) {
                stopRunning();
            }
            synchronized (this.f22603b.f22657e) {
                arrayList = new ArrayList(this.f22603b.f22658f);
                this.f22603b.f22658f.clear();
            }
            M6 m62 = this.f22603b;
            m62.getClass();
            if (!arrayList.isEmpty()) {
                long j10 = ((C0264jh) m62.f22660h.f23291k.a()).f24171v;
                m62.f22654b.lock();
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase writableDatabase = m62.f22655c.getWritableDatabase();
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.beginTransaction();
                            for (ContentValues contentValues : arrayList) {
                                writableDatabase.insertOrThrow("events", null, contentValues);
                                m62.i.incrementAndGet();
                                m62.a(contentValues, "Event saved to db");
                            }
                            if (m62.i.get() > j10) {
                                iA = m62.a(writableDatabase);
                                m62.i.addAndGet(-iA);
                            } else {
                                iA = 0;
                            }
                            writableDatabase.setTransactionSuccessful();
                            if (iA != 0) {
                                Iterator it = m62.f22661j.iterator();
                                while (it.hasNext()) {
                                    ((T8) it.next()).a();
                                }
                            }
                        } catch (Throwable unused2) {
                            sQLiteDatabase = writableDatabase;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                        }
                    }
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.endTransaction();
                        } catch (Throwable unused3) {
                        }
                    }
                } catch (Throwable unused4) {
                }
                m62.f22654b.unlock();
            }
            a(arrayList);
        }
    }
}
