package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kj0 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HandlerThread f40208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qp3 f40209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tj0 f40210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f40211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f40212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f40213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f40215h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f40217k;

    public kj0(HandlerThread handlerThread, rc0 rc0Var, sc0 sc0Var, Handler handler, boolean z5) {
        super(handlerThread.getLooper());
        this.f40208a = handlerThread;
        this.f40209b = rc0Var;
        this.f40210c = sc0Var;
        this.f40211d = handler;
        this.i = 3;
        this.f40216j = 5;
        this.f40215h = z5;
        this.f40212e = new ArrayList();
        this.f40213f = new HashMap();
    }

    public static int a(hj0 hj0Var, hj0 hj0Var2) {
        long j10 = hj0Var.f39213c;
        long j11 = hj0Var2.f39213c;
        int i = lb3.f40466a;
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public final void b() {
        int i = 0;
        for (int i10 = 0; i10 < this.f40212e.size(); i10++) {
            hj0 hj0Var = (hj0) this.f40212e.get(i10);
            mj0 mj0Var = (mj0) this.f40213f.get(hj0Var.f39211a.f42316b);
            int i11 = hj0Var.f39212b;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        mj0Var.getClass();
                        if (mj0Var.f40926e) {
                            throw new IllegalStateException();
                        }
                        if (this.f40215h || this.f40214g != 0 || i >= this.i) {
                            a(hj0Var, 0, 0);
                            mj0Var.a(false);
                        }
                    } else {
                        if (i11 != 5 && i11 != 7) {
                            throw new IllegalStateException();
                        }
                        if (mj0Var == null) {
                            mj0 mj0Var2 = new mj0(hj0Var.f39211a, ((sc0) this.f40210c).a(hj0Var.f39211a), hj0Var.f39218h, true, this.f40216j, this);
                            this.f40213f.put(hj0Var.f39211a.f42316b, mj0Var2);
                            mj0Var2.start();
                        } else if (!mj0Var.f40926e) {
                            mj0Var.a(false);
                        }
                    }
                } else if (mj0Var != null) {
                    if (mj0Var.f40926e) {
                        throw new IllegalStateException();
                    }
                    mj0Var.a(false);
                }
            } else if (mj0Var != null) {
                if (mj0Var.f40926e) {
                    throw new IllegalStateException();
                }
                mj0Var.a(false);
            } else if (this.f40215h || this.f40214g != 0 || this.f40217k >= this.i) {
                mj0Var = null;
            } else {
                hj0 hj0VarA = a(hj0Var, 2, 0);
                mj0 mj0Var3 = new mj0(hj0VarA.f39211a, ((sc0) this.f40210c).a(hj0VarA.f39211a), hj0VarA.f39218h, false, this.f40216j, this);
                this.f40213f.put(hj0VarA.f39211a.f42316b, mj0Var3);
                int i12 = this.f40217k;
                this.f40217k = i12 + 1;
                if (i12 == 0) {
                    sendEmptyMessageDelayed(11, 5000L);
                }
                mj0Var3.start();
                mj0Var = mj0Var3;
            }
            if (mj0Var != null && !mj0Var.f40926e) {
                i++;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.ArrayList] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        qc0 qc0Var;
        ?? arrayList;
        String str;
        rc0 rc0Var;
        qc0 qc0Var2 = null;
        int i = 7;
        i = 0;
        int i10 = 0;
        switch (message.what) {
            case 0:
                this.f40214g = message.arg1;
                try {
                    try {
                        ((rc0) this.f40209b).b();
                        int[] iArr = {0, 1, 2, 5, 7};
                        rc0 rc0Var2 = (rc0) this.f40209b;
                        rc0Var2.a();
                        StringBuilder sb2 = new StringBuilder("state IN (");
                        for (int i11 = 0; i11 < 5; i11++) {
                            if (i11 > 0) {
                                sb2.append(',');
                            }
                            sb2.append(iArr[i11]);
                        }
                        sb2.append(')');
                        qc0Var = new qc0(rc0Var2.a(sb2.toString(), (String[]) null));
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e3) {
                    e = e3;
                }
                while (true) {
                    try {
                    } catch (IOException e7) {
                        e = e7;
                        qc0Var2 = qc0Var;
                        kh1.b("DownloadManager", kh1.a("Failed to load index.", e));
                        this.f40212e.clear();
                        lb3.a((Closeable) qc0Var2);
                    } catch (Throwable th3) {
                        th = th3;
                        qc0Var2 = qc0Var;
                        lb3.a((Closeable) qc0Var2);
                        throw th;
                    }
                    if (!qc0Var.f42266a.moveToPosition(qc0Var.f42266a.getPosition() + 1)) {
                        lb3.a((Closeable) qc0Var);
                        this.f40211d.obtainMessage(0, new ArrayList(this.f40212e)).sendToTarget();
                        b();
                        i10 = 1;
                        this.f40211d.obtainMessage(1, i10, this.f40213f.size()).sendToTarget();
                        return;
                    }
                    this.f40212e.add(rc0.a(qc0Var.f42266a));
                    break;
                }
                break;
            case 1:
                this.f40215h = message.arg1 != 0;
                b();
                i10 = 1;
                this.f40211d.obtainMessage(1, i10, this.f40213f.size()).sendToTarget();
                return;
            case 2:
                this.f40214g = message.arg1;
                b();
                i10 = 1;
                this.f40211d.obtainMessage(1, i10, this.f40213f.size()).sendToTarget();
                return;
            case 3:
                String str2 = (String) message.obj;
                int i12 = message.arg1;
                if (str2 != null) {
                    hj0 hj0VarA = a(str2, false);
                    if (hj0VarA != null) {
                        a(hj0VarA, i12);
                    } else {
                        try {
                            ((rc0) this.f40209b).a(i12, str2);
                        } catch (IOException e10) {
                            kh1.b("DownloadManager", kh1.a("Failed to set manual stop reason: ".concat(str2), e10));
                        }
                    }
                    break;
                } else {
                    for (int i13 = 0; i13 < this.f40212e.size(); i13++) {
                        a((hj0) this.f40212e.get(i13), i12);
                    }
                    try {
                        rc0 rc0Var3 = (rc0) this.f40209b;
                        rc0Var3.a();
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("stop_reason", Integer.valueOf(i12));
                            rc0Var3.f42545b.getWritableDatabase().update(rc0Var3.f42544a, contentValues, rc0.f42542e, null);
                        } catch (Throwable th4) {
                            throw new v30(th4);
                        }
                    } catch (IOException e11) {
                        kh1.b("DownloadManager", kh1.a("Failed to set manual stop reason", e11));
                    }
                    break;
                }
                b();
                i10 = 1;
                this.f40211d.obtainMessage(1, i10, this.f40213f.size()).sendToTarget();
                return;
            case 4:
                this.i = message.arg1;
                b();
                i10 = 1;
                this.f40211d.obtainMessage(1, i10, this.f40213f.size()).sendToTarget();
                return;
            case 5:
                this.f40216j = message.arg1;
                i10 = 1;
                this.f40211d.obtainMessage(1, i10, this.f40213f.size()).sendToTarget();
                return;
            case 6:
                qj0 qj0Var = (qj0) message.obj;
                int i14 = message.arg1;
                hj0 hj0VarA2 = a(qj0Var.f42316b, true);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (hj0VarA2 != null) {
                    int i15 = hj0VarA2.f39212b;
                    long j10 = (i15 == 5 || i15 == 3 || i15 == 4) ? jCurrentTimeMillis : hj0VarA2.f39213c;
                    if (i15 != 5 && i15 != 7) {
                        i = i14 != 0 ? 1 : 0;
                    }
                    qj0 qj0Var2 = hj0VarA2.f39211a;
                    if (!qj0Var2.f42316b.equals(qj0Var.f42316b)) {
                        throw new IllegalArgumentException();
                    }
                    if (qj0Var2.f42319e.isEmpty() || qj0Var.f42319e.isEmpty()) {
                        arrayList = Collections.EMPTY_LIST;
                    } else {
                        arrayList = new ArrayList(qj0Var2.f42319e);
                        for (int i16 = 0; i16 < qj0Var.f42319e.size(); i16++) {
                            y33 y33Var = (y33) qj0Var.f42319e.get(i16);
                            if (!arrayList.contains(y33Var)) {
                                arrayList.add(y33Var);
                            }
                        }
                    }
                    a(new hj0(new qj0(qj0Var2.f42316b, qj0Var.f42317c, qj0Var.f42318d, arrayList, qj0Var.f42320f, qj0Var.f42321g, qj0Var.f42322h), i, j10, jCurrentTimeMillis, -1L, i14, 0, new oj0()));
                } else {
                    a(new hj0(qj0Var, i14 != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, -1L, i14, 0, new oj0()));
                }
                b();
                i10 = 1;
                this.f40211d.obtainMessage(1, i10, this.f40213f.size()).sendToTarget();
                return;
            case 7:
                String str3 = (String) message.obj;
                hj0 hj0VarA3 = a(str3, true);
                if (hj0VarA3 == null) {
                    kh1.b("DownloadManager", "Failed to remove nonexistent download: " + str3);
                } else {
                    a(hj0VarA3, 5, 0);
                    b();
                }
                i10 = 1;
                this.f40211d.obtainMessage(1, i10, this.f40213f.size()).sendToTarget();
                return;
            case 8:
                a();
                i10 = 1;
                this.f40211d.obtainMessage(1, i10, this.f40213f.size()).sendToTarget();
                return;
            case 9:
                mj0 mj0Var = (mj0) message.obj;
                String str4 = mj0Var.f40923b.f42316b;
                this.f40213f.remove(str4);
                boolean z5 = mj0Var.f40926e;
                if (!z5) {
                    int i17 = this.f40217k - 1;
                    this.f40217k = i17;
                    if (i17 == 0) {
                        removeMessages(11);
                    }
                }
                if (mj0Var.f40929h) {
                    b();
                } else {
                    Exception exc = mj0Var.i;
                    if (exc != null) {
                        kh1.b("DownloadManager", kh1.a("Task failed: " + mj0Var.f40923b + ", " + z5, exc));
                    }
                    hj0 hj0VarA4 = a(str4, false);
                    hj0VarA4.getClass();
                    int i18 = hj0VarA4.f39212b;
                    if (i18 == 2) {
                        if (z5) {
                            throw new IllegalStateException();
                        }
                        hj0 hj0Var = new hj0(hj0VarA4.f39211a, exc == null ? 3 : 4, hj0VarA4.f39213c, System.currentTimeMillis(), hj0VarA4.f39215e, hj0VarA4.f39216f, exc == null ? 0 : 1, hj0VarA4.f39218h);
                        this.f40212e.remove(a(hj0Var.f39211a.f42316b));
                        try {
                            ((rc0) this.f40209b).a(hj0Var);
                        } catch (IOException e12) {
                            kh1.b("DownloadManager", kh1.a("Failed to update index.", e12));
                        }
                        this.f40211d.obtainMessage(2, new jj0(hj0Var, false, new ArrayList(this.f40212e), exc)).sendToTarget();
                        break;
                    } else {
                        if (i18 != 5 && i18 != 7) {
                            throw new IllegalStateException();
                        }
                        if (!z5) {
                            throw new IllegalStateException();
                        }
                        if (i18 == 7) {
                            int i19 = hj0VarA4.f39216f;
                            a(hj0VarA4, i19 == 0 ? 0 : 1, i19);
                            b();
                        } else {
                            this.f40212e.remove(a(hj0VarA4.f39211a.f42316b));
                            try {
                                qp3 qp3Var = this.f40209b;
                                str = hj0VarA4.f39211a.f42316b;
                                rc0Var = (rc0) qp3Var;
                                rc0Var.a();
                            } catch (IOException unused) {
                                kh1.b("DownloadManager", "Failed to remove from database");
                            }
                            try {
                                rc0Var.f42545b.getWritableDatabase().delete(rc0Var.f42544a, "id = ?", new String[]{str});
                                this.f40211d.obtainMessage(2, new jj0(hj0VarA4, true, new ArrayList(this.f40212e), null)).sendToTarget();
                            } catch (Throwable th5) {
                                throw new v30(th5);
                            }
                        }
                    }
                    b();
                }
                this.f40211d.obtainMessage(1, i10, this.f40213f.size()).sendToTarget();
                return;
            case 10:
                mj0 mj0Var2 = (mj0) message.obj;
                int i20 = message.arg1;
                int i21 = message.arg2;
                int i22 = lb3.f40466a;
                long j11 = ((((long) i20) & 4294967295L) << 32) | (4294967295L & ((long) i21));
                hj0 hj0VarA5 = a(mj0Var2.f40923b.f42316b, false);
                hj0VarA5.getClass();
                if (j11 == hj0VarA5.f39215e || j11 == -1) {
                    return;
                }
                a(new hj0(hj0VarA5.f39211a, hj0VarA5.f39212b, hj0VarA5.f39213c, System.currentTimeMillis(), j11, hj0VarA5.f39216f, hj0VarA5.f39217g, hj0VarA5.f39218h));
                return;
            case 11:
                for (int i23 = 0; i23 < this.f40212e.size(); i23++) {
                    hj0 hj0Var2 = (hj0) this.f40212e.get(i23);
                    if (hj0Var2.f39212b == 2) {
                        try {
                            ((rc0) this.f40209b).a(hj0Var2);
                        } catch (IOException e13) {
                            kh1.b("DownloadManager", kh1.a("Failed to update index.", e13));
                        }
                    }
                }
                sendEmptyMessageDelayed(11, 5000L);
                return;
            case 12:
                Iterator it = this.f40213f.values().iterator();
                while (it.hasNext()) {
                    ((mj0) it.next()).a(true);
                }
                try {
                    ((rc0) this.f40209b).b();
                    break;
                } catch (IOException e14) {
                    kh1.b("DownloadManager", kh1.a("Failed to update index.", e14));
                }
                this.f40212e.clear();
                this.f40208a.quit();
                synchronized (this) {
                    notifyAll();
                    break;
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    public final hj0 a(String str, boolean z5) {
        int iA = a(str);
        if (iA != -1) {
            return (hj0) this.f40212e.get(iA);
        }
        if (!z5) {
            return null;
        }
        try {
            return ((rc0) this.f40209b).b(str);
        } catch (IOException e3) {
            kh1.b("DownloadManager", kh1.a("Failed to load download: " + str, e3));
            return null;
        }
    }

    public final int a(String str) {
        for (int i = 0; i < this.f40212e.size(); i++) {
            if (((hj0) this.f40212e.get(i)).f39211a.f42316b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final hj0 a(hj0 hj0Var) {
        int i = hj0Var.f39212b;
        if (i != 3 && i != 4) {
            int iA = a(hj0Var.f39211a.f42316b);
            if (iA == -1) {
                this.f40212e.add(hj0Var);
                Collections.sort(this.f40212e, new zl.v(1));
            } else {
                boolean z5 = hj0Var.f39213c != ((hj0) this.f40212e.get(iA)).f39213c;
                this.f40212e.set(iA, hj0Var);
                if (z5) {
                    Collections.sort(this.f40212e, new zl.v(1));
                }
            }
            try {
                ((rc0) this.f40209b).a(hj0Var);
            } catch (IOException e3) {
                kh1.b("DownloadManager", kh1.a("Failed to update index.", e3));
            }
            this.f40211d.obtainMessage(2, new jj0(hj0Var, false, new ArrayList(this.f40212e), null)).sendToTarget();
            return hj0Var;
        }
        throw new IllegalStateException();
    }

    public final hj0 a(hj0 hj0Var, int i, int i10) {
        if (i != 3 && i != 4) {
            return a(new hj0(hj0Var.f39211a, i, hj0Var.f39213c, System.currentTimeMillis(), hj0Var.f39215e, i10, 0, hj0Var.f39218h));
        }
        throw new IllegalStateException();
    }

    public final void a() {
        ArrayList arrayList = new ArrayList();
        try {
            int[] iArr = {3, 4};
            rc0 rc0Var = (rc0) this.f40209b;
            rc0Var.a();
            StringBuilder sb2 = new StringBuilder("state IN (");
            for (int i = 0; i < 2; i++) {
                if (i > 0) {
                    sb2.append(',');
                }
                sb2.append(iArr[i]);
            }
            sb2.append(')');
            Cursor cursorA = rc0Var.a(sb2.toString(), (String[]) null);
            while (cursorA.moveToPosition(cursorA.getPosition() + 1)) {
                try {
                    arrayList.add(rc0.a(cursorA));
                } finally {
                }
            }
            cursorA.close();
        } catch (IOException unused) {
            kh1.b("DownloadManager", "Failed to load downloads.");
        }
        for (int i10 = 0; i10 < this.f40212e.size(); i10++) {
            ArrayList arrayList2 = this.f40212e;
            hj0 hj0Var = (hj0) arrayList2.get(i10);
            arrayList2.set(i10, new hj0(hj0Var.f39211a, 5, hj0Var.f39213c, System.currentTimeMillis(), hj0Var.f39215e, 0, 0, hj0Var.f39218h));
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ArrayList arrayList3 = this.f40212e;
            hj0 hj0Var2 = (hj0) arrayList.get(i11);
            arrayList3.add(new hj0(hj0Var2.f39211a, 5, hj0Var2.f39213c, System.currentTimeMillis(), hj0Var2.f39215e, 0, 0, hj0Var2.f39218h));
        }
        Collections.sort(this.f40212e, new zl.v(1));
        try {
            ((rc0) this.f40209b).c();
        } catch (IOException e3) {
            kh1.b("DownloadManager", kh1.a("Failed to update index.", e3));
        }
        ArrayList arrayList4 = new ArrayList(this.f40212e);
        for (int i12 = 0; i12 < this.f40212e.size(); i12++) {
            this.f40211d.obtainMessage(2, new jj0((hj0) this.f40212e.get(i12), false, arrayList4, null)).sendToTarget();
        }
        b();
    }

    public final void a(hj0 hj0Var, int i) {
        if (i == 0) {
            if (hj0Var.f39212b == 1) {
                a(hj0Var, 0, 0);
            }
        } else if (i != hj0Var.f39216f) {
            int i10 = hj0Var.f39212b;
            if (i10 == 0 || i10 == 2) {
                i10 = 1;
            }
            a(new hj0(hj0Var.f39211a, i10, hj0Var.f39213c, System.currentTimeMillis(), hj0Var.f39215e, i, 0, hj0Var.f39218h));
        }
    }
}
