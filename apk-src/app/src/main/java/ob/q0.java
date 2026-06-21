package ob;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.google.android.gms.internal.ads.oq;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30355b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f30357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f30358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f30359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f30360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f30361h;

    public /* synthetic */ q0(String str, t0 t0Var, int i, IOException iOException, byte[] bArr, Map map) {
        pa.c0.i(t0Var);
        this.f30358e = t0Var;
        this.f30356c = i;
        this.f30359f = iOException;
        this.f30360g = bArr;
        this.f30357d = str;
        this.f30361h = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30355b) {
            case 0:
                s0 s0Var = (s0) this.f30361h;
                z0 z0Var = ((l1) s0Var.f15951b).f30264f;
                l1.h(z0Var);
                if (!z0Var.f30419c) {
                    Log.println(6, s0Var.M(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (s0Var.f30408d == 0) {
                    g gVar = ((l1) s0Var.f15951b).f30263e;
                    if (gVar.f30123f == null) {
                        synchronized (gVar) {
                            try {
                                if (gVar.f30123f == null) {
                                    l1 l1Var = (l1) gVar.f15951b;
                                    ApplicationInfo applicationInfo = l1Var.f30260b.getApplicationInfo();
                                    String strF = ua.b.f();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        gVar.f30123f = Boolean.valueOf(str != null && str.equals(strF));
                                    }
                                    if (gVar.f30123f == null) {
                                        gVar.f30123f = Boolean.TRUE;
                                        s0 s0Var2 = l1Var.f30265g;
                                        l1.k(s0Var2);
                                        s0Var2.f30411g.f("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (gVar.f30123f.booleanValue()) {
                        s0Var.f30408d = 'C';
                    } else {
                        s0Var.f30408d = 'c';
                    }
                    break;
                }
                if (s0Var.f30409e < 0) {
                    ((l1) s0Var.f15951b).f30263e.H();
                    s0Var.f30409e = 133005L;
                }
                int i = this.f30356c;
                char c8 = s0Var.f30408d;
                long j10 = s0Var.f30409e;
                String str2 = this.f30357d;
                Object obj = this.f30358e;
                Object obj2 = this.f30359f;
                Object obj3 = this.f30360g;
                char cCharAt = "01VDIWEA?".charAt(i);
                String strN = s0.N(true, str2, obj, obj2, obj3);
                StringBuilder sb2 = new StringBuilder(l7.o.v(String.valueOf(cCharAt).length() + 1, String.valueOf(c8).length(), String.valueOf(j10).length(), 1) + strN.length());
                sb2.append("2");
                sb2.append(cCharAt);
                sb2.append(c8);
                sb2.append(j10);
                sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                sb2.append(strN);
                String string = sb2.toString();
                if (string.length() > 1024) {
                    string = str2.substring(0, 1024);
                }
                oq oqVar = z0Var.f30581f;
                if (oqVar != null) {
                    String str3 = (String) oqVar.f8756d;
                    z0 z0Var2 = (z0) oqVar.f8757e;
                    z0Var2.C();
                    if (((z0) oqVar.f8757e).G().getLong((String) oqVar.f8754b, 0L) == 0) {
                        oqVar.b();
                    }
                    if (string == null) {
                        string = "";
                    }
                    SharedPreferences sharedPreferencesG = z0Var2.G();
                    String str4 = (String) oqVar.f8755c;
                    long j11 = sharedPreferencesG.getLong(str4, 0L);
                    if (j11 <= 0) {
                        SharedPreferences.Editor editorEdit = z0Var2.G().edit();
                        editorEdit.putString(str3, string);
                        editorEdit.putLong(str4, 1L);
                        editorEdit.apply();
                        return;
                    }
                    e4 e4Var = ((l1) z0Var2.f15951b).f30267j;
                    l1.h(e4Var);
                    long jNextLong = e4Var.y0().nextLong() & Long.MAX_VALUE;
                    long j12 = j11 + 1;
                    long j13 = Long.MAX_VALUE / j12;
                    SharedPreferences.Editor editorEdit2 = z0Var2.G().edit();
                    if (jNextLong < j13) {
                        editorEdit2.putString(str3, string);
                    }
                    editorEdit2.putLong(str4, j12);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((t0) this.f30358e).r(this.f30357d, this.f30356c, (Throwable) this.f30359f, (byte[]) this.f30360g, (Map) this.f30361h);
                return;
        }
    }

    public q0(s0 s0Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f30356c = i;
        this.f30357d = str;
        this.f30358e = obj;
        this.f30359f = obj2;
        this.f30360g = obj3;
        this.f30361h = s0Var;
    }
}
