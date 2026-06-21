package yads;

import android.os.SystemClock;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ho f44775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gr f44776b;

    public xo(b21 b21Var, gr grVar) {
        this.f44775a = b21Var;
        this.f44776b = grVar;
    }

    public final h82 a(ro2 ro2Var) throws lm3 {
        byte[] bArr;
        s82 s82Var;
        s82 s82Var2;
        int i;
        Map map;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            z11 z11Var = null;
            try {
                lr lrVar = ro2Var.f42671p;
                if (lrVar == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap map2 = new HashMap();
                    String str = lrVar.f40639b;
                    if (str != null) {
                        map2.put("If-None-Match", str);
                    }
                    long j10 = lrVar.f40641d;
                    if (j10 > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        map2.put("If-Modified-Since", simpleDateFormat.format(new Date(j10)));
                    }
                    map = map2;
                }
                z11 z11VarA = this.f44775a.a(ro2Var, map);
                try {
                    int i10 = z11VarA.f45222a;
                    List listUnmodifiableList = Collections.unmodifiableList(z11VarA.f45223b);
                    if (i10 == 304) {
                        return t82.a(ro2Var, SystemClock.elapsedRealtime() - jElapsedRealtime, listUnmodifiableList);
                    }
                    InputStream byteArrayInputStream = z11VarA.f45225d;
                    if (byteArrayInputStream == null) {
                        byteArrayInputStream = z11VarA.f45226e != null ? new ByteArrayInputStream(z11VarA.f45226e) : null;
                    }
                    byte[] bArrA = byteArrayInputStream != null ? t82.a(byteArrayInputStream, z11VarA.f45224c, this.f44776b) : new byte[0];
                    try {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (om3.f41652a || jElapsedRealtime2 > 3000) {
                            int i11 = ro2Var.f42670o.f42279b;
                        }
                        if (i10 < 200 || i10 > 299) {
                            throw new IOException();
                        }
                        SystemClock.elapsedRealtime();
                        return new h82(i10, bArrA, h82.a(listUnmodifiableList), listUnmodifiableList, false);
                    } catch (IOException e3) {
                        e = e3;
                        z11Var = z11VarA;
                        bArr = bArrA;
                        if (e instanceof SocketTimeoutException) {
                            s82Var = new s82("socket", new y63());
                        } else {
                            if (e instanceof MalformedURLException) {
                                throw new RuntimeException("Bad URL " + ro2Var.g(), e);
                            }
                            if (z11Var != null) {
                                int i12 = z11Var.f45222a;
                                ro2Var.g();
                                boolean z5 = om3.f41652a;
                                if (bArr != null) {
                                    List listUnmodifiableList2 = Collections.unmodifiableList(z11Var.f45223b);
                                    SystemClock.elapsedRealtime();
                                    h82 h82Var = new h82(i12, bArr, h82.a(listUnmodifiableList2), listUnmodifiableList2, false);
                                    if (i12 == 401 || i12 == 403) {
                                        s82Var = new s82("auth", new pl(h82Var));
                                    } else {
                                        if (i12 >= 400 && i12 <= 499) {
                                            throw new ov(h82Var);
                                        }
                                        if (i12 < 500 || i12 > 599 || !ro2Var.f42668m) {
                                            throw new vx2(h82Var);
                                        }
                                        s82Var = new s82("server", new vx2(h82Var));
                                    }
                                } else {
                                    s82Var = new s82("network", new e82());
                                }
                            } else {
                                if (!ro2Var.f42669n) {
                                    throw new d92(e);
                                }
                                s82Var = new s82("connection", new d92());
                            }
                        }
                        s82Var2 = s82Var;
                        qe0 qe0Var = ro2Var.f42670o;
                        i = qe0Var.f42278a;
                        try {
                            lm3 lm3Var = s82Var2.f42858b;
                            int i13 = qe0Var.f42279b + 1;
                            qe0Var.f42279b = i13;
                            qe0Var.f42278a = ((int) (i * qe0Var.f42281d)) + i;
                            if (i13 > qe0Var.f42280c) {
                                throw lm3Var;
                            }
                            ro2Var.a(s82Var2.f42857a + "-retry [timeout=" + i + "]");
                        } catch (lm3 e7) {
                            ro2Var.a(s82Var2.f42857a + "-timeout-giveup [timeout=" + i + "]");
                            throw e7;
                        }
                    }
                } catch (IOException e10) {
                    e = e10;
                    bArr = null;
                    z11Var = z11VarA;
                }
            } catch (IOException e11) {
                e = e11;
                bArr = null;
            }
            ro2Var.a(s82Var2.f42857a + "-retry [timeout=" + i + "]");
        }
    }
}
