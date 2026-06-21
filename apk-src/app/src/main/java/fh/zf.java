package fh;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zf implements g0.v, ii.o, i6.b, j4.n, md.e, l5.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ zf f19266b = new zf();

    public static ArrayList p(List protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((zk.v) obj) != zk.v.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.t.j(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((zk.v) it.next()).f46505b);
        }
        return arrayList2;
    }

    public static byte[] q(List protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        nl.g gVar = new nl.g();
        for (String str : p(protocols)) {
            gVar.L(str.length());
            gVar.R(str);
        }
        return gVar.k(gVar.f29540c);
    }

    public static boolean r() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    @Override // j4.n
    public long b() {
        throw new NoSuchElementException();
    }

    @Override // g0.v
    public g0.r2 c() {
        return g0.r2.f19734b;
    }

    @Override // g0.v
    public int d() {
        return 1;
    }

    @Override // l5.d
    public long e(q4.l lVar) {
        return -1L;
    }

    @Override // i6.b
    public void f() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // i6.b
    public void g(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // g0.v
    public long getTimestamp() {
        return -1L;
    }

    @Override // g0.v
    public g0.u h() {
        return g0.u.f19766b;
    }

    @Override // j4.n
    public long i() {
        throw new NoSuchElementException();
    }

    @Override // l5.d
    public q4.t j() {
        return new q4.o(-9223372036854775807L);
    }

    @Override // g0.v
    public g0.s k() {
        return g0.s.f19736b;
    }

    @Override // md.e
    public /* synthetic */ Object l(q9.o oVar) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(oVar);
    }

    @Override // g0.v
    public CaptureResult m() {
        return null;
    }

    @Override // g0.v
    public g0.t n() {
        return g0.t.f19756b;
    }

    @Override // j4.n
    public boolean next() {
        return false;
    }

    @Override // ii.o
    public void onMethodCall(ii.n nVar, ii.p pVar) {
        ((hi.g) pVar).success(null);
    }

    @Override // l5.d
    public void o(long j10) {
    }
}
