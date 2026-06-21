package com.google.android.gms.internal.ads;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fa1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fa1 f5294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fa1 f5295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fa1 f5296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final fa1 f5297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final fa1 f5298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final fa1 f5299h;
    public static final fa1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final fa1 f5300j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final fa1 f5301k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final fa1 f5302l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5304b;

    static {
        int i10 = 0;
        f5294c = new fa1("TINK", i10);
        f5295d = new fa1("CRUNCHY", i10);
        f5296e = new fa1("NO_PREFIX", i10);
        int i11 = 1;
        f5297f = new fa1("TINK", i11);
        f5298g = new fa1("CRUNCHY", i11);
        f5299h = new fa1("NO_PREFIX", i11);
        int i12 = 2;
        i = new fa1("TINK", i12);
        f5300j = new fa1("NO_PREFIX", i12);
        int i13 = 3;
        f5301k = new fa1("IEEE_P1363", i13);
        f5302l = new fa1("DER", i13);
    }

    public static String e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e3) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e3);
                String strJoin = TextUtils.join(", ", objArr);
                int length = str2.length();
                str2 = om1.n(new StringBuilder(String.valueOf(strJoin).length() + length + 2 + 1), str2, " [", strJoin, "]");
            }
        }
        return t.z.g(new StringBuilder(str.length() + 3 + String.valueOf(str2).length()), str, " : ", str2);
    }

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", e(this.f5304b, str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", e(this.f5304b, str, objArr));
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", e(this.f5304b, str, objArr));
        }
    }

    public void d(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", e(this.f5304b, str, objArr), remoteException);
        }
    }

    public String toString() {
        switch (this.f5303a) {
            case 0:
                return this.f5304b;
            case 1:
                return this.f5304b;
            case 2:
                return this.f5304b;
            case 3:
                return this.f5304b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ fa1(String str, int i10) {
        this.f5303a = i10;
        this.f5304b = str;
    }

    public fa1(String str) {
        this.f5303a = 5;
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        StringBuilder sb2 = new StringBuilder(String.valueOf(iMyUid).length() + 15 + String.valueOf(iMyPid).length() + 2);
        om1.u(sb2, "UID: [", iMyUid, "]  PID: [", iMyPid);
        sb2.append("] ");
        this.f5304b = sb2.toString().concat(str);
    }
}
