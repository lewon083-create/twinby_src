package yads;

import android.util.Base64;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class xo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lu1 f44777a = ku1.a();

    public static final void a(long j10, ro2 ro2Var, h82 h82Var) {
        String strG;
        String str;
        byte[] bArrB = ro2Var.b();
        String strG2 = null;
        if (bArrB != null) {
            try {
                strG = kotlin.text.a0.g(bArrB);
            } catch (Exception unused) {
                strG = "UNKNOWN_CONTENT";
            }
            str = strG;
        } else {
            str = null;
        }
        byte[] bArr = h82Var.f39070b;
        if (bArr != null) {
            if (ro2Var instanceof q41) {
                strG2 = "IMAGE_CONTENT";
            } else {
                try {
                    strG2 = kotlin.text.a0.g(Base64.decode(bArr, 0));
                } catch (IllegalArgumentException unused2) {
                    strG2 = kotlin.text.a0.g(bArr);
                } catch (Exception unused3) {
                    strG2 = "UNKNOWN_CONTENT";
                }
            }
        }
        lu1 lu1Var = f44777a;
        int i = ro2Var.f42659c;
        String str2 = i == 0 ? "GET" : i == 1 ? "POST" : i == 2 ? "PUT" : i == 3 ? "DELETE" : i == 4 ? "HEAD" : i == 5 ? "OPTIONS" : i == 6 ? "TRACE" : i == 7 ? "PATCH" : "UNKNOWN";
        String strG3 = ro2Var.g();
        Map mapD = ro2Var.d();
        Integer numValueOf = Integer.valueOf(h82Var.f39069a);
        Map map = h82Var.f39071c;
        lu1Var.getClass();
        if (gu1.f38875b) {
            ju1 ju1Var = new ju1(new ou1(j10, str2, strG3, mapD, str), new ru1(System.currentTimeMillis(), numValueOf, map, strG2));
            synchronized (lu1.f40685c) {
                try {
                    if (lu1Var.f40686a.a() > 100) {
                        lu1Var.f40686a.removeFirst();
                    }
                    lu1Var.f40686a.addLast(ju1Var);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
